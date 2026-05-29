package com.linglan.lencey.datagen;

import com.linglan.lencey.block.ModBlocks;
import com.linglan.lencey.tag.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.LENCEY_BLOCK);

        valueLookupBuilder(ModBlockTags.PICKAXE_AXE_MINEABLE)
                .forceAddTag(BlockTags.MINEABLE_WITH_PICKAXE);
    }
}
