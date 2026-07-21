package net.radzratz.eternalores.datagen.data_maps;

import com.enderio.enderio.api.components.GrindingBallData;
import mekanism.api.chemical.Chemical;
import mekanism.api.datamaps.chemical.ChemicalSolidTag;
import mekanism.common.registration.impl.SlurryRegistryObject;
import mekanism.common.registries.MekanismDataMapTypes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.radzratz.eternalores.block.types.EOCoalBlock;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.item.types.EOCoalItem;
import net.radzratz.eternalores.item.types.EODustItem;
import net.radzratz.eternalores.item.types.EOSmallDustItem;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOMekSlurries;
import net.radzratz.eternalores.util.recipes.util.EORecipeInputs;
import org.jetbrains.annotations.NotNull;
import owmii.powah.recipe.ReactorFuel;

import java.util.concurrent.CompletableFuture;

import static net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.compat.enderio.items.types.EOGrindingBall.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ingots.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Nuggets.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.StorageBlocks.*;

public class EODataMapsProvider extends DataMapProvider {
    public EODataMapsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.@NotNull Provider provider) {
        allBlockEntries().forEach(entry -> {
            if (entry.get() instanceof EOCoalBlock coal) {
                fuel(entry.getId(), coal.getBurnTime());
            }

            if (entry.get() instanceof EODustBlock dust && dust.getBurnTime() > 0) {
                fuel(entry.getId(), dust.getBurnTime());
            }
        });

        allItemEntries().forEach(entry -> {
            if (entry.get() instanceof EOCoalItem coal) {
                fuel(entry.getId(), coal.getBurnTime());
            }

            if (entry.get() instanceof EODustItem dust && dust.getBurnTime() > 0) {
                fuel(entry.getId(), dust.getBurnTime());
            }

            if (entry.get() instanceof EOSmallDustItem dust && dust.getBurnTime() > 0) {
                fuel(entry.getId(), dust.getBurnTime());
            }
        });

        reactorFuel(INGOTS_URANINITE, 100, 700);
        reactorFuel(NUGGETS_URANINITE, 5, 200);
        reactorFuel(ITEM_STORAGE_URANINITE, 700, 900);

        EOMekSlurries.getSlurryMap().forEach((mat, slurryObj) -> {
            if (slurryObj == null) return;

            EORecipeInputs inp = EORecipeInputs.fromPath(mat);
            if (inp.ORE == null) return;

            solidTag(slurryObj, inp.ORE);
        });

        grindingBall(CATALYRIC_GRINDING_BALL.getKey(), 3f, 3f, 3f, 150000);
        grindingBall(ENDERIUM_GRINDING_BALL.getKey(), 2f, 1.85f, 0.90f, 60000);
        grindingBall(SIGNALUM_GRINDING_BALL.getKey(), 1.5f, 1.25f, 1.25f, 40000);
        grindingBall(LUMIUM_GRINDING_BALL.getKey(), 1f, 1.25f, 2f, 10000);
        grindingBall(ELECTRUM_GRINDING_BALL.getKey(), 0.5f, 0.25f, 0.5f, 5000);
    }

    private void fuel(ResourceLocation path, int burnTime) {
        builder(FURNACE_FUELS).add(path, new FurnaceFuel(burnTime), false);
    }

    private void reactorFuel(TagKey<Item> tag, int fCnt, int heat) {
        builder(ReactorFuel.DATA_MAP_TYPE).add(tag, new ReactorFuel(fCnt, heat), false).conditions(POWAH_MOD);
    }

    private void solidTag(SlurryRegistryObject<? extends Chemical, ? extends Chemical> chem, TagKey<Item> solid) {
        builder(MekanismDataMapTypes.INSTANCE.chemicalSolidTag()).add(chem.getCleanSlurry(), new ChemicalSolidTag(solid), false).conditions(MEKANISM_MOD);
    }

    private void grindingBall(ResourceKey<Item> ball, float rltMtply, float bRltMtply, float eCnt, int drblty) {
        builder(GrindingBallData.DATA_MAP_TYPE).add(ball, new GrindingBallData(rltMtply, bRltMtply, eCnt, drblty), false).conditions(ENDERIO_MOD);
    }
}
