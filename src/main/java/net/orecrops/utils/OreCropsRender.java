package net.orecrops.utils;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;
import net.orecrops.gameobjs.ModBlocks;
import net.orecrops.gameobjs.ModItems;

public class OreCropsRender {

	public static void regItemRender(){
		reg(ModItems.essenceSeeds);
		
		reg(ModItems.earthSeeds);
		reg(ModItems.airSeeds);
		reg(ModItems.fireSeeds);
		reg(ModItems.waterSeeds);
		reg(ModItems.natureSeeds);
		reg(ModItems.dyeSeeds);
		
		reg(ModItems.coalSeeds);
		reg(ModItems.glowstoneSeeds);
		reg(ModItems.obsidianSeeds);
		reg(ModItems.netherSeeds);
		reg(ModItems.xpSeeds);
		
		reg(ModItems.redstoneSeeds);
		reg(ModItems.ironSeeds);
		reg(ModItems.goldSeeds);
		reg(ModItems.lapisSeeds);
		//reg(ModItems.certusSeeds);
		
		//reg(ModItems.osmiumSeeds);
		
		reg(ModItems.diamondSeeds);
		reg(ModItems.emeraldSeeds);
		
		
		
		if(Loader.isModLoaded(OreCropsCompatibility.MOD_ID.AL)){
			
			reg(ModItems.aluminumSeeds);
			reg(ModItems.tinSeeds);
			reg(ModItems.copperSeeds);
			reg(ModItems.leadSeeds);
			reg(ModItems.silverSeeds);
			reg(ModItems.steelSeeds);
			
		}
		
		if(Loader.isModLoaded(OreCropsCompatibility.MOD_ID.TINKERS_CONSTRUCT)){
			
			reg(ModItems.cobaltSeeds);
			reg(ModItems.arditeSeeds);
			reg(ModItems.manyullynSeeds);
			
		}

		if(Loader.isModLoaded(OreCropsCompatibility.MOD_ID.BOTANIA)){
			
			reg(ModItems.manasteelSeeds);
			reg(ModItems.terrasteelSeeds);
		
		}
		
		reg(ModItems.blazeSeeds);
		reg(ModItems.cowSeeds);
		reg(ModItems.pigSeeds);
		reg(ModItems.enderSeeds);
		reg(ModItems.chickenSeeds);
		reg(ModItems.sheepSeeds);
		reg(ModItems.creeperSeeds);
		reg(ModItems.spiderSeeds);
		reg(ModItems.skeletonSeeds);
		reg(ModItems.zombieSeeds);
		reg(ModItems.magmaSeeds);
		reg(ModItems.witherSeeds);
		reg(ModItems.slimeSeeds);
		reg(ModItems.ghastSeeds);
		
		reg(ModItems.weakEssence);
		reg(ModItems.lowEssence);
		reg(ModItems.midEssence);
		reg(ModItems.strongEssence);
		reg(ModItems.expertEssence);
		reg(ModItems.masterEssence);
		reg(ModItems.taintedEssence);
		
		reg(ModItems.weakEssenceIngot);
		reg(ModItems.midEssenceIngot);
		reg(ModItems.strongEssenceIngot);
		reg(ModItems.expertEssenceIngot);
		reg(ModItems.masterEssenceIngot);
		reg(ModItems.taintedEssenceIngot);
		
		reg(ModItems.weakEssencePlate);
		reg(ModItems.midEssencePlate);
		reg(ModItems.strongEssencePlate);
		reg(ModItems.expertEssencePlate);
		reg(ModItems.masterEssencePlate);
		reg(ModItems.taintedEssencePlate);
		
		reg(ModItems.weakEssenceNugget);
		reg(ModItems.midEssenceNugget);
		reg(ModItems.strongEssenceNugget);
		reg(ModItems.expertEssenceNugget);
		reg(ModItems.masterEssenceNugget);
		reg(ModItems.taintedEssenceNugget);
		
		reg(ModItems.weakEssenceGear);
		reg(ModItems.midEssenceGear);
		reg(ModItems.strongEssenceGear);
		reg(ModItems.expertEssenceGear);
		reg(ModItems.masterEssenceGear);
		reg(ModItems.taintedEssenceGear);
		
		reg(ModItems.weakEssenceAxe);
		reg(ModItems.midEssenceAxe);
		reg(ModItems.strongEssenceAxe);
		reg(ModItems.expertEssenceAxe);
		reg(ModItems.masterEssenceAxe);
		
		reg(ModItems.weakEssenceHoe);
		reg(ModItems.midEssenceHoe);
		reg(ModItems.strongEssenceHoe);
		reg(ModItems.expertEssenceHoe);
		reg(ModItems.masterEssenceHoe);
		
		reg(ModItems.weakEssencePickaxe);
		reg(ModItems.midEssencePickaxe);
		reg(ModItems.strongEssencePickaxe);
		reg(ModItems.expertEssencePickaxe);
		reg(ModItems.masterEssencePickaxe);
		
		reg(ModItems.weakEssenceShovel);
		reg(ModItems.midEssenceShovel);
		reg(ModItems.strongEssenceShovel);
		reg(ModItems.expertEssenceShovel);
		reg(ModItems.masterEssenceShovel);
		
		reg(ModItems.weakEssenceSword);
		reg(ModItems.midEssenceSword);
		reg(ModItems.strongEssenceSword);
		reg(ModItems.expertEssenceSword);
		reg(ModItems.masterEssenceSword);
		
		reg(ModItems.weakEssenceForgeHammer);
		reg(ModItems.midEssenceForgeHammer);
		reg(ModItems.strongEssenceForgeHammer);
		reg(ModItems.expertEssenceForgeHammer);
		reg(ModItems.masterEssenceForgeHammer);
		reg(ModItems.taintedEssenceForgeHammer);
		
		reg(ModItems.weakInfusionCrystal);
		reg(ModItems.midInfusionCrystal);
		reg(ModItems.strongInfusionCrystal);
		reg(ModItems.expertInfusionCrystal);
		reg(ModItems.masterInfusionCrystal);
		reg(ModItems.taintedInfusionCrystal);
		
		reg(ModItems.magneticCoin);
		
		reg(ModItems.essenceCoal);
		
		reg(ModItems.salt);
		
		regBlock(ModBlocks.essenceOre);
		
		regBlock(ModBlocks.weakEssenceBlock);
		regBlock(ModBlocks.midEssenceBlock);
		regBlock(ModBlocks.strongEssenceBlock);
		regBlock(ModBlocks.expertEssenceBlock);
		regBlock(ModBlocks.masterEssenceBlock);
		regBlock(ModBlocks.taintedEssenceBlock);
	}
	
	private static void reg(Item item){
		
		ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
		
		ModelLoader.setCustomModelResourceLocation(item, 0, res);
		
	}
	
	private static void regBlock(Block block){
		
		Item item = Item.getItemFromBlock(block);
		
		ModelResourceLocation res = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
		
		ModelLoader.setCustomModelResourceLocation(item, 0, res);
		
	}
	
}
