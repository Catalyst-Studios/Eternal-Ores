package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalStack;
import mekanism.api.datagen.recipe.builder.ItemStackChemicalToItemStackRecipeBuilder;
import mekanism.api.datagen.recipe.builder.ItemStackToChemicalRecipeBuilder;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import mekanism.common.registration.impl.DeferredChemical;
import mekanism.common.registries.MekanismItems;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EODustItem;
import net.radzratz.eternalores.item.types.EOEnrichedItems;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOInfusions;
import net.radzratz.eternalores.util.compat.mekanism.conditions.EOChemicalCondition;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static mekanism.common.registries.MekanismChemicals.*;
import static mekanism.common.tags.MekanismTags.Items.ENRICHED_GOLD;
import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.compat.mekanism.chemicals.types.EOChemical.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Blends.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Dusts.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Enriched.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ingots.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.RawMaterials.SULFUR;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.SmallDusts.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.StorageBlocks.ITEM_STORAGE_SULFUR;

public class EOMKInfusingRecipes {

    public static void infusion(RecipeOutput output, Object inp, String chemName, int amount, String suffix) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Holder<Chemical> chemical = EOInfusions.getChemical(chemName);
        if (chemical == null) return;

        ICondition condition = EOChemicalCondition.getCondition(chemName);

        ItemStackIngredient inputStackAsTag = IngredientCreatorAccess.item().from(itemTagInputs(inp));
        ChemicalStack result = new ChemicalStack(chemical, amount);

        ItemStackToChemicalRecipeBuilder.chemicalConversion(inputStackAsTag, result)
                .addCondition(MEKANISM_MOD)
                .addCondition(condition)
                .build(yeet, EO("compat/mekanism/infusions/" + suffix + "_conv"));

        ItemStackToChemicalRecipeBuilder.oxidizing(inputStackAsTag, result)
                .addCondition(MEKANISM_MOD)
                .addCondition(condition)
                .build(yeet, EO("compat/mekanism/infusions/" + suffix + "_oxidizer"));
    }

    public static void oxidizer(RecipeOutput output, Object inp, DeferredChemical<?> inputChemical, int amount, String suffix) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient inputStackAsTag = IngredientCreatorAccess.item().from(itemTagInputs(inp));
        ChemicalStack result = new ChemicalStack(inputChemical, amount);

        ItemStackToChemicalRecipeBuilder.oxidizing(inputStackAsTag, result)
                .addCondition(MEKANISM_MOD)
                .build(yeet, EO("compat/mekanism/infusions/" + suffix + "_oxidizer"));
    }

    public static void metallurgic(RecipeOutput output, Object inp, int inputItemCount, DeferredChemical<?> iChem, int iChemCnt, Item rlt, int rCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient itemInput = IngredientCreatorAccess.item().from(itemTagInputs(inp), inputItemCount);
        ChemicalStackIngredient chemInput = IngredientCreatorAccess.chemicalStack().fromHolder(iChem, iChemCnt);
        ItemStack itemOutput = new ItemStack(rlt, rCnt);

        ItemStackChemicalToItemStackRecipeBuilder.metallurgicInfusing(itemInput, chemInput, itemOutput, false)
                .addCondition(MEKANISM_MOD)
                .build(yeet, EO("compat/mekanism/metallurgic/" + sfx));
    }

    public static void generateInfusion(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedInfuserRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        infusion(yeet, BLENDS_CARBON, CARBON.getName(), 20, paths.Blend() + "carbon");
        infusion(yeet, BLENDS_CARBON_ENRICHED, INF_ENRICHED_CARBON.getName(), 20, paths.Blend() + "high_carbon");
        infusion(yeet, BLENDS_ENDERGETIC, INF_ENDERGETIC.getName(), 20, paths.Blend() + "endergetic");
        infusion(yeet, BLENDS_ENERGETIC, INF_ENERGETIC.getName(), 20, paths.Blend() + "energetic");
        infusion(yeet, BLENDS_LOW_CARBON, INF_LOW_CARBON.getName(), 20, paths.Blend() + "low_carbon");
        infusion(yeet, BLENDS_NETHER_ENRICHED, INF_NETHER_ENRICHED.getName(), 20, paths.Blend() + "nether");
        infusion(yeet, BLENDS_SHADOW, INF_SHADOW.getName(), 20, paths.Blend() + "shadow");

        oxidizer(yeet, ITEM_STORAGE_SULFUR, SULFUR_DIOXIDE, 900, paths.Block() + "sulfur");
        oxidizer(yeet, SULFUR, SULFUR_DIOXIDE, 100, paths.Raw() + "sulfur");
        oxidizer(yeet, SMALL_DUSTS_SULFUR, SULFUR_DIOXIDE, 10, paths.SmallDust() + "sulfur");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Dust -> Chemical
            if (item instanceof EODustItem) {
                if (generatedInfuserRecipes.add("mek_infuser_dust_conv:" + mat)) {
                    infusion(yeet, inp.DUST, mat, 10, id.Dust());
                }
            }

            // Enriched -> Chemical
            if (item instanceof EOEnrichedItems) {
                if (generatedInfuserRecipes.add("mek_infuser_enriched_conv" + mat) && !mat.equals("iron")) {
                    infusion(yeet, inp.ENRICHED, mat, 80, id.Enriched());
                }
            }
        });
    }

    public static void generateMetallurgic(RecipeOutput output) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        metallurgic(yeet, OBSIDIAN_SET.ENRICHED.get(), 1, DIAMOND, 30, MekanismItems.ENRICHED_OBSIDIAN.get(), 3, "basic/refined_obsidian");

        metallurgic(yeet, SMALL_DUSTS_IRON, 1, CARBON, 5, WROUGHT_IRON_SET.SMALL_DUST.asItem(), 2, "basic/wrought_iron");

        metallurgic(yeet, DUSTS_IRON, 1, INF_LOW_CARBON, 10, PIG_IRON_SET.DUST.asItem(), 1, "basic/pig_iron_1");
        metallurgic(yeet, INGOTS_IRON, 1, INF_LOW_CARBON, 10, PIG_IRON_SET.DUST.asItem(), 1, "basic/pig_iron_2");

        metallurgic(yeet, INGOTS_STEEL, 1, BIO, 10, BIOSTEEL_SET.DUST.asItem(), 1, "basic/biosteel_1");
        metallurgic(yeet, DUSTS_STEEL, 1, BIO, 10, BIOSTEEL_SET.DUST.asItem(), 1, "basic/biosteel_2");

        metallurgic(yeet, INGOTS_STEEL, 1, CARBON, 10, CAST_STEEL_SET.DUST.asItem(), 1, "basic/cast_steel_1");
        metallurgic(yeet, DUSTS_STEEL, 1, CARBON, 10, CAST_STEEL_SET.DUST.asItem(), 1, "basic/cast_steel_2");

        metallurgic(yeet, INGOTS_GOLD, 1, INF_SILVER, 10, ELECTRUM_SET.DUST.asItem(), 1, "basic/electrum_1");
        metallurgic(yeet, DUSTS_GOLD, 1, INF_SILVER, 10, ELECTRUM_SET.DUST.asItem(), 1, "basic/electrum_2");
        metallurgic(yeet, ENRICHED_GOLD, 1, INF_SILVER, 40, ELECTRUM_SET.DUST.asItem(), 4, "basic/electrum_3");

        metallurgic(yeet, INGOTS_SILVER, 1, INF_ENERGETIC, 20, LUMIUM_SET.DUST.asItem(), 2, "infusion/lumium_1");
        metallurgic(yeet, DUSTS_SILVER, 1, INF_ENERGETIC, 20, LUMIUM_SET.DUST.asItem(), 2, "infusion/lumium_2");
        metallurgic(yeet, SILVER_ENRICHED, 1, INF_ENERGETIC, 40, LUMIUM_SET.DUST.asItem(), 4, "infusion/lumium_3");

        metallurgic(yeet, INGOTS_COPPER, 1, INF_ENERGETIC, 40, SIGNALUM_SET.DUST.asItem(), 2, "infusion/signalum_1");
        metallurgic(yeet, DUSTS_COPPER, 1, INF_ENERGETIC, 40, SIGNALUM_SET.DUST.asItem(), 2, "infusion/signalum_2");
        metallurgic(yeet, COPPER_ENRICHED, 1, INF_ENERGETIC, 40, SIGNALUM_SET.DUST.asItem(), 4, "infusion/signalum_3");

        metallurgic(yeet, INGOTS_LEAD, 1, INF_ENDERGETIC, 40, ENDERIUM_SET.DUST.asItem(), 2, "infusion/enderium_1");
        metallurgic(yeet, DUSTS_LEAD, 1, INF_ENDERGETIC, 40, ENDERIUM_SET.DUST.asItem(), 2, "infusion/enderium_2");
        metallurgic(yeet, LEAD_ENRICHED, 1, INF_ENDERGETIC, 60, ENDERIUM_SET.DUST.asItem(), 4, "infusion/enderium_3");

        metallurgic(yeet, INGOTS_NICKEL, 1, INF_COPPER, 20, CONSTANTAN_SET.DUST.asItem(), 2, "basic/constantan_1");
        metallurgic(yeet, DUSTS_NICKEL, 1, INF_COPPER, 20, CONSTANTAN_SET.DUST.asItem(), 2, "basic/constantan_2");
        metallurgic(yeet, NICKEL_ENRICHED, 1, INF_COPPER, 30, CONSTANTAN_SET.DUST.asItem(), 4, "infusion/constantan");

        metallurgic(yeet, INGOTS_GOLD, 2, INF_COPPER, 10, ROSE_GOLD_SET.DUST.asItem(), 3, "basic/rose_gold_1");
        metallurgic(yeet, DUSTS_GOLD, 2, INF_COPPER, 10, ROSE_GOLD_SET.DUST.asItem(), 3, "basic/rose_gold_2");
        metallurgic(yeet, ENRICHED_GOLD, 2, INF_COPPER, 20, ROSE_GOLD_SET.DUST.asItem(), 5, "infusion/rose_gold");

        metallurgic(yeet, INGOTS_COPPER, 3, TIN, 10, BRONZE_SET.DUST.asItem(), 4, "basic/bronze");
        metallurgic(yeet, COPPER_ENRICHED, 2, TIN, 10, BRONZE_SET.DUST.asItem(), 6, "infusion/bronze");

        metallurgic(yeet, INGOTS_TIN, 1, INF_COPPER, 20, PEWTER_SET.DUST.asItem(), 2, "basic/pewter_1");
        metallurgic(yeet, DUSTS_TIN, 1, INF_COPPER, 20, PEWTER_SET.DUST.asItem(), 2, "basic/pewter_2");
        metallurgic(yeet, TIN_ENRICHED, 1, INF_COPPER, 40, PEWTER_SET.DUST.asItem(), 4, "infusion/pewter");

        metallurgic(yeet, INGOTS_SILVER, 2, INF_COPPER, 10, BRITANNIA_SILVER_SET.DUST.asItem(), 3, "basic/britannia_1");
        metallurgic(yeet, DUSTS_SILVER, 2, INF_COPPER, 10, BRITANNIA_SILVER_SET.DUST.asItem(), 3, "basic/britannia_2");
        metallurgic(yeet, SILVER_SET.ENRICHED.get(), 1, INF_COPPER, 10, BRITANNIA_SILVER_SET.DUST.asItem(), 7, "basic/britannia");

        metallurgic(yeet, INGOTS_STEEL, 3, INF_NETHER_ENRICHED, 20, NETHERSTEEL_SET.DUST.asItem(), 2, "basic/nethersteel_1");
        metallurgic(yeet, DUSTS_STEEL, 7, INF_NETHER_ENRICHED, 20, NETHERSTEEL_SET.DUST.asItem(), 1, "basic/nethersteel_2");
    }
}
