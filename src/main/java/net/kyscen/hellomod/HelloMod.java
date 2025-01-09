package net.kyscen.hellomod;

import net.fabricmc.api.ModInitializer;
import net.kyscen.hellomod.item.ModItemGroups;
import net.kyscen.hellomod.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMod implements ModInitializer {
	public static final String MOD_ID = "hellomod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems(); 
	}
}