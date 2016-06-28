package net.orecrops.gameobjs.items.tools;

import net.minecraft.item.Item;
import net.orecrops.OreCrops;

public class OreCropsInfusionCrystal extends Item{

	public OreCropsInfusionCrystal(int uses) {
		super();
		this.setMaxDamage(uses);
		this.setMaxStackSize(1);
		this.setCreativeTab(OreCrops.cropsTab);
	}
	
	

}
