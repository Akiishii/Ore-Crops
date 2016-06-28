package net.orecrops.gameobjs;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.orecrops.OreCrops;
import net.orecrops.gameobjs.blocks.OreCropsCrop;
import net.orecrops.gameobjs.items.OreCropsItems;
import net.orecrops.gameobjs.items.OreCropsMagnet;
import net.orecrops.gameobjs.items.OreCropsSeeds;
import net.orecrops.gameobjs.items.tools.OreCropsAxe;
import net.orecrops.gameobjs.items.tools.OreCropsForgeHammer;
import net.orecrops.gameobjs.items.tools.OreCropsHoe;
import net.orecrops.gameobjs.items.tools.OreCropsInfusionCrystal;
import net.orecrops.gameobjs.items.tools.OreCropsPickaxe;
import net.orecrops.gameobjs.items.tools.OreCropsShovel;
import net.orecrops.gameobjs.items.tools.OreCropsSword;
import net.orecrops.handler.OreCropsMaterialHandler;

public class ModItems {

	public static Item[] SEEDS;
	public static Item[] DROPS;
	public static Item[] MISC;

	public static HashMap<OreCropsCrop, Item> seedsMap = new HashMap<OreCropsCrop, Item>();
	public static HashMap<OreCropsCrop, Item> harvestedItemMap = new HashMap<OreCropsCrop, Item>();

	// Weak Essence
	public static Item essenceSeeds;

	// Mid Essence
	public static Item earthSeeds;
	public static Item natureSeeds;
	public static Item airSeeds;
	public static Item fireSeeds;
	public static Item waterSeeds;
	public static Item dyeSeeds;

	// Strong Essence
	public static Item coalSeeds;
	public static Item glowstoneSeeds;
	public static Item obsidianSeeds;
	public static Item netherSeeds;
	public static Item aluminumSeeds; // Tinkers Construct
	public static Item xpSeeds;
	public static Item tinSeeds; // Tinkers Construct
	public static Item copperSeeds; // Tinkers Construct

	// Expert Essence
	public static Item redstoneSeeds;
	public static Item ironSeeds;
	public static Item certusSeeds; // Applied Energistics/Applied Logistics
	public static Item lapisSeeds;
	public static Item goldSeeds;
	public static Item cobaltSeeds; // Tinkers Construct
	public static Item arditeSeeds; // Tinkers Construct
	public static Item leadSeeds; // Applied Energistics/Applied Logistics
	public static Item silverSeeds; // Applied Energistics/Applied Logistics
	public static Item manasteelSeeds;
	public static Item osmiumSeeds;
	public static Item steelSeeds;

	// Master Essence
	public static Item diamondSeeds;
	public static Item emeraldSeeds;
	public static Item manyullynSeeds;
	public static Item terrasteelSeeds;

	// Tainted Essence
	public static Item blazeSeeds;
	public static Item enderSeeds;
	public static Item cowSeeds;
	public static Item sheepSeeds;
	public static Item chickenSeeds;
	public static Item creeperSeeds;
	public static Item magmaSeeds;
	public static Item skeletonSeeds;
	public static Item slimeSeeds;
	public static Item spiderSeeds;
	public static Item ghastSeeds;
	public static Item witherSeeds;
	public static Item pigSeeds;
	public static Item zombieSeeds;

	//Essences
	public static Item weakEssence;
	public static Item lowEssence;
	public static Item midEssence;
	public static Item strongEssence;
	public static Item expertEssence;
	public static Item masterEssence;                                                    
	public static Item taintedEssence;

	// Mid Essence
	public static Item earthEssence;
	public static Item natureEssence;
	public static Item airEssence;
	public static Item fireEssence;
	public static Item waterEssence;
	public static Item dyeEssence;

	// Strong Essence
	public static Item coalEssence;
	public static Item glowstoneEssence;
	public static Item obsidianEssence;
	public static Item netherEssence;
	public static Item aluminumEssence; // Tinkers Construct
	public static Item xpEssence;
	public static Item tinEssence; // Tinkers Construct
	public static Item copperEssence; // Tinkers Construct

	// Expert Essence
	public static Item redstoneEssence;
	public static Item ironEssence;
	public static Item certusEssence; // Applied Energistics/Applied Logistics
	public static Item lapisEssence;
	public static Item goldEssence;
	public static Item cobaltEssence; // Tinkers Construct
	public static Item arditeEssence; // Tinkers Construct
	public static Item leadEssence; // Applied Energistics/Applied Logistics
	public static Item silverEssence; // Applied Energistics/Applied Logistics
	public static Item manasteelEssence;
	public static Item osmiumEssence;
	public static Item steelEssence;

	// Master Essence
	public static Item diamondEssence;
	public static Item emeraldEssence;
	public static Item manyullynEssence;
	public static Item terrasteelEssence;

	// Tainted Essence
	public static Item blazeEssence;
	public static Item enderEssence;
	public static Item cowEssence;
	public static Item sheepEssence;
	public static Item chickenEssence;
	public static Item creeperEssence;
	public static Item magmaEssence;
	public static Item skeletonEssence;
	public static Item slimeEssence;
	public static Item spiderEssence;
	public static Item ghastEssence;
	public static Item witherEssence;
	public static Item pigEssence;
	public static Item zombieEssence;

	public static Item weakEssenceIngot;
	public static Item midEssenceIngot;
	public static Item strongEssenceIngot;
	public static Item expertEssenceIngot;
	public static Item masterEssenceIngot;
	public static Item taintedEssenceIngot;
	
	public static Item weakEssenceNugget;
	public static Item midEssenceNugget;
	public static Item strongEssenceNugget;
	public static Item expertEssenceNugget;
	public static Item masterEssenceNugget;
	public static Item taintedEssenceNugget;
	
	public static Item weakEssencePlate;
	public static Item midEssencePlate;
	public static Item strongEssencePlate;
	public static Item expertEssencePlate;
	public static Item masterEssencePlate;
	public static Item taintedEssencePlate;
	
	public static Item weakEssenceGear;
	public static Item midEssenceGear;
	public static Item strongEssenceGear;
	public static Item expertEssenceGear;
	public static Item masterEssenceGear;
	public static Item taintedEssenceGear;
	
	public static Item weakEssenceAxe;
	public static Item weakEssenceHoe;
	public static Item weakEssencePickaxe;
	public static Item weakEssenceShovel;
	public static Item weakEssenceSword;
	
	public static Item midEssenceAxe;
	public static Item midEssenceHoe;
	public static Item midEssencePickaxe;
	public static Item midEssenceShovel;
	public static Item midEssenceSword;
	
	public static Item strongEssenceAxe;
	public static Item strongEssenceHoe;
	public static Item strongEssencePickaxe;
	public static Item strongEssenceShovel;
	public static Item strongEssenceSword;
	
	public static Item expertEssenceAxe;
	public static Item expertEssenceHoe;
	public static Item expertEssencePickaxe;
	public static Item expertEssenceShovel;
	public static Item expertEssenceSword;
	
	public static Item masterEssenceAxe;
	public static Item masterEssenceHoe;
	public static Item masterEssencePickaxe;
	public static Item masterEssenceShovel;
	public static Item masterEssenceSword;
	
	public static Item ironForgeHammer;
	public static Item weakEssenceForgeHammer;
	public static Item midEssenceForgeHammer;
	public static Item strongEssenceForgeHammer;
	public static Item expertEssenceForgeHammer;
	public static Item masterEssenceForgeHammer;
	public static Item taintedEssenceForgeHammer;
	
	public static Item weakInfusionCrystal;
	public static Item midInfusionCrystal;
	public static Item strongInfusionCrystal;
	public static Item expertInfusionCrystal;
	public static Item masterInfusionCrystal;
	public static Item taintedInfusionCrystal;
	
	public static Item salt;

	public static Item essenceCoal;

	public static Item magneticCoin;

	public static Item regItem(Item item, String regName) {
		item.setRegistryName(regName);
		item.setCreativeTab(OreCrops.cropsTab);

		return GameRegistry.register(item);
	}

	public static Item regSeeds(String regName, Block crop, boolean isSeed) {
		OreCropsSeeds item = new OreCropsSeeds(crop, Blocks.FARMLAND, regName);

		if (isSeed) {
			seedsMap.put((OreCropsCrop) crop, item);
		} else {
			harvestedItemMap.put((OreCropsCrop) crop, item);
		}

		return regItem(item, regName);
	}

	public static Item regMiscItem(String regName) {

		OreCropsItems item = new OreCropsItems(regName);

		return regItem(item, regName);

	}

	public static void loadCropItems() {

		essenceSeeds = regSeeds("essenceSeeds", ModBlocks.essenceCrop, true);

		fireSeeds = regSeeds("fireSeeds", ModBlocks.fireCrop, true);
		waterSeeds = regSeeds("waterSeeds", ModBlocks.waterCrop, true);
		natureSeeds = regSeeds("natureSeeds", ModBlocks.natureCrop, true);
		earthSeeds = regSeeds("earthSeeds", ModBlocks.earthCrop, true);
		dyeSeeds = regSeeds("dyeSeeds", ModBlocks.dyeCrop, true);
		airSeeds = regSeeds("airSeeds", ModBlocks.airCrop, true);

		coalSeeds = regSeeds("coalSeeds", ModBlocks.coalCrop, true);
		glowstoneSeeds = regSeeds("glowstoneSeeds", ModBlocks.glowstoneCrop, true);
		obsidianSeeds = regSeeds("obsidianSeeds", ModBlocks.obsidianCrop, true);
		netherSeeds = regSeeds("netherSeeds", ModBlocks.netherCrop, true);
		aluminumSeeds = regSeeds("aluminumSeeds", ModBlocks.aluminumCrop, true);
		xpSeeds = regSeeds("xpSeeds", ModBlocks.xpCrop, true);
		tinSeeds = regSeeds("tinSeeds", ModBlocks.tinCrop, true);
		copperSeeds = regSeeds("copperSeeds", ModBlocks.copperCrop, true);

		redstoneSeeds = regSeeds("redstoneSeeds", ModBlocks.redstoneCrop, true);
		ironSeeds = regSeeds("ironSeeds", ModBlocks.ironCrop, true);
		certusSeeds = regSeeds("certusSeeds", ModBlocks.certusCrop, true);
		lapisSeeds = regSeeds("lapisSeeds", ModBlocks.lapisCrop, true);
		goldSeeds = regSeeds("goldSeeds", ModBlocks.goldCrop, true);
		cobaltSeeds = regSeeds("cobaltSeeds", ModBlocks.cobaltCrop, true);
		arditeSeeds = regSeeds("arditeSeeds", ModBlocks.arditeCrop, true);
		leadSeeds = regSeeds("leadSeeds", ModBlocks.leadCrop, true);
		silverSeeds = regSeeds("silverSeeds", ModBlocks.silverCrop, true);
		manasteelSeeds = regSeeds("manasteelSeeds", ModBlocks.manasteelCrop, true);
		osmiumSeeds = regSeeds("osmiumSeeds", ModBlocks.osmiumCrop, true);
		steelSeeds = regSeeds("steelSeeds", ModBlocks.steelCrop, true);

		diamondSeeds = regSeeds("diamondSeeds", ModBlocks.diamondCrop, true);
		emeraldSeeds = regSeeds("emeraldSeeds", ModBlocks.emeraldCrop, true);
		manyullynSeeds = regSeeds("manyullynSeeds", ModBlocks.manyullynCrop, true);
		terrasteelSeeds = regSeeds("terrasteelSeeds", ModBlocks.terrasteelCrop, true);

		blazeSeeds = regSeeds("blazeSeeds", ModBlocks.blazeCrop, true);
		spiderSeeds = regSeeds("spiderSeeds", ModBlocks.spiderCrop, true);
		cowSeeds = regSeeds("cowSeeds", ModBlocks.cowCrop, true);
		chickenSeeds = regSeeds("chickenSeeds", ModBlocks.chickenCrop, true);
		pigSeeds = regSeeds("pigSeeds", ModBlocks.pigCrop, true);
		magmaSeeds = regSeeds("magmaSeeds", ModBlocks.magmaCrop, true);
		zombieSeeds = regSeeds("zombieSeeds", ModBlocks.zombieCrop, true);
		skeletonSeeds = regSeeds("skeletonSeeds", ModBlocks.skeletonCrop, true);
		witherSeeds = regSeeds("witherSeeds", ModBlocks.witherCrop, true);
		ghastSeeds = regSeeds("ghastSeeds", ModBlocks.ghastCrop, true);
		creeperSeeds = regSeeds("creeperSeeds", ModBlocks.creeperCrop, true);
		enderSeeds = regSeeds("enderSeeds", ModBlocks.enderCrop, true);
		slimeSeeds = regSeeds("slimeSeeds", ModBlocks.slimeCrop, true);
		sheepSeeds = regSeeds("sheepSeeds", ModBlocks.sheepCrop, true);

		weakEssence = regSeeds("weakEssence", ModBlocks.essenceCrop, false);
		lowEssence = regMiscItem("lowEssence");
		midEssence = regMiscItem("midEssence");
		strongEssence = regMiscItem("strongEssence");
		expertEssence = regMiscItem("expertEssence");
		masterEssence = regMiscItem("masterEssence");
		taintedEssence = regMiscItem("taintedEssence");

		fireEssence = regSeeds("fireEssence", ModBlocks.fireCrop, false);
		waterEssence = regSeeds("waterEssence", ModBlocks.waterCrop, false);
		natureEssence = regSeeds("natureEssence", ModBlocks.natureCrop, false);
		earthEssence = regSeeds("earthEssence", ModBlocks.earthCrop, false);
		dyeEssence = regSeeds("dyeEssence", ModBlocks.dyeCrop, false);
		airEssence = regSeeds("airEssence", ModBlocks.airCrop, false);

		coalEssence = regSeeds("coalEssence", ModBlocks.coalCrop, false);
		glowstoneEssence = regSeeds("glowstoneEssence", ModBlocks.glowstoneCrop, false);
		obsidianEssence = regSeeds("obsidianEssence", ModBlocks.obsidianCrop, false);
		netherEssence = regSeeds("netherEssence", ModBlocks.netherCrop, false);
		aluminumEssence = regSeeds("aluminumEssence", ModBlocks.aluminumCrop, false);
		xpEssence = regSeeds("xpEssence", ModBlocks.xpCrop, false);
		tinEssence = regSeeds("tinEssence", ModBlocks.tinCrop, false);
		copperEssence = regSeeds("copperEssence", ModBlocks.copperCrop, false);

		redstoneEssence = regSeeds("redstoneEssence", ModBlocks.redstoneCrop, false);
		ironEssence = regSeeds("ironEssence", ModBlocks.ironCrop, false);
		certusEssence = regSeeds("certusEssence", ModBlocks.certusCrop, false);
		lapisEssence = regSeeds("lapisEssence", ModBlocks.lapisCrop, false);
		goldEssence = regSeeds("goldEssence", ModBlocks.goldCrop, false);
		cobaltEssence = regSeeds("cobaltEssence", ModBlocks.cobaltCrop, false);
		arditeEssence = regSeeds("arditeEssence", ModBlocks.arditeCrop, false);
		leadEssence = regSeeds("leadEssence", ModBlocks.leadCrop, false);
		silverEssence = regSeeds("silverEssence", ModBlocks.silverCrop, false);
		manasteelEssence = regSeeds("manasteelEssence", ModBlocks.manasteelCrop, false);
		osmiumEssence = regSeeds("osmiumEssence", ModBlocks.osmiumCrop, false);
		steelEssence = regSeeds("steelEssence", ModBlocks.steelCrop, false);

		diamondEssence = regSeeds("diamondEssence", ModBlocks.diamondCrop, false);
		emeraldEssence = regSeeds("emeraldEssence", ModBlocks.emeraldCrop, false);
		manyullynEssence = regSeeds("manyullynEssence", ModBlocks.manyullynCrop, false);
		terrasteelEssence = regSeeds("terrasteelEssence", ModBlocks.terrasteelCrop, false);

		blazeEssence = regSeeds("blazeEssence", ModBlocks.blazeCrop, false);
		spiderEssence = regSeeds("spiderEssence", ModBlocks.spiderCrop, false);
		cowEssence = regSeeds("cowEssence", ModBlocks.cowCrop, false);
		chickenEssence = regSeeds("chickenEssence", ModBlocks.chickenCrop, false);
		pigEssence = regSeeds("pigEssence", ModBlocks.pigCrop, false);
		magmaEssence = regSeeds("magmaEssence", ModBlocks.magmaCrop, false);
		zombieEssence = regSeeds("zombieEssence", ModBlocks.zombieCrop, false);
		skeletonEssence = regSeeds("skeletonEssence", ModBlocks.skeletonCrop, false);
		witherEssence = regSeeds("witherEssence", ModBlocks.witherCrop, false);
		ghastEssence = regSeeds("ghastEssence", ModBlocks.ghastCrop, false);
		creeperEssence = regSeeds("creeperEssence", ModBlocks.creeperCrop, false);
		enderEssence = regSeeds("enderEssence", ModBlocks.enderCrop, false);
		slimeEssence = regSeeds("slimeEssence", ModBlocks.slimeCrop, false);
		sheepEssence = regSeeds("sheepEssence", ModBlocks.sheepCrop, false);
				
		weakEssenceIngot = regMiscItem("weakEssenceIngot");
		midEssenceIngot = regMiscItem("midEssenceIngot");
		strongEssenceIngot = regMiscItem("strongEssenceIngot");
		expertEssenceIngot = regMiscItem("expertEssenceIngot");
		masterEssenceIngot = regMiscItem("masterEssenceIngot");
		taintedEssenceIngot = regMiscItem("taintedEssenceIngot");
		
		weakEssencePlate = regMiscItem("weakEssencePlate");
		midEssencePlate = regMiscItem("midEssencePlate");
		strongEssencePlate = regMiscItem("strongEssencePlate");
		expertEssencePlate = regMiscItem("expertEssencePlate");
		masterEssencePlate = regMiscItem("masterEssencePlate");
		taintedEssencePlate = regMiscItem("taintedEssencePlate");
		
		weakEssenceNugget = regMiscItem("weakEssenceNugget");
		midEssenceNugget = regMiscItem("midEssenceNugget");
		strongEssenceNugget = regMiscItem("strongEssenceNugget");
		expertEssenceNugget = regMiscItem("expertEssenceNugget");
		masterEssenceNugget = regMiscItem("masterEssenceNugget");
		taintedEssenceNugget = regMiscItem("taintedEssenceNugget");
		
		weakEssenceGear = regMiscItem("weakEssenceGear");
		midEssenceGear = regMiscItem("midEssenceGear");
		strongEssenceGear = regMiscItem("strongEssenceGear");
		expertEssenceGear = regMiscItem("expertEssenceGear");
		masterEssenceGear = regMiscItem("masterEssenceGear");
		taintedEssenceGear = regMiscItem("taintedEssenceGear");
		
		essenceCoal = regMiscItem("essenceCoal");
		
		salt = regMiscItem("salt");
		
		weakEssenceAxe = new OreCropsAxe(OreCropsMaterialHandler.Tool.weak).setUnlocalizedName("weakEssenceAxe");
		regItem(weakEssenceAxe, "weakEssenceAxe");
		midEssenceAxe = new OreCropsAxe(OreCropsMaterialHandler.Tool.mid).setUnlocalizedName("midEssenceAxe");
		regItem(midEssenceAxe, "midEssenceAxe");
		strongEssenceAxe = new OreCropsAxe(OreCropsMaterialHandler.Tool.strong).setUnlocalizedName("strongEssenceAxe");
		regItem(strongEssenceAxe, "strongEssenceAxe");
		expertEssenceAxe = new OreCropsAxe(OreCropsMaterialHandler.Tool.expert).setUnlocalizedName("expertEssenceAxe");
		regItem(expertEssenceAxe, "expertEssenceAxe");
		masterEssenceAxe = new OreCropsAxe(OreCropsMaterialHandler.Tool.master).setUnlocalizedName("masterEssenceAxe");
		regItem(masterEssenceAxe, "masterEssenceAxe");
		
		weakEssenceHoe = new OreCropsHoe(OreCropsMaterialHandler.Tool.weak).setUnlocalizedName("weakEssenceHoe");
		regItem(weakEssenceHoe, "weakEssenceHoe");
		midEssenceHoe = new OreCropsHoe(OreCropsMaterialHandler.Tool.mid).setUnlocalizedName("midEssenceHoe");
		regItem(midEssenceHoe, "midEssenceHoe");
		strongEssenceHoe = new OreCropsHoe(OreCropsMaterialHandler.Tool.strong).setUnlocalizedName("strongEssenceHoe");
		regItem(strongEssenceHoe, "strongEssenceHoe");
		expertEssenceHoe = new OreCropsHoe(OreCropsMaterialHandler.Tool.expert).setUnlocalizedName("expertEssenceHoe");
		regItem(expertEssenceHoe, "expertEssenceHoe");
		masterEssenceHoe = new OreCropsHoe(OreCropsMaterialHandler.Tool.master).setUnlocalizedName("masterEssenceHoe");
		regItem(masterEssenceHoe, "masterEssenceHoe");
		
		weakEssencePickaxe = new OreCropsPickaxe(OreCropsMaterialHandler.Tool.weak).setUnlocalizedName("weakEssencePickaxe");
		regItem(weakEssencePickaxe, "weakEssencePickaxe");
		midEssencePickaxe = new OreCropsPickaxe(OreCropsMaterialHandler.Tool.mid).setUnlocalizedName("midEssencePickaxe");
		regItem(midEssencePickaxe, "midEssencePickaxe");
		strongEssencePickaxe = new OreCropsPickaxe(OreCropsMaterialHandler.Tool.strong).setUnlocalizedName("strongEssencePickaxe");
		regItem(strongEssencePickaxe, "strongEssencePickaxe");
		expertEssencePickaxe = new OreCropsPickaxe(OreCropsMaterialHandler.Tool.expert).setUnlocalizedName("expertEssencePickaxe");
		regItem(expertEssencePickaxe, "expertEssencePickaxe");
		masterEssencePickaxe = new OreCropsPickaxe(OreCropsMaterialHandler.Tool.master).setUnlocalizedName("masterEssencePickaxe");
		regItem(masterEssencePickaxe, "masterEssencePickaxe");
		
		weakEssenceShovel = new OreCropsShovel(OreCropsMaterialHandler.Tool.weak).setUnlocalizedName("weakEssenceShovel");
		regItem(weakEssenceShovel, "weakEssenceShovel");
		midEssenceShovel = new OreCropsShovel(OreCropsMaterialHandler.Tool.mid).setUnlocalizedName("midEssenceShovel");
		regItem(midEssenceShovel, "midEssenceShovel");
		strongEssenceShovel = new OreCropsShovel(OreCropsMaterialHandler.Tool.strong).setUnlocalizedName("strongEssenceShovel");
		regItem(strongEssenceShovel, "strongEssenceShovel");
		expertEssenceShovel = new OreCropsShovel(OreCropsMaterialHandler.Tool.expert).setUnlocalizedName("expertEssenceShovel");
		regItem(expertEssenceShovel, "expertEssenceShovel");
		masterEssenceShovel = new OreCropsShovel(OreCropsMaterialHandler.Tool.master).setUnlocalizedName("masterEssenceShovel");
		regItem(masterEssenceShovel, "masterEssenceShovel");
		
		weakEssenceSword = new OreCropsSword(OreCropsMaterialHandler.Tool.weak).setUnlocalizedName("weakEssenceSword");
		regItem(weakEssenceSword, "weakEssenceSword");
		midEssenceSword = new OreCropsSword(OreCropsMaterialHandler.Tool.mid).setUnlocalizedName("midEssenceSword");
		regItem(midEssenceSword, "midEssenceSword");
		strongEssenceSword = new OreCropsSword(OreCropsMaterialHandler.Tool.strong).setUnlocalizedName("strongEssenceSword");
		regItem(strongEssenceSword, "strongEssenceSword");
		expertEssenceSword = new OreCropsSword(OreCropsMaterialHandler.Tool.expert).setUnlocalizedName("expertEssenceSword");
		regItem(expertEssenceSword, "expertEssenceSword");
		masterEssenceSword = new OreCropsSword(OreCropsMaterialHandler.Tool.master).setUnlocalizedName("masterEssenceSword");
		regItem(masterEssenceSword, "masterEssenceSword");
		
		ironForgeHammer = new OreCropsForgeHammer(10).setUnlocalizedName("ironForgeHammer");
		regItem(ironForgeHammer, "ironForgeHammer");
		weakEssenceForgeHammer = new OreCropsForgeHammer(15).setUnlocalizedName("weakEssenceForgeHammer");
		regItem(weakEssenceForgeHammer, "weakEssenceForgeHammer");
		midEssenceForgeHammer = new OreCropsForgeHammer(25).setUnlocalizedName("midEssenceForgeHammer");
		regItem(midEssenceForgeHammer, "midEssenceForgeHammer");
		strongEssenceForgeHammer = new OreCropsForgeHammer(50).setUnlocalizedName("strongEssenceForgeHammer");
		regItem(strongEssenceForgeHammer, "strongEssenceForgeHammer");
		expertEssenceForgeHammer = new OreCropsForgeHammer(100).setUnlocalizedName("expertEssenceForgeHammer");
		regItem(expertEssenceForgeHammer, "expertEssenceForgeHammer");
		masterEssenceForgeHammer = new OreCropsForgeHammer(150).setUnlocalizedName("masterEssenceForgeHammer");
		regItem(masterEssenceForgeHammer, "masterEssenceForgeHammer");
		taintedEssenceForgeHammer = new OreCropsForgeHammer(75).setUnlocalizedName("taintedEssenceForgeHammer");
		regItem(taintedEssenceForgeHammer, "taintedEssenceForgeHammer");
		
		weakInfusionCrystal = new OreCropsInfusionCrystal(150).setUnlocalizedName("weakInfusionCrystal");
		regItem(weakInfusionCrystal, "weakInfusionCrystal");
		midInfusionCrystal = new OreCropsInfusionCrystal(200).setUnlocalizedName("midInfusionCrystal");
		regItem(midInfusionCrystal, "midInfusionCrystal");
		strongInfusionCrystal = new OreCropsInfusionCrystal(250).setUnlocalizedName("strongInfusionCrystal");
		regItem(strongInfusionCrystal, "strongInfusionCrystal");
		expertInfusionCrystal = new OreCropsInfusionCrystal(300).setUnlocalizedName("expertInfusionCrystal");
		regItem(expertInfusionCrystal, "expertInfusionCrystal");
		masterInfusionCrystal = new OreCropsInfusionCrystal(-1).setUnlocalizedName("masterInfusionCrystal");
		regItem(masterInfusionCrystal, "masterInfusionCrystal");
		taintedInfusionCrystal = new OreCropsInfusionCrystal(275).setUnlocalizedName("taintedInfusionCrystal");
		regItem(taintedInfusionCrystal, "taintedInfusionCrystal");
		
		magneticCoin = new OreCropsMagnet().setUnlocalizedName("magneticCoin");
		regItem(magneticCoin, "magneticCoin");
		
		SEEDS = new Item[] { essenceSeeds, fireSeeds, waterSeeds, natureSeeds, earthSeeds, dyeSeeds, airSeeds,
				coalSeeds, glowstoneSeeds, obsidianSeeds, netherSeeds, aluminumSeeds, xpSeeds, tinSeeds, copperSeeds,
				redstoneSeeds, ironSeeds, certusSeeds, lapisSeeds, goldSeeds, cobaltSeeds, arditeSeeds, leadSeeds,
				silverSeeds, manasteelSeeds, osmiumSeeds, steelSeeds, diamondSeeds, emeraldSeeds, terrasteelSeeds,
				manyullynSeeds, blazeSeeds, spiderSeeds, cowSeeds, chickenSeeds, pigSeeds, magmaSeeds, zombieSeeds,
				skeletonSeeds, witherSeeds, ghastSeeds, creeperSeeds, enderSeeds, slimeSeeds, sheepSeeds };

		DROPS = new Item[] { weakEssence, fireEssence, waterEssence, natureEssence, earthEssence, dyeEssence, airEssence,
				coalEssence, glowstoneEssence, obsidianEssence, netherEssence, aluminumEssence, xpEssence, tinEssence, copperEssence,
				redstoneEssence, ironEssence, certusEssence, lapisEssence, goldEssence, cobaltEssence, arditeEssence, leadEssence,
				silverEssence, manasteelEssence, osmiumEssence, steelEssence, diamondEssence, emeraldEssence, terrasteelEssence,
				manyullynEssence, blazeEssence, spiderEssence, cowEssence, chickenEssence, pigEssence, magmaEssence, zombieEssence,
				skeletonEssence, witherEssence, ghastEssence, creeperEssence, enderEssence, slimeEssence, sheepEssence };
		
		//MISC = new Item[] {};
		
	}

}
