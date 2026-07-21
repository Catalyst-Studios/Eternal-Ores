package net.radzratz.eternalores.datagen.lang.ES;

import net.minecraft.data.PackOutput;
import net.radzratz.eternalores.datagen.lang.EN.EOLocalizationEN_US;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.lang.EOLangKeys.*;

@SuppressWarnings("all")
// yeet this warning off to see almost 300 typo errors due to this having spanish names LMAO
public class EOLocalizationES_ES extends EOLocalizationEN_US {
    public EOLocalizationES_ES(PackOutput output) {
        super(output, "es_es");
    }

    @Override
    protected Map<String, String> materialTranslations() {
        return EOSpanishMaterials.ES_ES;
    }

    @Override
    protected String tabOresName() {
        return "EO Menas";
    }

    @Override
    protected String tabRawMatsName() {
        return "EO Materiales en Bruto";
    }

    @Override
    protected String tabBlocksName() {
        return "EO Bloques";
    }

    @Override
    protected String tabCompressedName() {
        return "EO Bloques Comprimidos";
    }

    @Override
    protected String tabMaterialsName() {
        return "EO Materiales";
    }

    @Override
    protected String tabDustsName() {
        return "EO Polvos";
    }

    @Override
    protected String tabFormsName() {
        return "EO Formas de Material";
    }

    @Override
    protected String tabToolsName() {
        return "EO Herramientas";
    }

    @Override
    protected String tabCoalsName() {
        return "EO Carbones (Combustibles)";
    }

    @Override
    protected String tabCompatMaterialsName() {
        return "EO Materiales de Compatibilidad";
    }

    @Override
    protected String tabCompatItemsName() {
        return "EO Objetos y Bloques de Compatibilidad";
    }

    @Override
    protected String rawMaterialName(String mat) {
        return mat + " en Bruto";
    }

    @Override
    protected String ingotName(String mat) {
        return "Lingote de " + mat;
    }

    @Override
    protected String nuggetName(String mat) {
        return "Pepita de " + mat;
    }

    @Override
    protected String dustName(String mat) {
        return "Polvo de " + mat;
    }

    @Override
    protected String dirtyDustName(String mat) {
        return "Polvo Sucio de " + mat;
    }

    @Override
    protected String smallDustName(String mat) {
        return "Pequeño Polvo de " + mat;
    }

    @Override
    protected String smallClumpName(String mat) {
        return "Pequeño Grumo de " + mat;
    }

    @Override
    protected String oreGemName(String mat) {
        return "Gema de " + mat;
    }

    @Override
    protected String clumpName(String mat) {
        return "Grumo de " + mat;
    }

    @Override
    protected String crystalName(String mat) {
        return "Cristal de " + mat;
    }

    @Override
    protected String shardName(String mat) {
        return "Fragmento de " + mat;
    }

    @Override
    protected String gemName(String mat) {
        return mat;
    }

    @Override
    protected String gemShardName(String mat) {
        return "Fragmento de " + mat;
    }

    @Override
    protected String enrichedName(String mat) {
        return mat + " Enriquecido";
    }

    @Override
    protected String gearName(String mat) {
        return "Engranaje de " + mat;
    }

    @Override
    protected String plateName(String mat) {
        return "Placa de " + mat;
    }

    @Override
    protected String rodName(String mat) {
        return "Vara de " + mat;
    }

    @Override
    protected String blendName(String mat) {
        return "Mezcla de " + mat;
    }

    @Override
    protected String foilName(String mat) {
        return "Lámina de " + mat;
    }

    @Override
    protected String pebbleName(String mat) {
        return "Guijarro de " + mat;
    }

    @Override
    protected String coalName(String mat) {
        return mat;
    }

    @Override
    protected String hammerName(String mat) {
        return "Martillo de " + mat;
    }

    @Override
    protected String gemCutterName(String mat) {
        return "Cortadora de Gemas de " + mat;
    }

    @Override
    protected String wireCutterName(String mat) {
        return "Cortacables de " + mat;
    }

    @Override
    protected String blockOfDustName(String mat) {
        return "Bloque de Polvo de " + mat;
    }

    @Override
    protected String blockOfName(String mat) {
        return "Bloque de " + mat;
    }

    @Override
    protected String blockOfRawName(String mat) {
        return "Bloque de " + mat + " en Bruto";
    }

    @Override
    protected String deepslateOreName(String mat) {
        return "Mena de " + mat + " de Pizarra Profunda";
    }

    @Override
    protected String netherOreName(String mat) {
        return "Mena de " + mat + " del Nether";
    }

    @Override
    protected String endOreName(String mat) {
        return "Mena de " + mat + " del End";
    }

    @Override
    protected String oreName(String mat) {
        return "Mena de " + mat;
    }

    @Override
    protected String geOreBlockName(String mat) {
        return "Bloque de GeOre de " + mat;
    }

    @Override
    protected String buddingGeOreName(String mat) {
        return "Brotador de GeOre de " + mat;
    }

    @Override
    protected String smallGeOreBudName(String mat) {
        return "Brote Pequeño de GeOre de " + mat;
    }

    @Override
    protected String mediumGeOreBudName(String mat) {
        return "Brote Mediano de GeOre de " + mat;
    }

    @Override
    protected String largeGeOreBudName(String mat) {
        return "Brote Grande de GeOre de " + mat;
    }

    @Override
    protected String geOreClusterName(String mat) {
        return "Racimo de GeOre de " + mat;
    }

    @Override
    protected String geOreShardName(String mat) {
        return "Fragmento de GeOre de " + mat;
    }

    @Override
    protected String capacitorName(String mat) {
        return "Capacitor de " + mat;
    }

    @Override
    protected String grindingBallName(String mat) {
        return "Bola de Molienda de " + mat;
    }

    @Override
    protected String cleanSlurryName(String mat) {
        return "Lechada Limpia de " + mat;
    }

    @Override
    protected String dirtySlurryName(String mat) {
        return "Lechada Sucia de " + mat;
    }

    @Override
    protected String catalyriumFurnaceName() {
        return "Horno de Catalirio";
    }

    @Override
    protected String catalyriumUpgradeName() {
        return "Mejora de Netherita a Horno de Catalirio";
    }

    @Override
    protected Map<String, String> specialCaseNames() {
        Map<String, String> m = new HashMap<>();
        m.put("fluorite", "Fluorita");
        m.put("biomass", "Biomasa");
        m.put("bismuth", "Bismuto");
        m.put("silicon", "Silicio");
        m.put("sulfur", "Azufre");
        m.put("missing_ingot", "item.eternalores.missing_ingot");
        m.put("nether_star_block", "Bloque de Estrella del Nether");
        m.put("mold_gear", "Molde de Engranaje Metálico");
        m.put("mold_plate", "Molde de Placa Metálica");
        m.put("mold_rod", "Molde de Vara Metálica");
        m.put("mold_foil", "Molde de Lámina Metálica");
        m.put("salt_dust", "Sal");
        m.put("salt_small_dust", "Pequeño Montón de Sal");
        m.put("sculk_dust", "Masa de Sculk");
        m.put("sculk_small_dust", "Pequeña Masa de Sculk");
        m.put("temictetl_shard", "Temictetl Tlapani");
        m.put("temictetl_dust", "Temictetl Teuhtli");
        m.put("temictetl_small_dust", "Temictetl Tepitzin Teuhtli");
        m.put("plate_temictetl", "Temictetl Tetzauhtli");
        m.put("rod_temictetl", "Temictetl Cuauhpil");
        m.put("gear_temictetl", "Temictetl Malinalli");
        m.put("enriched_temictetl", "Hueyi Temictetl");
        m.put("temictetl_block", "Temictetl Tetl");
        m.put("temictetl_dust_block", "Temictetl Tetl Teuhtli");
        m.put("sand_dust", "Montón de Arena");
        m.put("sand_small_dust", "Pequeño Montón de Arena");
        m.put("red_sand_dust", "Montón de Arena Roja");
        m.put("red_sand_small_dust", "Pequeño Montón de Arena Roja");
        m.put("soul_sand_dust", "Montón de Arena de Almas");
        m.put("soul_sand_small_dust", "Pequeño Montón de Arena de Almas");
        m.put("gravel_dust", "Montón de Grava");
        m.put("gravel_small_dust", "Pequeño Montón de Grava");
        m.put("nautilus_dust", "Caparazón de Nautilo Pulverizada");
        m.put("nautilus_small_dust", "Pequeño Montón de Caparazón de Nautilo Pulverizada");
        m.put("shulker_shell_dust", "Caparazón de Shulker Pulverizado");
        m.put("shulker_shell_small_dust", "Pequeño Montón de Caparazón de Shulker Pulverizado");
        m.put("nether_wart_dust", "Verruga del Nether Pulverizada");
        m.put("nether_wart_small_dust", "Pequeño Montón de Verruga del Nether Pulverizada");
        m.put("warped_nether_wart_dust", "Verruga Distorsionada Pulverizada");
        m.put("warped_nether_wart_small_dust", "Pequeño Montón de Verruga Distorsionada Pulverizada");
        m.put("highly_enriched_carbon_blend", "Mezcla de Carbono Altamente Enriquecida");
        m.put("low_enriched_carbon_blend", "Mezcla de Carbono Poco Enriquecida");
        m.put("highly_enriched_carbon", "Carbono Altamente Enriquecido");
        m.put("low_enriched_carbon", "Carbono Poco Enriquecido");
        m.put("redstone_block", "Bloque de Lingote de Redstone");
        m.put("gem_source", "Gema Fuente");
        m.put("rod_source", "Vara de Gema Fuente");
        m.put("gear_source", "Engranaje de Gema Fuente");
        m.put("plate_source", "Placa de Gema Fuente");
        m.put("source_shard", "Fragmento de Gema Fuente");
        m.put("source_dust", "Polvo de Gema Fuente");
        m.put("source_small_dust", "Pequeño Polvo de Gema Fuente");
        m.put("enriched_source", "Gema Fuente Enriquecida");
        m.put("source_block", "Bloque de Gemas Fuente");
        m.put("source_dust_block", "Bloque de Polvo de Gemas Fuente");
        m.put("rare_earth_dust", "Tierras Raras");
        m.put("rare_earth_small_dust", "Pequeño Montón de Tierras Raras");
        m.put("prospector", "Prospector Básico");
        m.put("advanced_prospector", "Prospector Avanzado");
        m.put("lignite_coal", "Carbón Pardo");
        m.put("sawdust", "Aserrín");
        return m;
    }

    @Override
    protected void addToolTip() {
        add(UNSTABLE_INGOT_DESC, """
                               Este lingote es inestable y explotará después de 10 segundos.
                               También explotará si se suelta o si se cierra la ventana de crafteo.
                               Estos lingotes no se pueden stackear ni craftear automáticamente.
                               """);
        add(UNSTABLE_INGOT_CRAFTING_TABLE, "Debe craftearse en una mesa de crafteo vanilla.");
        add(UNSTABLE_INGOT_WARNING, "No craftear a menos que estés preparado.");
        add(UNSTABLE_INGOT_TIMER, "Explota en: %ss");

        add(FINDER_CREATIVE_ONLY, "Este objeto es solo para el Modo Creativo.");
        add(FINDER_CHUNK_DESTROYED, "¡El Chunk se fue a volar!");
        add(FINDER_CHUNK_DESC, "¡Elimina todo excepto minerales y bedrock! Herramienta de debug.");

        add(NICKELBACK, "Bloque de Níquel, no Nickelback");
        add(EXOTIC_BUTTER, "Bloque de Mantequilla Exótica");

        add(TEMICTETL_BLOCK_DESC, "Bloque de Gema de los Sueños");
        add(TEMICTETL_DUST_BLOCK_DESC, "Bloque de Polvo de Gema de los Sueños");
        add(TEMICTETL_GEM_DESC, "Gema de los Sueños");
        add(TEMICTETL_GEM_SHARD_DESC, "Fragmento de Gema de los Sueños");
        add(TEMICTETL_DUST_DESC, "Polvo de Gema de los Sueños");
        add(TEMICTETL_SMALL_DUST_DESC, "Pequeño Polvo de Gema de los Sueños");
        add(TEMICTETL_PLATE_DESC, "Placa de Gema de los Sueños");
        add(TEMICTETL_ROD_DESC, "Vara de Gema de los Sueños");
        add(TEMICTETL_GEAR_DESC, "Engranaje de Gema de los Sueños");
        add(TEMICTETL_ENRICHED_DESC, "Gema de los Sueños Enriquecida");

        add(METAL_GEAR, "¿No es esto el VERDADERO Metal Gear?");
        add(METAL_GEAR_EXTRA, "Puedes desactivar esto en la configuración, no te preocupes...");

        add(TELEPORTER_MINING_ACCESS, "Click Derecho para entrar a la Dimensión Minera.");
        add(TELEPORTER_MINING_RETURN, "Click Derecho para regresar.");

        add(BASIC_PROSPECTOR_LINKED_TO, "Vinculado a: ");
        add(BASIC_PROSPECTOR_CLICK_TO_CLEAR, "Shift + Click Derecho para desvincular.");
        add(BASIC_PROSPECTOR_CLICK_TO_SCAN, "Click Derecho en el aire para escanear.");
        add(BASIC_PROSPECTOR_UNLINKED, "Sin vincular");
        add(BASIC_PROSPECTOR_SCAN_RADIUS, "Radio de escaneo: ");
        add(BASIC_PROSPECTOR_SCAN_BLOCKS_IN_SCAN, " bloques");
        add(BASIC_PROSPECTOR_SCAN_CLICK_TO_LINK, "Click Derecho en un mineral para vincular.");
        add(BASIC_PROSPECTOR_KEY, "Editar Posición del HUD: ");

        add(ADVANCED_PROSPECTOR_CLICK_TO_SCAN, "Click Derecho en el aire para escanear.");
        add(ADVANCED_PROSPECTOR_CLICK_TO_LINK, "Click Derecho en un mineral para vincular.");
        add(ADVANCED_PROSPECTOR_UNLINKED, "Sin vincular");
        add(ADVANCED_PROSPECTOR_CLICK_TO_CLEAR, "Shift + Click Derecho para desvincular.");
        add(ADVANCED_PROSPECTOR_SECONDS, "s");
        add(ADVANCED_PROSPECTOR_OUTLINE_DURATION, "Duración del contorno: ");
        add(ADVANCED_PROSPECTOR_OUTLINE_BLOCKS, " bloques");
        add(ADVANCED_PROSPECTOR_OUTLINE_RADIUS, "Radio del contorno: ");
        add(ADVANCED_PROSPECTOR_LINKED_TO, "Vinculado a: ");
    }

    @Override
    protected void addCategories() {
        add(ETERNAL_ORES_CAT, "Eternal Ores");
        add(BASIC_PROSPECTOR_CAT, "[Prospector] Editar Posición");
    }

    @Override
    protected void addScreens() {
        add(EDIT_HUD, "Editar HUD del Prospector");
        add(DRAG_BOX, "Arrastra la caja para reposicionar la superposición");
        add(PRESS_ESC_TO_CLOSE, "Presiona ESC para cerrar");
    }

    @Override
    protected void addClientMessages() {
        add(TELEPORTER_NO_MINING_FOUND, "[Teletransportador] Dimensión Minera no encontrada.");
        add(TELEPORTER_NO_RETURN_FOUND, "[Teletransportador] No se encontró punto de retorno.");
        add(TELEPORTER_NO_POINT_FOUND, "[Teletransportador] Dimensión de retorno no encontrada.");

        add(BASIC_PROSPECTOR_HEADER, "[Prospector] ");
        add(BASIC_PROSPECTOR_NOTHING_TO_CLEAR, "Nada que desvincular.");
        add(BASIC_PROSPECTOR_LINK_CLEAR, "Vínculo eliminado: ");
        add(BASIC_PROSPECTOR_ERROR_WHILE_SCAN, "Ocurrió un error durante el escaneo.");
        add(BASIC_PROSPECTOR_NO_BLOCK_WHILE_SCAN, " bloques.");
        add(BASIC_PROSPECTOR_NO_FOUND_IN, " encontrado en ");
        add(BASIC_PROSPECTOR_NO_FOUND, "Sin ");
        add(BASIC_PROSPECTOR_NEAREST_FOUND, " encontrado");
        add(BASIC_PROSPECTOR_NEAREST_BLOCKS, " bloques ");
        add(BASIC_PROSPECTOR_NEAREST, "Más cercano: ");
        add(BASIC_PROSPECTOR_RADIUS_SEARCH, "m de radio");
        add(BASIC_PROSPECTOR_SEARCHING, "Buscando ");
        add(BASIC_PROSPECTOR_NO_MATERIAL_LINKED, "Ningún material vinculado.");
        add(BASIC_PROSPECTOR_LINKED_TO_ORE, "Vinculado a: ");
        add(BASIC_PROSPECTOR_IS_BLACKLISTED, " está en la lista negra y no puede rastrearse.");
        add(BASIC_PROSPECTOR_INVALID_BLOCK, "No es un bloque de mineral válido.");
        add(BASIC_PROSPECTOR_SEARCHING_DOT, " Buscando... ");
        add(BASIC_PROSPECTOR_NOT_LINKED, "Sin vincular ");
        add(BASIC_PROSPECTOR_NOT_FOUND, "No encontrado ");

        add(ADVANCED_PROSPECTOR_HEADER, "[Prospector Avanzado] ");
        add(ADVANCED_PROSPECTOR_LINK_CLEARED, "Vínculo eliminado: ");
        add(ADVANCED_PROSPECTOR_NOTHING_TO_CLEAR, "Nada que desvincular.");
        add(ADVANCED_PROSPECTOR_RADIUS_IN, "m de radio");
        add(ADVANCED_PROSPECTOR_SCANNING, "Escaneando ");
        add(ADVANCED_PROSPECTOR_NO_MATERIAL_LINKED, "Ningún material vinculado.");
        add(ADVANCED_PROSPECTOR_LINKED_TO_MATERIAL, "Vinculado a: ");
        add(ADVANCED_PROSPECTOR_IS_BLACKLISTED, " está en la lista negra y no puede rastrearse.");
        add(ADVANCED_PROSPECTOR_NOT_VALID, "No es un bloque de mineral válido.");
    }
}