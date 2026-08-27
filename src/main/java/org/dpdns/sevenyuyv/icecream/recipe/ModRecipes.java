package org.dpdns.sevenyuyv.icecream.recipe;

import org.dpdns.sevenyuyv.icecream.cream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModRecipes {
    public static final Logger LOGGER = LoggerFactory.getLogger("IceCream Recipes");

    public static void register() {
        // 1.21+ 版本推荐使用 JSON 数据包注册配方，无需在 Java 中注册 Serializer
        LOGGER.info("Recipes are loaded via data packs (JSON).");
    }
}