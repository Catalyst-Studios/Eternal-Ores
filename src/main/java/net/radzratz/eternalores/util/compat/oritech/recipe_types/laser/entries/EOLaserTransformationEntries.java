package net.radzratz.eternalores.util.compat.oritech.recipe_types.laser.entries;

import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOLaserCreationType;

import java.util.HashMap;
import java.util.Map;

import static net.minecraft.world.level.block.Blocks.*;
import static net.neoforged.neoforge.common.Tags.Blocks.*;
import static net.radzratz.eternalores.block.EOBlockRegistry.*;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.laser.EOLaserInputRegistry.registerRawBlockToBlockEngravingRecipes;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.laser.EOLaserInputRegistry.registerRawBlockToBlockEngravingRecipesVar;
import static net.radzratz.eternalores.util.tags.block.storage_blocks.EOStorageRawOreBlockTags.Blocks.*;

public class EOLaserTransformationEntries
{
    public static final Map<String, EOLaserCreationType.InputsOreBlock> RAW_BLOCK_TO_MATERIAL_BLOCK;
    static
    {
        Map<String, EOLaserCreationType.InputsOreBlock> map = new HashMap<>();

        registerRawBlockToBlockEngravingRecipes(map, "aluminum", RAW_ALUMINUM_ST, ALUMINUM_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "cobalt", RAW_COBALT_ST, COBALT_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "gallium", RAW_GALLIUM_ST, GALLIUM_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "iridium", RAW_IRIDIUM_ST, IRIDIUM_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "lead", RAW_LEAD_ST, LEAD_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "nickel", RAW_NICKEL_ST, NICKEL_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "osmium", RAW_OSMIUM_ST, OSMIUM_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "platinum", RAW_PLATINUM_ST, PLATINUM_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "silver", RAW_SILVER_ST, SILVER_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "tin", RAW_TIN_ST, TIN_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "tungsten", RAW_TUNGSTEN_ST, TUNGSTEN_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "uraninite", RAW_URANINITE_ST, URANINITE_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "uranium", RAW_URANIUM_ST, URANIUM_BLOCK);

        registerRawBlockToBlockEngravingRecipes(map, "zinc", RAW_ZINC_ST, ZINC_BLOCK);

        registerRawBlockToBlockEngravingRecipesVar(map, "copper", STORAGE_BLOCKS_RAW_COPPER, () -> COPPER_BLOCK);

        registerRawBlockToBlockEngravingRecipesVar(map, "iron", STORAGE_BLOCKS_RAW_IRON, () -> IRON_BLOCK);

        registerRawBlockToBlockEngravingRecipesVar(map, "gold", STORAGE_BLOCKS_RAW_GOLD, () -> GOLD_BLOCK);


        RAW_BLOCK_TO_MATERIAL_BLOCK = Map.copyOf(map);
    }
}
