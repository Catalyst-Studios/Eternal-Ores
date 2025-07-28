package net.radzratz.eternalores.block;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.Map;

import static net.minecraft.tags.BlockTags.*;
import static net.neoforged.neoforge.common.Tags.Blocks.NEEDS_NETHERITE_TOOL;

public class EOBlockToolTier
{
    /**
     * {@link #ToolTiers} is where we pass every NEEDS_TIER_TOOL in one spot
     */
    public enum ToolTiers
    {
        T_STONE(NEEDS_STONE_TOOL),
        T_IRON(NEEDS_IRON_TOOL),
        T_DIAMOND(NEEDS_DIAMOND_TOOL),
        T_NETHERITE(NEEDS_NETHERITE_TOOL);

        private final TagKey<Block> toolTag;

        ToolTiers(TagKey<Block> toolTag)
        {
            this.toolTag = toolTag;
        }

        public TagKey<Block> getToolTag()
        {
            return toolTag;
        }
    }

    /// In a way, we still pass every single entry manually through these tags, but only once, not like 5 times each
    public static final Map<String, ToolTiers> matWithExactTier = Map.<String, ToolTiers>ofEntries(
            /*Map.entry("aluminum", ToolTiers.STONE),
            Map.entry("amber", ToolTiers.IRON),
            Map.entry("apatite", ToolTiers.IRON),
            Map.entry("ardite", ToolTiers.NETHERITE),
            Map.entry("blue_steel", ToolTiers.IRON),
            Map.entry("brass", ToolTiers.IRON),
            Map.entry("britannia_silver", ToolTiers.IRON),
            Map.entry("bronze", ToolTiers.IRON),
            Map.entry("cast_iron", ToolTiers.IRON),
            Map.entry("cast_steel", ToolTiers.IRON),
            Map.entry("catalyrium", ToolTiers.NETHERITE),
            Map.entry("cinnabar", ToolTiers.IRON),
            Map.entry("cobalt", ToolTiers.DIAMOND),
            Map.entry("constantan", ToolTiers.IRON),
            Map.entry("electrum", ToolTiers.IRON),
            Map.entry("enderium", ToolTiers.IRON),
            Map.entry("fluorite", ToolTiers.IRON),
            Map.entry("gallium", ToolTiers.STONE),
            Map.entry("graphite", ToolTiers.STONE),
            Map.entry("invar", ToolTiers.IRON),
            Map.entry("iridium", ToolTiers.IRON),
            Map.entry("lead", ToolTiers.IRON),
            Map.entry("lumium", ToolTiers.IRON),
            Map.entry("nethersteel", ToolTiers.IRON),
            Map.entry("necroticarite", ToolTiers.DIAMOND),
            Map.entry("nether_star", ToolTiers.DIAMOND),
            Map.entry("nickel", ToolTiers.STONE),
            Map.entry("niter", ToolTiers.IRON),
            Map.entry("obsidian", ToolTiers.DIAMOND),
            Map.entry("onyx", ToolTiers.IRON),
            Map.entry("osmium", ToolTiers.IRON),
            Map.entry("pewter", ToolTiers.IRON),
            Map.entry("pig_iron", ToolTiers.IRON),
            Map.entry("peridot", ToolTiers.IRON),
            Map.entry("platinum", ToolTiers.DIAMOND),
            Map.entry("plutonium", ToolTiers.DIAMOND),
            Map.entry("pyrite", ToolTiers.DIAMOND),
            Map.entry("rose_gold", ToolTiers.IRON),
            Map.entry("ruby", ToolTiers.IRON),
            Map.entry("sapphire", ToolTiers.IRON),
            Map.entry("silicon", ToolTiers.IRON),
            Map.entry("silver", ToolTiers.IRON),
            Map.entry("signalum", ToolTiers.IRON),
            Map.entry("shadowsteel", ToolTiers.IRON),
            Map.entry("sulfur", ToolTiers.STONE),
            Map.entry("steel", ToolTiers.IRON),
            Map.entry("tin", ToolTiers.STONE),
            Map.entry("titanium", ToolTiers.DIAMOND),
            Map.entry("tungsten", ToolTiers.DIAMOND),
            Map.entry("ultimatitanium", ToolTiers.DIAMOND),
            Map.entry("uraninite", ToolTiers.IRON),
            Map.entry("uranium", ToolTiers.DIAMOND),
            Map.entry("wrought_iron", ToolTiers.IRON),
            Map.entry("zinc", ToolTiers.IRON)*/
    );

    public static final List<String> matWithPick = List.of(
            "andesite", "granite", "cobble", "diorite"
    );

    public static final List<String> matWithShovel = List.of(
            "dirt", "sand", "gravel"
    );
}
