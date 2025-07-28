package net.radzratz.eternalores.datagen.tags.items;

import net.minecraft.core.HolderLookup;
import net.radzratz.eternalores.block.types.EOBlock;
import net.radzratz.eternalores.block.types.EOMiscBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;
import net.radzratz.eternalores.datagen.tags.util.item.ITagEntryProvider;
import net.radzratz.eternalores.datagen.tags.util.item.ItemTagAutoRegister;
import net.radzratz.eternalores.item.tools.EOGemCutter;
import net.radzratz.eternalores.item.tools.EOHammers;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.compat.util.types.*;

import java.util.Comparator;

import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOUtils.allBlockEntries;
import static net.radzratz.eternalores.util.EOUtils.allItemEntries;
import static net.radzratz.eternalores.util.tags.item.EOItemsGeneralTags.Items.*;

/**
 * Registers all item and block as item tag entries for the Eternal Ores mod.
 * <p>
 * This class serves as a unified entry point that automatically detects item/block as item types
 * and applies the appropriate tags using {@link ItemTagAutoRegister}.
 * <p>
 * It significantly reduces boilerplate code by replacing individual tag entry classes with
 * a streamlined, type-based registration system.
 */
public class EOItemTagEntries implements ITagEntryProvider
{
    @Override
    public void addTags(EOItemTagProvider provider, HolderLookup.Provider lookup)
    {
        ItemTagAutoRegister register = new ItemTagAutoRegister(provider);

        allItemEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry ->
                {
                    Object obj = entry.get();

                    switch (obj)
                    {
                        case EOIngotItem ingot -> register.register(entry, INGOTS, true);

                        case EONuggetItem nugget -> register.register(entry, NUGGETS, true);

                        case EOHammers hammer -> register.register(entry, hammers, true);

                        case EOGemCutter gem_cutter -> register.register(entry, GEM_CUTTER, true);

                        case EOPlateItem plate -> register.register(entry, PLATES, plate.getPlateType(), METAL_PLATES, GEM_PLATES, MISC_PLATES);

                        case EORodItem rod -> register.register(entry, RODS, rod.getRodType(), METAL_RODS, GEM_RODS, MISC_RODS);

                        case EORawMaterialItem raw_material -> register.register(entry, RAW_MATERIALS, true);

                        case EOGemItem gem -> register.register(entry, GEMS, true);

                        case EOGearItem gear -> register.register(entry, GEARS, gear.getGearType(), METAL_GEARS, GEM_GEARS, MISC_GEARS);

                        case EOWireItem wire -> register.register(entry, WIRES, true);

                        case EODustItem dust -> register.register(entry, DUSTS, dust.getDustType(), METAL_DUSTS, GEM_DUSTS, MISC_DUSTS, STONE_DUSTS, WOOD_DUSTS);

                        case EOSmallDustItem small_dust -> register.register(entry, O_SMALL_DUST_C, true);

                        case EODirtyDustItem dirty_dust -> register.register(entry, DIRTY_DUST_C, true);

                        case EOrGemItem ore_gem -> register.register(entry, O_GEM_C, true);

                        case EOSmallClumpItem small_clump -> register.register(entry, O_SMALL_CLUMP_C, true);

                        case EOClumpItem clump -> register.register(entry, CLUMP_C, true);

                        case EOShardItem shard -> register.register(entry, SHARDS_C, true);

                        case EOCrystalItem crystal -> register.register(entry, CRYSTALS_C, true);

                        default -> {}
                    }
                });

        allBlockEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry ->
                {
                    Object obj = entry.get();

                    switch (obj)
                    {
                        case EOreBlock ore -> register.register(entry, ORES, ore.getLayerType(), ORES_IN_GROUND_STONE, ORES_IN_GROUND_DEEPSLATE, ORES_IN_GROUND_NETHERRACK);

                        case EOBlock block -> register.register(entry, STORAGE_BLOCKS, block.getBlockType());

                        case EOMiscBlock block -> register.register(entry, STORAGE_BLOCKS, block.getMiscBlock());

                        case EORawBlock block -> register.register(entry, STORAGE_BLOCKS, block.rawType(), ITEM_RAW_BLOCK);

                        default -> {}
                    }

                    if (obj instanceof EORawBlock block)
                    {
                        register.register(entry, ITEM_RAW_BLOCK, block.rawType());
                    }
                });
    }
}
