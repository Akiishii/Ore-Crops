package net.orecrops.gameobjs.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.orecrops.OreCrops;
import net.orecrops.gameobjs.ModBlocks;
import net.orecrops.gameobjs.ModItems;

public class OreCropsBlocks extends Block{

	public OreCropsBlocks(String regName, float resistance, float hardness) {
		super(Material.ROCK);
		this.setUnlocalizedName(regName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setCreativeTab(OreCrops.cropsTab);
	}
	
	@Override
	public int quantityDropped(Random random) {
				
		return 1;
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return this == ModBlocks.essenceOre ? new ItemStack(ModItems.weakEssence).getItem() : Item.getItemFromBlock(this);
	}
	
}
