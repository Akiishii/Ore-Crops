package net.orecrops.gameobjs.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.orecrops.OreCrops;

public class OreCropsPickaxe extends OreCropsAdvancedPickaxe
{
	
	public OreCropsPickaxe(ToolMaterial material) {
		super(material, 4F);
		this.setCreativeTab(OreCrops.cropsTab);
	}
    
}