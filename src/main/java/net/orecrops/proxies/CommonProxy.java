package net.orecrops.proxies;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.orecrops.gameobjs.ModBlocks;
import net.orecrops.gameobjs.ModItems;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {

		ModBlocks.loadCrops();
		ModBlocks.loadBlocks();
		ModItems.loadCropItems();
		
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
	
}
