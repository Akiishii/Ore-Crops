package net.orecrops;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.orecrops.gameobjs.ModItems;
import net.orecrops.lib.OreCropsLib;
import net.orecrops.proxies.CommonProxy;

@Mod(modid = OreCropsLib.MODID, name = OreCropsLib.MODNAME, version = OreCropsLib.VERSION)
public class OreCrops {
	
	public static CreativeTabs cropsTab = new CreativeTabs("OreCrops") {
        @Override
        public Item getTabIconItem() {
            return ModItems.diamondSeeds;
        }
    };
	
	@SidedProxy(clientSide = OreCropsLib.CLIENTPROXYLOCATION, serverSide = OreCropsLib.SERVERPROXYLOCATION)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
	
		this.proxy.preInit(e);
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent e){		

		this.proxy.init(e);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){

		this.proxy.postInit(e);
		
	}
	
}
