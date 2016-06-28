package net.orecrops.gameobjs.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.fml.common.Optional;
import net.orecrops.utils.OreCropsCompatibility;

public abstract class OreCropsBauble extends Item implements IBauble{

	@Override
	@Optional.Method(modid = OreCropsCompatibility.MOD_ID.BAUBLES)
	public abstract BaubleType getBaubleType(ItemStack stack);

	@Override
	@Optional.Method(modid = OreCropsCompatibility.MOD_ID.BAUBLES)
	public abstract void onWornTick(ItemStack stack, EntityLivingBase player);

	@Override
	@Optional.Method(modid = OreCropsCompatibility.MOD_ID.BAUBLES)
	public void onEquipped(ItemStack stack, EntityLivingBase player) {

	}

	@Override
	@Optional.Method(modid = OreCropsCompatibility.MOD_ID.BAUBLES)
	public void onUnequipped(ItemStack stack, EntityLivingBase player) {
		// Nothing?
	}

	@Override
	@Optional.Method(modid = OreCropsCompatibility.MOD_ID.BAUBLES)
	public boolean canEquip(ItemStack stack, EntityLivingBase player) {
		return true;
	}

	@Override
	@Optional.Method(modid = OreCropsCompatibility.MOD_ID.BAUBLES)
	public boolean canUnequip(ItemStack stack, EntityLivingBase player) {
		return true;
	}

}
