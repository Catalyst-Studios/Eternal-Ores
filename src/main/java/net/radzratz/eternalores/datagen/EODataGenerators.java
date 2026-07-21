package net.radzratz.eternalores.datagen;

import com.stal111.forbidden_arcanus.core.registry.FARegistries;
import com.stal111.forbidden_arcanus.data.enhancer.ModEnhancerDefinitions;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
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
import net.radzratz.eternalores.datagen.data_maps.EODataMapsProvider;
import net.radzratz.eternalores.datagen.lang.EOLangProvider;
import net.radzratz.eternalores.datagen.loot_tables.EOBlockLootTableProvider;
import net.radzratz.eternalores.datagen.models.EOBlockStateProvider;
import net.radzratz.eternalores.datagen.models.EOItemModelProvider;
import net.radzratz.eternalores.datagen.recipes.EORecipeProvider;
import net.radzratz.eternalores.datagen.tags.EOBiomeTagProvider;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;
import net.radzratz.eternalores.datagen.worldgen.EOWorldgenProvider;
import net.radzratz.eternalores.datagen.tags.EOChemicalTagProvider;
import net.radzratz.eternalores.util.loot_tables.EOConditionalLootTableProvider;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.util.EOUtils.forbiddenArcanusMod;

@EventBusSubscriber(modid = EternalOres.id)
public class EODataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt) {
        DataGenerator gen = evt.getGenerator();
        PackOutput pOutput = gen.getPackOutput();
        ExistingFileHelper eFileHelp = evt.getExistingFileHelper();

        if (forbiddenArcanusMod) {
            evt.createDatapackRegistryObjects(
                    new RegistrySetBuilder()
                            .add(FARegistries.ENHANCER_DEFINITION, ModEnhancerDefinitions::new)
            );
        }
        CompletableFuture<HolderLookup.Provider> lProv = evt.getLookupProvider();

        EODataProvider prov = new EODataProvider(pOutput);

        // EO LootTables
        prov.addSubProvider(evt.includeServer(), new EOConditionalLootTableProvider(pOutput, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(EOBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lProv));

        // EO x Compat Recipes
        prov.addSubProvider(evt.includeServer(), new EORecipeProvider(pOutput, lProv));

        // EO Langs
        EOLangProvider.registerLangs(pOutput);
        EOLangProvider.addLangs(prov, evt.includeClient());

        // EO Tags
        prov.addSubProvider(evt.includeServer(), new EOBiomeTagProvider(pOutput, lProv, eFileHelp));
        BlockTagsProvider bTagProv = new EOBlockTagProvider(pOutput, lProv, eFileHelp);
        prov.addSubProvider(evt.includeServer(), bTagProv);
        prov.addSubProvider(evt.includeServer(), new EOItemTagProvider(pOutput, lProv, bTagProv.contentsGetter(), eFileHelp));
        prov.addSubProvider(evt.includeServer(), new EOChemicalTagProvider(pOutput, lProv, eFileHelp));

        // EO Models
        prov.addSubProvider(evt.includeClient(), new EOItemModelProvider(pOutput, eFileHelp));
        prov.addSubProvider(evt.includeClient(), new EOBlockStateProvider(pOutput, eFileHelp));

        // EO WorldGen
        prov.addSubProvider(evt.includeServer(), new EOWorldgenProvider(pOutput, lProv));

        // EO x Compat DataMaps
        prov.addSubProvider(evt.includeServer(), new EODataMapsProvider(pOutput, lProv));

        gen.addProvider(true, prov);
    }
}