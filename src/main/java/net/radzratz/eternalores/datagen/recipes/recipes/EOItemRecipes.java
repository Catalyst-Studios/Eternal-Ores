package net.radzratz.eternalores.datagen.recipes.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.recipes.EOAdvancementYeeter;
import net.radzratz.eternalores.util.EOMaterialHelper;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.compat.util.types.EOSmallClumpItem;
import net.radzratz.eternalores.util.compat.util.types.EOSmallDustItem;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.item.EOItemRegistry.*;
import static net.radzratz.eternalores.util.EOMaterialHelper.*;
import static net.radzratz.eternalores.util.EOUtils.C;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.tags.item.EOItemsGeneralTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.EOItemsGeneralTags.Items.silicon;
import static net.radzratz.eternalores.util.tags.item.EOItemsGeneralTags.*;
import static net.radzratz.eternalores.util.tags.item.gems.EOGemTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.raw_materials.EORawMaterialTags.*;

public class EOItemRecipes extends RecipeProvider
{
    public EOItemRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    /**
     * Set of material base names excluded from raw -> dust hammer recipes.
     * <p>
     * This list includes materials that:
     * <p>
     * - Already have special or balanced processing paths (e.g., netherite, emerald).
     * <p>
     * - Are not meant to be processed into dust (e.g., obsidian, nether_star, coal).
     * <p>
     * - Could create balance issues or duplicates if included (e.g., bronze, brass, steel).
     * <p>
     * - Are considered non-standard or decorative materials (e.g., amethyst, sculk, prismarine).
     * <p>
     * The goal is to avoid duplicate or conflicting recipes when generating default
     * "raw -> dust" hammer conversions for ingot-like materials in EO.
     */
    private static final Set<String> excluded_from_dupe = Set.of(
            "netherite", "apatite", "fluorite", "amber", "diamond", "emerald", "brass", "blue_steel",
            "britannia_silver", "bronze", "constantan", "electrum", "coal", "ender", "endstone", "netherrack",
            "invar", "lapis", "cinnabar", "lumium", "niter", "obsidian", "peridot", "pewter", "plutonium",
            "quartz", "rose_gold", "ruby", "sapphire", "signalum", "steel", "titanium", "enderium",
            "cast_iron", "cast_steel", "wrought_iron", "nethersteel", "shadowsteel", "pig_iron",
            "necroticarite", "sculk", "amethyst", "nether_star", "prismarine_crystal", "catalyrium", "graphite",
            "sulfur", "silicon"
    );

    public static void generate(RecipeOutput output, Stream<DeferredHolder<Item, ? extends Item>> allItems, Registry<Item> itemRegistry)
    {
        Set<String> generatedConversions = new HashSet<>();
        Set<String> generatedDustRecipes = new HashSet<>();

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        record dustConversions(String material, TagKey<Item> input, Item output) {}

        /// List of materials with a "very" specific input and output
        List<dustConversions> dustConversion = List.of(
                new dustConversions("iron", INGOTS_IRON, IRON_DUST.get()),
                new dustConversions("gold", INGOTS_GOLD, GOLD_DUST.get()),
                new dustConversions("copper", INGOTS_COPPER, COPPER_DUST.get()),
                new dustConversions("fluorite", TAG_GEM_FLUORITE, FLUORITE_DUST.get()),
                new dustConversions("sulfur", TAG_SULFUR, SULFUR_DUST.get()),
                new dustConversions("diamond", GEMS_DIAMOND, DIAMOND_DUST.get()),
                new dustConversions("emerald", GEMS_EMERALD, EMERALD_DUST.get()),
                new dustConversions("lapis", GEMS_LAPIS, LAPIS_LAZULI_DUST.get()),
                new dustConversions("coal", COAL, COAL_DUST.get()),
                new dustConversions("netherite", INGOTS_NETHERITE, NETHERITE_DUST.get()),
                new dustConversions("quartz", GEMS_QUARTZ, QUARTZ_DUST.get()),
                new dustConversions("amethyst", GEMS_AMETHYST, AMETHYST_DUST.get()),
                new dustConversions("sculk", SCULK, SCULK_DUST.get()),
                new dustConversions("obsidian", OBSIDIANS, OBSIDIAN_DUST.get()),
                new dustConversions("endstone", END_STONES, ENDSTONE_DUST.get()),
                new dustConversions("netherrack", NETHERRACKS, NETHERRACK_DUST.get()),
                new dustConversions("prismarine_crystal", GEMS_PRISMARINE, PRISMARINE_DUST.get()),
                new dustConversions("ender", ENDER_PEARLS, ENDER_DUST.get()),
                new dustConversions("nether_star", NETHER_STARS, NETHER_STAR_DUST.get()),
                new dustConversions("silicon", silicon, SILICON_DUST.get()),
                new dustConversions("silicon", TAG_SILICON_INGOT, SILICON_DUST.get())
        );



        allItems.sorted(Comparator.comparing(entry -> entry.getId().getPath()))
                .forEach(entry ->
                {
                    Item item = entry.get();
                    String path = entry.getId().getPath();
                    String material = EOMaterialHelper.extractMaterial(path);

                    /// main folder
                    String mainPath = "materials/";

                    /// folders
                    String ingotPath = mainPath + "ingot/";
                    String gemPath = mainPath + "gem/";
                    String nuggetPath = mainPath + "nugget/";
                    String sDustPath = mainPath + "dust/";
                    String dustPath = mainPath + "small_dust/";
                    String clumpPath = mainPath + "clump/";
                    String plateFolder = mainPath + "plates/";
                    String rodFolder = mainPath + "rods/";

                    /// name end
                    String endNug = "_from_nuggets"; String endIng = "_from_ingot";
                    String endGem = "_from_shards"; String endShard = "_from_gem";
                    String endDust = "_from_dust"; String endSDust = "_from_small_dust";
                    String endClump = "_from_small_clump"; String endDustT = "_to_dust";
                    String endPlate = "_from_plate"; String endRod = "_from_rod";
                    String endP = "_plate"; String endRo = "_rod";

                    /// tags
                    String gems = "gems/"; String shards = "gem_shards/";

                    /// has
                    String hn = "has_nugget_"; String hs = "has_shard_";
                    String hi = "has_ingot_"; String hg = "has_gem_";
                    String hsd = "has_dust_"; String hc = "has_clump_";
                    String hr = "has_raw_"; String h = "has_";
                    String hp = "has_plate_"; String hri = "has_rod_";

                    /// pattern & char
                    String pat = "###";
                    String p1 = "H  ";
                    String p2 = " H ";
                    String p3 = " I ";
                    String p4 = "  I";
                    char c = '#';

                    /// Ingot -> Nugget
                    if (item instanceof EOIngotItem)
                    {
                        if (!generatedConversions.add("ingot:" + material)) return;

                        Item n = itemRegistry.getOptional(EO(material + nugget)).orElse(null);

                        if (n == null) return;

                        TagKey<Item> i = TagKey.create(Registries.ITEM, C(ingotTag + material));

                        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, n, 9)
                                .requires(i)
                                .unlockedBy(hn + material + ingot, has(item))
                                .save(yeet, EO(nuggetPath + material + nugget + endIng));
                    }

                    /// Nugget -> Ingot
                    if (item instanceof EONuggetItem)
                    {
                        if (!generatedConversions.add("nugget:" + material)) return;

                        Item i = itemRegistry.getOptional(EO(material + ingot)).orElse(null);

                        if (i == null) return;

                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, i)
                                .define(c, TagKey.create(Registries.ITEM, C(nuggetTag + material)))
                                .pattern(pat)
                                .pattern(pat)
                                .pattern(pat)
                                .unlockedBy(hi + material, has(item))
                                .save(yeet, EO( ingotPath + material + ingot + endNug));
                    }

                    /// Small Clump -> Clump
                    if (item instanceof EOSmallClumpItem)
                    {
                        if (!generatedConversions.add("clump:" + material)) return;

                        Item sC = itemRegistry.getOptional(EO(o + material + oClump)).orElse(null);

                        if (sC == null) return;

                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, sC)
                                .define(c, TagKey.create(Registries.ITEM, C(clumpTag + material)))
                                .pattern(pat)
                                .pattern(pat)
                                .pattern(pat)
                                .unlockedBy(hc + material, has(item))
                                .save(yeet, EO(clumpPath + material + oClump + endClump));
                    }

                    /// Small Dust -> Dust
                    if (item instanceof EOSmallDustItem)
                    {
                        if (!generatedConversions.add("dust:" + material)) return;

                        Item sD = itemRegistry.getOptional(EO(material + dust)).orElse(null);

                        if (sD == null) return;

                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, sD)
                                .define(c, TagKey.create(Registries.ITEM, C(smallDustTag + material)))
                                .pattern(pat)
                                .pattern(pat)
                                .pattern(pat)
                                .unlockedBy(hsd + material, has(item))
                                .save(yeet, EO(dustPath + material + oDust + endDust));
                    }

                    /// Dust -> Small Dust
                    if (item instanceof EODustItem)
                    {
                        if (!generatedConversions.add("small_dust:" + material)) return;

                        Item eD = itemRegistry.getOptional(EO(o + material + oDust)).orElse(null);

                        if (eD == null) return;

                        TagKey<Item> smallDustTag = TagKey.create(Registries.ITEM, C(dustTag + material));

                        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, eD, 9)
                                .requires(smallDustTag)
                                .unlockedBy(hsd + material, has(item))
                                .save(yeet, EO(sDustPath + material + dust + endSDust));
                    }

                    /// Gem Shard -> Gem
                    if (item instanceof EOGemShardItem)
                    {
                        if (!generatedConversions.add("gem_shard:" + material)) return;

                        Item gem = itemRegistry.getOptional(EO(material)).orElse(null);

                        if (gem == null) return;

                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, gem)
                                .define(c, TagKey.create(Registries.ITEM, C( gemShardTag + material)))
                                .pattern(pat)
                                .pattern(pat)
                                .pattern(pat)
                                .unlockedBy(hs + material, has(item))
                                .save(yeet, EO( gemPath + material + endGem));
                    }

                    /// Material Plate -> Dust
                    if (item instanceof EOPlateItem)
                    {
                        if (!generatedConversions.add("plate_:" + material)) return;

                        Item p = itemRegistry.getOptional(EO(material + dust)).orElse(null);

                        if (p == null) return;

                        TagKey<Item> pT = TagKey.create(Registries.ITEM, C(plateTag + material));

                        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, p, 1)
                                .requires(pT)
                                .requires(hammers)
                                .unlockedBy(hp + material, has(item))
                                .save(yeet, EO(sDustPath + material + dust + endPlate));
                    }

                    /// Material Rod -> Dust
                    if (item instanceof EORodItem)
                    {
                        if (!generatedConversions.add("rod_:" + material)) return;

                        Item r = itemRegistry.getOptional(EO(material + dust)).orElse(null);

                        if (r == null) return;

                        TagKey<Item> rT = TagKey.create(Registries.ITEM, C(rodTag + material));

                        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, r, 1)
                                .requires(rT)
                                .requires(hammers)
                                .unlockedBy(hri + material, has(item))
                                .save(yeet, EO(sDustPath + material + dust + endRod));
                    }

                    /// Material -> Plate
                    if (item instanceof EOPlateItem)
                    {
                        if (!generatedConversions.add("plate:" + material)) return;

                        Item p = itemRegistry.getOptional(EO(plate + material)).orElse(null);
                        if (p == null) return;

                        boolean isGem = Set.of("diamond", "emerald", "lapis", "quartz",
                                "sapphire", "ruby", "amethyst", "peridot", "necroticarite",
                                "quantiquarite", "tachyarite", "voiderite"
                        ).contains(material);

                        String tagPrefix = isGem ? gemTag : ingotTag;
                        String toolPath  = isGem ? cutterTag : hammerTag;

                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, p, 1)
                                .define('H', TagKey.create(Registries.ITEM, EO(toolPath)))
                                .define('I', TagKey.create(Registries.ITEM, C(tagPrefix + material)))
                                .pattern(" H ")
                                .pattern(" I ")
                                .pattern(" I ")
                                .unlockedBy(h + material + (isGem ? "_gem" : ingot), has(TagKey.create(Registries.ITEM, C(tagPrefix + material))))
                                .save(yeet, EO(plateFolder + material + endP));
                    }

                    /// Material -> Rod
                    if (item instanceof EOPlateItem)
                    {
                        if (!generatedConversions.add("rod:" + material)) return;

                        Item p = itemRegistry.getOptional(EO(rod + material)).orElse(null);
                        if (p == null) return;

                        boolean isGem = Set.of("diamond", "emerald", "lapis", "quartz",
                                "sapphire", "ruby", "amethyst", "peridot", "necroticarite",
                                "quantiquarite", "tachyarite", "voiderite"
                        ).contains(material);

                        String tagPrefix = isGem ? gemTag : ingotTag;
                        String toolPath  = isGem ? cutterTag : hammerTag;

                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, p, 1)
                                .define('H', TagKey.create(Registries.ITEM, EO(toolPath)))
                                .define('I', TagKey.create(Registries.ITEM, C(tagPrefix + material)))
                                .pattern("H  ")
                                .pattern(" I ")
                                .pattern("  I")
                                .unlockedBy(h + material + (isGem ? "_gem" : ingot), has(TagKey.create(Registries.ITEM, C(tagPrefix + material))))
                                .save(yeet, EO(rodFolder + material + endRo));
                    }

                    /// Material -> Dust / Raw Material Dupe recipe
                    ///
                    /// Both `excluded_from_dupe` and `dustConversion` are necessary.
                    /// Some EO materials follow _ingot/gem_, others don't, same for vanilla ones.
                    if (path.endsWith(ingot) || path.startsWith(gem))
                    {
                        Item dD = itemRegistry.getOptional(EO(material + dust)).orElse(null);
                        if (dD == null || !generatedDustRecipes.add("dust_from:" + path)) return;

                        // Ingot/Gem → Dust
                        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dD, 1)
                                .requires(item)
                                .requires(hammers)
                                .unlockedBy(h + path, has(item))
                                .save(yeet, EO(sDustPath + path + endDustT));

                        // Raw Material → Dust x2
                        if (path.endsWith(ingot))
                        {
                            String baseMaterial = material.replace(ingot, "");

                            if (!excluded_from_dupe.contains(baseMaterial))
                            {
                                TagKey<Item> rT = TagKey.create(Registries.ITEM, C(rawTag + baseMaterial));

                                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dD, 2)
                                        .requires(rT)
                                        .requires(hammers)
                                        .unlockedBy(hr + baseMaterial, has(rT))
                                        .save(yeet, EO(sDustPath + raw + baseMaterial + endDustT));
                            }
                        }
                    }

                    /// Extra conversions (fluorite, coal, etc)
                    for (dustConversions conv : dustConversion)
                    {
                        String materials = conv.material();
                        TagKey<Item> input = conv.input();
                        Item dustOut = conv.output();

                        if (!generatedDustRecipes.add("dust_from:" + materials)) continue;

                        // Ingot/Gem/Misc → Dust
                        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dustOut, 1)
                                .requires(input)
                                .requires(hammers)
                                .unlockedBy(h + materials, has(input))
                                .save(yeet, EO(sDustPath + materials + endDustT));

                        // Raw Material → Dust x2 (if not excluded)
                        if (!excluded_from_dupe.contains(materials))
                        {
                            TagKey<Item> rT = TagKey.create(Registries.ITEM, C(rawTag + materials));

                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dustOut, 2)
                                    .requires(rT)
                                    .requires(hammers)
                                    .unlockedBy(hr + materials + "_raw", has(rT))
                                    .save(yeet, EO(sDustPath + raw + materials + endDustT));
                        }
                    }
                });
    }
}
