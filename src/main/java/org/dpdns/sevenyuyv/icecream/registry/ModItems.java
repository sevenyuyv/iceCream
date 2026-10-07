package org.dpdns.sevenyuyv.icecream.registry;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.dpdns.sevenyuyv.icecream.IceCream;
import net.minecraft.component.type.FoodComponent;
import java.util.function.Function;

public final class ModItems {
    private ModItems() {}

    // 定义所有食物属性组件
    public static final FoodComponent ORIGINAL_POPSICLE_FOOD = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build();

    public static final FoodComponent ORIGINAL_ICE_CREAM_FOOD = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(1.0f)
            .build();

    public static final FoodComponent CONE_FOOD = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.5f)
            .build();

    public static final FoodComponent SWEET_POPSICLE_FOOD = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.5f)
            .build();

    // 注册所有物品。
    // 注意：1.21.2 起“能否被食用”由 CONSUMABLE（ConsumableComponent）组件决定，
    // FOOD 组件只提供营养值与饱和度。必须使用 Item.Settings#food 同时写入两者，
    // 单独 .component(DataComponentTypes.FOOD, ...) 的物品右键不会触发进食。
    public static final Item CREAM = register("cream", Item::new, new Item.Settings());
    public static final Item ORIGINAL_POPSICLE = register("original_popsicle", Item::new,
            new Item.Settings().food(ORIGINAL_POPSICLE_FOOD));
    public static final Item ORIGINAL_ICE_CREAM = register("original_ice_cream", Item::new,
            new Item.Settings().food(ORIGINAL_ICE_CREAM_FOOD));
    public static final Item CONE = register("cone", Item::new,
            new Item.Settings().food(CONE_FOOD));
    public static final Item SWEET_POPSICLE = register("sweet_popsicle", Item::new,
            new Item.Settings().food(SWEET_POPSICLE_FOOD));

    public static Item register(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IceCream.MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }

    public static void initialize() {}
}
