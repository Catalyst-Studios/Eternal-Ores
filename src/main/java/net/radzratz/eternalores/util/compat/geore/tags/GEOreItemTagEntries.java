package net.radzratz.eternalores.util.compat.geore.tags;

import net.minecraft.core.HolderLookup;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;
import net.radzratz.eternalores.util.tags.item.util.ITagItemEntryProvider;
import net.radzratz.eternalores.util.tags.item.util.ItemTagAutoRegister;
import net.radzratz.eternalores.util.compat.geore.blocks.*;
import net.radzratz.eternalores.util.compat.geore.item.GEOreShardItem;

import java.util.Comparator;

import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.allGeOreBlockEntries;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.allGeOreItemEntries;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Compat.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.GeOreBuds.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.GeOreShardBlocks.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.GeOresShards.*;

public class GEOreItemTagEntries implements ITagItemEntryProvider {
    @Override
    public void addTags(EOItemTagProvider provider, HolderLookup.Provider lookup) {
        ItemTagAutoRegister register = new ItemTagAutoRegister(provider);

        allGeOreItemEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry -> {
            Object item = entry.get();

            if (item instanceof GEOreShardItem) {
                register.registerGeOre(entry, GEOSHARDS, true, true);
            }
        });

        allGeOreBlockEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry -> {
            Object block = entry.get();

            if (block instanceof GEOreBuddingBlock) {
                register.register(entry, BUDDING_BLOCKS, false, true);

                register.registerGeOre(entry, GEO_BUDDING_BLOCKS_ITEM, false, true);
            }

            if (block instanceof GEOreShardBlock) {
                register.registerGeOre(entry, GEOSHARD_BLOCKS, true, true);
            }

            if (block instanceof GEOreSmallBuds) {
                register.registerMC(entry, BUDS, false, true);

                register.registerGeOre(entry, GEORE_SMALL_BUDS, true, true);
            }

            if (block instanceof GEOreMediumBuds) {
                register.registerMC(entry, BUDS, false, true);

                register.registerGeOre(entry, GEORE_MEDIUM_BUDS, true, true);
            }

            if (block instanceof GEOreLargeBuds) {
                register.registerMC(entry, BUDS, false, true);

                register.registerGeOre(entry, GEORE_LARGE_BUDS, true, true);
            }

            if (block instanceof GEOreClusterBlock) {
                register.registerMC(entry, CLUSTERS, false, true);

                register.registerGeOre(entry, GEORE_CLUSTERS, true, true);
            }
        });
    }
}
