package net.orecrops.gameobjs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.orecrops.gameobjs.blocks.OreCropsBlocks;
import net.orecrops.gameobjs.blocks.OreCropsCrop;

public class ModBlocks {

	 // Weak Essence
 	public static Block essenceCrop;

 	// Mid Essence
 	public static Block earthCrop;
 	public static Block natureCrop;
 	public static Block airCrop;
 	public static Block fireCrop;
 	public static Block waterCrop;
 	public static Block dyeCrop;
 	
 	// Strong Essence
 	public static Block coalCrop;
 	public static Block glowstoneCrop;
 	public static Block obsidianCrop;
 	public static Block netherCrop;
 	public static Block aluminumCrop; // Tinkers Construct
 	public static Block xpCrop;
 	public static Block tinCrop; // Tinkers Construct
 	public static Block copperCrop; // Tinkers Construct

 	// Expert Essence
 	public static Block redstoneCrop;
 	public static Block ironCrop;
 	public static Block certusCrop; // Applied Energistics/Applied Logistics
 	public static Block lapisCrop;
 	public static Block goldCrop;
 	public static Block cobaltCrop; // Tinkers Construct
 	public static Block arditeCrop; // Tinkers Construct
 	public static Block leadCrop; // Applied Energistics/Applied Logistics
 	public static Block silverCrop; // Applied Energistics/Applied Logistics
 	public static Block manasteelCrop;
 	public static Block osmiumCrop;
 	public static Block steelCrop; // Tinkers Construct
 	public static Block alumiteCrop; // Tinkers Construct

 	// Master Essence
 	public static Block diamondCrop;
 	public static Block emeraldCrop;
 	public static Block manyullynCrop;
 	public static Block terrasteelCrop;

 	// Tainted Essence
 	public static Block blazeCrop;
 	public static Block enderCrop;
 	public static Block cowCrop;
 	public static Block sheepCrop;
 	public static Block chickenCrop;
 	public static Block creeperCrop;
 	public static Block magmaCrop;
 	public static Block skeletonCrop;
 	public static Block slimeCrop;
 	public static Block spiderCrop;
 	public static Block ghastCrop;
 	public static Block witherCrop;
 	public static Block pigCrop;
 	public static Block zombieCrop;
	
 	public static Block essenceOre;
	public static Block saltOre;
	
	public static Block weakEssenceBlock;
	public static Block midEssenceBlock;
	public static Block strongEssenceBlock;
	public static Block expertEssenceBlock;
	public static Block masterEssenceBlock;
	public static Block taintedEssenceBlock;
	
 	
 	public static void loadCrops(){
 		
 		essenceCrop = registerBlockCrop("essenceCrop");
 		
 		earthCrop = registerBlockCrop("earthCrop");
		waterCrop = registerBlockCrop("waterCrop");
		fireCrop = registerBlockCrop("fireCrop");
		airCrop = registerBlockCrop("airCrop");
		dyeCrop = registerBlockCrop("dyeCrop");
		natureCrop = registerBlockCrop("natureCrop");
		
		coalCrop = registerBlockCrop("coalCrop");
		glowstoneCrop = registerBlockCrop("glowstoneCrop");
		obsidianCrop = registerBlockCrop("obsidianCrop");
		netherCrop = registerBlockCrop("netherCrop");
		aluminumCrop = registerBlockCrop("aluminumCrop");
		xpCrop = registerBlockCrop("xpCrop");
		tinCrop = registerBlockCrop("tinCrop");
		copperCrop = registerBlockCrop("copperCrop");
		
		redstoneCrop = registerBlockCrop("redstoneCrop");
		ironCrop = registerBlockCrop("ironCrop");
		certusCrop = registerBlockCrop("certusCrop");
		lapisCrop = registerBlockCrop("lapisCrop");
		goldCrop = registerBlockCrop("goldCrop");
		cobaltCrop = registerBlockCrop("cobaltCrop");
		arditeCrop = registerBlockCrop("arditeCrop");
		leadCrop = registerBlockCrop("leadCrop");
		silverCrop = registerBlockCrop("silverCrop");
		manasteelCrop = registerBlockCrop("manasteelCrop");
		osmiumCrop = registerBlockCrop("osmiumCrop");
		steelCrop = registerBlockCrop("steelCrop");
		alumiteCrop = registerBlockCrop("alumiteCrop");
		
		emeraldCrop = registerBlockCrop("emeraldCrop");
		diamondCrop = registerBlockCrop("diamondCrop");
		manyullynCrop = registerBlockCrop("manyullynCrop");
		terrasteelCrop = registerBlockCrop("terrasteelCrop");
		
		blazeCrop = registerBlockCrop("blazeCrop");
		enderCrop = registerBlockCrop("enderCrop");
		cowCrop = registerBlockCrop("cowCrop");
		sheepCrop = registerBlockCrop("sheepCrop");
		chickenCrop = registerBlockCrop("chickenCrop");
		creeperCrop = registerBlockCrop("creeperCrop");
		magmaCrop = registerBlockCrop("magmaCrop");
		skeletonCrop = registerBlockCrop("skeletonCrop");
		slimeCrop = registerBlockCrop("slimeCrop");
		spiderCrop = registerBlockCrop("spiderCrop");
		ghastCrop = registerBlockCrop("ghastCrop");
		witherCrop = registerBlockCrop("witherCrop");
		pigCrop = registerBlockCrop("pigCrop");
		zombieCrop = registerBlockCrop("zombieCrop");
 		
 	}
 	
 	public static void loadBlocks(){
 		
 		essenceOre = registerBlock("essenceOre");
 		
 		weakEssenceBlock = registerBlock("weakEssenceBlock");
 		midEssenceBlock = registerBlock("midEssenceBlock");
 		strongEssenceBlock = registerBlock("strongEssenceBlock");
 		expertEssenceBlock = registerBlock("expertEssenceBlock");
 		masterEssenceBlock = registerBlock("masterEssenceBlock");
 		taintedEssenceBlock = registerBlock("taintedEssenceBlock");
 		
 		
 	}
 	
 	private static Block registerBlock(String regName) {
 		final Block OreBlock = new OreCropsBlocks(regName, 1.0F, 10.0F);
 		final ItemBlock itemBlock = new ItemBlock(OreBlock);
 		
 		return registerBlocks(regName, itemBlock, OreBlock);
 	}
 	
 	private static Block registerBlockCrop(String regName) {
        final Block OreCrop = new OreCropsCrop(regName);
        final ItemBlock itemBlock = new ItemBlock(OreCrop);

        return registerBlocks(regName, itemBlock, OreCrop);
    }

    private static Block registerBlocks(String regName, ItemBlock itemBlock, Block block) {
        block.setRegistryName(regName);
        block.setUnlocalizedName(regName);

        GameRegistry.register(block);

        itemBlock.setRegistryName(regName);
        itemBlock.setUnlocalizedName(regName);
        GameRegistry.register(itemBlock);

        return block;
    }
 	
}
