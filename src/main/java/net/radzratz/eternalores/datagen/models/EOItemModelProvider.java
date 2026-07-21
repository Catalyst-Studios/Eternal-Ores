package net.radzratz.eternalores.datagen.models;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.allGeOreItemEntries;
import static net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries.allIronFurnacesItemEntries;

public class EOItemModelProvider extends ItemModelProvider {
    public EOItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EternalOres.id, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        allItemEntries()
                .filter(entry -> !(entry.get() instanceof BlockItem))
                .forEach(item -> basicItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item.get()))));

        if (georeMod) {
            allGeOreItemEntries()
                    .filter(entry -> !(entry.get() instanceof BlockItem))
                    .forEach(item -> basicItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item.get()))));
        }

        if (ironFurnaceMod) {
            allIronFurnacesItemEntries()
                    .filter(entry -> !(entry.get() instanceof BlockItem))
                    .forEach(item -> basicItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item.get()))));
        }
    }

    public @NotNull ItemModelBuilder basicItem(ResourceLocation item) {
        String itemName = item.getPath();
        String basePath = "item/";

        String[] possiblePaths = {
                basePath + itemName,
                basePath + "hammers/" + itemName,
                basePath + "ingots/" + itemName,
                basePath + "rods/" + itemName,
                basePath + "nuggets/" + itemName,
                basePath + "gems/" + itemName,
                basePath + "gears/" + itemName,
                basePath + "raw_materials/" + itemName,
                basePath + "gem_cutters/" + itemName,
                basePath + "misc/" + itemName,
                basePath + "dusts/" + itemName,
                basePath + "plates/" + itemName,
                basePath + "dirty_dusts/" + itemName,
                basePath + "clumps/" + itemName,
                basePath + "shards/" + itemName,
                basePath + "crystals/" + itemName,
                basePath + "small_clumps/" + itemName,
                basePath + "small_dusts/" + itemName,
                basePath + "ore_gem/" + itemName,
                basePath + "coals/" + itemName,
                basePath + "enriched/" + itemName,
                basePath + "blends/" + itemName,
                basePath + "foils/" + itemName,
                basePath + "wire_cutters/" + itemName,
                basePath + "gem_shards/" + itemName,
                basePath + "geoshards/" + itemName,
                basePath + "upgrades/" + itemName,
                basePath + "pebbles/" + itemName
        };

        ItemModelBuilder builder = null;

        for (String path : possiblePaths) {
            if (existingFileHelper.exists(ResourceLocation.fromNamespaceAndPath(item.getNamespace(), path), TEXTURE)) {
                if (path.contains("rods/") || path.contains("hammers/") || path.contains("gem_cutters") || path.contains("finder")) {
                    builder = this.getBuilder(item.toString())
                            .parent(new ModelFile.UncheckedModelFile("item/handheld"))
                            .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), path));
                } else {
                    builder = this.getBuilder(item.toString())
                            .parent(new ModelFile.UncheckedModelFile("item/generated"))
                            .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), path));
                }
                break;
            }
        }

        if (builder == null) {
            builder = this.getBuilder(item.toString())
                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                    .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), basePath + itemName));
        }

        return builder;
    }
}
