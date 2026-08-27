package org.dpdns.sevenyuyv.icecream;

import org.dpdns.sevenyuyv.icecream.registry.ModItems;
import org.dpdns.sevenyuyv.icecream.recipe.ModRecipes;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IceCream implements ModInitializer {
	public static final String MOD_ID = "icecream";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// 触发ModItems类加载，按照官方规范完成所有物品注册
		ModItems.initialize();
		ModRecipes.register();
		LOGGER.info("Ice Cream Mod initialized! All food items loaded normally.");
	}
}
