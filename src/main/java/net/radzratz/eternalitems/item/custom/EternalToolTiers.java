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

    public static final Tier ETERNAL_DARK_TOOLS = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ETERNAL_DARK_TOOLS,
            3000, 5f, 10f, 55, ()-> Ingredient.of(Moditems.ETERNAL_DARK_INGOT));

    public static final Tier ETERNAL_LIGHT_TOOLS = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ETERNAL_LIGHT_TOOLS,
            3000,5,10,55, ()-> Ingredient.of(Moditems.ETERNAL_LIGHT_INGOT));

    public static final Tier BONE_TOOLS = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BONE_TOOLS,
            128,2f,1f,4, ()-> Ingredient.of(Items.BONE));

    public static final Tier ETERNAL_GRAY_TOOLS = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ETERNAL_GRAY_TOOLS, Integer.MAX_VALUE,
            128,999f,2000, ()-> Ingredient.of(Items.AIR));
}
