package net.radzratz.eternalores.item.special.prospectors.utils;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.radzratz.eternalores.util.config.EOToolsConfig;

import java.util.Optional;

import static net.radzratz.eternalores.util.EOUtils.C;

public class EOProspectorUtils {
    public static TagKey<Block> resolveOreTag(String material) {
        return TagKey.create(BuiltInRegistries.BLOCK.key(), C("ores/" + material));
    }

    public static Optional<String> findMaterialFromBlock(Level level, BlockPos pos) {
        BlockState state = level.getBlockState(pos);
        for (String material : EOToolsConfig.CFG.prospectorListAndColors.getMaterials()) {
            if (state.is(resolveOreTag(material))) return Optional.of(material);
        }
        return Optional.empty();
    }
}
