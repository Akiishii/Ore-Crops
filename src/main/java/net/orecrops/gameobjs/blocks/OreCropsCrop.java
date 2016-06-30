package net.orecrops.gameobjs.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.FMLLog;
import net.orecrops.gameobjs.ModItems;

import java.util.List;
import java.util.Random;

public class OreCropsCrop extends BlockCrops implements IGrowable, IPlantable {
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 7);

    public final String regName;

    public OreCropsCrop(String regName) {
    	super();
        this.regName = regName;
        this.setDefaultState(blockState.getBaseState().withProperty(AGE, 0));
    }

    public boolean isSuitableForPlant(Block soil) {
        return soil == Blocks.FARMLAND;
    }

    protected PropertyInteger getAge() {
        return AGE;
    }

    public int getHarvestReadyAge() {
        return 7;
    }

    public boolean isHarvestReady(IBlockState state) {
        return state.getValue(getAge()) >= getHarvestReadyAge();
    }

    protected Item getSeeds() {
        final Item seeds = ModItems.seedsMap.get(this);
        if(seeds == null) {
            FMLLog.bigWarning("No seeds detected!");
            return new Item();
        }
        return seeds;
    }

    @Override
    public ItemStack getItem(World world, BlockPos pos, IBlockState state) {
        return new ItemStack(getSeeds());
    }

    @Override
    public boolean canGrow(World worl, BlockPos pos, IBlockState state, boolean isClient) {
        return !isHarvestReady(state);
    }

    protected Item getHarvestedItem() {
        final Item harvestedItem = ModItems.harvestedItemMap.get(this);
        if(harvestedItem == null) {
            FMLLog.bigWarning("Unexpected drop regsitered!");
            return new Item();
        }
        return harvestedItem;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(getAge(), meta);
    }

    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rnd) {
        this.checkAndDropBlock(world, pos, state);

        if(world.getLightFromNeighbors(pos.up()) >= 9) {
            int i = this.getMetaFromState(state);

            if(i < this.getHarvestReadyAge()) {
                float f = getGrowthChance(this, world, pos);

                if(rnd.nextInt((int) (25.0F / f) + 1) == 0) {
                    world.setBlockState(pos, this.getStateFromMeta(i + 1), 2);
                }
            }
        }
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rnd, int fortune) {
        if(!isHarvestReady(state)) {
            return getSeeds();
        }else{
            return getHarvestedItem();
        }
    }

    public int getMetaFromState(IBlockState state) {
        return state.getValue(getAge());
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos pos) {
        Block soilBlock = world.getBlockState(pos.down()).getBlock();

        return this.isSuitableForPlant(soilBlock);
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Crop;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, AGE);
    }

    protected int getRandomInt(World world) {
        return MathHelper.getRandomIntegerInRange(world.rand, 1, 7);
    }

    @Override
    public void grow(World world, BlockPos pos, IBlockState state) {
        int newGrowth = getMetaFromState(state) + getRandomInt(world);
        int maxGrowth = getHarvestReadyAge();

        if(newGrowth > maxGrowth) {
            newGrowth = maxGrowth;
        }

        world.setBlockState(pos, getStateFromMeta(newGrowth), 2);
    }

    @Override
    public void grow(World world, Random rnd, BlockPos pos, IBlockState state) {
        grow(world, pos, state);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof OreCropsCrop && regName.equals(((OreCropsCrop) obj).regName));
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        List<ItemStack> ret = new java.util.ArrayList<ItemStack>();

        Random rnd = world instanceof World ? ((World) world).rand : new Random();

        int age = getMetaFromState(state);

        int count = quantityDropped(state, fortune, rnd);
        for(int i = 0; i < count; i++) {
            Item item = this.getItemDropped(state, rnd, fortune);
            if(item != null) {
                ret.add(new ItemStack(item, 1, this.damageDropped(state)));
            }
        }

        if(age >= getHarvestReadyAge()) {
            for(int i = 0; i < 7 + fortune; ++i) {
                if(rnd.nextInt(2 * getHarvestReadyAge()) <= age) {
                    ret.add(new ItemStack(this.getSeeds(), 1, 0));
                }
            }
        }
        return ret;
    }
    
    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
    	return false;
    }
}
