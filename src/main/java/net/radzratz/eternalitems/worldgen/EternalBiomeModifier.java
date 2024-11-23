package net.radzratz.eternalitems.worldgen;

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
import net.radzratz.eternalitems.EternalItems;

public class EternalBiomeModifier {
    //Aluminum
    public static final ResourceKey<BiomeModifier> ADD_ALUMINUM_ORE = registerKey("add_aluminum_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ALUMINUM_ORE = registerKey("add_nether_aluminum_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_ALUMINUM_ORE = registerKey("add_end_aluminum_ore");
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
    //Lead
    public static final ResourceKey<BiomeModifier> ADD_LEAD_ORE = registerKey("add_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_LEAD_ORE = registerKey("add_nether_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_LEAD_ORE = registerKey("add_end_lead_ore");
    //Nickel
    public static final ResourceKey<BiomeModifier> ADD_NICKEL_ORE = registerKey("add_nickel_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_NICKEL_ORE = registerKey("add_nether_nickel_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_NICKEL_ORE = registerKey("add_end_nickel_ore");
    //Osmium
    public static final ResourceKey<BiomeModifier> ADD_OSMIUM_ORE = registerKey("add_osmium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_OSMIUM_ORE = registerKey("add_nether_osmium_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_OSMIUM_ORE = registerKey("add_end_osmium_ore");
    //Platinum
    public static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE = registerKey("add_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_PLATINUM_ORE = registerKey("add_nether_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_PLATINUM_ORE = registerKey("add_end_platinum_ore");
    //Plutonium
    public static final ResourceKey<BiomeModifier> ADD_PLUTONIUM_ORE = registerKey("add_plutonium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_PLUTONIUM_ORE = registerKey("add_nether_plutonium_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_PLUTONIUM_ORE = registerKey("add_end_plutonium_ore");
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
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        //Aluminum
        context.register(ADD_ALUMINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.ALUMINUM_ORE_PLACED_KEY)),
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

        //Lead
        context.register(ADD_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.LEAD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Nickel
        context.register(ADD_NICKEL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.NICKEL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Osmium
        context.register(ADD_OSMIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.OSMIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Platinum
        context.register(ADD_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.PLATINUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Plutonium
        context.register(ADD_PLUTONIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EternalPlacedFeatures.PLUTONIUM_ORE_PLACED_KEY)),
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
        return ResourceKey.create(
                NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, name)
        );

    }
}
