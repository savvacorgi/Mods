package org.vivo;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Planvivo implements ModInitializer {

	public static final String MODID = "planvivo";

    public static final Logger LOGGER = LoggerFactory.getLogger("MODID");

	@Override
	public void onInitialize() {

		LOGGER.info("Planvivo mod activatet!");
	}
}
