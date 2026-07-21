package net.radzratz.eternalores.worldgen.configured_features;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.radzratz.eternalores.worldgen.EOWorldGenRegistries;
import net.radzratz.eternalores.worldgen.ores.EOreKeys;
import net.radzratz.eternalores.worldgen.configured_features.config.EOreFeature;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

import static net.minecraft.world.level.block.Blocks.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.worldgen.ores.EOreKeys.*;

public class EOConfiguredFeatures {
    public static void configuredFeaturesRegistry(BootstrapContext<ConfiguredFeature<?, ?>> ctx) {
        rgtrAllOverworld(ctx, ALUMINUM_FEATURE.configuredOverworldFeature(), ALUMINUM_SET.ORE.get(), ALUMINUM_SET.SLATE_ORE.get(), EO("aluminum_overworld"));
        rgtrMining(ctx, ALUMINUM_FEATURE.configuredMiningFeature(), ALUMINUM_SET.ORE.get(), ALUMINUM_SET.SLATE_ORE.get(), null, null, EO("aluminum_mining"));

        rgtrAllOverworld(ctx, AMBER_FEATURE.configuredOverworldFeature(), AMBER_SET.ORE.get(), AMBER_SET.SLATE_ORE.get(), EO("amber_overworld"));
        rgtrMining(ctx, AMBER_FEATURE.configuredMiningFeature(), AMBER_SET.ORE.get(), AMBER_SET.SLATE_ORE.get(), null, null, EO("amber_mining"));

        rgtrMining(ctx, ANCIENT_DEBRIS_FEATURE.configuredMiningFeature(), null, null, Blocks.ANCIENT_DEBRIS, null, EO("ancient_debris_mining"));

        rgtrAllOverworld(ctx, ANTHRACITE_FEATURE.configuredOverworldFeature(), ANTHRACITE_SET.ORE.get(), ANTHRACITE_SET.SLATE_ORE.get(), EO("anthracite_overworld"));
        rgtrMining(ctx, ANTHRACITE_FEATURE.configuredMiningFeature(), ANTHRACITE_SET.ORE.get(), ANTHRACITE_SET.SLATE_ORE.get(), null, null, EO("anthracite_mining"));

        rgtrAllOverworld(ctx, APATITE_FEATURE.configuredOverworldFeature(), APATITE_SET.ORE.get(), APATITE_SET.SLATE_ORE.get(), EO("apatite_overworld"));
        rgtrMining(ctx, APATITE_FEATURE.configuredMiningFeature(), APATITE_SET.ORE.get(), APATITE_SET.SLATE_ORE.get(), null, null, EO("apatite_mining"));

        rgtrAllNether(ctx, ARDITE_FEATURE.configuredNetherFeature(), ARDITE_SET.NETHER_ORE.get(), EO("ardite_nether"));
        rgtrMining(ctx, ARDITE_FEATURE.configuredMiningFeature(), null, null, ARDITE_SET.NETHER_ORE.get(), null, EO("ardite_mining"));

        rgtrAllOverworld(ctx, BERYLLIUM_FEATURE.configuredOverworldFeature(), BERYLLIUM_SET.ORE.get(), BERYLLIUM_SET.SLATE_ORE.get(), EO("beryllium_overworld"));
        rgtrMining(ctx, BERYLLIUM_FEATURE.configuredMiningFeature(), BERYLLIUM_SET.ORE.get(), BERYLLIUM_SET.SLATE_ORE.get(), null, null, EO("beryllium_mining"));

        rgtrAllOverworld(ctx, BITUMINOUS_FEATURE.configuredOverworldFeature(), BITUMINOUS_SET.ORE.get(), BITUMINOUS_SET.SLATE_ORE.get(), EO("bituminous_overworld"));
        rgtrMining(ctx, BITUMINOUS_FEATURE.configuredMiningFeature(), BITUMINOUS_SET.ORE.get(), BITUMINOUS_SET.SLATE_ORE.get(), null, null, EO("bituminous_mining"));

        rgtrAllOverworld(ctx, CINNABAR_FEATURE.configuredOverworldFeature(), CINNABAR_SET.ORE.get(), CINNABAR_SET.SLATE_ORE.get(), EO("cinnabar_overworld"));
        rgtrAllNether(ctx, CINNABAR_FEATURE.configuredNetherFeature(), CINNABAR_SET.NETHER_ORE.get(), EO("cinnabar_nether"));
        rgtrMining(ctx, CINNABAR_FEATURE.configuredMiningFeature(), CINNABAR_SET.ORE.get(), CINNABAR_SET.SLATE_ORE.get(), CINNABAR_SET.NETHER_ORE.get(), null, EO("cinnabar_mining"));

        rgtrMining(ctx, COAL_FEATURE.configuredMiningFeature(), COAL_ORE, DEEPSLATE_COAL_ORE, null, null, EO("coal_mining"));

        rgtrAllOverworld(ctx, COBALT_FEATURE.configuredOverworldFeature(), COBALT_SET.ORE.get(), COBALT_SET.SLATE_ORE.get(), EO("cobalt_overworld"));
        rgtrAllNether(ctx, COBALT_FEATURE.configuredNetherFeature(), COBALT_SET.NETHER_ORE.get(), EO("cobalt_nether"));
        rgtrMining(ctx, COBALT_FEATURE.configuredMiningFeature(), COBALT_SET.ORE.get(), COBALT_SET.SLATE_ORE.get(), COBALT_SET.NETHER_ORE.get(), null, EO("cobalt_mining"));

        rgtrMining(ctx, COPPER_FEATURE.configuredMiningFeature(), COPPER_ORE, DEEPSLATE_COPPER_ORE, null, null, EO("copper_mining"));

        rgtrMining(ctx, DIAMOND_FEATURE.configuredMiningFeature(), DIAMOND_ORE, DEEPSLATE_DIAMOND_ORE, null, null, EO("diamond_mining"));

        rgtrMining(ctx, EMERALD_FEATURE.configuredMiningFeature(), EMERALD_ORE, DEEPSLATE_EMERALD_ORE, null, null, EO("emerald_mining"));

        rgtrAllOverworld(ctx, FLUORITE_FEATURE.configuredOverworldFeature(), FLUORITE_SET.ORE.get(), FLUORITE_SET.SLATE_ORE.get(), EO("fluorite_overworld"));
        rgtrAllEnd(ctx, FLUORITE_FEATURE.configuredEndFeature(), FLUORITE_SET.END_ORE.get(), EO("fluorite_end"));
        rgtrMining(ctx, FLUORITE_FEATURE.configuredMiningFeature(), FLUORITE_SET.ORE.get(), FLUORITE_SET.SLATE_ORE.get(), null, FLUORITE_SET.END_ORE.get(), EO("fluorite_mining"));

        rgtrAllOverworld(ctx, GALLIUM_FEATURE.configuredOverworldFeature(), GALLIUM_SET.ORE.get(), GALLIUM_SET.SLATE_ORE.get(), EO("gallium_overworld"));
        rgtrAllNether(ctx, GALLIUM_FEATURE.configuredNetherFeature(), GALLIUM_SET.NETHER_ORE.get(), EO("gallium_nether"));
        rgtrMining(ctx, GALLIUM_FEATURE.configuredMiningFeature(), GALLIUM_SET.ORE.get(), GALLIUM_SET.SLATE_ORE.get(), GALLIUM_SET.NETHER_ORE.get(), null , EO("gallium_mining"));

        rgtrAllOverworld(ctx, GARNET_FEATURE.configuredOverworldFeature(), GARNET_SET.ORE.get(), GARNET_SET.SLATE_ORE.get(), EO("garnet_overworld"));
        rgtrAllNether(ctx, GARNET_FEATURE.configuredNetherFeature(), GARNET_SET.NETHER_ORE.get(), EO("garnet_nether"));
        rgtrMining(ctx, GARNET_FEATURE.configuredMiningFeature(), GARNET_SET.ORE.get(), GARNET_SET.SLATE_ORE.get(), GARNET_SET.NETHER_ORE.get(), null, EO("garnet_mining"));

        rgtrMining(ctx, GOLD_FEATURE.configuredMiningFeature(), GOLD_ORE, DEEPSLATE_GOLD_ORE, NETHER_GOLD_ORE, null, EO("gold_mining"));

        rgtrAllOverworld(ctx, IRIDIUM_FEATURE.configuredOverworldFeature(), IRIDIUM_SET.ORE.get(), IRIDIUM_SET.SLATE_ORE.get(), EO("iridium_overworld"));
        rgtrAllEnd(ctx, IRIDIUM_FEATURE.configuredEndFeature(), IRIDIUM_SET.END_ORE.get(), EO("iridium_end"));
        rgtrMining(ctx, IRIDIUM_FEATURE.configuredMiningFeature(), IRIDIUM_SET.ORE.get(), IRIDIUM_SET.SLATE_ORE.get(), null, IRIDIUM_SET.END_ORE.get(), EO("iridium_mining"));

        rgtrMining(ctx, IRON_FEATURE.configuredMiningFeature(), IRON_ORE, DEEPSLATE_IRON_ORE, null, null, EO("iron_mining"));

        rgtrAllOverworld(ctx, JADE_FEATURE.configuredOverworldFeature(), JADE_SET.ORE.get(), JADE_SET.SLATE_ORE.get(), EO("jade_overworld"));
        rgtrAllNether(ctx, JADE_FEATURE.configuredNetherFeature(), JADE_SET.NETHER_ORE.get(), EO("jade_nether"));
        rgtrMining(ctx, JADE_FEATURE.configuredMiningFeature(), JADE_SET.ORE.get(), JADE_SET.SLATE_ORE.get(), JADE_SET.NETHER_ORE.get(), null, EO("jade_mining"));

        rgtrMining(ctx, LAPIS_FEATURE.configuredMiningFeature(), LAPIS_ORE, DEEPSLATE_LAPIS_ORE, null, null, EO("lapis_mining"));

        rgtrAllOverworld(ctx, LEAD_FEATURE.configuredOverworldFeature(), LEAD_SET.ORE.get(), LEAD_SET.SLATE_ORE.get(), EO("lead_overworld"));
        rgtrAllEnd(ctx, LEAD_FEATURE.configuredEndFeature(), LEAD_SET.END_ORE.get(),EO("lead_end"));
        rgtrMining(ctx, LEAD_FEATURE.configuredMiningFeature(), LEAD_SET.ORE.get(), LEAD_SET.SLATE_ORE.get(), null, LEAD_SET.END_ORE.get(), EO("lead_mining"));

        rgtrAllOverworld(ctx, LIGNITE_FEATURE.configuredOverworldFeature(), LIGNITE_SET.ORE.get(), LIGNITE_SET.SLATE_ORE.get(), EO("lignite_overworld"));
        rgtrMining(ctx, LIGNITE_FEATURE.configuredMiningFeature(), LIGNITE_SET.ORE.get(), LIGNITE_SET.SLATE_ORE.get(), null, null, EO("lignite_mining"));

        rgtrAllOverworld(ctx, MOLYBDENUM_FEATURE.configuredOverworldFeature(), MOLYBDENUM_SET.ORE.get(), MOLYBDENUM_SET.SLATE_ORE.get(), EO("molybdenum_overworld"));
        rgtrAllNether(ctx, MOLYBDENUM_FEATURE.configuredNetherFeature(), MOLYBDENUM_SET.NETHER_ORE.get(), EO("molybdenum_nether"));
        rgtrAllEnd(ctx, MOLYBDENUM_FEATURE.configuredEndFeature(), MOLYBDENUM_SET.END_ORE.get(), EO("molybdenum_end"));
        rgtrMining(ctx, MOLYBDENUM_FEATURE.configuredMiningFeature(), MOLYBDENUM_SET.ORE.get(), MOLYBDENUM_SET.SLATE_ORE.get(), MOLYBDENUM_SET.NETHER_ORE.get(), MOLYBDENUM_SET.END_ORE.get(), EO("molybdenum_mining"));

        rgtrAllNether(ctx, NECROTICARITE_FEATURE.configuredNetherFeature(), NECROTICARITE_SET.NETHER_ORE.get(), EO("necroticarite_nether"));
        rgtrMining(ctx, NECROTICARITE_FEATURE.configuredMiningFeature(), null, null, NECROTICARITE_SET.NETHER_ORE.get(), null, EO("necroticarite_mining"));

        rgtrAllOverworld(ctx, NEODYMIUM_FEATURE.configuredOverworldFeature(), NEODYMIUM_SET.ORE.get(), NEODYMIUM_SET.SLATE_ORE.get(), EO("neodymium_overworld"));
        rgtrAllEnd(ctx, NEODYMIUM_FEATURE.configuredEndFeature(), NEODYMIUM_SET.END_ORE.get(), EO("neodymium_end"));
        rgtrMining(ctx, NEODYMIUM_FEATURE.configuredMiningFeature(), NEODYMIUM_SET.ORE.get(), NEODYMIUM_SET.SLATE_ORE.get(), null, NEODYMIUM_SET.END_ORE.get(), EO("neodymium_mining"));

        rgtrAllOverworld(ctx, NITER_FEATURE.configuredOverworldFeature(), NITER_SET.ORE.get(), NITER_SET.SLATE_ORE.get(), EO("niter_overworld"));
        rgtrMining(ctx, NITER_FEATURE.configuredMiningFeature(), NITER_SET.ORE.get(), NITER_SET.SLATE_ORE.get(), null, null, EO("niter_mining"));

        rgtrAllOverworld(ctx, NICKEL_FEATURE.configuredOverworldFeature(), NICKEL_SET.ORE.get(), NICKEL_SET.SLATE_ORE.get(), EO("nickel_overworld"));
        rgtrAllNether(ctx, NICKEL_FEATURE.configuredNetherFeature(), NICKEL_SET.NETHER_ORE.get(), EO("nickel_nether"));
        rgtrMining(ctx, NICKEL_FEATURE.configuredMiningFeature(), NICKEL_SET.ORE.get(), NICKEL_SET.SLATE_ORE.get(), NICKEL_SET.NETHER_ORE.get(), null, EO("nickel_mining"));

        rgtrAllNether(ctx, EOreKeys.OBSIDIAN_FEATURE.configuredNetherFeature(), OBSIDIAN_SET.NETHER_ORE.get(), EO("obsidian_nether"));
        rgtrMining(ctx, EOreKeys.OBSIDIAN_FEATURE.configuredMiningFeature(), null, null, OBSIDIAN_SET.NETHER_ORE.get(), null, EO("obsidian_mining"));

        rgtrAllOverworld(ctx, ONYX_FEATURE.configuredOverworldFeature(), ONYX_SET.ORE.get(), ONYX_SET.SLATE_ORE.get(), EO("onyx_overworld"));
        rgtrAllNether(ctx, ONYX_FEATURE.configuredNetherFeature(), ONYX_SET.NETHER_ORE.get(), EO("onyx_nether"));
        rgtrMining(ctx, ONYX_FEATURE.configuredMiningFeature(), ONYX_SET.ORE.get(), ONYX_SET.SLATE_ORE.get(), ONYX_SET.NETHER_ORE.get(), null, EO("onyx_mining"));

        rgtrAllOverworld(ctx, OSMIUM_FEATURE.configuredOverworldFeature(), OSMIUM_SET.ORE.get(), OSMIUM_SET.SLATE_ORE.get(), EO("osmium_overworld"));
        rgtrAllNether(ctx, OSMIUM_FEATURE.configuredNetherFeature(), OSMIUM_SET.NETHER_ORE.get(), EO("osmium_nether"));
        rgtrMining(ctx, OSMIUM_FEATURE.configuredMiningFeature(), OSMIUM_SET.ORE.get(), OSMIUM_SET.SLATE_ORE.get(), OSMIUM_SET.NETHER_ORE.get(), null, EO("osmium_mining"));

        rgtrAllOverworld(ctx, PALLADIUM_FEATURE.configuredOverworldFeature(), PALLADIUM_SET.ORE.get(), PALLADIUM_SET.SLATE_ORE.get(), EO("palladium_overworld"));
        rgtrAllEnd(ctx, PALLADIUM_FEATURE.configuredEndFeature(), PALLADIUM_SET.END_ORE.get(), EO("palladium_end"));
        rgtrMining(ctx, PALLADIUM_FEATURE.configuredMiningFeature(), PALLADIUM_SET.ORE.get(), PALLADIUM_SET.SLATE_ORE.get(), null, PALLADIUM_SET.END_ORE.get(), EO("palladium_mining"));

        rgtrAllOverworld(ctx, PEAT_FEATURE.configuredOverworldFeature(), PEAT_SET.ORE.get(), PEAT_SET.SLATE_ORE.get(), EO("peat_overworld"));
        rgtrMining(ctx, PEAT_FEATURE.configuredMiningFeature(), PEAT_SET.ORE.get(), PEAT_SET.SLATE_ORE.get(), null, null, EO("peat_mining"));

        rgtrOnlySand(ctx, PEARL_FEATURE.configuredOverworldFeature(), PEARL_SET.SAND_ORE.get(), EO("pearl_overworld"));
        rgtrMining(ctx, PEARL_FEATURE.configuredMiningFeature(), PEARL_SET.SAND_ORE.get(), null, null, null, EO("pearl_mining"));

        rgtrAllOverworld(ctx, PERIDOT_FEATURE.configuredOverworldFeature(), PERIDOT_SET.ORE.get(), PERIDOT_SET.SLATE_ORE.get(), EO("peridot_overworld"));
        rgtrAllNether(ctx, PERIDOT_FEATURE.configuredNetherFeature(), PERIDOT_SET.NETHER_ORE.get(), EO("peridot_nether"));
        rgtrMining(ctx, PERIDOT_FEATURE.configuredMiningFeature(), PERIDOT_SET.ORE.get(), PERIDOT_SET.SLATE_ORE.get(), PERIDOT_SET.NETHER_ORE.get(), null, EO("peridot_mining"));

        rgtrAllOverworld(ctx, PLATINUM_FEATURE.configuredOverworldFeature(), PLATINUM_SET.ORE.get(), PLATINUM_SET.SLATE_ORE.get(), EO("platinum_overworld"));
        rgtrAllEnd(ctx, PLATINUM_FEATURE.configuredEndFeature(), PLATINUM_SET.END_ORE.get(), EO("platinum_end"));
        rgtrMining(ctx, PLATINUM_FEATURE.configuredMiningFeature(), PLATINUM_SET.ORE.get(), PLATINUM_SET.SLATE_ORE.get(), null, PLATINUM_SET.END_ORE.get(), EO("platinum_mining"));

        rgtrAllNether(ctx, PYROLITE_FEATURE.configuredNetherFeature(), PYROLITE_SET.NETHER_ORE.get(), EO("pyrolite_nether"));
        rgtrAllEnd(ctx, PYROLITE_FEATURE.configuredEndFeature(), PYROLITE_SET.END_ORE.get(), EO("pyrolite_end"));
        rgtrMining(ctx, PYROLITE_FEATURE.configuredMiningFeature(), null, null, PYROLITE_SET.NETHER_ORE.get(), PYROLITE_SET.END_ORE.get(), EO("pyrolite_mining"));

        rgtrMining(ctx, QUARTZ_FEATURE.configuredMiningFeature(), null, null, NETHER_QUARTZ_ORE, null, EO("quartz_mining"));

        rgtrMining(ctx, REDSTONE_FEATURE.configuredMiningFeature(), REDSTONE_ORE, DEEPSLATE_REDSTONE_ORE, null, null, EO("redstone_mining"));

        rgtrAllOverworld(ctx, RUBY_FEATURE.configuredOverworldFeature(), RUBY_SET.ORE.get(), RUBY_SET.SLATE_ORE.get(), EO("ruby_overworld"));
        rgtrAllNether(ctx, RUBY_FEATURE.configuredNetherFeature(), RUBY_SET.NETHER_ORE.get(), EO("ruby_nether"));
        rgtrMining(ctx, RUBY_FEATURE.configuredMiningFeature(), RUBY_SET.ORE.get(), RUBY_SET.SLATE_ORE.get(), RUBY_SET.NETHER_ORE.get(), null, EO("ruby_mining"));

        rgtrOnlySand(ctx, SALT_FEATURE.configuredOverworldFeature(), SALT_SET.SAND_ORE.get(), EO("salt_overworld"));
        rgtrMining(ctx, SALT_FEATURE.configuredMiningFeature(), SALT_SET.SAND_ORE.get(), null, null, null, EO("salt_mining"));

        rgtrAllOverworld(ctx, SAPPHIRE_FEATURE.configuredOverworldFeature(), SAPPHIRE_SET.ORE.get(), SAPPHIRE_SET.SLATE_ORE.get(), EO("sapphire_overworld"));
        rgtrAllEnd(ctx, SAPPHIRE_FEATURE.configuredEndFeature(), SAPPHIRE_SET.END_ORE.get(), EO("sapphire_end"));
        rgtrMining(ctx, SAPPHIRE_FEATURE.configuredMiningFeature(), SAPPHIRE_SET.ORE.get(), SAPPHIRE_SET.SLATE_ORE.get(), null, SAPPHIRE_SET.END_ORE.get(), EO("sapphire_mining"));

        rgtrOnlySculk(ctx, SCULKITE_FEATURE.configuredOverworldFeature(), SCULKITE_SET.SCULK_ORE.get(), EO("sculkite_overworld"));
        rgtrMining(ctx, SCULKITE_FEATURE.configuredMiningFeature(), null, SCULKITE_SET.SCULK_ORE.get(), null, null, EO("sculkite_mining"));

        rgtrAllOverworld(ctx, SILVER_FEATURE.configuredOverworldFeature(), SILVER_SET.ORE.get(), SILVER_SET.SLATE_ORE.get(), EO("silver_overworld"));
        rgtrAllNether(ctx, SILVER_FEATURE.configuredNetherFeature(), SILVER_SET.NETHER_ORE.get(), EO("silver_nether"));
        rgtrMining(ctx, SILVER_FEATURE.configuredMiningFeature(), SILVER_SET.ORE.get(), SILVER_SET.SLATE_ORE.get(), SILVER_SET.NETHER_ORE.get(), null, EO("silver_mining"));

        rgtrAllOverworld(ctx, SULFUR_FEATURE.configuredOverworldFeature(), SULFUR_SET.ORE.get(), SULFUR_SET.SLATE_ORE.get(), EO("sulfur_overworld"));
        rgtrAllNether(ctx, SULFUR_FEATURE.configuredNetherFeature(), SULFUR_SET.NETHER_ORE.get(), EO("sulfur_nether"));
        rgtrMining(ctx, SULFUR_FEATURE.configuredMiningFeature(), SULFUR_SET.ORE.get(), SULFUR_SET.SLATE_ORE.get(), SULFUR_SET.NETHER_ORE.get(), null, EO("sulfur_mining"));

        rgtrAllOverworld(ctx, SPINEL_FEATURE.configuredOverworldFeature(), SPINEL_SET.ORE.get(), SPINEL_SET.SLATE_ORE.get(), EO("spinel_overworld"));
        rgtrAllNether(ctx, SPINEL_FEATURE.configuredNetherFeature(), SPINEL_SET.NETHER_ORE.get(), EO("spinel_nether"));
        rgtrMining(ctx, SPINEL_FEATURE.configuredMiningFeature(), SPINEL_SET.ORE.get(), SPINEL_SET.SLATE_ORE.get(), SPINEL_SET.NETHER_ORE.get(), null, EO("spinel_mining"));

        rgtrAllOverworld(ctx, TANZANITE_FEATURE.configuredOverworldFeature(), TANZANITE_SET.ORE.get(), TANZANITE_SET.SLATE_ORE.get(), EO("tanzanite_overworld"));
        rgtrAllNether(ctx, TANZANITE_FEATURE.configuredNetherFeature(), TANZANITE_SET.NETHER_ORE.get(), EO("tanzanite_nether"));
        rgtrMining(ctx, TANZANITE_FEATURE.configuredMiningFeature(), TANZANITE_SET.ORE.get(), TANZANITE_SET.SLATE_ORE.get(), TANZANITE_SET.NETHER_ORE.get(), null, EO("tanzanite_mining"));

        rgtrAllOverworld(ctx, TIN_FEATURE.configuredOverworldFeature(), TIN_SET.ORE.get(), TIN_SET.SLATE_ORE.get(), EO("tin_overworld"));
        rgtrAllEnd(ctx, TIN_FEATURE.configuredEndFeature(), TIN_SET.END_ORE.get(), EO("tin_end"));
        rgtrMining(ctx, TIN_FEATURE.configuredMiningFeature(), TIN_SET.ORE.get(), TIN_SET.SLATE_ORE.get(), null, TIN_SET.END_ORE.get(), EO("tin_mining"));

        rgtrAllOverworld(ctx, TITANIUM_FEATURE.configuredOverworldFeature(), TITANIUM_SET.ORE.get(), TITANIUM_SET.SLATE_ORE.get(), EO("titanium_overworld"));
        rgtrAllEnd(ctx, TITANIUM_FEATURE.configuredEndFeature(), TITANIUM_SET.END_ORE.get(), EO("titanium_end"));
        rgtrMining(ctx, TITANIUM_FEATURE.configuredMiningFeature(), TITANIUM_SET.ORE.get(), TITANIUM_SET.SLATE_ORE.get(), null, TITANIUM_SET.END_ORE.get(), EO("titanium_mining"));

        rgtrOnlySlate(ctx, TUNGSTEN_FEATURE.configuredOverworldFeature(), TUNGSTEN_SET.SLATE_ORE.get(), EO("tungsten_overworld"));
        rgtrAllEnd(ctx, TUNGSTEN_FEATURE.configuredEndFeature(), TUNGSTEN_SET.END_ORE.get(), EO("tungsten_end"));
        rgtrMining(ctx, TUNGSTEN_FEATURE.configuredMiningFeature(), null, TUNGSTEN_SET.SLATE_ORE.get(), null, TUNGSTEN_SET.END_ORE.get(), EO("tungsten_mining"));

        rgtrAllEnd(ctx, ULTIMATITANIUM_FEATURE.configuredEndFeature(), ULTIMATITANIUM_SET.END_ORE.get(), EO("ultimatitanium_end"));
        rgtrMining(ctx, ULTIMATITANIUM_FEATURE.configuredMiningFeature(), null, null, null, ULTIMATITANIUM_SET.END_ORE.get(), EO("ultimatitanium_mining"));

        rgtrAllOverworld(ctx, URANINITE_FEATURE.configuredOverworldFeature(), URANINITE_SET.ORE.get(), URANINITE_SET.SLATE_ORE.get(), EO("uraninite_overworld"));
        rgtrAllNether(ctx, URANINITE_FEATURE.configuredNetherFeature(), URANINITE_SET.NETHER_ORE.get(), EO("uraninite_nether"));
        rgtrMining(ctx, URANINITE_FEATURE.configuredMiningFeature(), URANINITE_SET.ORE.get(), URANINITE_SET.SLATE_ORE.get(), URANINITE_SET.NETHER_ORE.get(), null, EO("uraninite_mining"));

        rgtrAllOverworld(ctx, URANIUM_FEATURE.configuredOverworldFeature(), URANIUM_SET.ORE.get(), URANIUM_SET.SLATE_ORE.get(), EO("uranium_overworld"));
        rgtrAllNether(ctx, URANIUM_FEATURE.configuredNetherFeature(), URANIUM_SET.NETHER_ORE.get(), EO("uranium_nether"));
        rgtrAllEnd(ctx, URANIUM_FEATURE.configuredEndFeature(), URANIUM_SET.END_ORE.get(), EO("uranium_end"));
        rgtrMining(ctx, URANIUM_FEATURE.configuredMiningFeature(), URANIUM_SET.ORE.get(), URANIUM_SET.SLATE_ORE.get(), URANIUM_SET.NETHER_ORE.get(), URANIUM_SET.END_ORE.get(), EO("uranium_mining"));

        rgtrAllOverworld(ctx, VANADIUM_FEATURE.configuredOverworldFeature(), VANADIUM_SET.ORE.get(), VANADIUM_SET.SLATE_ORE.get(), EO("vanadium_overworld"));
        rgtrAllEnd(ctx, VANADIUM_FEATURE.configuredEndFeature(), VANADIUM_SET.END_ORE.get(), EO("vanadium_end"));
        rgtrMining(ctx, VANADIUM_FEATURE.configuredMiningFeature(), VANADIUM_SET.ORE.get(), VANADIUM_SET.SLATE_ORE.get(), null, VANADIUM_SET.END_ORE.get(), EO("vanadium_mining"));

        rgtrAllOverworld(ctx, ZINC_FEATURE.configuredOverworldFeature(), ZINC_SET.ORE.get(), ZINC_SET.SLATE_ORE.get(), EO("zinc_overworld"));
        rgtrMining(ctx, ZINC_FEATURE.configuredMiningFeature(), ZINC_SET.ORE.get(), ZINC_SET.SLATE_ORE.get(), null, null, EO("zinc_mining"));

        rgtrAllOverworld(ctx, ZIRCON_FEATURE.configuredOverworldFeature(), ZIRCON_SET.ORE.get(), ZIRCON_SET.SLATE_ORE.get(), EO("zircon_overworld"));
        rgtrAllNether(ctx, ZIRCON_FEATURE.configuredNetherFeature(), ZIRCON_SET.NETHER_ORE.get(), EO("zircon_nether"));
        rgtrMining(ctx, ZIRCON_FEATURE.configuredMiningFeature(), ZIRCON_SET.ORE.get(), ZIRCON_SET.SLATE_ORE.get(), ZIRCON_SET.NETHER_ORE.get(), null, EO("zircon_mining"));
    }

    private static void rgtrAllOverworld(BootstrapContext<ConfiguredFeature<?, ?>> ctx, ResourceKey<ConfiguredFeature<?, ?>> key,
                                         Block stone, Block slate, ResourceLocation oreId) {
        RuleTest sReplace = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest dReplace = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        var Stone = OreConfiguration.target(sReplace, stone.defaultBlockState());
        var Slate = OreConfiguration.target(dReplace, slate.defaultBlockState());

        List<OreConfiguration.TargetBlockState> targets = List.of(Stone, Slate);

        ctx.register(key, new ConfiguredFeature<>(EOWorldGenRegistries.CONFIG_ORE_FEATURE.get(), new EOreFeature.EOreFeatureConfig(targets, oreId)));
    }

    private static void rgtrOnlySculk(BootstrapContext<ConfiguredFeature<?, ?>> ctx, ResourceKey<ConfiguredFeature<?, ?>> key,
                                      Block sculk, ResourceLocation oreId) {
        RuleTest sculkReplaceable = new TagMatchTest(BlockTags.SCULK_REPLACEABLE);

        var Sculk = OreConfiguration.target(sculkReplaceable, sculk.defaultBlockState());

        List<OreConfiguration.TargetBlockState> targets = List.of(Sculk);

        ctx.register(key, new ConfiguredFeature<>(EOWorldGenRegistries.CONFIG_ORE_FEATURE.get(), new EOreFeature.EOreFeatureConfig(targets, oreId)));
    }

    private static void rgtrOnlySlate(BootstrapContext<ConfiguredFeature<?, ?>> ctx, ResourceKey<ConfiguredFeature<?, ?>> key,
                                      Block block, ResourceLocation oreId) {
        RuleTest uniqueReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        var unique = OreConfiguration.target(uniqueReplaceable, block.defaultBlockState());

        List<OreConfiguration.TargetBlockState> targets = List.of(unique);

        ctx.register(key, new ConfiguredFeature<>(EOWorldGenRegistries.CONFIG_ORE_FEATURE.get(), new EOreFeature.EOreFeatureConfig(targets, oreId)));
    }

    private static void rgtrOnlySand(BootstrapContext<ConfiguredFeature<?, ?>> ctx, ResourceKey<ConfiguredFeature<?, ?>> key,
                                     Block sand, ResourceLocation oreId) {
        RuleTest sculkReplaceable = new TagMatchTest(BlockTags.SAND);

        var snd = OreConfiguration.target(sculkReplaceable, sand.defaultBlockState());

        List<OreConfiguration.TargetBlockState> targets = List.of(snd);

        ctx.register(key, new ConfiguredFeature<>(EOWorldGenRegistries.CONFIG_ORE_FEATURE.get(), new EOreFeature.EOreFeatureConfig(targets, oreId)));
    }

    private static void rgtrAllNether(BootstrapContext<ConfiguredFeature<?, ?>> ctx, ResourceKey<ConfiguredFeature<?, ?>> key,
                                      Block block, ResourceLocation oreId) {
        RuleTest nReplace = new BlockMatchTest(Blocks.NETHERRACK);

        var nether = OreConfiguration.target(nReplace, block.defaultBlockState());

        List<OreConfiguration.TargetBlockState> targets = List.of(nether);

        ctx.register(key, new ConfiguredFeature<>(EOWorldGenRegistries.CONFIG_ORE_FEATURE.get(), new EOreFeature.EOreFeatureConfig(targets, oreId)));
    }

    private static void rgtrAllEnd(BootstrapContext<ConfiguredFeature<?, ?>> ctx, ResourceKey<ConfiguredFeature<?, ?>> key, Block block, ResourceLocation oreId) {
        RuleTest eReplace = new BlockMatchTest(Blocks.END_STONE);

        var nether = OreConfiguration.target(eReplace, block.defaultBlockState());

        List<OreConfiguration.TargetBlockState> targets = List.of(nether);

        ctx.register(key, new ConfiguredFeature<>(EOWorldGenRegistries.CONFIG_ORE_FEATURE.get(), new EOreFeature.EOreFeatureConfig(targets, oreId)));
    }

    private static void rgtrMining(BootstrapContext<ConfiguredFeature<?, ?>> ctx, ResourceKey<ConfiguredFeature<?, ?>> key, @Nullable Block stone,
                                   @Nullable Block slate, @Nullable Block netherrack, @Nullable Block endStone, ResourceLocation oreId) {
        List<OreConfiguration.TargetBlockState> targets = new ArrayList<>();

        if (stone != null) {
            targets.add(OreConfiguration.target(new BlockMatchTest(Blocks.STONE), stone.defaultBlockState()));
        }

        if (slate != null) {
            targets.add(OreConfiguration.target(new BlockMatchTest(Blocks.DEEPSLATE), slate.defaultBlockState()));
        }

        if (netherrack != null) {
            targets.add(OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), netherrack.defaultBlockState()));
        }

        if (endStone != null) {
            targets.add(OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), endStone.defaultBlockState()));
        }

        if (targets.isEmpty()) {
            return;
        }

        ctx.register(key, new ConfiguredFeature<>(EOWorldGenRegistries.CONFIG_ORE_FEATURE.get(), new EOreFeature.EOreFeatureConfig(targets, oreId)));
    }
}
