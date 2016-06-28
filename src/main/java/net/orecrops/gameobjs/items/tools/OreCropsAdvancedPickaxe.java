package net.orecrops.gameobjs.items.tools;

import net.minecraft.item.ItemPickaxe;

public class OreCropsAdvancedPickaxe extends ItemPickaxe{

	private final float attackSpeed;
	
	public OreCropsAdvancedPickaxe(ToolMaterial material, float attackSpeed) {
		super(material);
		this.attackSpeed = attackSpeed;
	}

}
