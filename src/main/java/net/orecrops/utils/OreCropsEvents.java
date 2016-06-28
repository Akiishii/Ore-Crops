package net.orecrops.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class OreCropsEvents {

	private boolean hasShownUp = false;
	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent e){
		
		if(OreCropsUpdate.isNewVersionAvailable() && !hasShownUp && Minecraft.getMinecraft().currentScreen == null){
			Minecraft.getMinecraft().thePlayer.sendChatMessage("OreCrops has been updated! Check Curse for the latest Version."  );
			hasShownUp = true;
		}
		
	}
	
}
