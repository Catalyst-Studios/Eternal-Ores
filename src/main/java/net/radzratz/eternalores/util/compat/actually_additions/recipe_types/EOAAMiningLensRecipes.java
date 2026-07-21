package net.radzratz.eternalores.util.compat.actually_additions.recipe_types;

import de.ellpeck.actuallyadditions.mod.crafting.MiningLensRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.util.EOMaterials;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.function.Function;

import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialNames.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Compat.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Items.SCULKS;

public class EOAAMiningLensRecipes {
    private record LensVariant(Object tagInput, String suffix, Function<EOMaterials.materialTypes, DeferredBlock<?>> field) {}

    private static final LensVariant[] VARIANTS = new LensVariant[]{
            new LensVariant(STONE_REPLACEABLES_ITEM, "_stone", set -> set.ORE),
            new LensVariant(SLATE_REPLACEABLES_ITEM, "_slate", set -> set.SLATE_ORE),
            new LensVariant(NETHERRACKS, "_nether", set -> set.NETHER_ORE),
            new LensVariant(END_STONES, "_end", set -> set.END_ORE)
    };

    private static void lens(RecipeOutput output, Object block, int weight, Item ore, String sfx) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        MiningLensRecipe bldr = new MiningLensRecipe(itemTagInputs(block), weight, new ItemStack(ore));

        yeet.withConditions().accept(EO(id.Lens() + sfx), bldr, null, ACTUALLY_ADDITIONS_MOD);
    }

    private static void lensesFor(RecipeOutput output, EOMaterials.materialTypes set, String matId, int weight) {
        for (LensVariant variant : VARIANTS) {
            DeferredBlock<?> oreBlock = variant.field().apply(set);
            if (oreBlock == null) continue;

            lens(output, variant.tagInput(), weight, oreBlock.get().asItem(), matId + variant.suffix());
        }
    }

    public static void generate(RecipeOutput output, Registry<Item> ignoredReg) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        lensesFor(yeet, ALUMINUM_SET, ALUMINUM_ID, 3000);
        lensesFor(yeet, ARDITE_SET, ARDITE_ID, 300);
        lensesFor(yeet, BERYLLIUM_SET, BERYLLIUM_ID, 500);
        lensesFor(yeet, COBALT_SET, COBALT_ID, 100);
        lensesFor(yeet, GALLIUM_SET, GALLIUM_ID, 2000);
        lensesFor(yeet, IRIDIUM_SET, IRIDIUM_ID, 200);
        lensesFor(yeet, LEAD_SET, LEAD_ID, 2000);
        lensesFor(yeet, MOLYBDENUM_SET, MOLYBDENUM_ID, 500);
        lensesFor(yeet, NICKEL_SET, NICKEL_ID, 2000);
        lensesFor(yeet, NEODYMIUM_SET, NEODYMIUM_ID, 100);
        lensesFor(yeet, OSMIUM_SET, OSMIUM_ID, 3000);
        lensesFor(yeet, PALLADIUM_SET, PALLADIUM_ID, 50);
        lensesFor(yeet, PLATINUM_SET, PLATINUM_ID, 1500);
        lensesFor(yeet, SILVER_SET, SILVER_ID, 1000);
        lensesFor(yeet, SULFUR_SET, SULFUR_ID, 3000);
        lensesFor(yeet, TIN_SET, TIN_ID, 2000);
        lensesFor(yeet, TITANIUM_SET, TITANIUM_ID, 250);
        lensesFor(yeet, TUNGSTEN_SET, TUNGSTEN_ID, 250);
        lensesFor(yeet, ULTIMATITANIUM_SET, ULTIMATITANIUM_ID, 50);
        lensesFor(yeet, URANINITE_SET, URANINITE_ID, 200);
        lensesFor(yeet, URANIUM_SET, URANIUM_ID, 500);
        lensesFor(yeet, VANADIUM_SET, VANADIUM_ID, 400);
        lensesFor(yeet, ZINC_SET, ZINC_ID, 3000);

        lensesFor(yeet, AMBER_SET, AMBER_ID, 50);
        lensesFor(yeet, APATITE_SET, APATITE_ID, 500);
        lensesFor(yeet, BLACK_QUARTZ_SET, BLACK_QUARTZ_ID, 3000);
        lensesFor(yeet, CINNABAR_SET, CINNABAR_ID, 1000);
        lensesFor(yeet, FLUORITE_SET, FLUORITE_ID, 1000);
        lensesFor(yeet, GARNET_SET, GARNET_ID, 100);
        lensesFor(yeet, JADE_SET, JADE_ID, 60);
        lensesFor(yeet, MONAZITE_SET, MONAZITE_ID, 100);
        lensesFor(yeet, NECROTICARITE_SET, NECROTICARITE_ID, 250);
        lensesFor(yeet, NITER_SET, NITER_ID, 2000);
        lensesFor(yeet, OBSIDIAN_SET, OBSIDIAN_ID, 500);
        lensesFor(yeet, ONYX_SET, ONYX_ID, 20);
        lensesFor(yeet, PERIDOT_SET, PERIDOT_ID, 100);
        lensesFor(yeet, PYROLITE_SET, PYROLITE_ID, 1);
        lensesFor(yeet, RUBY_SET, RUBY_ID, 50);
        lensesFor(yeet, SAPPHIRE_SET, SAPPHIRE_ID, 50);
        lensesFor(yeet, SPINEL_SET, SPINEL_ID, 50);
        lensesFor(yeet, TANZANITE_SET, TANZANITE_ID, 50);
        lensesFor(yeet, ZIRCON_SET, ZIRCON_ID, 50);

        lensesFor(yeet, ANTHRACITE_SET, ANTHRACITE_ID, 2000);
        lensesFor(yeet, BITUMINOUS_SET, BITUMINOUS_ID, 2000);
        lensesFor(yeet, LIGNITE_SET, LIGNITE_ID, 2000);
        lensesFor(yeet, PEAT_SET, PEAT_ID, 1500);

        lens(yeet, SCULKS, 50, SCULKITE_SET.SCULK_ORE.asItem(), "sculkite_sculk");
        lens(yeet, SANDS, 50, PEARL_SET.SAND_ORE.asItem(), "pearl_sand");
        lens(yeet, SANDS, 500, SALT_SET.SAND_ORE.asItem(), "salt_sand");
    }
}
