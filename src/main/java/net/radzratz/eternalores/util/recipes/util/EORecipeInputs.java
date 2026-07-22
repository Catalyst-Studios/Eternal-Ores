package net.radzratz.eternalores.util.recipes.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.Set;

import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Nuggets.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Plates.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.StorageBlocks.*;
import static net.radzratz.eternalores.util.tags.EOTagIds.*;

public class EORecipeInputs {
    public final TagKey<Item> TOOLS;
    public final TagKey<Item> INGOT;
    public final TagKey<Item> GEM;
    public final TagKey<Item> GEM_INGOT;
    public final TagKey<Item> NUGGET;
    public final TagKey<Item> PLATE;
    public final TagKey<Item> ROD;
    public final TagKey<Item> GEAR;
    public final TagKey<Item> FOIL;
    public final TagKey<Item> CLUMP;
    public final TagKey<Item> SMALL_CLUMP;
    public final TagKey<Item> DUST;
    public final TagKey<Item> DIRTY_DUST;
    public final TagKey<Item> SMALL_DUST;
    public final TagKey<Item> CRYSTAL;
    public final TagKey<Item> SHARD;
    public final TagKey<Item> ORE_GEM;
    public final TagKey<Item> RAW;
    public final TagKey<Item> PEBBLES;
    public final TagKey<Item> STORAGE_BLOCK;
    public final TagKey<Item> STORAGE_BLOCK_RAW;
    public final TagKey<Item> RAW_BLOCK_CASE;
    public final TagKey<Item> DUST_BLOCK;
    public final TagKey<Item> ORE;
    public final TagKey<Item> COALS;
    public final TagKey<Item> ENRICHED;
    public final TagKey<Item> BLENDS;
    public final TagKey<Item> GEM_SHARDS;
    public final TagKey<Item> GEOSHARDS;
    public final TagKey<Item> GEOSHARD_BLOCKS;
    public final TagKey<Item> STONES;

    public EORecipeInputs(String mat) {
        String cleanCoal = mat.endsWith("_coal") ? mat.substring(0, mat.length() - 5) : mat;

        boolean isGem = Set.of("diamond", "emerald", "lapis", "quartz", "sapphire", "ruby", "amethyst", "peridot", "necroticarite",
                "quantiquarite", "tachyarite", "voiderite", "zircon", "pearl", "pyrolite", "tanzanite", "cinnabar", "amber", "garnet",
                "jade", "obsidian", "onyx", "spectral_sky_bluerite", "temictetl", "sanguis_vivus", "arcanum", "monazite", "apatite",
                "certus_quartz", "fluix", "source", "spinel", "black_quartz", "prismarine", "primornium", "morphite"
        ).contains(mat);

        String materialType = isGem ? gemTag : ingotTag;
        String toolPath = isGem ? cutterTag : hammerTag;

        var reg = Registries.ITEM;
        this.TOOLS = TagKey.create(reg, C(toolPath));
        this.INGOT = TagKey.create(reg, C(ingotTag + mat));
        this.GEM = TagKey.create(reg, C(gemTag + mat));
        this.GEM_INGOT = TagKey.create(reg, C(materialType + mat));
        this.NUGGET = TagKey.create(reg, C(nuggetTag + mat));
        this.GEM_SHARDS = TagKey.create(reg, C(gemShardTag + mat));
        this.PLATE = TagKey.create(reg, C(plateTag + mat));
        this.ROD = TagKey.create(reg, C(rodTag + mat));
        this.GEAR = TagKey.create(reg, C(gearTag + mat));
        this.FOIL = TagKey.create(reg, C(foilTag + mat));
        this.CLUMP = TagKey.create(reg, C(clumpTag + mat));
        this.SMALL_CLUMP = TagKey.create(reg, C(sClumpTag + mat));
        this.COALS = TagKey.create(reg, C(coalTag + cleanCoal));
        this.DUST = TagKey.create(reg, C(dustTag + mat));
        this.DIRTY_DUST = TagKey.create(reg, C(dDustTag + mat));
        this.SMALL_DUST = TagKey.create(reg, C(smallDustTag + mat));
        this.CRYSTAL = TagKey.create(reg, C(crystalTag + mat));
        this.SHARD = TagKey.create(reg, C(shardTag + mat));
        this.ORE_GEM = TagKey.create(reg, C(oreGemTag + mat));
        this.RAW = TagKey.create(reg, C(rawTag + mat));
        this.PEBBLES = TagKey.create(reg, C(pebbles + mat));
        this.STORAGE_BLOCK = TagKey.create(reg, C(storage + mat));
        this.STORAGE_BLOCK_RAW = TagKey.create(reg, C(storage + materialPrefixSuffixes.RAW + mat));
        this.RAW_BLOCK_CASE = TagKey.create(reg, mat.equals("sulfur") ? C(storage + "sulfur") : C(storage + materialPrefixSuffixes.RAW + mat));
        this.DUST_BLOCK = TagKey.create(reg, C(dustB + mat));
        this.ORE = TagKey.create(reg, C(ores + mat));
        this.ENRICHED = TagKey.create(reg, C(enrichedTag + mat));
        this.BLENDS = TagKey.create(reg, C(blends + mat));
        this.GEOSHARDS = TagKey.create(reg, GEO(geoshards + mat));
        this.GEOSHARD_BLOCKS = TagKey.create(reg, GEO(geoshardBlock + mat));
        this.STONES = TagKey.create(reg, EO(stonesTag + mat));
    }

    public static EORecipeInputs fromPath(String path) {
        String material = extractMaterialName(path);
        return new EORecipeInputs(material);
    }

    /**
     * This abomination treats {@link Object} as the following;
     * {@link ItemLike}, {@link ItemStack} and {@link TagKey TagKey&lt;Item&gt;}.
     * <p>
     * As a result of some, if not all recipe builders using {@link Ingredient} as their inputs, and since Ingredient
     * can use;
     *  <ul>
     *  <li>{@link TagKey} — {@link Ingredient#of(TagKey)}, cast to {@code TagKey<Item>}</li>
     *  <li>{@link ItemLike} — {@link Ingredient#of(ItemLike...)}</li>
     *  <li>{@link ItemStack} — {@link Ingredient#of(ItemStack...)}</li>
     *  </ul>
     *  This method was created to handle all Ingredient.of() calls as one.
     * <p>
     *  While yes, most of Eternal Ores recipes use TagKey as its main input, it was done this way as some recipes
     *  use a very specific {@link Item} and not a {@link TagKey} to prevent any other mod; Material or Tag. Mix within Eternal
     *  Ores recipes and wreck them.
     * <p>
     *  Additionally, itemTagInputs can be used as an Output as well, only if the recipe builder
     *  casts Ingredient.of() as an output.
     * <p>
     *  Whoever is reading this, if ya create your recipes using Ingredient.of(), you're an angel, if not
     *  you're a monster, and pray both sides of your pillow are cold, 'cuz that won't happen ever again.
     *  With love: RadzRatz
     */
    @SuppressWarnings("unchecked") // TagKey<?> is assumed to be TagKey<Item> at call sites
    public static Ingredient itemTagInputs(Object inp) {
        if (inp instanceof TagKey<?> tag) {
            return Ingredient.of((TagKey<Item>) tag);
        }

        if (inp instanceof Item item) {
            return Ingredient.of(item);
        }

        if (inp instanceof ItemStack stack) {
            return Ingredient.of(stack);
        }

        throw new IllegalArgumentException("Invalid recipe input: " + inp);
    }

    public static final Set<String> FOURS_DUST_MATERIALS = Set.of(
            "amethyst", "quartz", "fluix", "certus_quartz", "source", "black_quartz", "salt"
    );

    public static final Set<TagKey<Item>> VANILLA_RAW = Set.of(
            RAW_MATERIALS_IRON,
            RAW_MATERIALS_COPPER,
            RAW_MATERIALS_GOLD
    );

    public static final Set<TagKey<Item>> VANILLA_INGOTS = Set.of(
            INGOTS_IRON,
            INGOTS_COPPER,
            INGOTS_GOLD,
            INGOTS_NETHERITE
    );

    public static final Set<TagKey<Item>> VANILLA_PLATES = Set.of(
            PLATES_IRON,
            PLATES_COPPER,
            PLATES_GOLD,
            PLATES_NETHERITE
    );

    public static final Set<TagKey<Item>> VANILLA_GEM = Set.of(
            GEMS_LAPIS,
            GEMS_DIAMOND,
            GEMS_EMERALD,
            GEMS_QUARTZ,
            GEMS_PRISMARINE,
            GEMS_AMETHYST
    );

    public static final Set<TagKey<Item>> VANILLA_BASICS = Set.of(
            GEMS_LAPIS,
            GEMS_DIAMOND,
            GEMS_EMERALD,
            GEMS_QUARTZ,
            GEMS_PRISMARINE,
            GEMS_AMETHYST,
            INGOTS_IRON,
            INGOTS_COPPER,
            INGOTS_GOLD,
            INGOTS_NETHERITE
    );

    public static final Set<TagKey<Item>> VANILLA_NUGGETS = Set.of(
            NUGGETS_COPPER,
            NUGGETS_NETHERITE
    );

    public static final Set<TagKey<Item>> VANILLA_RAW_BLOCK = Set.of(
            STORAGE_BLOCKS_RAW_IRON,
            STORAGE_BLOCKS_RAW_COPPER,
            STORAGE_BLOCKS_RAW_GOLD
    );

    public static final Set<TagKey<Item>> VANILLA_BLOCK = Set.of(
            STORAGE_BLOCKS_DIAMOND,
            ITEM_STORAGE_QUARTZ,
            ITEM_STORAGE_AMETHYST,
            STORAGE_BLOCKS_IRON,
            STORAGE_BLOCKS_EMERALD,
            STORAGE_BLOCKS_GOLD,
            STORAGE_BLOCKS_COPPER,
            STORAGE_BLOCKS_NETHERITE,
            STORAGE_BLOCKS_LAPIS
    );

    public static final Set<TagKey<Item>> VANILLA_ORES = Set.of(
            ORES_IRON,
            ORES_COPPER,
            ORES_GOLD,
            ORES_DIAMOND,
            ORES_EMERALD,
            ORES_QUARTZ,
            ORES_COAL,
            ORES_REDSTONE,
            ORES_LAPIS
    );

    public static final Set<TagKey<Item>> VANILLA_METAL_ORES = Set.of(
            ORES_IRON,
            ORES_COPPER,
            ORES_GOLD
    );

    public static boolean isVanillaRaw(TagKey<Item> item) {
        return VANILLA_RAW.contains(item);
    }

    public static boolean isVanillaIngot(TagKey<Item> item) {
        return VANILLA_INGOTS.contains(item);
    }

    public static boolean isVanillaPlate(TagKey<Item> item) {
        return VANILLA_PLATES.contains(item);
    }

    public static boolean isVanillaSet(TagKey<Item> item) {
        return VANILLA_BASICS.contains(item);
    }

    public static boolean isVanillaNuggets(TagKey<Item> item) {
        return VANILLA_NUGGETS.contains(item);
    }

    public static boolean isVanillaRawBlock(TagKey<Item> item) {
        return VANILLA_RAW_BLOCK.contains(item);
    }

    public static boolean isVanillaBlock(TagKey<Item> item) {
        return VANILLA_BLOCK.contains(item);
    }

    public static boolean isVanillaOre(TagKey<Item> item) {
        return VANILLA_ORES.contains(item);
    }

    public static boolean isVanillaMetalOre(TagKey<Item> item) {
        return VANILLA_METAL_ORES.contains(item);
    }

    public static boolean isVanillaGem(TagKey<Item> item) {
        return VANILLA_GEM.contains(item);
    }
}
