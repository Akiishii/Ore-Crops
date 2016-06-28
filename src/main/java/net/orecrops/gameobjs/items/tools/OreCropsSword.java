package net.orecrops.gameobjs.items.tools;

import net.orecrops.OreCrops;

public class OreCropsSword extends OreCropsAdvancedSword
{

	public OreCropsSword(ToolMaterial material) {
		super(material, 3F);
		this.setCreativeTab(OreCrops.cropsTab);
	}
  
	
}