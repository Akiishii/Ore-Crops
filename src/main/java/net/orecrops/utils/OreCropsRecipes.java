package net.orecrops.utils;

import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;

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
		

	}
	
}
