package net.radzratz.eternalores.util.recipes.util;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.radzratz.eternalores.util.EOMaterials;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.EOUtils.getItemFromAnyNamespace;

public class EORecipeOutputs {
    public final Item DUST;
    public final Item DIRTY_DUST;
    public final Item SMALL_DUST;
    public final Item CLEAN_DUST;
    public final Item CLUMP;
    public final Item SMALL_CLUMP;
    public final Item SHARD;
    public final Item CRYSTAL;
    public final Item ENRICHED;
    public final Item ORE_GEM;
    public final Item INGOT;
    public final Item NUGGET;
    public final Item GEM;
    public final Item DUST_INGOT;
    public final Item PLATE;
    public final Item ROD;
    public final Item GEAR;
    public final Item FOIL;
    public final Item WIRE;
    public final Item BLOCK;
    public final Item BLOCK_DUST;
    public final Item DUST_BLOCK;
    public final Item RAW;
    public final Item RAW_BLOCK;
    public final Item COALS;
    public final Item GEM_SHARD;
    public final Item GEOSHARDS;
    public final Item GEOSHARD_BLOCK;

    public EORecipeOutputs(String mat, Registry<Item> reg) {
        ResourceLocation gemLocation = GEM_EXCEPTIONS.contains(mat)
                ? ResourceLocation.withDefaultNamespace(VANILLA_GEM_IDS.getOrDefault(mat, mat))
                : EO(EOMaterials.materialPrefixSuffixes.GEM + mat);
        String outputRawOre = mat.equals("sulfur") ? "sulfur" : EOMaterials.materialPrefixSuffixes.RAW + mat;

        String suffix = dustOutput().contains(mat) ? EOMaterials.materialPrefixSuffixes.DUST : EOMaterials.materialPrefixSuffixes.INGOT;
        String suffixes = dustOutput().contains(mat) ? EOMaterials.materialPrefixSuffixes.DUST : EOMaterials.materialPrefixSuffixes.BLOCK;
        String cleanMaterial = mat.startsWith("raw_") ? mat.substring(4) : mat;

        this.DUST = get(reg, EO(mat + EOMaterials.materialPrefixSuffixes.DUST));
        this.DIRTY_DUST = get(reg, EO(EOMaterials.materialPrefixSuffixes.DIRTY_DUST + mat + EOMaterials.materialPrefixSuffixes.DUST));
        this.SMALL_DUST = get(reg, EO(mat + EOMaterials.materialPrefixSuffixes.SMALL_DUST));
        this.CLEAN_DUST = get(reg, EO(cleanMaterial + EOMaterials.materialPrefixSuffixes.DUST));
        this.CLUMP = get(reg, EO(EOMaterials.materialPrefixSuffixes.CLUMP + mat));
        this.SMALL_CLUMP = get(reg, EO(mat + EOMaterials.materialPrefixSuffixes.SMALL_CLUMP));
        this.SHARD = get(reg, EO(EOMaterials.materialPrefixSuffixes.SHARD + mat));
        this.CRYSTAL = get(reg, EO(EOMaterials.materialPrefixSuffixes.CRYSTAL + mat));
        this.ENRICHED = get(reg, EO(EOMaterials.materialPrefixSuffixes.ENRICHED + mat));
        this.ORE_GEM = get(reg, EO(mat + EOMaterials.materialPrefixSuffixes.ORE_GEM));
        this.INGOT = getItemFromAnyNamespace(reg, mat + EOMaterials.materialPrefixSuffixes.INGOT);
        this.NUGGET = getItemFromAnyNamespace(reg, mat + EOMaterials.materialPrefixSuffixes.NUGGET);
        this.COALS = getItemFromAnyNamespace(reg, mat);
        this.GEM = get(reg, gemLocation);
        this.GEM_SHARD = get(reg, EO(mat + EOMaterials.materialPrefixSuffixes.GEM_SHARD));
        this.PLATE = get(reg, EO(EOMaterials.materialPrefixSuffixes.PLATE + mat));
        this.ROD = get(reg, EO(EOMaterials.materialPrefixSuffixes.ROD + mat));
        this.GEAR = get(reg, EO(EOMaterials.materialPrefixSuffixes.GEAR + mat));
        this.FOIL = get(reg, EO(mat + EOMaterials.materialPrefixSuffixes.FOIL));
        this.WIRE = get(reg, EO(EOMaterials.materialPrefixSuffixes.WIRE + mat));
        this.BLOCK = getItemFromAnyNamespace(reg, mat + EOMaterials.materialPrefixSuffixes.BLOCK);
        this.BLOCK_DUST = getItemFromAnyNamespace(reg, mat + suffixes);
        this.DUST_BLOCK = get(reg, EO(mat + EOMaterials.materialPrefixSuffixes.DUST_BLOCK));
        this.RAW = get(reg, EO(outputRawOre));
        this.RAW_BLOCK = get(reg, EO(EOMaterials.materialPrefixSuffixes.RAW + mat + EOMaterials.materialPrefixSuffixes.BLOCK));
        this.DUST_INGOT = getItemFromAnyNamespace(reg, mat + suffix);
        this.GEOSHARDS = get(reg, EO(mat + EOMaterials.materialPrefixSuffixes.GEOSHARDS));
        this.GEOSHARD_BLOCK = get(reg, EO(mat + EOMaterials.materialPrefixSuffixes.GEORE_BLOCK));
    }

    private Item get(Registry<Item> registry, ResourceLocation id) {
        return registry.getOptional(id).orElse(null);
    }

    public static EORecipeOutputs fromPath(String path, Registry<Item> registry) {
        return new EORecipeOutputs(EOMaterials.extractMaterialName(path), registry);
    }

    public static List<String> dustOutput() {
        return List.of(
                "catalyrium", "ardite", "tungsten", "titanium", "vanadium", "neodymium", "palladium"
        );
    }

    public static Set<String> furnaceExclusions() {
        return Set.of(
                "ardite", "catalyrium", "nether_star_dust", "sculk", "ender_dust", "quartz_dust", "endstone_dust", "netherrack_dust", "stone_dust",
                "soul_sand", "blue_steel", "black_steel", "titanium", "tungsten", "stellarium", "redstone", "lapis", "aurorium", "chromium",
                "universium", "cosmic_matter", "eternity", "gravitronium", "stainless_steel", "vanadium", "ruthenium", "niobium", "hafnium", "novalloy",
                "rhodium", "indium", "red_steel", "neptunium", "rubidium", "francium", "kanthal", "nanite", "unstable", "neodymium", "etherium", "black_bronze", "yttrium",
                "samarium", "palladium", "unstable_stable", "nautilus"
        );
    }

    public static Set<String> crushingExclusions() {
        return Set.of(
                "calcium", "rare_earth", "phosphorus", "selenium", "cerium", "californium", "cadmium", "coke_coal"
        );
    }

    public static Set<String> dustBlockExclusions() {
        return Set.of(
                "diamond", "emerald", "lapis", "quartz", "sapphire", "ruby", "amethyst", "peridot", "necroticarite", "quantiquarite",
                "tachyarite", "voiderite", "zircon", "pearl", "pyrolite", "tanzanite", "cinnabar", "amber", "garnet", "jade", "obsidian",
                "onyx", "spectral_sky_bluerite", "temictetl", "sanguis_vivus", "certus_quartz", "fluix", "source", "spinel", "morphite",
                "black_quartz", "blaze", "dust", "salt", "apatite", "arcanum", "nether_star", "flint", "fluorite", "nautilus_shell", "niter",
                "prismarine", "primornium", "anthracite_coal", "bituminous_coal", "lignite_coal", "peat_coal", "coal", "charcoal", "coke_coal",
                "nautilus"
        );
    }

    public static Set<String> formTypeExclusions() {
        return Set.of(
                "stone", "wooden", "blackstone", "andesite", "granite", "diorite", "calcite", "basalt", "deepslate",
                "end_stone", "tuff", "netherrack"
        );
    }

    private static final Map<String, String> VANILLA_GEM_IDS = Map.of(
            "lapis", "lapis_lazuli",
            "amethyst", "amethyst_shard",
            "prismarine", "prismarine_crystals"
    );

    // Materials that DON'T have the 'gem_' prefix, either because of skill issueness of me or are vanilla gems
    private static final Set<String> GEM_EXCEPTIONS = Set.of(
            "fluorite", "emerald", "diamond", "prismarine", "amethyst", "quartz", "lapis"
    );

    // represents the base stone type an ore variant is generated in
    public enum OreVariant {
        STONE,
        DEEPSLATE,
        NETHER,
        END
    }

    public static Item resolveOreCases(String material, OreVariant variant) {
        // this was made to tell some recipes to output said cobble/stone type as an output
        // certain cases, like ardite and such, don't have a prefix at all, which means it will output cobblestone
        // to prevent this, we cast its specific ore variant type, if it doesn't contain a prefix at all,
        // but it does a variant or multiple, we specify them
        return switch (material) {
            case "ardite", "obsidian", "necroticarite" -> Items.NETHERRACK;
            case "pyrolite" -> variant == OreVariant.END ? Items.END_STONE : Items.NETHERRACK;
            case "tungsten" -> variant == OreVariant.END ? Items.END_STONE : Items.COBBLED_DEEPSLATE;
            case "ultimatitanium" -> Items.END_STONE;
            case "sculkite" -> Items.COBBLED_DEEPSLATE;
            case "pearl", "salt" -> Items.SAND;

            // if these cases do have their prefix; nether, deepslate, or end, we don't specify any in here
            default -> switch (variant) {
                case DEEPSLATE -> Items.COBBLED_DEEPSLATE;
                case NETHER -> Items.NETHERRACK;
                case END -> Items.END_STONE;
                default -> Items.COBBLESTONE;
            };
        };
    }
}
