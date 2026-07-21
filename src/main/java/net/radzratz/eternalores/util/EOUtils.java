package net.radzratz.eternalores.util;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.EternalOres;

import java.util.Collection;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

import static net.radzratz.eternalores.block.EOCompressedBlockRegistry.EO_COMPRESSED_BLOCKS;
import static net.radzratz.eternalores.util.EOSetRegistries.EO_BLOCKS;
import static net.radzratz.eternalores.util.EOSetRegistries.EO_ITEMS;
import static net.radzratz.eternalores.util.EOMaterials.extractMaterialName;

@SuppressWarnings("unused")
public class EOUtils {
    public static String capitalize(String string) {
        // obviously, we set Locale.ROOT in this to prevent anything from
        // blowing up due to funny lang characters causing issues
        return string.substring(0, 1).toUpperCase(Locale.ROOT) + string.substring(1);
    }

    public static String capitalizeWords(String string) {
        String[] parts = string.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String part : parts) {
            builder.append(capitalize(part)).append(" ");
        }
        return builder.toString().trim();
    }

    public static String replaceUnderscoreWithCapitalization(String string) {
        return capitalizeWords(extractMaterialName(string).replace("_", " "));
    }

    public static String ALMOST_UNIFIED = "almostunified";
    public static final boolean almostUnifiedMod = ModList.get().isLoaded(ALMOST_UNIFIED);
    public static final ModLoadedCondition ALMOST_UNIFIED_MOD = new ModLoadedCondition(ALMOST_UNIFIED);

    public static String MEKANISM = "mekanism";
    public static final boolean mekanismMod = ModList.get().isLoaded(MEKANISM);
    public static final ModLoadedCondition MEKANISM_MOD = new ModLoadedCondition(MEKANISM);

    public static String MEKANISM_MORE_MACHINE = "mekmm";
    public static final boolean mekMoreMachineMod = ModList.get().isLoaded(MEKANISM_MORE_MACHINE);
    public static final ModLoadedCondition MEKANISM_MORE_MACHINE_MOD = new ModLoadedCondition(MEKANISM_MORE_MACHINE);

    public static String ENERGIZED_POWER = "energizedpower";
    public static final boolean energizedPowerMod = ModList.get().isLoaded(ENERGIZED_POWER);
    public static final ModLoadedCondition ENERGIZED_POWER_MOD = new ModLoadedCondition(ENERGIZED_POWER);

    public static String ACTUALLY_ADDITIONS = "actuallyadditions";
    public static final boolean actuallyAdditionsMod = ModList.get().isLoaded(ACTUALLY_ADDITIONS);
    public static final ModLoadedCondition ACTUALLY_ADDITIONS_MOD = new ModLoadedCondition(ACTUALLY_ADDITIONS);

    public static String POWAH = "powah";
    public static final boolean powahMod = ModList.get().isLoaded(POWAH);
    public static final ModLoadedCondition POWAH_MOD = new ModLoadedCondition(POWAH);

    public static String ORITECH = "oritech";
    public static final boolean oritechMod = ModList.get().isLoaded(ORITECH);
    public static final ModLoadedCondition ORITECH_MOD = new ModLoadedCondition(ORITECH);

    public static String IRON_FURNACES = "ironfurnaces";
    public static final boolean ironFurnaceMod = ModList.get().isLoaded(IRON_FURNACES);
    public static final ModLoadedCondition IRON_FURNACES_MOD = new ModLoadedCondition(IRON_FURNACES);

    public static String ENDERIO = "enderio";
    public static final boolean enderioMod = ModList.get().isLoaded(ENDERIO);
    public static final ModLoadedCondition ENDERIO_MOD = new ModLoadedCondition(ENDERIO);

    public static String CREATE = "create";
    public static final boolean createMod = ModList.get().isLoaded(CREATE);
    public static final ModLoadedCondition CREATE_MOD = new ModLoadedCondition(CREATE);

    public static String CREATE_CRAFTS_ADDITIONS = "createaddition";
    public static final boolean craftsAdditionsMod = ModList.get().isLoaded(CREATE_CRAFTS_ADDITIONS);
    public static final ModLoadedCondition CREATE_CRAFTS_ADDITIONS_MOD = new ModLoadedCondition(CREATE_CRAFTS_ADDITIONS);

    public static String IMMERSIVE_ENGINEERING = "immersiveengineering";
    public static final boolean immersiveEngineeringMod = ModList.get().isLoaded(IMMERSIVE_ENGINEERING);
    public static final ModLoadedCondition IMMERSIVE_ENGINEERING_MOD = new ModLoadedCondition(IMMERSIVE_ENGINEERING);

    public static String FORBIDDEN_ARCANUS = "forbidden_arcanus";
    public static final boolean forbiddenArcanusMod = ModList.get().isLoaded(FORBIDDEN_ARCANUS);
    public static final ModLoadedCondition FORBIDDEN_ARCANUS_MOD = new ModLoadedCondition(FORBIDDEN_ARCANUS);

    public static String APPLIED_ENERGISTICS = "ae2";
    public static final boolean appliedEnergisticsMod = ModList.get().isLoaded(APPLIED_ENERGISTICS);
    public static final ModLoadedCondition APPLIED_ENERGISTICS_MOD = new ModLoadedCondition(APPLIED_ENERGISTICS);

    public static String APPLIED_FLUX = "appflux";
    public static final boolean appliedFluxMod = ModList.get().isLoaded(APPLIED_FLUX);
    public static final ModLoadedCondition APPLIED_FLUX_MOD = new ModLoadedCondition(APPLIED_FLUX);

    public static String MEGA_CELLS = "megacells";
    public static final boolean megaCellsMod = ModList.get().isLoaded(MEGA_CELLS);
    public static final ModLoadedCondition MEGA_CELLS_MOD = new ModLoadedCondition(MEGA_CELLS);

    public static String EXTENDED_AE = "extendedae";
    public static final boolean extendedAEMod = ModList.get().isLoaded(EXTENDED_AE);
    public static final ModLoadedCondition EXTENDED_AE_MOD = new ModLoadedCondition(EXTENDED_AE);

    public static String ADVANCED_AE = "advanced_ae";
    public static final boolean advancedAEMod = ModList.get().isLoaded(ADVANCED_AE);
    public static final ModLoadedCondition ADVANCED_AE_MOD = new ModLoadedCondition(ADVANCED_AE);

    public static String REPLICATION = "replication";
    public static final boolean replicaMod = ModList.get().isLoaded(REPLICATION);
    public static final ModLoadedCondition REPLICATION_MOD = new ModLoadedCondition(REPLICATION);

    public static String OCCULTISM = "occultism";
    public static final boolean occultismMod = ModList.get().isLoaded(OCCULTISM);
    public static final ModLoadedCondition OCCULTISM_MOD = new ModLoadedCondition(OCCULTISM);

    public static String PNEUMATICCRAFT = "pneumaticcraft";
    public static final boolean pneumaticCraftMod = ModList.get().isLoaded(PNEUMATICCRAFT);
    public static final ModLoadedCondition PNEUMATICCRAFT_MOD = new ModLoadedCondition(PNEUMATICCRAFT);

    public static String MYSTICAL_AGRICULTURE = "mysticalagriculture";
    public static final boolean mysticalAgricultureMod = ModList.get().isLoaded(MYSTICAL_AGRICULTURE);
    public static final ModLoadedCondition MYSTICAL_AGRICULTURE_MOD = new ModLoadedCondition(MYSTICAL_AGRICULTURE);

    public static String MYSTICAL_AGRADDITIONS = "mysticalagradditions";
    public static final boolean mysticalAgradditionsMod = ModList.get().isLoaded(MYSTICAL_AGRADDITIONS);
    public static final ModLoadedCondition MYSTICAL_AGRADDITIONS_MOD = new ModLoadedCondition(MYSTICAL_AGRADDITIONS);

    public static String ARS_NOUVEAU = "ars_nouveau";
    public static final boolean arsNouveauMod = ModList.get().isLoaded(ARS_NOUVEAU);
    public static final ModLoadedCondition ARS_NOUVEAU_MOD = new ModLoadedCondition(ARS_NOUVEAU);

    public static String JUST_DIRE_THINGS = "justdirethings";
    public static final boolean justDireMod = ModList.get().isLoaded(JUST_DIRE_THINGS);
    public static final ModLoadedCondition JUST_DIRE_THINGS_MOD = new ModLoadedCondition(JUST_DIRE_THINGS);

    public static String XYCRAFT_WORLD = "xycraft_world";
    public static final boolean xycraftMod = ModList.get().isLoaded(XYCRAFT_WORLD);
    public static final ModLoadedCondition XYCRAFT_WORLD_MOD = new ModLoadedCondition(XYCRAFT_WORLD);

    public static String EVILCRAFT = "evilcraft";
    public static final boolean evilcraftMod = ModList.get().isLoaded(EVILCRAFT);
    public static final ModLoadedCondition EVILCRAFT_MOD = new ModLoadedCondition(EVILCRAFT);

    public static String INTEGRATED_DYNAMICS = "integrateddynamics";
    public static final boolean integratedDynamicsMod = ModList.get().isLoaded(INTEGRATED_DYNAMICS);
    public static final ModLoadedCondition INTEGRATED_DYNAMICS_MOD = new ModLoadedCondition(INTEGRATED_DYNAMICS);

    public static String INDUSTRIAL_FOREGOING = "industrialforegoing";
    public static final boolean industrialForegoingMod = ModList.get().isLoaded(INDUSTRIAL_FOREGOING);
    public static final ModLoadedCondition INDUSTRIAL_FOREGOING_MOD = new ModLoadedCondition(INDUSTRIAL_FOREGOING);

    public static String GEORE = "geore";
    public static final boolean georeMod = ModList.get().isLoaded(GEORE);
    public static final ModLoadedCondition GEORE_MOD = new ModLoadedCondition(GEORE);

    public static String RAILCRAFT = "railcraft";
    public static final boolean railCraftMod = ModList.get().isLoaded(RAILCRAFT);
    public static final ModLoadedCondition RAILCRAFT_MOD = new ModLoadedCondition(RAILCRAFT);

    public static Stream<DeferredHolder<Item, ? extends Item>> allItemEntries() {
        return Stream.of(EO_ITEMS.getEntries()).flatMap(Collection::stream);
    }

    public static Stream<DeferredHolder<Block, ? extends Block>> allBlockEntries() {
        return Stream.of(EO_BLOCKS.getEntries(), EO_COMPRESSED_BLOCKS.getEntries()).flatMap(Collection::stream);
    }

    public static ResourceLocation EO(String path) {
        return ResourceLocation.fromNamespaceAndPath(EternalOres.id, path);
    }

    public static ResourceLocation NEO(String path) {
        return ResourceLocation.fromNamespaceAndPath("neoforge", path);
    }

    public static ResourceLocation MEK(String path) {
        return ResourceLocation.fromNamespaceAndPath(MEKANISM, path);
    }

    public static ResourceLocation FA(String path) {
        return ResourceLocation.fromNamespaceAndPath(FORBIDDEN_ARCANUS, path);
    }

    public static ResourceLocation EP(String path) {
        return ResourceLocation.fromNamespaceAndPath(ENERGIZED_POWER, path);
    }

    public static ResourceLocation MC(String path) {
        return ResourceLocation.withDefaultNamespace(path);
    }

    public static ResourceLocation C(String path) {
        return ResourceLocation.fromNamespaceAndPath("c", path);
    }

    public static ResourceLocation GEO(String path) {
        return ResourceLocation.fromNamespaceAndPath(GEORE, path);
    }

    public static ResourceLocation EIO(String path) {
        return ResourceLocation.fromNamespaceAndPath(ENDERIO, path);
    }

    public static ResourceLocation CTE(String path) {
        return ResourceLocation.fromNamespaceAndPath(CREATE, path);
    }

    public static ResourceLocation ORIT(String path) {
        return ResourceLocation.fromNamespaceAndPath(ORITECH, path);
    }

    public static ResourceLocation EXTEND_AE(String path) {
        return ResourceLocation.fromNamespaceAndPath(EXTENDED_AE, path);
    }

    public static ResourceLocation POW(String path) {
        return ResourceLocation.fromNamespaceAndPath(POWAH, path);
    }

    public static Item getItemFromAnyNamespace(Registry<Item> registry, String path) {
        Optional<Item> eternalOresItem = registry.getOptional(EO(path));
        if (eternalOresItem.isPresent()) return eternalOresItem.get();

        Optional<Item> mcItem = registry.getOptional(MC(path));
        return mcItem.orElse(null);
    }
}
