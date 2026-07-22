package net.radzratz.eternalores.datagen.tags;

import appeng.core.definitions.AEBlocks;
import com.refinedmods.refinedstorage.common.content.ContentIds;
import mekanism.common.tags.MekanismTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.tags.item.EOItemTagEntries;
import net.radzratz.eternalores.util.tags.item.util.ITagItemEntryProvider;
import net.radzratz.eternalores.util.compat.geore.tags.GEOreItemTagEntries;
import net.radzratz.eternalores.util.tags.item.EOItemTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static blusunrize.immersiveengineering.common.register.IEItems.Molds.*;
import static me.jddev0.ep.item.EPItems.*;
import static net.minecraft.tags.ItemTags.COALS;
import static net.minecraft.world.item.Items.*;
import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Blends.BLENDS;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Blends.BLENDS_SILICON;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Clumps.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Common.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Compat.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.DustBlocks.ITEM_DUST_BLOCK_COAL_COKE;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.DustBlocks.ITEM_DUST_BLOCK_COKE_COAL_R;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Dusts.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Enriched.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Gears.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.GemShards.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ingots.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Items.BISMUTH;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.OreGems.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ores.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Pebbles.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Plates.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Rods.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.SmallClumps.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.SmallDusts.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.StorageBlocks.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.*;

public class EOItemTagProvider extends ItemTagsProvider {
    private final List<ITagItemEntryProvider> entryProviders = new ArrayList<>();

    public EOItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                             CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, EternalOres.id, existingFileHelper);
        entryProviders.add(new EOItemTagEntries());
        entryProviders.add(new GEOreItemTagEntries());
    }

    public IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> getItemTag(TagKey<Item> tag) {
        return super.tag(tag);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        for (ITagItemEntryProvider tagProvider : entryProviders) {
            tagProvider.addTags(this, provider);
        }

        tag(EOItemTags.Coals.COAL).add(Items.COAL);
        tag(EOItemTags.Coals.CHARCOAL).add(Items.CHARCOAL);
        tag(EOItemTags.Coals.COAL_COKE).add(COKE_SET.COAL.get());
        tag(EOItemTags.Coals.BITUMINOUS).add(BITUMINOUS_SET.COAL.get());
        tag(EOItemTags.Coals.ANTHRACITE).add(ANTHRACITE_SET.COAL.get());
        tag(EOItemTags.Coals.PEAT).add(PEAT_SET.COAL.get());
        tag(EOItemTags.Coals.LIGNITE).add(LIGNITE_SET.COAL.get());
        tag(COALS).add(
                ANTHRACITE_SET.COAL.get(),
                BITUMINOUS_SET.COAL.get(),
                COKE_SET.COAL.get(),
                LIGNITE_SET.COAL.get(),
                PEAT_SET.COAL.get()
        );

        tag(BISMUTH).add(BISMUTH_SET.ITEM.get());

        tag(ITEM_STORAGE_COKE).add(COKE_SET.COAL_BLOCK.get().asItem());
        tag(ITEM_STORAGE_COAL_COKE).add(COKE_SET.COAL_BLOCK.get().asItem());
        tag(ITEM_STORAGE_FLUIX).add(FLUIX_SET.BLOCK.get().asItem());
        tag(ITEM_STORAGE_SOURCE).add(SOURCE_SET.BLOCK.get().asItem());

        tag(EOItemTags.Items.SCULKS).add(Items.SCULK);

        tag(DYES).add(LAPIS_SET.DUST.get());
        tag(DYES_BLUE).add(LAPIS_SET.DUST.get());

        tag(EOItemTags.Items.SILICON).add(SILICON_SET.ITEM.get());
        tag(ITEM_URANINITE_ORE).add(URANINITE_SET.ORE.get().asItem());
        tag(ITEM_URANINITE_ORE).add(URANINITE_SET.SLATE_ORE.get().asItem());

        tag(DUSTS_SALTPETER).add(NITER_SET.DUST.get());
        tag(EOItemTags.Items.SALT).add(SALT_SET.DUST.get());
        tag(DUSTS_WOOD).add(WOOD_SET.DUST.get());
        tag(DUSTS_COKE).add(COKE_SET.DUST.get().asItem());
        tag(DUSTS_DUST).add(DUST_SET.DUST.get().asItem());

        tag(SMALL_DUSTS_COAL_COKE).add(COKE_SET.SMALL_DUST.get().asItem());
        tag(ITEM_DUST_BLOCK_COAL_COKE).add(COKE_SET.DUST_BLOCK.get().asItem());

        tag(GEAR_STONES).add(
                ANDESITE_SET.GEAR.get(),
                BASALT_SET.GEAR.get(),
                BLACKSTONE_SET.GEAR.get(),
                CALCITE_SET.GEAR.get(),
                GRANITE_SET.GEAR.get(),
                DEEPSLATE_SET.GEAR.get(),
                DIORITE_SET.GEAR.get(),
                END_STONE_SET.GEAR.get(),
                NETHERRACK_SET.GEAR.get(),
                STONE_SET.GEAR.get(),
                TUFF_SET.GEAR.get()
        );

        tag(PLATES_STONES).add(
                ANDESITE_SET.PLATE.get(),
                BASALT_SET.PLATE.get(),
                BLACKSTONE_SET.PLATE.get(),
                CALCITE_SET.PLATE.get(),
                GRANITE_SET.PLATE.get(),
                DEEPSLATE_SET.PLATE.get(),
                DIORITE_SET.PLATE.get(),
                END_STONE_SET.PLATE.get(),
                NETHERRACK_SET.PLATE.get(),
                STONE_SET.PLATE.get(),
                TUFF_SET.PLATE.get()
        );

        tag(RODS_STONES).add(
                ANDESITE_SET.ROD.get(),
                BASALT_SET.ROD.get(),
                BLACKSTONE_SET.ROD.get(),
                CALCITE_SET.ROD.get(),
                GRANITE_SET.ROD.get(),
                DEEPSLATE_SET.ROD.get(),
                DIORITE_SET.ROD.get(),
                END_STONE_SET.ROD.get(),
                NETHERRACK_SET.ROD.get(),
                STONE_SET.ROD.get(),
                TUFF_SET.ROD.get()
        );

        tag(DUSTS_STONES).add(
                ANDESITE_SET.DUST.get(),
                BASALT_SET.DUST.get(),
                BLACKSTONE_SET.DUST.get(),
                CALCITE_SET.DUST.get(),
                GRANITE_SET.DUST.get(),
                DEEPSLATE_SET.DUST.get(),
                DIORITE_SET.DUST.get(),
                END_STONE_SET.DUST.get(),
                NETHERRACK_SET.DUST.get(),
                STONE_SET.DUST.get(),
                TUFF_SET.DUST.get()
        );

        tag(SMALL_DUSTS_STONES).add(
                ANDESITE_SET.SMALL_DUST.get(),
                BASALT_SET.SMALL_DUST.get(),
                BLACKSTONE_SET.SMALL_DUST.get(),
                CALCITE_SET.SMALL_DUST.get(),
                GRANITE_SET.SMALL_DUST.get(),
                DEEPSLATE_SET.SMALL_DUST.get(),
                DIORITE_SET.SMALL_DUST.get(),
                END_STONE_SET.SMALL_DUST.get(),
                NETHERRACK_SET.SMALL_DUST.get(),
                STONE_SET.SMALL_DUST.get(),
                TUFF_SET.SMALL_DUST.get()
        );

        tag(ETERNAL_STONES).add(
                STONE,
                ANDESITE,
                GRANITE,
                DEEPSLATE,
                TUFF,
                DIORITE,
                CALCITE,
                BLACKSTONE,
                END_STONE,
                NETHERRACK,
                BASALT
        );

        tag(ETERNAL_ANDESITE).add(ANDESITE);
        tag(ETERNAL_BASALT).add(BASALT);
        tag(ETERNAL_BLACKSTONE).add(BLACKSTONE);
        tag(ETERNAL_CALCITE).add(CALCITE);
        tag(ETERNAL_DEEPSLATE).add(DEEPSLATE);
        tag(ETERNAL_DIORITE).add(DIORITE);
        tag(ETERNAL_END_STONE).add(END_STONE);
        tag(ETERNAL_GRANITE).add(GRANITE);
        tag(ETERNAL_NETHERRACK).add(NETHERRACK);
        tag(ETERNAL_STONE).add(STONE);
        tag(ETERNAL_TUFF).add(TUFF);

        tag(ITEM_STORAGE_QUARTZ).add(QUARTZ_BLOCK);
        tag(ITEM_STORAGE_AMETHYST).add(AMETHYST_BLOCK);

        tag(STONE_REPLACEABLES_ITEM).add(ANDESITE, STONE, DIORITE, GRANITE);
        tag(SLATE_REPLACEABLES_ITEM).add(DEEPSLATE, TUFF);

        tag(MUSHROOM_BLOCKS).add(BROWN_MUSHROOM_BLOCK).add(RED_MUSHROOM_BLOCK).add(MUSHROOM_STEM);

        tag(GEAR_MOLD).addOptional(MOLD_GEAR.getId());
        tag(ROD_MOLD).addOptional(MOLD_ROD.getId());
        tag(PLATE_MOLD).addOptional(MOLD_PLATE.getId());
        //tag(WIRE_MOLD).addOptional(EOMolds.MOLD_WIRE.getId());
        tag(GEAR_MOLD).addOptional(GEAR_PRESS_MOLD.getId());
        tag(ROD_MOLD).addOptional(ROD_PRESS_MOLD.getId());
        tag(WIRE_MOLD).addOptional(WIRE_PRESS_MOLD.getId());

        tag(MOLDS).addOptional(MOLD_GEAR.getId());
        tag(MOLDS).addOptional(MOLD_ROD.getId());
        tag(MOLDS).addOptional(MOLD_PLATE.getId());
        tag(MOLDS).addOptional(GEAR_PRESS_MOLD.getId());
        tag(MOLDS).addOptional(ROD_PRESS_MOLD.getId());
        tag(MOLDS).addOptional(WIRE_PRESS_MOLD.getId());

        tag(ITEM_STORAGE_FLUIX).addOptional(AEBlocks.FLUIX_BLOCK.id());
        extendedAEOptional(BLENDS, "quartz_blend");
        extendedAEOptional(BLENDS_SILICON, "quartz_blend");

        tag(INGOTS_QUARTZ_ENRICHED_COPPER).addOptional(ContentIds.QUARTZ_ENRICHED_COPPER);
        tag(INGOTS_QUARTZ_ENRICHED_IRON).addOptional(ContentIds.QUARTZ_ENRICHED_IRON);

        oritechOptional(SMALL_CLUMPS, "small_gold_clump");
        oritechOptional(SMALL_CLUMPS_GOLD, "small_gold_clump");
        oritechOptional(SMALL_DUSTS, "small_gold_dust");
        oritechOptional(SMALL_DUSTS_GOLD, "small_gold_dust");
        oritechOptional(ORE_GEMS, "gold_gem");
        oritechOptional(ORE_GEMS_GOLD, "gold_gem");
        oritechOptional(SMALL_CLUMPS, "small_iron_clump");
        oritechOptional(SMALL_CLUMPS_IRON, "small_iron_clump");
        oritechOptional(MekanismTags.Items.CLUMPS, "iron_clump");
        oritechOptional(SMALL_DUSTS, "small_iron_dust");
        oritechOptional(SMALL_DUSTS_IRON, "small_iron_dust");
        oritechOptional(ORE_GEMS, "iron_gem");
        oritechOptional(ORE_GEMS_IRON, "iron_gem");
        oritechOptional(SMALL_CLUMPS, "small_copper_clump");
        oritechOptional(SMALL_CLUMPS_COPPER, "small_copper_clump");
        oritechOptional(SMALL_DUSTS, "small_copper_dust");
        oritechOptional(SMALL_DUSTS_COPPER, "small_copper_dust");
        oritechOptional(ORE_GEMS, "copper_gem");
        oritechOptional(ORE_GEMS_COPPER, "copper_gem");
        oritechOptional(SMALL_CLUMPS, "small_nickel_clump");
        oritechOptional(SMALL_CLUMPS_NICKEL, "small_nickel_clump");
        oritechOptional(SMALL_DUSTS, "small_nickel_dust");
        oritechOptional(SMALL_DUSTS_NICKEL, "small_nickel_dust");
        oritechOptional(ORE_GEMS, "nickel_gem");
        oritechOptional(ORE_GEMS_NICKEL, "nickel_gem");
        oritechOptional(SMALL_CLUMPS, "small_platinum_clump");
        oritechOptional(SMALL_CLUMPS_PLATINUM, "small_platinum_clump");
        oritechOptional(MekanismTags.Items.CLUMPS, "platinum_clump");
        oritechOptional(SMALL_DUSTS, "small_platinum_dust");
        oritechOptional(SMALL_DUSTS_PLATINUM, "small_platinum_dust");
        oritechOptional(ORE_GEMS, "platinum_gem");
        oritechOptional(ORE_GEMS_PLATINUM, "platinum_gem");
        oritechOptional(SMALL_DUSTS, "small_uranium_dust");
        oritechOptional(SMALL_DUSTS_URANIUM, "small_uranium_dust");
        oritechOptional(SMALL_DUSTS, "small_plutonium_dust");
        oritechOptional(SMALL_DUSTS_PLUTONIUM, "small_plutonium_dust");
        oritechOptional(RAW_POLYMER, "raw_biopolymer");
        oritechOptional(BLENDS, "raw_silicon");
        oritechOptional(BLENDS_SILICON, "raw_silicon");
        removal(INGOTS_STEEL, ORIT("biosteel_ingot"));

        createOptional(CLUMPS_LEAD, "crushed_raw_lead");
        createOptional(CLUMPS_SILVER, "crushed_raw_silver");
        createOptional(CLUMPS_TIN, "crushed_raw_tin");
        createOptional(CLUMPS_ALUMINUM, "crushed_raw_aluminum");
        createOptional(CLUMPS, "crushed_raw_lead");
        createOptional(CLUMPS, "crushed_raw_silver");
        createOptional(CLUMPS, "crushed_raw_tin");
        createOptional(CLUMPS, "crushed_raw_aluminum");
        createOptional(MekanismTags.Items.CLUMPS, "crushed_raw_aluminum");
        createOptional(DUSTS_NETHERRACK, "cinder_flour");

        mekOptional(ENRICHED, "enriched_tin");
        mekOptional(ENRICHED, "enriched_gold");
        mekOptional(ENRICHED, "enriched_diamond");
        mekOptional(ENRICHED, "enriched_carbon");
        mekOptional(ENRICHED, "enriched_iron");
        mekOptional(TIN_ENRICHED, "enriched_tin");
        mekOptional(GOLD_ENRICHED, "enriched_gold");
        mekOptional(DIAMOND_ENRICHED, "enriched_diamond");
        mekOptional(IRON_ENRICHED, "enriched_iron");

        powahOptional(INGOTS, "uraninite");
        powahOptional(INGOTS_URANINITE, "uraninite");

        actuallyOptional(GEM_SHARDS, "diamatine_crystal_shard");
        actuallyOptional(GEM_SHARDS_DIAMATINE, "diamatine_crystal_shard");
        actuallyOptional(GEM_SHARDS, "emeradic_crystal_shard");
        actuallyOptional(GEM_SHARDS_EMERADIC, "emeradic_crystal_shard");
        actuallyOptional(GEM_SHARDS, "enori_crystal_shard");
        actuallyOptional(GEM_SHARDS_ENORI, "enori_crystal_shard");
        actuallyOptional(GEM_SHARDS, "palis_crystal_shard");
        actuallyOptional(GEM_SHARDS_PALIS, "palis_crystal_shard");
        actuallyOptional(GEM_SHARDS, "restonia_crystal_shard");
        actuallyOptional(GEM_SHARDS_RESTONIA, "restonia_crystal_shard");
        actuallyOptional(GEM_SHARDS, "void_crystal_shard");
        actuallyOptional(GEM_SHARDS_VOID_CRYSTAL, "void_crystal_shard");

        energizedOptional(PEBBLES, "stone_pebble");
        energizedOptional(PEBBLE_STONE, "stone_pebble");

        exDeorumOptional(PEBBLES, "stone_pebble");
        exDeorumOptional(PEBBLE_STONE, "stone_pebble");
        exDeorumOptional(PEBBLES, "diorite_pebble");
        exDeorumOptional(PEBBLE_DIORITE, "diorite_pebble");
        exDeorumOptional(PEBBLES, "granite_pebble");
        exDeorumOptional(PEBBLE_GRANITE, "granite_pebble");
        exDeorumOptional(PEBBLES, "andesite_pebble");
        exDeorumOptional(PEBBLE_ANDESITE, "andesite_pebble");
        exDeorumOptional(PEBBLES, "deepslate_pebble");
        exDeorumOptional(PEBBLE_DEEPSLATE, "deepslate_pebble");
        exDeorumOptional(PEBBLES, "tuff_pebble");
        exDeorumOptional(PEBBLE_TUFF, "tuff_pebble");
        exDeorumOptional(PEBBLES, "calcite_pebble");
        exDeorumOptional(PEBBLE_CALCITE, "calcite_pebble");
        exDeorumOptional(PEBBLES, "blackstone_pebble");
        exDeorumOptional(PEBBLE_BLACKSTONE, "blackstone_pebble");
        exDeorumOptional(PEBBLES, "basalt_pebble");
        exDeorumOptional(PEBBLE_BASALT, "basalt_pebble");

        removal(DUSTS_SAWDUST_R, WOOD_SET.DUST.get());
        removal(DUSTS_COKE_COAL_R, COKE_SET.DUST.get());
        removal(SMALL_DUSTS_COKE_COAL_R, COKE_SET.SMALL_DUST.get());
        removal(DUSTS_PRISMARINE, PRISMARINE_SHARD.asItem());
        removal(DUSTS, PRISMARINE_SHARD.asItem());
        removal(ITEM_STORAGE_COKE_COAL_R, COKE_SET.COAL_BLOCK.get().asItem());
        removal(ITEM_DUST_BLOCK_COKE_COAL_R, COKE_SET.DUST_BLOCK.get().asItem());
        removal(ITEM_STORAGE_FLUIX_R, FLUIX_SET.BLOCK.get().asItem());
        removal(ITEM_STORAGE_SOURCE_R, SOURCE_SET.BLOCK.get().asItem());
    }

    private void removal(TagKey<Item> iTag, Item item) {
        tag(iTag).remove(item);
    }

    @SuppressWarnings("all")
    private void removal(TagKey<Item> iTag, ResourceLocation item) {
        tag(iTag).remove(item);
    }

    @SuppressWarnings("all")
    private void extendedAEOptional(TagKey<Item> iTag, String path) {
        tag(iTag).addOptional(EXTEND_AE(path));
    }

    private void oritechOptional(TagKey<Item> iTag, String path) {
        tag(iTag).addOptional(ORIT(path));
    }

    private void createOptional(TagKey<Item> iTag, String path) {
        tag(iTag).addOptional(CTE(path));
    }

    private void mekOptional(TagKey<Item> iTag, String path) {
        tag(iTag).addOptional(MEK(path));
    }

    @SuppressWarnings("all")
    private void powahOptional(TagKey<Item> iTag, String path) {
        tag(iTag).addOptional(POW(path));
    }

    private void actuallyOptional(TagKey<Item> iTag, String path) {
        tag(iTag).addOptional(AA(path));
    }

    @SuppressWarnings("all")
    private void energizedOptional(TagKey<Item> iTag, String path) {
        tag(iTag).addOptional(EP(path));
    }

    private void exDeorumOptional(TagKey<Item> iTag, String path) {
        tag(iTag).addOptional(EX(path));
    }
}
