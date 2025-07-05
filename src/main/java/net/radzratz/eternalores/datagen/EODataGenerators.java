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
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.dust.EODustDupeEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.compressed.vanilla.EOCompressedEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.gem.EOGemBlockEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.metal.EOMetalBlockEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.raw.EORawBlockEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.ingot.EOIngotEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.nugget.EONuggetEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.plate.EOPlateEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.rod.EORodEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.gem.EODeconstructionGemBlockEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.metal.EODeconstructionMetalBlockEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.raw.EODeconstructionRawBlockEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.item.EODeconstructionItemEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.smelting_blasting.EOBlastingEntries;
import net.radzratz.eternalores.datagen.recipes.recipetypes.smelting_blasting.EOSmeltingEntries;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;
import net.radzratz.eternalores.datagen.worldgen.EOWorldGenProvider;
import net.radzratz.eternalores.util.compat.mekanism.datagen.EOMekRecipeProvider;
import net.radzratz.eternalores.util.compat.mekanism.datagen.EOMekanismTagProvider;
import net.radzratz.eternalores.util.compat.oritech.datagen.EOritechRecipeProvider;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("all")
@EventBusSubscriber(modid = EternalOres.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
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
        provider.addSubProvider(event.includeServer(), new EODustDupeEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EOCompressedEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EOSmeltingEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EOBlastingEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EODeconstructionItemEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EONuggetEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EOIngotEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EORodEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EOPlateEntries(packOutput, lookupProvider));
        //Material -> Block
        provider.addSubProvider(event.includeServer(), new EOGemBlockEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EOMetalBlockEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EORawBlockEntries(packOutput, lookupProvider));
        //Block -> Material
        provider.addSubProvider(event.includeServer(), new EODeconstructionGemBlockEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EODeconstructionMetalBlockEntries(packOutput, lookupProvider));
        provider.addSubProvider(event.includeServer(), new EODeconstructionRawBlockEntries(packOutput, lookupProvider));

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

        generator.addProvider(true, provider);
    }
}