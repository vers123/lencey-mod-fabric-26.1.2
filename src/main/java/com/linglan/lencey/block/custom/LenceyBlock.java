package com.linglan.lencey.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class LenceyBlock extends Block {
    public LenceyBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState onState, Entity entity) {
        if(!level.isClientSide()) {
            if (entity instanceof Player player && player.experienceLevel >= 1 && player.tickCount % 20 == 0) {
                player.giveExperienceLevels(-1);
            }
        }
    }
}
