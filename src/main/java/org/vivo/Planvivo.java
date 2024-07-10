package org.vivo;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vivo.item.ModItems;

public class Planvivo implements ModInitializer {

	public static final String MOD_ID = "planvivo";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
