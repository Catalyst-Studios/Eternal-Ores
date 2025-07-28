package net.radzratz.eternalores.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.EternalOres;

import java.util.Collection;
import java.util.stream.Stream;

import static net.radzratz.eternalores.block.EOBlockRegistry.BLOCKS;
import static net.radzratz.eternalores.item.EOItemRegistry.ITEMS;
import static net.radzratz.eternalores.util.compat.mekanism.item.EOMekCompatItems.MEK_COMPAT_ITEMS;
import static net.radzratz.eternalores.util.compat.oritech.items.EOritechItemRegistry.ORITECH_COMPAT_ITEMS;

/**
 * Central utility class for accessing Eternal Ores mod states and compatibility flags.
 *
 * <p>Provides:
 * <ul>
 *   <li>Booleans indicating whether specific mods (e.g., Mekanism, Powah, Oritech) are loaded.</li>
 *   <li>{@link ModLoadedCondition} instances for use in datagen or conditional registration.</li>
 *   <li>Convenience methods for namespaced {@link ResourceLocation}s using Eternal Ores, Minecraft, or common "c" tags.</li>
 * </ul>
 * This is especially useful during conditional tag registration, recipe generation, or dynamic behaviors
 * depending on which mods are present at runtime.
 */
public class EOUtils
{

    // === Mod presence flags ===

    /** {@code true} if the Eternal Ores mod is loaded (self-check). */
    public static final boolean eternaloresMod = ModList.get().isLoaded("eternalores");

    /** {@code true} if Mekanism is loaded. */
    public static final boolean mekanismMod = ModList.get().isLoaded("mekanism");

    /** {@code true} if Powah is loaded. */
    public static final boolean powahMod = ModList.get().isLoaded("powah");

    /** {@code true} if Oritech is loaded. */
    public static final boolean oritechMod = ModList.get().isLoaded("oritech");

    // === Conditional wrappers ===

    /** Condition wrapper for Mekanism, used in datagen or conditional registration. */
    public static final ModLoadedCondition MEK = new ModLoadedCondition("mekanism");

    /** Condition wrapper for Powah, used in datagen or conditional registration. */
    public static final ModLoadedCondition POW = new ModLoadedCondition("powah");

    /** Condition wrapper for Oritech, used in datagen or conditional registration. */
    public static final ModLoadedCondition ORI = new ModLoadedCondition("oritech");

    /**
     * Returns a unified stream of all {@link DeferredHolder} item entries across
     * Eternal Ores, Mekanism compat, and Oritech compat registries.
     *
     * <p>This is useful in contexts where all mod items should be treated as a single pool,
     * such as for automated tag generation, item processing, or dynamic lookup.
     *
     * @return a stream of {@code DeferredHolder<Item, ? extends Item>} representing all known mod items
     */
    public static Stream<DeferredHolder<Item, ? extends Item>> allItemEntries()
    {
        return Stream.of(ITEMS.getEntries(), MEK_COMPAT_ITEMS.getEntries(), ORITECH_COMPAT_ITEMS.getEntries()).flatMap(Collection::stream);
    }

    /**
     * Returns a unified stream of all {@link DeferredHolder} block entries across Eternal Ores registries.
     *
     * <p>This is useful in contexts where all mod blocks should be treated as a single pool,
     * such as for automated tag generation, block processing, or dynamic lookup.
     *
     * @return a stream of {@code DeferredHolder<Block, ? extends Block>} representing all known mod blocks
     */
    public static Stream<DeferredHolder<Block, ? extends Block>> allBlockEntries()
    {
        return Stream.of(BLOCKS.getEntries()).flatMap(Collection::stream);
    }

    /**
     * Creates a {@link ResourceLocation} using Eternal Ores' mod ID as the namespace.
     *
     * <p>Recommended for all mod-specific resources, including:
     * <ul>
     *   <li>Registry names (items, blocks, etc.)</li>
     *   <li>Recipe IDs</li>
     *   <li>Texture paths</li>
     *   <li>Loot tables</li>
     * </ul>
     *
     * @param path the resource path (e.g., {@code "raw_aluminum"}, {@code "recipes/smelting/aluminum_ore"})
     * @return a {@link ResourceLocation} with Eternal Ores' mod ID as the namespace
     * @throws IllegalArgumentException if the path is invalid
     * @see ResourceLocation#fromNamespaceAndPath(String, String)
     */
    public static ResourceLocation EO(String path) { return ResourceLocation.fromNamespaceAndPath(EternalOres.id, path); }

    /**
     * Creates a {@link ResourceLocation} using the Minecraft namespace ("minecraft").
     *
     * <p>Useful when referring to vanilla items, blocks, or recipe IDs like {@code "minecraft:diamond"}
     * or {@code "minecraft:smelting/iron_ingot"}.
     *
     * @param path the resource path (e.g., {@code "diamond"}, {@code "textures/block/stone.png"})
     * @return a {@link ResourceLocation} with the "minecraft" namespace
     * @throws IllegalArgumentException if the path is invalid
     * @see ResourceLocation#withDefaultNamespace(String)
     */
    public static ResourceLocation MC(String path) { return ResourceLocation.withDefaultNamespace(path); }

    /**
     * Creates a {@link ResourceLocation} using the common namespace ("c") for shared tags.
     *
     * <p>Primarily used to define or reference shared tags across multiple mods, like {@code "c:ingots/aluminum"}.
     *
     * @param path the tag path within the "c" namespace (e.g., {@code "ingots/aluminum"})
     * @return a {@link ResourceLocation} with "c" as namespace
     * @throws IllegalArgumentException if the path is invalid
     * @see ResourceLocation#fromNamespaceAndPath(String, String)
     */
    public static ResourceLocation C(String path) { return ResourceLocation.fromNamespaceAndPath("c", path); }
}
