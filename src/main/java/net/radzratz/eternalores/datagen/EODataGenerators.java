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
import net.radzratz.eternalores.datagen.loottables.EOLootTableProvider;
import net.radzratz.eternalores.datagen.models.EOBlockStateProvider;
import net.radzratz.eternalores.datagen.models.EOItemModelProvider;
import net.radzratz.eternalores.datagen.recipes.EORecipeProvider;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;
import net.radzratz.eternalores.datagen.worldgen.EOWorldGenProvider;
import net.radzratz.eternalores.util.compat.mekanism.datagen.EOMekRecipeProvider;
import net.radzratz.eternalores.util.compat.mekanism.datagen.EOMekanismTagProvider;
import net.radzratz.eternalores.util.compat.oritech.datagen.EOritechRecipeProvider;
import net.radzratz.eternalores.util.compat.powah.datagen.EOPowahRecipeProvider;
import net.radzratz.eternalores.util.compat.powah.datagen.EOPowahMapProvider;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("all")
@EventBusSubscriber(modid = EternalOres.id, bus = EventBusSubscriber.Bus.MOD)
public class EODataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        EODataProvider provider = new EODataProvider(packOutput);

        /// EO LootTables
        provider.addSubProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(EOLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));

        /// EO Recipes
        provider.addSubProvider(event.includeServer(), new EORecipeProvider(packOutput, lookupProvider));

        /// EO Langs

        /// EO Tags
        BlockTagsProvider blockTagsProvider = new EOBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        provider.addSubProvider(event.includeServer(), blockTagsProvider);
        provider.addSubProvider(event.includeServer(), new EOItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        /// EO Models
        provider.addSubProvider(event.includeClient(), new EOItemModelProvider(packOutput, existingFileHelper));
        provider.addSubProvider(event.includeClient(), new EOBlockStateProvider(packOutput, existingFileHelper));

        /// EO WorldGen
        provider.addSubProvider(event.includeServer(), new EOWorldGenProvider(packOutput, lookupProvider));

        /// Mekanism Compat
        provider.addSubProvider(event.includeServer(), new EOMekanismTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        provider.addSubProvider(event.includeServer(), new EOMekRecipeProvider(packOutput, lookupProvider));

        /// Oritech Compat
        provider.addSubProvider(event.includeServer(), new EOritechRecipeProvider(packOutput, lookupProvider));

        /// Powah Compat
        provider.addSubProvider(event.includeServer(), new EOPowahRecipeProvider(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EOPowahMapProvider(packOutput, lookupProvider));

        generator.addProvider(true, provider);
    }
}