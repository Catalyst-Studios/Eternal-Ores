package net.radzratz.eternalitems.item.custom;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.radzratz.eternalitems.item.Moditems;
import net.radzratz.eternalitems.util.ModTags;

public class EternalToolTiers {
    public static final Tier COPPER_TOOLS = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOLS,
            250, 4f, 2f, 22,()-> Ingredient.of(Items.COPPER_INGOT));

    public static final Tier ETERNAL_DARK_TOOLS = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ETERNALDARK_TOOLS,
            10000, 10f, 16f, 77, ()-> Ingredient.of(Moditems.ETERNAL_DARK_INGOT));

    public static final Tier BONE_TOOLS = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BONE_TOOLS,
            128,2f,1f,4, ()-> Ingredient.of(Items.BONE));
}
