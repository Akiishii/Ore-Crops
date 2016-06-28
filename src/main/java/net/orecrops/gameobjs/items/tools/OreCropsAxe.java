package net.orecrops.gameobjs.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.orecrops.OreCrops;

public class OreCropsAxe extends OreCropsAdvancedAxe{

	public OreCropsAxe(ToolMaterial material) {
		super(material, 2.0F);
		this.setCreativeTab(OreCrops.cropsTab);
	}

}
