package org.dpdns.sevenyuyv.icecream.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.dpdns.sevenyuyv.icecream.cream;

public class ModItems {

    public static final Item CREAM = new Item(new Item.Settings());
    public static final Item ORIGINAL_POPSICLE = new Item(new Item.Settings());
    public static final Item ORIGINAL_ICE_CREAM = new Item(new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, Identifier.of(cream.MOD_ID, "cream"), CREAM);
        Registry.register(Registries.ITEM, Identifier.of(cream.MOD_ID, "original_popsicle"), ORIGINAL_POPSICLE);
        Registry.register(Registries.ITEM, Identifier.of(cream.MOD_ID, "original_ice_cream"), ORIGINAL_ICE_CREAM);
    }
}