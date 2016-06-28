package net.orecrops.gameobjs.items;

import net.minecraft.item.Item;
import net.orecrops.OreCrops;

public class OreCropsItems extends Item{

	public OreCropsItems(String regName) {
        super();
        this.setUnlocalizedName(regName);
        this.setCreativeTab(OreCrops.cropsTab);
    }
	
}
