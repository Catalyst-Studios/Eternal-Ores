package net.radzratz.eternalores.util.compat.powah.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import owmii.powah.block.Blcks;
import owmii.powah.block.Tier;
import owmii.powah.item.CapacitorItem;
import owmii.powah.item.Itms;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.URANINITE_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ingots.*;

public class EOReactorRecipes extends RecipeProvider {
    public EOReactorRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static void reactorUpgrades(RecipeOutput output, Tier cTier, Tier pTier, DeferredItem<CapacitorItem> capacitor, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blcks.REACTOR.get(cTier), 4)
                .pattern("RCR")
                .pattern("C#C")
                .pattern("RCR")
                .define('#', INGOTS_URANINITE)
                .define('C', capacitor)
                .define('R', Blcks.REACTOR.get(pTier))
                .unlockedBy(getHasName(URANINITE_SET.INGOT.get()), has(INGOTS_URANINITE))
                .save(yeet.withConditions(POWAH_MOD), EO(PATH.PWHCrafting() + sfx));
    }

    public static void reactorStarter(RecipeOutput output, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blcks.REACTOR.get(Tier.STARTER), 4)
                .pattern("UCU")
                .pattern("CDC")
                .pattern("UCU")
                .define('U', INGOTS_URANINITE)
                .define('C', Itms.CAPACITOR_BASIC_TINY)
                .define('D', Itms.DIELECTRIC_CASING)
                .unlockedBy(getHasName(Itms.DIELECTRIC_CASING), has(Itms.DIELECTRIC_CASING))
                .save(yeet.withConditions(POWAH_MOD), EO(PATH.PWHCrafting() + sfx));
    }

    public static void generate(RecipeOutput output) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        reactorStarter(yeet, "starter");
        reactorUpgrades(yeet, Tier.BASIC, Tier.STARTER, Itms.CAPACITOR_BASIC_LARGE, "basic");
        reactorUpgrades(yeet, Tier.HARDENED, Tier.BASIC, Itms.CAPACITOR_HARDENED, "hardened");
        reactorUpgrades(yeet, Tier.BLAZING, Tier.HARDENED, Itms.CAPACITOR_BLAZING, "blazing");
        reactorUpgrades(yeet, Tier.NIOTIC, Tier.BLAZING, Itms.CAPACITOR_NIOTIC, "niotic");
        reactorUpgrades(yeet, Tier.SPIRITED, Tier.NIOTIC, Itms.CAPACITOR_SPIRITED, "spirited");
        reactorUpgrades(yeet, Tier.NITRO, Tier.SPIRITED, Itms.CAPACITOR_NITRO, "nitro");
    }
}
