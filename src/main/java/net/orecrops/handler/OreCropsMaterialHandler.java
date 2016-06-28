package net.orecrops.handler;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class OreCropsMaterialHandler {

	public static final class Tool{
		
		public static final ToolMaterial weak = EnumHelper.addToolMaterial("weak", 2, 256, 3F, 3F, 30);
		public static final ToolMaterial mid = EnumHelper.addToolMaterial("mid", 2, 1024, 4F, 4.5F, 30);
		public static final ToolMaterial strong = EnumHelper.addToolMaterial("strong", 2, 2048, 6F, 6F, 30);
		public static final ToolMaterial expert = EnumHelper.addToolMaterial("expert", 3, 4096, 8F, 7.5F, 30);
		public static final ToolMaterial master = EnumHelper.addToolMaterial("master", 3, -1, 12F, 9F, 30);
		
	}
	
	public static final class Armor{
		
		public static final ArmorMaterial weak = EnumHelper.addArmorMaterial("weak", "", 256, new int []{3, 4, 2, 1}, 30, null, 5F);
		
	}
	
}
