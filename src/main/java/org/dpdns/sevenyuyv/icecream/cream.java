package org.dpdns.sevenyuyv.icecream;

import org.dpdns.sevenyuyv.icecream.registry.ModItems;
import org.dpdns.sevenyuyv.icecream.recipe.ModRecipes;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class cream implements ModInitializer {
	public static final String MOD_ID = "icecream";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// 注册物品
		ModItems.register();
		// 注册配方
		ModRecipes.register();

		LOGGER.info("Ice Cream Mod initialized! Cream registered.");
	}
}
