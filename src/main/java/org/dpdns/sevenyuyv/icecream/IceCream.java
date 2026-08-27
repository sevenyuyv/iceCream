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
		// 手动触发ModItems类加载，确保在安全时序下完成所有物品实例初始化
		try {
			Class.forName(ModItems.class.getName());
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Failed to load ModItems class", e);
		}
		// 后续再执行注册、配方加载等逻辑
		ModItems.register();
		ModRecipes.register();
		LOGGER.info("Ice Cream Mod initialized! Cream registered.");
	}
}