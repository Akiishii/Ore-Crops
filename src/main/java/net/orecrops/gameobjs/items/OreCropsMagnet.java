package net.orecrops.gameobjs.items;

import java.util.Iterator;
import java.util.List;

import baubles.api.BaubleType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.orecrops.OreCrops;
import net.orecrops.utils.OreCropsCompatibility;
import net.orecrops.utils.OreCropsNBT;
import net.orecrops.utils.OreCropsSettings;


public class OreCropsMagnet extends OreCropsBauble{
	
	public OreCropsMagnet() {
		super();
		this.setMaxDamage(0);
		this.setMaxStackSize(1);
		this.setCreativeTab(OreCrops.cropsTab);
		canRepair = false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.EPIC;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return isEnabled(stack);
	}

	@SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return this.bFull3D;
    }
	
	private boolean isEnabled(ItemStack stack) {
		return OreCropsNBT.getBoolean("enabled", stack);
	}

	@Override
	public void onUpdate(ItemStack ist, World world, Entity entity, int i, boolean f) {
		if(world.isRemote)
			return;
		if(!disabledAudio())
			if(OreCropsNBT.getShort("soundTimer", ist) > 0) {
				if(OreCropsNBT.getShort("soundTimer", ist) % 2 == 0) {
					world.playSound(null, entity.getPosition(), SoundEvents.ENTITY_EXPERIENCE_ORB_TOUCH, SoundCategory.PLAYERS, 0.1F, 0.5F * ((world.rand.nextFloat() - world.rand.nextFloat()) * 0.7F + 1.8F));
				}
				OreCropsNBT.setShort("soundTimer", ist, OreCropsNBT.getShort("soundTimer", ist) - 1);
			}
		if(!isEnabled(ist))
			return;
		EntityPlayer player = null;
		if(entity instanceof EntityPlayer) {
			player = (EntityPlayer) entity;
		}
		if(player == null)
			return;
		scanForEntitiesInRange(world, player, getStandardPullDistance());
	}

	private void scanForEntitiesInRange(World world, EntityPlayer player, double d) {
		List iList = world.getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(player.posX - d, player.posY - d, player.posZ - d, player.posX + d, player.posY + d, player.posZ + d));
		Iterator iterator = iList.iterator();
		while(iterator.hasNext()) {
			EntityItem item = (EntityItem) iterator.next();
			if(!checkForRoom(item.getEntityItem(), player)) {
				continue;
			}

			item.setPickupDelay(0);
			if(player.getDistanceToEntity(item) < 1.5D) {
				continue;
			}
			teleportEntityToPlayer(item, player);
			break;
		}
		List iList2 = world.getEntitiesWithinAABB(EntityXPOrb.class, new AxisAlignedBB(player.posX - d, player.posY - d, player.posZ - d, player.posX + d, player.posY + d, player.posZ + d));
		Iterator iterator2 = iList2.iterator();
		while(iterator2.hasNext()) {
			EntityXPOrb item = (EntityXPOrb) iterator2.next();
			if(player.xpCooldown > 0) {
				player.xpCooldown = 0;
			}
			if(player.getDistanceToEntity(item) < 1.5D) {
				continue;
			}
			teleportEntityToPlayer(item, player);
			break;
		}
	}

	private void teleportEntityToPlayer(Entity item, EntityPlayer player) {
		player.worldObj.spawnParticle(EnumParticleTypes.SPELL_MOB, item.posX + 0.5D + player.worldObj.rand.nextGaussian() / 8, item.posY + 0.2D, item.posZ + 0.5D + player.worldObj.rand.nextGaussian() / 8, 0.9D, 0.9D, 0.0D);
		player.getLookVec();
		double x = player.posX + player.getLookVec().xCoord * 0.2D;
		double y = player.posY;
		double z = player.posZ + player.getLookVec().zCoord * 0.2D;
		item.setPosition(x, y, z);
		if(!disabledAudio()) {
			player.worldObj.playSound(null, player.getPosition(), SoundEvents.ENTITY_EXPERIENCE_ORB_TOUCH, SoundCategory.PLAYERS, 0.1F, 0.5F * ((player.worldObj.rand.nextFloat() - player.worldObj.rand.nextFloat()) * 0.7F + 1.8F));
		}
	}

	private boolean checkForRoom(ItemStack item, EntityPlayer player) {
		int remaining = item.stackSize;
		for(ItemStack ist : player.inventory.mainInventory) {
			if(ist == null) {
				continue;
			}
			if(ist.getItem() == item.getItem() && ist.getItemDamage() == item.getItemDamage()) {
				if(ist.stackSize + remaining <= ist.getMaxStackSize())
					return true;
				else {
					int count = ist.stackSize;
					while(count < ist.getMaxStackSize()) {
						count++;
						remaining--;
						if(remaining == 0)
							return true;
					}
				}
			}
		}
		for(int slot = 0; slot < player.inventory.mainInventory.length; slot++) {
			if(player.inventory.mainInventory[slot] == null)
				return true;
		}
		return false;
	}

	@Override
	public void onUsingTick(ItemStack ist, EntityLivingBase entity, int count) {
		if(!(entity instanceof EntityPlayer))
			return;

		EntityPlayer player = (EntityPlayer) entity;

		scanForEntitiesInRange(player.worldObj, player, getLongRangePullDistance());
	}

	public double getLongRangePullDistance() {
		return (double) OreCropsSettings.Magnet.longRangePullDistance;
	}

	public double getStandardPullDistance() {
		return (double) OreCropsSettings.Magnet.standardPullDistance;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 64;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.BLOCK;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack ist, World world, EntityPlayer player, EnumHand hand) {
		if(player.isSneaking()) {
			if(!disabledAudio()) {
				OreCropsNBT.setShort("soundTimer", ist, 6);
			}
			OreCropsNBT.setBoolean("enabled", ist, !isEnabled(ist));
		} else {
			player.setActiveHand(hand);
		}
		return new ActionResult<>(EnumActionResult.SUCCESS, ist);
	}

	@Override
	@Optional.Method(modid = OreCropsCompatibility.MOD_ID.BAUBLES)
	public BaubleType getBaubleType(ItemStack stack) {
		return BaubleType.AMULET;
	}

	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase player) {
		this.onUpdate(stack, player.worldObj, player, 0, false);
	}

	private boolean disabledAudio() {
		return OreCropsSettings.Magnet.disableAudio;
	}

}
