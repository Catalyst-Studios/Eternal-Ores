package net.radzratz.eternalores.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.radzratz.eternalores.EternalOres;

public class EternalBiomeModifier {
    //Aluminum
    public static final ResourceKey<BiomeModifier> ADD_ALUMINUM_ORE = registerKey("add_aluminum_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ALUMINUM_ORE = registerKey("add_nether_aluminum_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_ALUMINUM_ORE = registerKey("add_end_aluminum_ore");
    //Amber
    public static final ResourceKey<BiomeModifier> ADD_AMBER_ORE = registerKey("add_amber_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_AMBER_ORE = registerKey("add_nether_amber_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_AMBER_ORE = registerKey("add_end_amber_ore");
    //Apatite
    public static final ResourceKey<BiomeModifier> ADD_APATITE_ORE = registerKey("add_apatite_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_APATITE_ORE = registerKey("add_nether_apatite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_APATITE_ORE = registerKey("add_end_apatite_ore");
    //Cinnabar
    public static final ResourceKey<BiomeModifier> ADD_CINNABAR_ORE = registerKey("add_cinnabar_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_CINNABAR_ORE = registerKey("add_nether_cinnabar_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_CINNABAR_ORE = registerKey("add_end_cinnabar_ore");
    //Cobalt
    public static final ResourceKey<BiomeModifier> ADD_COBALT_ORE = registerKey("add_cobalt_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_COBALT_ORE = registerKey("add_nether_cobalt_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_COBALT_ORE = registerKey("add_end_cobalt_ore");
    //Fluorite
    public static final ResourceKey<BiomeModifier> ADD_FLUORITE_ORE = registerKey("add_fluorite_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_FLUORITE_ORE = registerKey("add_nether_fluorite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_FLUORITE_ORE = registerKey("add_end_fluorite_ore");
    //Gallium
    public static final ResourceKey<BiomeModifier> ADD_GALLIUM_ORE = registerKey("add_gallium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_GALLIUM_ORE = registerKey("add_nether_gallium_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_GALLIUM_ORE = registerKey("add_end_gallium_ore");
    //Iridium
    public static final ResourceKey<BiomeModifier> ADD_IRIDIUM_ORE = registerKey("add_iridium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_IRIDIUM_ORE = registerKey("add_nether_iridium_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_IRIDIUM_ORE = registerKey("add_end_iridium_ore");
    //Lead
    public static final ResourceKey<BiomeModifier> ADD_LEAD_ORE = registerKey("add_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_LEAD_ORE = registerKey("add_nether_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_LEAD_ORE = registerKey("add_end_lead_ore");
    //Nickel
    public static final ResourceKey<BiomeModifier> ADD_NICKEL_ORE = registerKey("add_nickel_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_NICKEL_ORE = registerKey("add_nether_nickel_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_NICKEL_ORE = registerKey("add_end_nickel_ore");
    //Niter
    public static final ResourceKey<BiomeModifier> ADD_NITER_ORE = registerKey("add_niter_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_NITER_ORE = registerKey("add_nether_niter_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_NITER_ORE = registerKey("add_end_niter_ore");
    //Onyx
    public static final ResourceKey<BiomeModifier> ADD_ONYX_ORE = registerKey("add_onyx_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ONYX_ORE = registerKey("add_nether_onyx_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_ONYX_ORE = registerKey("add_end_onyx_ore");
    //Osmium
    public static final ResourceKey<BiomeModifier> ADD_OSMIUM_ORE = registerKey("add_osmium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_OSMIUM_ORE = registerKey("add_nether_osmium_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_OSMIUM_ORE = registerKey("add_end_osmium_ore");
    //Obsidian
    public static final ResourceKey<BiomeModifier> ADD_NETHER_OBSIDIAN_ORE = registerKey("add_nether_obsidian_ore");
    //Peridot
    public static final ResourceKey<BiomeModifier> ADD_PERIDOT_ORE = registerKey("add_peridot_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_PERIDOT_ORE = registerKey("add_nether_peridot_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_PERIDOT_ORE = registerKey("add_end_peridot_ore");
    //Platinum
    public static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE = registerKey("add_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_PLATINUM_ORE = registerKey("add_nether_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_PLATINUM_ORE = registerKey("add_end_platinum_ore");
    //Ruby
    public static final ResourceKey<BiomeModifier> ADD_RUBY_ORE = registerKey("add_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_RUBY_ORE = registerKey("add_nether_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_RUBY_ORE = registerKey("add_end_ruby_ore");
    //Sapphire
    public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_ORE = registerKey("add_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SAPPHIRE_ORE = registerKey("add_nether_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_SAPPHIRE_ORE = registerKey("add_end_sapphire_ore");
    //Silver
    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = registerKey("add_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SILVER_ORE = registerKey("add_nether_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_SILVER_ORE = registerKey("add_end_silver_ore");
    //Sulfur
    public static final ResourceKey<BiomeModifier> ADD_SULFUR_ORE = registerKey("add_sulfur_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SULFUR_ORE = registerKey("add_nether_sulfur_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_SULFUR_ORE = registerKey("add_end_sulfur_ore");
    //Tin
    public static final ResourceKey<BiomeModifier> ADD_TIN_ORE = registerKey("add_tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_TIN_ORE = registerKey("add_nether_tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_TIN_ORE = registerKey("add_end_tin_ore");
    //Uranium
    public static final ResourceKey<BiomeModifier> ADD_URANIUM_ORE = registerKey("add_uranium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_URANIUM_ORE = registerKey("add_nether_uranium_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_URANIUM_ORE = registerKey("add_end_uranium_ore");
    //Zinc
    public static final ResourceKey<BiomeModifier> ADD_ZINC_ORE = registerKey("add_zinc_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ZINC_ORE = registerKey("add_nether_zinc_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_ZINC_ORE = registerKey("add_end_zinc_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        System.out.println("Bootstrap of BiomeModifier is Loading");

        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        System.out.println("Loading Biome Modifiers");

        //Aluminum
            context.register(ADD_ALUMINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                    HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.ALUMINUM_ORE_PLACED_KEY)),
                    GenerationStep.Decoration.UNDERGROUND_ORES));

        //Amber
        context.register(ADD_AMBER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.AMBER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Apatite
        context.register(ADD_APATITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.APATITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Cinnabar
        context.register(ADD_CINNABAR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.CINNABAR_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Cobalt
        context.register(ADD_COBALT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.COBALT_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Fluorite
        context.register(ADD_FLUORITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.FLUORITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Gallium
        context.register(ADD_GALLIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.GALLIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Iridium
        context.register(ADD_IRIDIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.IRIDIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Lead
        context.register(ADD_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.LEAD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Niter
        context.register(ADD_NITER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.NITER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Nickel
        context.register(ADD_NICKEL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.NICKEL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Onyx
        context.register(ADD_ONYX_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.ONYX_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Obsidian
        context.register(ADD_NETHER_OBSIDIAN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.OBSIDIAN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Osmium
        context.register(ADD_OSMIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.OSMIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Peridot
        context.register(ADD_PERIDOT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.PERIDOT_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Platinum
        context.register(ADD_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.PLATINUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Ruby
        context.register(ADD_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.RUBY_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Silver
        context.register(ADD_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Silver
        context.register(ADD_SILVER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.SILVER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Sulfur
        context.register(ADD_SULFUR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.SULFUR_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Tin
        context.register(ADD_TIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.TIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Uranium
        context.register(ADD_URANIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.URANIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Zinc
        context.register(ADD_ZINC_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.ZINC_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        System.out.println("Loading Register Key of Biome Modifier");
        return ResourceKey.create(
                NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                ResourceLocation.fromNamespaceAndPath(EternalOres.MOD_ID, name));

    }
}
