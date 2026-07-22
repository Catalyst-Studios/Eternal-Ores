package net.radzratz.eternalores.util.compat.energized_power.recipe_types;

import me.jddev0.ep.recipe.FiltrationPlantRecipe;
import me.jddev0.ep.recipe.OutputItemStackWithPercentages;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;

public class EEPFiltrationPlantRecipes {
    private static void plant(RecipeOutput output, Item pebbleType, Item result, double resultChance, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        OutputItemStackWithPercentages pebble = new OutputItemStackWithPercentages(new ItemStack(pebbleType, 1), 0.33);
        OutputItemStackWithPercentages raw = new OutputItemStackWithPercentages(new ItemStack(result, 1), resultChance);

        FiltrationPlantRecipe bldr = new FiltrationPlantRecipe(pebble, raw, BuiltInRegistries.ITEM.getKey(result.asItem()));

        yeet.withConditions(ENERGIZED_POWER_MOD).accept(EO(PATH.EEPFiltration() + sfx), bldr, null);
    }

    public static void generate(RecipeOutput output) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        plant(yeet, STONE_SET.PEBBLE.get(), ALUMINUM_SET.RAW.get(), 0.05, "aluminum");
        plant(yeet, STONE_SET.PEBBLE.get(), ARDITE_SET.RAW.get(), 0.005, "ardite");
        plant(yeet, STONE_SET.PEBBLE.get(), BERYLLIUM_SET.RAW.get(), 0.035, "beryllium");
        plant(yeet, STONE_SET.PEBBLE.get(), COBALT_SET.RAW.get(), 0.025, "cobalt");
        plant(yeet, STONE_SET.PEBBLE.get(), GALLIUM_SET.RAW.get(), 0.05, "gallium");
        plant(yeet, STONE_SET.PEBBLE.get(), IRIDIUM_SET.RAW.get(), 0.025, "iridium");
        plant(yeet, STONE_SET.PEBBLE.get(), LEAD_SET.RAW.get(), 0.045, "lead");
        plant(yeet, STONE_SET.PEBBLE.get(), MOLYBDENUM_SET.RAW.get(), 0.045, "molybdenum");
        plant(yeet, STONE_SET.PEBBLE.get(), NICKEL_SET.RAW.get(), 0.05, "nickel");
        plant(yeet, STONE_SET.PEBBLE.get(), NEODYMIUM_SET.RAW.get(), 0.015, "neodymium");
        plant(yeet, STONE_SET.PEBBLE.get(), OSMIUM_SET.RAW.get(), 0.035, "osmium");
        plant(yeet, STONE_SET.PEBBLE.get(), PALLADIUM_SET.RAW.get(), 0.005, "palladium");
        plant(yeet, STONE_SET.PEBBLE.get(), PLATINUM_SET.RAW.get(), 0.015, "platinum");
        plant(yeet, STONE_SET.PEBBLE.get(), SCULKITE_SET.RAW.get(), 0.005, "sculkite");
        plant(yeet, STONE_SET.PEBBLE.get(), SILVER_SET.RAW.get(), 0.035, "silver");
        plant(yeet, STONE_SET.PEBBLE.get(), TIN_SET.RAW.get(), 0.05, "tin");
        plant(yeet, STONE_SET.PEBBLE.get(), TITANIUM_SET.RAW.get(), 0.002, "titanium");
        plant(yeet, STONE_SET.PEBBLE.get(), TUNGSTEN_SET.RAW.get(), 0.002, "tungsten");
        plant(yeet, STONE_SET.PEBBLE.get(), ULTIMATITANIUM_SET.RAW.get(), 0.002, "ultimatitanium");
        plant(yeet, STONE_SET.PEBBLE.get(), URANINITE_SET.RAW.get(), 0.05, "uraninite");
        plant(yeet, STONE_SET.PEBBLE.get(), URANIUM_SET.RAW.get(), 0.025, "uranium");
        plant(yeet, STONE_SET.PEBBLE.get(), VANADIUM_SET.RAW.get(), 0.010, "vanadium");
        plant(yeet, STONE_SET.PEBBLE.get(), ZINC_SET.RAW.get(), 0.05, "zinc");
    }
}
