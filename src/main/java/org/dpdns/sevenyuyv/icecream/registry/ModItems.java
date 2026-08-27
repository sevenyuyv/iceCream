package org.dpdns.sevenyuyv.icecream.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.dpdns.sevenyuyv.icecream.IceCream;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;

public class ModItems {

    public static final FoodComponent ORIGINAL_POPSICLE_FOOD = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build();

    // 原味冰淇淋: 2点饱食度, 1.0饱和度系数(即2点饱和度)
    public static final FoodComponent ORIGINAL_ICE_CREAM_FOOD = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(1.0f)
            .build();

    // 甜筒: 1点饱食度, 0.5饱和度系数
    public static final FoodComponent CONE_FOOD = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.5f)
            .build();

    // 2. 创建物品实例，并通过 component 方法挂载食物数据
    public static final Item CREAM = new Item(new Item.Settings());

    public static final Item ORIGINAL_POPSICLE = new Item(new Item.Settings()
            .component(DataComponentTypes.FOOD, ORIGINAL_POPSICLE_FOOD));

    public static final Item ORIGINAL_ICE_CREAM = new Item(new Item.Settings()
            .component(DataComponentTypes.FOOD, ORIGINAL_ICE_CREAM_FOOD));

    public static final Item CONE = new Item(new Item.Settings()
            .component(DataComponentTypes.FOOD, CONE_FOOD));

    public static void register() {
        Registry.register(Registries.ITEM, Identifier.of(IceCream.MOD_ID, "cream"), CREAM);
        Registry.register(Registries.ITEM, Identifier.of(IceCream.MOD_ID, "original_popsicle"), ORIGINAL_POPSICLE);
        Registry.register(Registries.ITEM, Identifier.of(IceCream.MOD_ID, "original_ice_cream"), ORIGINAL_ICE_CREAM);
        Registry.register(Registries.ITEM, Identifier.of(IceCream.MOD_ID, "cone"), CONE);
    }
}