package net.radzratz.eternalores.util.tags.item;

import mekanism.common.tags.MekanismTags;
import net.minecraft.core.HolderLookup;
import net.radzratz.eternalores.block.types.*;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;
import net.radzratz.eternalores.item.special.prospectors.EOAdvProspector;
import net.radzratz.eternalores.item.special.prospectors.EOBasicProspector;
import net.radzratz.eternalores.util.tags.item.util.ITagItemEntryProvider;
import net.radzratz.eternalores.util.tags.item.util.ItemTagAutoRegister;
import net.radzratz.eternalores.item.tools.*;
import net.radzratz.eternalores.item.types.*;

import java.util.Comparator;

import static mekanism.common.tags.MekanismTags.Items.CLUMPS;
import static mekanism.common.tags.MekanismTags.Items.DIRTY_DUSTS;
import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOUtils.allBlockEntries;
import static net.radzratz.eternalores.util.EOUtils.allItemEntries;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Blends.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Compat.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.DustBlocks.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Enriched.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Foils.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Gears.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.GemShards.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.OreGems.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ores.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Plates.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.SmallClumps.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.SmallDusts.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.StorageBlocks.ITEM_STORAGE_RAW;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Wires.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Pebbles.PEBBLES;

public class EOItemTagEntries implements ITagItemEntryProvider {
    @Override
    public void addTags(EOItemTagProvider provider, HolderLookup.Provider lookup) {
        ItemTagAutoRegister register = new ItemTagAutoRegister(provider);

        allItemEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry -> {

            Object item = entry.get();

            if (item instanceof EOIngotItem) {
                register.register(entry, INGOTS, true, false);
            }

            if (item instanceof EONuggetItem) {
                register.register(entry, NUGGETS, true, false);
            }

            if (item instanceof EOHammers) {
                register.register(entry, HAMMERS, true, false);
                register.register(entry, ETERNAL_BLACKLIST, false, true);
            }

            if (item instanceof EOGemCutter) {
                register.register(entry, GEM_CUTTERS, true, false);
                register.register(entry, ETERNAL_BLACKLIST, false, false);
            }

            if (item instanceof EOWireCutter) {
                register.register(entry, WIRE_CUTTERS, true, false);

                register.register(entry, ETERNAL_BLACKLIST, false, true);
            }

            if (item instanceof EOPlateItem) {
                register.register(entry, PLATES, true, false);
            }

            if (item instanceof EORodItem) {
                register.register(entry, RODS, true, false);
            }

            if (item instanceof EORawMaterialItem) {
                register.register(entry, RAW_MATERIALS, true, false);
            }

            if (item instanceof EOGemItem) {
                register.register(entry, GEMS, true, false);
            }

            if (item instanceof EOGemShardItem) {
                register.register(entry, GEM_SHARDS, true, false);
            }

            if (item instanceof EOGearItem) {
                register.register(entry, GEARS, true, false);
            }

            if (item instanceof EOFoilItem) {
                register.register(entry, FOILS, true, false);
            }

            if (item instanceof EOWireItem) {
                register.register(entry, WIRES, true, false);
            }

            if (item instanceof EODustItem) {
                register.register(entry, DUSTS, true, false);
            }

            if (item instanceof EOSmallDustItem) {
                register.register(entry, SMALL_DUSTS, true, false);
            }

            if (item instanceof EOrGemItem) {
                register.register(entry, ORE_GEMS, true, false);
            }

            if (item instanceof EOSmallClumpItem) {
                register.register(entry, SMALL_CLUMPS, true, false);
            }

            if (item instanceof EOBlends) {
                register.register(entry, BLENDS, true, false);
            }

            if (item instanceof EOMolds) {
                register.register(entry, MOLDS, true, false);
                register.register(entry, PRESS_MOLDS, false, true);
            }

            if (item instanceof EOBasicProspector || item instanceof EOAdvProspector) {
                register.register(entry, PROSPECTORS, true, false);
            }

            if (item instanceof EOClumpItem) {
                register.register(entry, EOItemTags.Clumps.CLUMPS, true, false);
                register.registerCreate(entry, CREATE_CRUSHED_RAW_MATERIALS, false, true);
                register.register(entry, CLUMPS, false, true);
            }

            if (item instanceof EOShardItem) {
                register.register(entry, EOItemTags.Shards.SHARDS, true, false);
                register.register(entry, MekanismTags.Items.SHARDS, false, true);
            }

            if (item instanceof EOCrystalItem) {
                register.register(entry, EOItemTags.Crystals.CRYSTALS, true, false);
                register.register(entry, MekanismTags.Items.CRYSTALS, false, true);
            }

            if (item instanceof EOEnrichedItems) {
                register.register(entry, ENRICHED, true, false);
                register.register(entry, MekanismTags.Items.ENRICHED, false, true);
                register.registerMek(entry, MekanismTags.Items.ENRICHED, true, true);
            }

            if (item instanceof EODirtyDustItem) {
                register.register(entry, EOItemTags.DirtyDusts.DIRTY_DUSTS, true, false);
                register.register(entry, DIRTY_DUSTS, false, true);
            }

            if (item instanceof EOPebbleItem) {
                register.register(entry, PEBBLES, true, false);
            }
        });

        allBlockEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry -> {
            Object blocks = entry.get();

            if (blocks instanceof EOreBlock ore) {
                register.register(entry, ORES, ore.getLayerType(), ITEM_ORES_IN_GROUND_SAND, ORES_IN_GROUND_STONE, ORES_IN_GROUND_DEEPSLATE, ITEM_ORES_IN_GROUND_SCULK,
                        ORES_IN_GROUND_NETHERRACK, ITEM_ORES_IN_GROUND_END);
            }

            if (blocks instanceof EOStorageBlock) {
                register.register(entry, STORAGE_BLOCKS, true, false);
            }

            if (blocks instanceof EORawBlock) {
                register.registerPrefixedOnly(entry, ITEM_STORAGE_RAW, false);
                register.register(entry, STORAGE_BLOCKS, false, false);
            }

            if (blocks instanceof EODustBlock) {
                register.register(entry, ITEM_DUST_BLOCK, true, false);
            }

            if (blocks instanceof EOCoalBlock) {
                register.register(entry, STORAGE_BLOCKS, true, false);
            }
        });
    }
}
