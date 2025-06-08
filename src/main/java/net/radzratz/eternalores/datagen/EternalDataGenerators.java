package net.radzratz.eternalores.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.datagen.loottables.EternalBlockLootTableProvider;
import net.radzratz.eternalores.datagen.models.EternalBlockStateProvider;
import net.radzratz.eternalores.datagen.models.EternalItemModelProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.dust.EternalDustDupeDecoRecipeProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.compressed.vanilla.EternalCompressedBlocksProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.gem.EternalGemBlockProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.metal.EternalMetalBlockProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.raw.EternalRawBlockProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.ingot.EternalIngotProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.nugget.EternalNuggetProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.plate.EternalPlatesProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.rod.EternalRodsProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.gem.EternalGemBlockDecoProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.metal.EternalMetalBlockDecoProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.raw.EternalRawBlockDecoProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.item.EternalDeconstructionProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.smelting_blasting.EternalBlastingProvider;
import net.radzratz.eternalores.datagen.recipes.recipetypes.smelting_blasting.EternalSmeltingProvider;
import net.radzratz.eternalores.datagen.tags.EternalBlockTagProvider;
import net.radzratz.eternalores.datagen.tags.EternalItemTagProvider;
import net.radzratz.eternalores.datagen.worldgen.EternalWorldGenProvider;
import net.radzratz.eternalores.util.compat.mekanism.datagen.EternalOresMekanismRecipes;
import net.radzratz.eternalores.util.compat.mekanism.datagen.EternalOresMekanismTags;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("all")
@EventBusSubscriber(modid = EternalOres.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class EternalDataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        EternalDataProvider provider = new EternalDataProvider(packOutput);

        /// EO LootTables
        provider.addSubProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(EternalBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));

        /// EO Recipes
        provider.addSubProvider(event.includeServer(), new EternalDustDupeDecoRecipeProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalCompressedBlocksProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalSmeltingProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalBlastingProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalDeconstructionProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalNuggetProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalIngotProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalRodsProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalPlatesProvider(packOutput, lookupProvider));
        //Material -> Block
        provider.addSubProvider(event.includeServer(), new EternalGemBlockProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalMetalBlockProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalRawBlockProvider(packOutput, lookupProvider));
        //Block -> Material
        provider.addSubProvider(event.includeServer(), new EternalGemBlockDecoProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalMetalBlockDecoProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EternalRawBlockDecoProvider(packOutput, lookupProvider));

        /// EO Tags
        BlockTagsProvider blockTagsProvider = new EternalBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        provider.addSubProvider(event.includeServer(), blockTagsProvider);
        provider.addSubProvider(event.includeServer(), new EternalItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        /// EO Models
        provider.addSubProvider(event.includeClient(), new EternalItemModelProvider(packOutput, existingFileHelper));
        provider.addSubProvider(event.includeClient(), new EternalBlockStateProvider(packOutput, existingFileHelper));

        /// EO WorldGen
        provider.addSubProvider(event.includeServer(), new EternalWorldGenProvider(packOutput, lookupProvider));

        /// Mekanism Compat
        provider.addSubProvider(event.includeServer(), new EternalOresMekanismTags(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        provider.addSubProvider(event.includeServer(), new EternalOresMekanismRecipes(packOutput, lookupProvider));

        generator.addProvider(true, provider);
    }
}