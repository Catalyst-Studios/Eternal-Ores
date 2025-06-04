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

        provider.addSubProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(EternalBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));

        provider.addSubProvider(event.includeServer(), new EternalRecipeProvider(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new EternalBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        provider.addSubProvider(event.includeServer(), blockTagsProvider);
        provider.addSubProvider(event.includeServer(), new EternalItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        provider.addSubProvider(event.includeClient(), new EternalItemModelProvider(packOutput, existingFileHelper));
        provider.addSubProvider(event.includeClient(), new EternalBlockStateProvider(packOutput, existingFileHelper));

        provider.addSubProvider(event.includeServer(), new EternalWorldGenProvider(packOutput, lookupProvider));

        /// Mekanism Compat
        provider.addSubProvider(event.includeServer(), new EternalOresMekanismTags(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        provider.addSubProvider(event.includeServer(), new EternalOresMekanismRecipes(packOutput, lookupProvider));

        generator.addProvider(true, provider);
    }
}