package net.orecrops.utils;

import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.orecrops.gameobjs.ModItems;

public class OreCropsRecipes {

	public static CraftingManager craftManager = CraftingManager.getInstance();
	public static List<IRecipe> recipes = craftManager.getRecipeList();
	
	public static void LoadOreCropsRecipes(){
		addCrafting();
		addSmelting();
	}
	
	private static void addSmelting(){
		
		
		
	}
	
	private static void addCrafting(){
		
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.lowEssence), new Object[]{" X ", "XCX", " X ", 'X', new ItemStack(ModItems.weakEssence), 'C', new ItemStack(ModItems.weakInfusionCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.midEssence), new Object[]{" X ", "XCX", " X ", 'X', new ItemStack(ModItems.lowEssence), 'C', new ItemStack(ModItems.midInfusionCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.strongEssence), new Object[]{" X ", "XCX", " X ", 'X', new ItemStack(ModItems.midEssence), 'C', new ItemStack(ModItems.strongInfusionCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.expertEssence), new Object[]{" X ", "XCX", " X ", 'X', new ItemStack(ModItems.strongEssence), 'C', new ItemStack(ModItems.expertInfusionCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.masterEssence), new Object[]{" X ", "XCX", " X ", 'X', new ItemStack(ModItems.expertEssence), 'C', new ItemStack(ModItems.masterInfusionCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.lowEssence), new Object[]{" X ", "XCX", " X ", 'X', new ItemStack(ModItems.weakEssence), 'C', new ItemStack(ModItems.masterInfusionCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.midEssence), new Object[]{" X ", "XCX", " X ", 'X', new ItemStack(ModItems.lowEssence), 'C', new ItemStack(ModItems.masterInfusionCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.strongEssence), new Object[]{" X ", "XCX", " X ", 'X', new ItemStack(ModItems.midEssence), 'C', new ItemStack(ModItems.masterInfusionCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.expertEssence), new Object[]{" X ", "XCX", " X ", 'X', new ItemStack(ModItems.strongEssence), 'C', new ItemStack(ModItems.masterInfusionCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.masterEssence), new Object[]{" X ", "XCX", " X ", 'X', new ItemStack(ModItems.expertEssence), 'C', new ItemStack(ModItems.masterInfusionCrystal, 1, OreDictionary.WILDCARD_VALUE)}));
		
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.essenceSeeds), new Object[]{" E ", "ESE", " E ", 'E', new ItemStack(ModItems.weakEssence), 'S', Items.WHEAT_SEEDS}));

		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.earthSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.midEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Blocks.DIRT}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.natureSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.midEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Items.WHEAT}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.airSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.midEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Items.GLASS_BOTTLE}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.fireSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.midEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Items.LAVA_BUCKET}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.waterSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.midEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Items.WATER_BUCKET}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.dyeSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.midEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "dye"}));
		
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.coalSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.strongEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Items.COAL}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.glowstoneSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.strongEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Items.GLOWSTONE_DUST}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.obsidianSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.strongEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Blocks.OBSIDIAN}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.netherSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.strongEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Blocks.NETHERRACK}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.xpSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.strongEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Items.EXPERIENCE_BOTTLE}));
				
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.redstoneSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "dustRedstone"}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.ironSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotIron"}));
		//recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.certusSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', Items.EXPERIENCE_BOTTLE}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.lapisSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "gemLapis"}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.goldSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotGold"}));
		//recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.osmiumSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotOsmium"}));
		
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.diamondSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.masterEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "gemDiamond"}));
		recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.emeraldSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.masterEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "gemEmerald"}));
				
		
		if(Loader.isModLoaded(OreCropsCompatibility.MOD_ID.TINKERS_CONSTRUCT)){
			
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.cobaltSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotCobalt"}));
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.arditeSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotArdite"}));
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.manyullynSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.masterEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotManyullyn"}));	
		}
		
		if(Loader.isModLoaded(OreCropsCompatibility.MOD_ID.BOTANIA)){
			
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.manasteelSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotManasteel"}));
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.terrasteelSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.masterEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotTerrasteel"}));
			
		}
		
		if(Loader.isModLoaded(OreCropsCompatibility.MOD_ID.AL)){
			
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.aluminumSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.strongEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotAluminum"}));
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.tinSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.strongEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotTin"}));
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.copperSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.strongEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotCopper"}));
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.steelSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotSteel"}));
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.leadSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotLead"}));
			recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.silverSeeds), new Object[]{"DED", "ESE", "DED", 'E', new ItemStack(ModItems.expertEssence), 'S', new ItemStack(ModItems.essenceSeeds), 'D', "ingotSilver"}));
			
		}
				
	}
	
}
