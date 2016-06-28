package net.orecrops.gameobjs.items.tools;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.orecrops.OreCrops;

public class OreCropsForgeHammer extends Item{

	private static int maxUses;
	
	public OreCropsForgeHammer(int uses) {
		super();
		this.maxUses = uses;
		this.setCreativeTab(OreCrops.cropsTab);
		setMaxDamage(uses);
		
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {

		itemStack.setItemDamage(itemStack.getItemDamage() + 10);
		return itemStack;
		
	}
	 
	@SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return this.bFull3D;
    }

}
