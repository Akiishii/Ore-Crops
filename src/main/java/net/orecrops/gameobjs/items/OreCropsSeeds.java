package net.orecrops.gameobjs.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.orecrops.OreCrops;

public class OreCropsSeeds extends ItemSeeds{

	public OreCropsSeeds(Block crops, Block soil, String regName) {
		super(crops, soil);
		this.setUnlocalizedName(regName);
		this.setCreativeTab(OreCrops.cropsTab);
	}
	
}
