package net.radzratz.eternalores.datagen.lang.EN;

import mekanism.api.chemical.Chemical;
import mekanism.common.registration.impl.SlurryRegistryObject;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.EOMaterials;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOInfusions;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOMekSlurries;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.compat.enderio.items.EOioItems.allEnderIOItemEntries;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.allGeOreItemEntries;
import static net.radzratz.eternalores.util.lang.EOLangKeys.*;
import static net.radzratz.eternalores.util.EOMaterials.materialPrefixSuffixes.*;
import static net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries.*;

public class EOLocalizationEN_US extends LanguageProvider {
    private Map<String, String> specialCaseCache;

    public EOLocalizationEN_US(PackOutput output) {
        this(output, "en_us");
    }

    protected EOLocalizationEN_US(PackOutput output, String locale) {
        super(output, EternalOres.id, locale);
    }

    @Override
    protected void addTranslations() {
        addCoreTranslations();
        addToolTip();
        addClientMessages();
        addCategories();
        addScreens();
        addCompatTranslations();
    }

    protected void addCoreTranslations() {
        allItemEntries().forEach(item -> {
            String path = item.getId().getPath();
            if (path.startsWith("compressed_")) return;
            add(item.get(), formatNames(path));
        });

        add(CREATIVE_TAB + "ores", tabOresName());
        add(CREATIVE_TAB + "raw_mats", tabRawMatsName());
        add(CREATIVE_TAB + "blocks", tabBlocksName());
        add(CREATIVE_TAB + "compressed", tabCompressedName());
        add(CREATIVE_TAB + "materials", tabMaterialsName());
        add(CREATIVE_TAB + "dusts", tabDustsName());
        add(CREATIVE_TAB + "forms", tabFormsName());
        add(CREATIVE_TAB + "tools", tabToolsName());
        add(CREATIVE_TAB + "coals", tabCoalsName());
        add(CREATIVE_TAB + "compat_materials", tabCompatMaterialsName());
        add(CREATIVE_TAB + "compat_items", tabCompatItemsName());
    }

    protected String tabOresName() {
        return "EO Ores";
    }

    protected String tabRawMatsName() {
        return "EO Raw Materials";
    }

    protected String tabBlocksName() {
        return "EO Blocks";
    }

    protected String tabCompressedName() {
        return "EO Compressed Blocks";
    }

    protected String tabMaterialsName() {
        return "EO Materials";
    }

    protected String tabDustsName() {
        return "EO Dusts";
    }

    protected String tabFormsName() {
        return "EO Material Forms";
    }

    protected String tabToolsName() {
        return "EO Tools";
    }

    protected String tabCoalsName() {
        return "EO Coals (Fuels)";
    }

    protected String tabCompatMaterialsName() {
        return "EO Compat Materials";
    }

    protected String tabCompatItemsName() {
        return "EO Compat Items & Blocks";
    }

    protected void addToolTip() {
        add(UNSTABLE_INGOT_DESC, """
                               This ingot is unstable and will explode after 10 seconds.
                               It will also explode if dropped or if the crafting window is closed.
                               These ingots do not stack and cannot be auto-crafted.
                               """);
        add(UNSTABLE_INGOT_CRAFTING_TABLE, "Must be crafted in a vanilla crafting table.");
        add(UNSTABLE_INGOT_WARNING, "Do not craft unless prepared.");
        add(UNSTABLE_INGOT_TIMER, "Explodes in: %ss");

        add(FINDER_CREATIVE_ONLY, "This item is for Creative Mode only.");
        add(FINDER_CHUNK_DESTROYED, "Chunk Be GONE!");
        add(FINDER_CHUNK_DESC, "Yeets everything except ores and bedrock! Dev Tool Only.");

        add(NICKELBACK, "Nickel Block not Nickelback");
        add(EXOTIC_BUTTER, "Block of Exotic Butter");

        add(TEMICTETL_BLOCK_DESC, "Block of Dream Gemstone");
        add(TEMICTETL_DUST_BLOCK_DESC, "Block of Dream Gemstone Dust");
        add(TEMICTETL_GEM_DESC, "Dream Gemstone");
        add(TEMICTETL_GEM_SHARD_DESC, "Dream Gemstone Shard");
        add(TEMICTETL_DUST_DESC, "Dream Gemstone Dust");
        add(TEMICTETL_SMALL_DUST_DESC, "Small Dream Gemstone Dust");
        add(TEMICTETL_PLATE_DESC, "Dream Gemstone Plate");
        add(TEMICTETL_ROD_DESC, "Dream Gemstone Rod");
        add(TEMICTETL_GEAR_DESC, "Dream Gemstone Gear");
        add(TEMICTETL_ENRICHED_DESC, "Enriched Dream Gemstone");

        add(METAL_GEAR, "Now ain't this the REAL Metal Gear?");
        add(METAL_GEAR_EXTRA, "You can disable this in the config, don't worry...");

        add(TELEPORTER_MINING_ACCESS, "Right-Click to enter the Mining Dimension.");
        add(TELEPORTER_MINING_RETURN, "Right-Click to return.");

        add(BASIC_PROSPECTOR_LINKED_TO, "Linked to: ");
        add(BASIC_PROSPECTOR_CLICK_TO_CLEAR, "Shift + Right Click to clear.");
        add(BASIC_PROSPECTOR_CLICK_TO_SCAN, "Right Click in air to scan.");
        add(BASIC_PROSPECTOR_UNLINKED, "Unlinked");
        add(BASIC_PROSPECTOR_SCAN_RADIUS, "Scan radius: ");
        add(BASIC_PROSPECTOR_SCAN_BLOCKS_IN_SCAN, " blocks");
        add(BASIC_PROSPECTOR_SCAN_CLICK_TO_LINK, "Right Click an ore to link.");
        add(BASIC_PROSPECTOR_KEY, "Edit HUD Position: ");

        add(ADVANCED_PROSPECTOR_CLICK_TO_SCAN, "Right Click in air to scan.");
        add(ADVANCED_PROSPECTOR_CLICK_TO_LINK, "Right Click an ore to link.");
        add(ADVANCED_PROSPECTOR_UNLINKED, "Unlinked");
        add(ADVANCED_PROSPECTOR_CLICK_TO_CLEAR, "Shift + Right Click to clear.");
        add(ADVANCED_PROSPECTOR_SECONDS, "s");
        add(ADVANCED_PROSPECTOR_OUTLINE_DURATION, "Outline duration: ");
        add(ADVANCED_PROSPECTOR_OUTLINE_BLOCKS, " blocks");
        add(ADVANCED_PROSPECTOR_OUTLINE_RADIUS, "Outline radius: ");
        add(ADVANCED_PROSPECTOR_LINKED_TO, "Linked to: ");
    }

    protected void addCategories() {
        add(ETERNAL_ORES_CAT, "Eternal Ores");
        add(BASIC_PROSPECTOR_CAT, "Edit Prospector HUD Position");
    }

    protected void addScreens() {
        add(EDIT_HUD, "Edit Prospector HUD");
        add(DRAG_BOX, "Drag the box to reposition the overlay");
        add(PRESS_ESC_TO_CLOSE, "Press ESC to close");
    }

    protected void addClientMessages() {
        add(TELEPORTER_NO_MINING_FOUND, "[Teleporter] Mining Dimension not found.");
        add(TELEPORTER_NO_RETURN_FOUND, "[Teleporter] No return point found.");
        add(TELEPORTER_NO_POINT_FOUND, "[Teleporter] Return dimension not found.");

        add(BASIC_PROSPECTOR_HEADER, "[Prospector] ");
        add(BASIC_PROSPECTOR_NOTHING_TO_CLEAR, "Nothing to clear.");
        add(BASIC_PROSPECTOR_LINK_CLEAR, "Link cleared: ");
        add(BASIC_PROSPECTOR_ERROR_WHILE_SCAN, "An error occurred during scan.");
        add(BASIC_PROSPECTOR_NO_BLOCK_WHILE_SCAN, " blocks.");
        add(BASIC_PROSPECTOR_NO_FOUND_IN, " found in ");
        add(BASIC_PROSPECTOR_NO_FOUND, "No ");
        add(BASIC_PROSPECTOR_NEAREST_FOUND, " found");
        add(BASIC_PROSPECTOR_NEAREST_BLOCKS, " blocks ");
        add(BASIC_PROSPECTOR_NEAREST, "Nearest ");
        add(BASIC_PROSPECTOR_RADIUS_SEARCH, "m radius");
        add(BASIC_PROSPECTOR_SEARCHING, "Searching ");
        add(BASIC_PROSPECTOR_NO_MATERIAL_LINKED, "No material linked.");
        add(BASIC_PROSPECTOR_LINKED_TO_ORE, "Linked to: ");
        add(BASIC_PROSPECTOR_IS_BLACKLISTED, " is blacklisted and cannot be tracked.");
        add(BASIC_PROSPECTOR_INVALID_BLOCK, "Not a valid ore block.");
        add(BASIC_PROSPECTOR_SEARCHING_DOT, " Searching... ");
        add(BASIC_PROSPECTOR_NOT_LINKED, "Unlinked ");
        add(BASIC_PROSPECTOR_NOT_FOUND, "Not found ");

        add(ADVANCED_PROSPECTOR_HEADER, "[Advanced Prospector] ");
        add(ADVANCED_PROSPECTOR_LINK_CLEARED, "Link cleared: ");
        add(ADVANCED_PROSPECTOR_NOTHING_TO_CLEAR, "Nothing to clear.");
        add(ADVANCED_PROSPECTOR_RADIUS_IN, "m radius");
        add(ADVANCED_PROSPECTOR_SCANNING, "Scanning ");
        add(ADVANCED_PROSPECTOR_NO_MATERIAL_LINKED, "No material linked.");
        add(ADVANCED_PROSPECTOR_LINKED_TO_MATERIAL, "Linked to: ");
        add(ADVANCED_PROSPECTOR_IS_BLACKLISTED, " is blacklisted and cannot be tracked.");
        add(ADVANCED_PROSPECTOR_NOT_VALID, "Not a valid ore block.");
    }

    protected void addCompatTranslations() {
        Map<String, SlurryRegistryObject<? extends Chemical, ? extends Chemical>> map = EOMekSlurries.getSlurryMap();

        map.forEach((material, slurryObj) -> {
            String matName = translateMaterial(capitalize(material));
            add(CHEMICAL + CLEAN + material, cleanSlurryName(matName));
            add(CHEMICAL + DIRTY + material, dirtySlurryName(matName));
        });

        EOInfusions.EO_CHEMICALS.getEntries().forEach(entry -> {
            String name = entry.getId().getPath();
            String matName = translateMaterial(capitalizeWords(name.replace("_", " ")));
            add(CHEMICAL + name, matName);
        });

        allGeOreItemEntries().forEach(item -> {
            String path = item.getId().getPath();
            add(item.get(), formatNames(path));
        });

        allEnderIOItemEntries().forEach(item -> {
            String path = item.getId().getPath();
            add(item.get(), formatNames(path));
        });

        add(CONTAINER + "catalyrium_furnace", catalyriumFurnaceName());
        add(CATALYRIUM_FURNACE.block().get(), catalyriumFurnaceName());
        add(CATALYRIUM_UPGRADE.get(), catalyriumUpgradeName());
    }

    protected String cleanSlurryName(String mat) {
        return "Clean " + mat + " Slurry";
    }

    protected String dirtySlurryName(String mat) {
        return "Dirty " + mat + " Slurry";
    }

    protected String catalyriumFurnaceName() {
        return "Catalyrium Furnace";
    }

    protected String catalyriumUpgradeName() {
        return "Netherite to Catalyrium Furnace Upgrade";
    }

    protected String formatNames(String path) {
        String special = lookupSpecialCase(path);
        if (special != null) return special;
        return Stream.of(
                        rawItemName(path),
                        itemNames(path, INGOT, this::ingotName),
                        itemNames(path, NUGGET, this::nuggetName),
                        itemNames(path, DIRTY, this::dirtyDustName),
                        itemNames(path, SMALL_DUST, this::smallDustName),
                        itemNames(path, DUST, this::dustName),
                        itemNames(path, SMALL_CLUMP, this::smallClumpName),
                        itemNames(path, ORE_GEM, this::oreGemName),
                        itemNames(path, CLUMP, this::clumpName),
                        itemNames(path, CRYSTAL, this::crystalName),
                        itemNames(path, SHARD, this::shardName),
                        itemNames(path, GEM, this::gemName),
                        itemNames(path, GEM_SHARD, this::gemShardName),
                        itemNames(path, ENRICHED, this::enrichedName),
                        itemNames(path, GEAR, this::gearName),
                        itemNames(path, PLATE, this::plateName),
                        itemNames(path, ROD, this::rodName),
                        itemNames(path, BLEND, this::blendName),
                        itemNames(path, FOIL, this::foilName),
                        itemNames(path, PEBBLE, this::pebbleName),
                        itemNames(path, COAL, this::coalName),
                        itemNames(path, HAMMER, this::hammerName),
                        itemNames(path, GEM_CUT, this::gemCutterName),
                        itemNames(path, WIRE_CUT, this::wireCutterName),
                        blockNames(path),
                        georeNames(path),
                        enderIONames(path)
                ).filter(Optional::isPresent)
                .findFirst()
                .map(Optional::get)
                .orElse(defaultName(path));
    }

    protected final String lookupSpecialCase(String path) {
        if (specialCaseCache == null) specialCaseCache = specialCaseNames();
        return specialCaseCache.get(path);
    }

    protected Map<String, String> specialCaseNames() {
        Map<String, String> m = new HashMap<>();
        m.put("missing_ingot", "item.eternalores.missing_ingot");
        m.put("nether_star_block", "Block of Nether Star");
        m.put("mold_gear", "Metal Gear Mold");
        m.put("mold_plate", "Metal Plate Mold");
        m.put("mold_rod", "Metal Rod Mold");
        m.put("mold_foil", "Metal Foil Mold");
        m.put("salt_dust", "Salt");
        m.put("salt_small_dust", "Small Pile of Salt");
        m.put("sculk_dust", "Sculk Mass");
        m.put("sculk_small_dust", "Sculk Small Mass");
        m.put("temictetl_shard", "Temictetl Tlapani");
        m.put("temictetl_dust", "Temictetl Teuhtli");
        m.put("temictetl_small_dust", "Temictetl Tepitzin Teuhtli");
        m.put("plate_temictetl", "Temictetl Tetzauhtli");
        m.put("rod_temictetl", "Temictetl Cuauhpil");
        m.put("gear_temictetl", "Temictetl Malinalli");
        m.put("enriched_temictetl", "Hueyi Temictetl");
        m.put("temictetl_block", "Temictetl Tetl");
        m.put("temictetl_dust_block", "Temictetl Tetl Teuhtli");
        m.put("sand_dust", "Pile of Sand");
        m.put("sand_small_dust", "Small Pile of Sand");
        m.put("red_sand_dust", "Pile of Red Sand");
        m.put("red_sand_small_dust", "Small Pile of Red Sand");
        m.put("soul_sand_dust", "Pile of Soul Sand");
        m.put("soul_sand_small_dust", "Small Pile of Soul Sand");
        m.put("gravel_dust", "Pile of Gravel");
        m.put("gravel_small_dust", "Small Pile of Gravel");
        m.put("nautilus_dust", "Pulverized Nautilus Shell");
        m.put("nautilus_small_dust", "Small Pile of Pulverized Nautilus Shell");
        m.put("shulker_shell_dust", "Pulverized Shulker Shell");
        m.put("shulker_shell_small_dust", "Small Pile of Pulverized Shulker Shell");
        m.put("nether_wart_dust", "Pulverized Nether Wart");
        m.put("nether_wart_small_dust", "Small Pile of Pulverized Nether Wart");
        m.put("warped_nether_wart_dust", "Pulverized Warped Nether Wart");
        m.put("warped_nether_wart_small_dust", "Small Pile of Pulverized Warped Nether Wart");
        m.put("highly_enriched_carbon_blend", "HE Carbon Blend");
        m.put("low_enriched_carbon_blend", "LE Carbon Blend");
        m.put("redstone_block", "Block of Redstone Ingot");
        m.put("gem_source", "Source Gem");
        m.put("rod_source", "Source Gem Rod");
        m.put("gear_source", "Source Gem Gear");
        m.put("plate_source", "Source Gem Plate");
        m.put("source_shard", "Source Gem Shard");
        m.put("source_dust", "Source Gem Dust");
        m.put("source_small_dust", "Small Source Gem Dust");
        m.put("enriched_source", "Enriched Source Gem");
        m.put("source_block", "Block of Source Gem");
        m.put("source_dust_block", "Block of Source Gem Dust");
        m.put("rare_earth_dust", "Rare Earth");
        m.put("rare_earth_small_dust", "Small Pile of Rare Earth");
        m.put("prospector", "Basic Prospector");
        m.put("advanced_prospector", "Advanced Prospector");
        m.put("coke_coal", "Coal Coke");
        m.put("sawdust", "Sawdust");
        return m;
    }

    protected String rawMaterialName(String mat) {
        return "Raw " + mat;
    }

    protected String ingotName(String mat) {
        return mat + " Ingot";
    }

    protected String nuggetName(String mat) {
        return mat + " Nugget";
    }

    protected String dustName(String mat) {
        return mat + " Dust";
    }

    protected String dirtyDustName(String mat) {
        return "Dirty " + mat + " Dust";
    }

    protected String smallDustName(String mat) {
        return "Small " + mat + " Dust";
    }

    protected String smallClumpName(String mat) {
        return "Small " + mat + " Clump";
    }

    protected String oreGemName(String mat) {
        return mat + " Gem";
    }

    protected String clumpName(String mat) {
        return mat + " Clump";
    }

    protected String crystalName(String mat) {
        return mat + " Crystal";
    }

    protected String shardName(String mat) {
        return mat + " Shard";
    }

    protected String gemName(String mat) {
        return mat;
    }

    protected String enrichedName(String mat) {
        return "Enriched " + mat;
    }

    protected String gearName(String mat) {
        return mat + " Gear";
    }

    protected String plateName(String mat) {
        return mat + " Plate";
    }

    protected String rodName(String mat) {
        return mat + " Rod";
    }

    protected String blendName(String mat) {
        return mat + " Blend";
    }

    protected String foilName(String mat) {
        return mat + " Foil";
    }

    protected String pebbleName(String mat) {
        return mat + " Pebble";
    }

    protected String coalName(String mat) {
        return mat;
    }

    protected String hammerName(String mat) {
        return mat + " Hammer";
    }

    protected String gemCutterName(String mat) {
        return mat + " Gem Cutter";
    }

    protected String wireCutterName(String mat) {
        return mat + " Wire Cutter";
    }

    protected String gemShardName(String mat) {
        return mat + " Shard";
    }

    protected String blockOfDustName(String mat) {
        return "Block of " + mat + " Dust";
    }

    protected String blockOfName(String mat) {
        return "Block of " + mat;
    }

    protected String blockOfRawName(String mat) {
        return "Block of Raw " + mat;
    }

    protected String deepslateOreName(String mat) {
        return "Deepslate " + mat + " Ore";
    }

    protected String netherOreName(String mat) {
        return "Nether " + mat + " Ore";
    }

    protected String endOreName(String mat) {
        return "End " + mat + " Ore";
    }

    protected String oreName(String mat) {
        return mat + " Ore";
    }

    protected String geOreBlockName(String mat) {
        return "Block of " + mat + " GeOre";
    }

    protected String buddingGeOreName(String mat) {
        return "Budding " + mat + " GeOre";
    }

    protected String smallGeOreBudName(String mat) {
        return "Small " + mat + " GeOre Bud";
    }

    protected String mediumGeOreBudName(String mat) {
        return "Medium " + mat + " GeOre Bud";
    }

    protected String largeGeOreBudName(String mat) {
        return "Large " + mat + " GeOre Bud";
    }

    protected String geOreClusterName(String mat) {
        return mat + " GeOre Cluster";
    }

    protected String geOreShardName(String mat) {
        return mat + " GeOre Shard";
    }

    protected String capacitorName(String mat) {
        return mat + " Capacitor";
    }

    protected String grindingBallName(String mat) {
        return mat + " Grinding Ball";
    }

    protected Optional<String> blockNames(String path) {
        if (!path.endsWith(BLOCK)) return Optional.empty();
        String materialId = EOMaterials.extractMaterialName(path);
        String mat = translateMaterial(capitalizeWords(materialId.replace("_", " ")));
        if (path.contains(DUST_BLOCK)) return Optional.of(blockOfDustName(mat));
        if (path.startsWith(RAW)) return Optional.of(blockOfRawName(mat));
        if (path.startsWith(SLATE_ORE)) return Optional.of(deepslateOreName(mat));
        if (path.startsWith(NETHER_ORE)) return Optional.of(netherOreName(mat));
        if (path.startsWith(END_ORE)) return Optional.of(endOreName(mat));
        if (path.endsWith(ORE)) return Optional.of(oreName(mat));
        return Optional.of(blockOfName(mat));
    }

    protected Optional<String> rawItemName(String path) {
        if (!path.startsWith(RAW) || path.endsWith(BLOCK)) return Optional.empty();
        String mat = translateMaterial(replaceUnderscoreWithCapitalization(path));
        return Optional.of(rawMaterialName(mat));
    }

    protected Optional<String> enderIONames(String path) {
        String mat = translateMaterial(replaceUnderscoreWithCapitalization(path));
        if (path.endsWith(CAPACITOR)) return Optional.of(capacitorName(mat));
        if (path.endsWith(GRINDING_BALL)) return Optional.of(grindingBallName(mat));
        return Optional.empty();
    }

    protected Optional<String> georeNames(String path) {
        String mat = translateMaterial(replaceUnderscoreWithCapitalization(path));
        if (path.endsWith(GEORE_BLOCK)) return Optional.of(geOreBlockName(mat));
        if (path.startsWith(BUDDING)) return Optional.of(buddingGeOreName(mat));
        if (path.startsWith(SMALL_GEO) && path.endsWith(BUD)) return Optional.of(smallGeOreBudName(mat));
        if (path.startsWith(MEDIUM_GEO) && path.endsWith(BUD)) return Optional.of(mediumGeOreBudName(mat));
        if (path.startsWith(LARGE_GEO) && path.endsWith(BUD)) return Optional.of(largeGeOreBudName(mat));
        if (path.endsWith(CLUSTER)) return Optional.of(geOreClusterName(mat));
        if (path.endsWith(GEOSHARDS)) return Optional.of(geOreShardName(mat));
        return Optional.empty();
    }

    protected Optional<String> itemNames(String path, String constant, Function<String, String> nameBuilder) {
        boolean isPrefix = constant.endsWith("_") && !constant.startsWith("_");
        boolean matches = isPrefix ? path.startsWith(constant) : path.endsWith(constant);
        if (!matches) return Optional.empty();
        String mat = translateMaterial(replaceUnderscoreWithCapitalization(path));
        return Optional.of(nameBuilder.apply(mat));
    }

    protected String defaultName(String path) {
        return capitalizeWords(path.replace("_", " "));
    }

    protected Map<String, String> materialTranslations() {
        return Map.of();
    }

    protected String translateMaterial(String englishMaterialName) {
        return materialTranslations().getOrDefault(englishMaterialName, englishMaterialName);
    }
}