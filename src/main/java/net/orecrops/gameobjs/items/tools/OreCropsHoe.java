package net.orecrops.gameobjs.items.tools;

import net.minecraft.item.ItemHoe;
import net.orecrops.OreCrops;

public class OreCropsHoe extends ItemHoe
{

	public OreCropsHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(OreCrops.cropsTab);
	}
    
}
