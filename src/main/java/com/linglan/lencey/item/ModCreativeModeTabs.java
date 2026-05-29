package com.linglan.lencey.item;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static final ResourceKey<CreativeModeTab> LENCEY_TAB = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(),  Identifier.fromNamespaceAndPath(LenceyMod.MOD_ID, "lencey"));

    public static final CreativeModeTab LENCEY = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.LENCEY))
            .title(Component.translatable("itemGroup.lencey"))
            .displayItems((parameters, output) -> {
                output.accept(ModBlocks.LENCEY_BLOCK);
                output.accept(ModItems.LENCEY);
            }).build();

    public static void register() {
        LenceyMod.LOGGER.info("Registering Mod Creative Mode Tabs " + LenceyMod.MOD_ID);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, LENCEY_TAB, LENCEY);
    }
}
