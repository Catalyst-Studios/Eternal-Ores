package net.radzratz.eternalores.util.compat.industrial_foregoing.recipe_types;

import com.buuz135.industrial.recipe.LaserDrillOreRecipe;
import com.buuz135.industrial.recipe.LaserDrillRarity;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;

import java.util.List;

import static net.minecraft.world.level.dimension.BuiltinDimensionTypes.*;
import static net.neoforged.neoforge.common.Tags.Biomes.IS_SPOOKY;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.EOUtils.INDUSTRIAL_FOREGOING_MOD;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;
import static com.buuz135.industrial.recipe.LaserDrillRarity.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Items.SALT;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ores.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.RawMaterials.*;

public class EOreLaserDrillRecipes {
    private static final BiomeRarity allBiomes = new BiomeRarity(List.of(), List.of());
    private static final BiomeRarity bSculk = new BiomeRarity(List.of(IS_SPOOKY), List.of());

    private static final DimensionRarity allDimension = new DimensionRarity(List.of(), List.of());
    private static final DimensionRarity onlyOverworld = new DimensionRarity(List.of(OVERWORLD), List.of(END, NETHER));
    private static final DimensionRarity onlyNether = new DimensionRarity(List.of(NETHER), List.of(END, OVERWORLD));
    private static final DimensionRarity onlyEnd = new DimensionRarity(List.of(END), List.of(OVERWORLD, NETHER));

    private static final DimensionRarity onlyOverWorldNether = new DimensionRarity(List.of(OVERWORLD, NETHER), List.of(END));
    private static final DimensionRarity onlyOverWorldEnd = new DimensionRarity(List.of(OVERWORLD, END), List.of(NETHER));

    private static void drill(RecipeOutput output, Object rlt, int rCnt, int color, int minY, int maxY, int weight, BiomeRarity bRarity, DimensionRarity dRarity, String sfx) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        LaserDrillRarity mRarity = new LaserDrillRarity(bRarity, dRarity, minY, maxY, weight);
        // We use itemTagInputs as the output, quite contradictory truth being told as this method was created explicitly for Inputs
        // But since LaserDrillOreRecipe uses SizedIngredient as an output we can reuse this method to call Itemlikes, Tags or ItemStacks safely
        SizedIngredient out = new SizedIngredient(itemTagInputs(rlt), rCnt);

        LaserDrillOreRecipe bldr = new LaserDrillOreRecipe(out, color, mRarity);

        yeet.withConditions(INDUSTRIAL_FOREGOING_MOD).accept(EO(PATH.IFLaser() + sfx), bldr, null);
    }

    public static void generate(RecipeOutput output, Registry<Item> ignoredReg) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        drill(yeet, RAW_BERYLLIUM, 1, 13, 52, 77, 14, allBiomes, onlyOverworld, PATH.Raw() + "beryllium");
        drill(yeet, RAW_SCULKITE, 1, 15, -64, -47, 10, bSculk, onlyOverworld, PATH.Raw() + "sculkite");
        drill(yeet, RAW_ULTIMATITANIUM, 1, 10, -14, 64, 8, allBiomes, onlyEnd, PATH.Raw() + "ultimatitanium");
        drill(yeet, RAW_URANINITE, 1, 5, -14, 64, 20, allBiomes, onlyOverWorldNether, PATH.Raw() + "uraninite");
        drill(yeet, RAW_GALLIUM, 1, 0, -14, 64, 19, allBiomes, onlyOverWorldNether, PATH.Raw() + "gallium");
        drill(yeet, RAW_ZINC, 1, 0, 30, 43, 24, allBiomes, onlyOverworld, PATH.Raw() + "zinc");
        drill(yeet, RAW_TITANIUM, 1, 6, -24, 11, 9, allBiomes, onlyOverWorldEnd, PATH.Raw() + "titanium");
        drill(yeet, RAW_NEODYMIUM, 1, 6, -52, 10, 11, allBiomes, allDimension, PATH.Raw() + "neodymium");
        drill(yeet, RAW_MOLYBDENUM, 1, 3, -52, 10, 11, allBiomes, allDimension, PATH.Raw() + "molybdenum");
        drill(yeet, RAW_VANADIUM, 1, 15, -52, 10, 11, allBiomes, onlyOverWorldEnd, PATH.Raw() + "vanadium");
        drill(yeet, RAW_PALLADIUM, 1, 6, -52, 5, 5, allBiomes, onlyOverWorldEnd, PATH.Raw() + "palladium");

        drill(yeet, ITEM_AMBER_ORE, 1, 1, 37, 50, 15, allBiomes, onlyOverworld, PATH.Gem() + "amber");
        drill(yeet, ITEM_APATITE_ORE, 1, 3, 19, 42, 16, allBiomes, onlyOverworld, PATH.Gem() + "apatite");
        drill(yeet, ITEM_CINNABAR_ORE, 1, 14, 41, 54, 13, allBiomes, onlyOverWorldNether, PATH.Gem() + "cinnabar");
        drill(yeet, ITEM_ZIRCON_ORE, 1, 14, 13, 53, 10, allBiomes, onlyOverWorldNether, PATH.Gem() + "zircon");
        drill(yeet, ITEM_RUBY_ORE, 1, 14, 36, 54, 11, allBiomes, onlyOverWorldNether, PATH.Gem() + "ruby");
        drill(yeet, ITEM_TANZANITE_ORE, 1, 10, 30, 52, 13, allBiomes, onlyOverWorldNether, PATH.Gem() + "tanzanite");
        drill(yeet, ITEM_SAPPHIRE_ORE, 1, 3, 20, 30, 10, allBiomes, onlyOverWorldEnd, PATH.Gem() + "sapphire");
        drill(yeet, ITEM_PERIDOT_ORE, 1, 5, 39, 59, 10, allBiomes, onlyOverWorldNether, PATH.Gem() + "peridot");
        drill(yeet, ITEM_NECROTICARITE_ORE, 1, 10, 58, 79, 12, allBiomes, onlyNether, PATH.Gem() + "necroticarite");
        drill(yeet, ITEM_MONAZITE_ORE, 1, 1, 45, 66, 14, allBiomes, onlyOverWorldNether, PATH.Gem() + "monazite");
        drill(yeet, ITEM_GARNET_ORE, 1, 2, 33, 54, 14, allBiomes, onlyOverWorldNether, PATH.Gem() + "garnet");
        drill(yeet, ITEM_ONYX_ORE, 1, 15, 25, 43, 14, allBiomes, onlyOverWorldNether, PATH.Gem() + "onyx");
        drill(yeet, ITEM_PYROLITE_ORE, 1, 14, -10, 10, 5, allBiomes, onlyNether, PATH.Gem() + "pyrolite");
        drill(yeet, ITEM_OBSIDIAN_ORE, 1, 10, -15, 27, 5, allBiomes, onlyNether, PATH.Gem() + "obsidian");
        drill(yeet, ITEM_JADE_ORE, 1, 5, 11, 34, 5, allBiomes, onlyOverWorldNether, PATH.Gem() + "jade");
        drill(yeet, ITEM_PEARL_ORE, 1, 0, 59, 83, 5, allBiomes, onlyOverworld, PATH.Gem() + "pearl");

        drill(yeet, SALT, 3, 8, 54, 81, 19, allBiomes, onlyOverworld, PATH.Gem() + "salt");

        drill(yeet, ITEM_PEAT_ORE, 1, 14, 41, 59, 18, allBiomes, onlyOverworld, PATH.Gem() + "peat");
        drill(yeet, ITEM_ANTHRACITE_ORE, 1, 15, 34, 51, 16, allBiomes, onlyOverworld, PATH.Gem() + "anthracite");
        drill(yeet, ITEM_LIGNITE_ORE, 1, 14, 29, 34, 21, allBiomes, onlyOverworld, PATH.Gem() + "lignite");
        drill(yeet, ITEM_BITUMINOUS_ORE, 1, 15, 45, 62, 24, allBiomes, onlyOverworld, PATH.Gem() + "bituminous");
    }
}
