package net.radzratz.eternalores.util.compat.geore.tags;

import net.minecraft.core.HolderLookup;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;
import net.radzratz.eternalores.util.tags.block.util.BlockTagAutoRegister;
import net.radzratz.eternalores.util.tags.block.util.ITagBlockEntryProvider;
import net.radzratz.eternalores.util.compat.geore.blocks.*;

import java.util.Comparator;

import static net.minecraft.tags.BlockTags.*;
import static net.neoforged.neoforge.common.Tags.Blocks.*;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.allGeOreBlockEntries;
import static net.radzratz.eternalores.util.tags.block.EOBlockTags.GeOreBuds.*;
import static net.radzratz.eternalores.util.tags.block.EOBlockTags.GeOreShardBlocks.GEOSHARD_BLOCKS;

public class GEOreBlockTagEntries implements ITagBlockEntryProvider {
    @Override
    public void addTags(EOBlockTagProvider provider, HolderLookup.Provider lookup) {
        BlockTagAutoRegister register = new BlockTagAutoRegister(provider);

        allGeOreBlockEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry -> {
            Object blocks = entry.get();

            if (blocks instanceof GEOreBuddingBlock block) {
                register.registerMC(entry, CRYSTAL_SOUND_BLOCKS, false, true);

                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), true, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);

                register.register(entry, BUDDING_BLOCKS, false, true);

                register.registerGeo(entry, GEORE_BUDDING, false, true);
            }

            if (blocks instanceof GEOreShardBlock block) {
                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), true, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);

                register.registerGeo(entry, GEOSHARD_BLOCKS, true, true);
            }

            if (blocks instanceof GEOreClusterBlock block) {
                register.registerMC(entry, CLUSTERS, false, true);

                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), true, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);
            }

            if (blocks instanceof GEOreSmallBuds block) {
                register.registerMC(entry, BUDS, false, true);

                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), true, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);

                register.registerGeo(entry, GEORE_SMALL_BUDS, true, true );
            }

            if (blocks instanceof GEOreMediumBuds block) {
                register.registerMC(entry, BUDS, false, true);

                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), true, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);

                register.registerGeo(entry, GEORE_MEDIUM_BUDS, true, true);
            }

            if (blocks instanceof GEOreLargeBuds block) {
                register.registerMC(entry, BUDS, false, true);

                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), true, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);

                register.registerGeo(entry, GEORE_LARGE_BUDS, true, true);
            }

            if (blocks instanceof GEOreClusterBlock block) {
                register.registerMC(entry, CLUSTERS, false, true);

                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), true, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);

                register.registerGeo(entry, GEORE_CLUSTERS, true, true);
            }
        });
    }
}
