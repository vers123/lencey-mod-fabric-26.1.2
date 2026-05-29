package com.linglan.lencey.datagen;

import com.linglan.lencey.block.ModBlocks;
import com.linglan.lencey.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.lencey", "Lencey Tab");

        translationBuilder.add(ModItems.LENCEY, "Lencey");
        translationBuilder.add(ModBlocks.LENCEY_BLOCK, "Lencey Block");

        translationBuilder.add("tooltip.lencey.lencey_tooltip.shift", "This is an item that can be used to increase Exp.");
        translationBuilder.add("tooltip.lencey.lencey_tooltip", "Hold §6§n§l§oSHIFT§r§r§r§r for more info!");
    }
}
