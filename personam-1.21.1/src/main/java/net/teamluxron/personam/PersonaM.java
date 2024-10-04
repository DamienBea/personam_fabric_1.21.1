package net.teamluxron.personam;

import net.fabricmc.api.ModInitializer;

import net.teamluxron.personam.blocks.ModBlocks;
import net.teamluxron.personam.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PersonaM implements ModInitializer {
	public static final String MOD_ID = "personam";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize(){
//		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}