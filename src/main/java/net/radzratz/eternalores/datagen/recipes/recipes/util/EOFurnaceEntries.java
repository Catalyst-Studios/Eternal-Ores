package net.radzratz.eternalores.datagen.recipes.recipes.util;

import net.minecraft.resources.ResourceLocation;
import net.radzratz.eternalores.util.EOUtils;

import java.util.Map;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.*;

/**
 * {@link EOFurnaceEntries} is a utility class that defines sets and maps used to include or exclude
 * specific materials during recipe generation.
 * <p>
 * This helps reduce hardcoded logic in datagen and simplifies the registration process
 * for vanilla-style recipe types like furnace smelting or blasting.
 */
public class EOFurnaceEntries
{
    /**
     * Set of material names that should not generate furnace smelting recipes.
     * <p>
     * These are excluded from all furnace-based processing, due to design restrictions.
     * <p>
     * Values in this set must match the material names as defined in the registry
     * (e.g., "ardite", "catalyrium").
     */
    public static final Set<String> excludeMat = Set.of(
            "ardite", "catalyrium"
    );

    /**
     * Set of dust-related materials that should not generate any recipes using
     * dust variants (e.g., smelting and alloying).
     */
    public static final Set<String> excludeDust = Set.of(
            "ardite", "catalyrium", "nether_star_dust", "sculk", "ender_dust", "carbon_blend",
            "energetic_blend", "endergetic_blend", "quartz_dust", "endstone_dust", "netherrack_dust",
            "stone_dust"
    );

    /**
     * Maps materials that do not follow standard naming conventions to their
     * correct base names.
     * <p>
     * This is required when a material doesn't:
     * <ul>
     *   <li>Start with {@code gem_}</li>
     *   <li>Or end with {@code _ingot}</li>
     * </ul>
     * In these cases, they must be registered here to avoid being excluded from generation logic.
     */
    public static final Map<String, String> specialCases = Map.of(
            "fluorite", "fluorite",
            "sulfur", "sulfur"
    );

    /**
     * Maps specific dust material names to their corresponding result {@link ResourceLocation}s.
     * <p>
     * Used for dust-based recipe generation where the output item does not follow standard patterns,
     * or when it must map to an alternate item such as silicon, graphite, or other modded results.
     * <p>
     * This acts as an override table for dust-to-result mappings across Eternal Ores furnace recipes.
     *
     * @see EOUtils#EO(String)
     * @see EOUtils#MC(String)
     */
    public static final Map<String, ResourceLocation> dustSpecialCases = Map.ofEntries(
            Map.entry("coal", EO("graphite_dust")), Map.entry("graphite", EO("graphite_ingot")),
            Map.entry("quartz", EO("silicon")), Map.entry("amethyst", MC("silicon")),
            Map.entry("sulfur", EO("sulfur")),
            Map.entry("fluorite", EO("fluorite")),
            Map.entry("diamond", MC("diamond")),
            Map.entry("emerald", MC("emerald")),
            Map.entry("lapis", MC("lapis")),
            Map.entry("netherite", MC("netherite_ingot")),
            Map.entry("prismarine", MC("prismarine_crystals")),
            Map.entry("copper", MC("copper")),
            Map.entry("iron", MC("iron")),
            Map.entry("gold", MC("gold"))
    );
}
