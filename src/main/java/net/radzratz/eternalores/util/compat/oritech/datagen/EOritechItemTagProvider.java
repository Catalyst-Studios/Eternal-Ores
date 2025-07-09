package net.radzratz.eternalores.util.compat.oritech.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.oritech.items.EOritechItemRegistry;
import net.radzratz.eternalores.util.compat.oritech.tags.EOItemOritechTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EOritechItemTagProvider extends ItemTagsProvider
{
    public EOritechItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                 CompletableFuture<TagLookup<Block>> blockTags,
                                 @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTags, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider)
    {
        tag(EOItemOritechTags.Items.O_CLUMP_ALUMINUM_C).add(EOritechItemRegistry.O_ALUMINUM_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_ALUMINUM_C).add(EOritechItemRegistry.O_ALUMINUM_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_ALUMINUM_C).add(EOritechItemRegistry.O_ALUMINUM_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_ALUMINUM_C).add(EOritechItemRegistry.O_ALUMINUM_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_ARDITE_C).add(EOritechItemRegistry.O_ARDITE_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_ARDITE_C).add(EOritechItemRegistry.O_ARDITE_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_ARDITE_C).add(EOritechItemRegistry.O_ARDITE_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_ARDITE_C).add(EOritechItemRegistry.O_ARDITE_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_CATALYRIUM_C).add(EOritechItemRegistry.O_CATALYRIUM_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_CATALYRIUM_C).add(EOritechItemRegistry.O_CATALYRIUM_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_CATALYRIUM_C).add(EOritechItemRegistry.O_CATALYRIUM_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_CATALYRIUM_C).add(EOritechItemRegistry.O_CATALYRIUM_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_COBALT_C).add(EOritechItemRegistry.O_COBALT_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_COBALT_C).add(EOritechItemRegistry.O_COBALT_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_COBALT_C).add(EOritechItemRegistry.O_COBALT_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_COBALT_C).add(EOritechItemRegistry.O_COBALT_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_GALLIUM_C).add(EOritechItemRegistry.O_GALLIUM_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_GALLIUM_C).add(EOritechItemRegistry.O_GALLIUM_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_GALLIUM_C).add(EOritechItemRegistry.O_GALLIUM_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_GALLIUM_C).add(EOritechItemRegistry.O_GALLIUM_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_IRIDIUM_C).add(EOritechItemRegistry.O_IRIDIUM_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_IRIDIUM_C).add(EOritechItemRegistry.O_IRIDIUM_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_IRIDIUM_C).add(EOritechItemRegistry.O_IRIDIUM_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_IRIDIUM_C).add(EOritechItemRegistry.O_IRIDIUM_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_LEAD_C).add(EOritechItemRegistry.O_LEAD_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_LEAD_C).add(EOritechItemRegistry.O_LEAD_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_LEAD_C).add(EOritechItemRegistry.O_LEAD_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_LEAD_C).add(EOritechItemRegistry.O_LEAD_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_OSMIUM_C).add(EOritechItemRegistry.O_OSMIUM_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_OSMIUM_C).add(EOritechItemRegistry.O_OSMIUM_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_OSMIUM_C).add(EOritechItemRegistry.O_OSMIUM_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_OSMIUM_C).add(EOritechItemRegistry.O_OSMIUM_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_SILVER_C).add(EOritechItemRegistry.O_SILVER_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_SILVER_C).add(EOritechItemRegistry.O_SILVER_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_SILVER_C).add(EOritechItemRegistry.O_SILVER_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_SILVER_C).add(EOritechItemRegistry.O_SILVER_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_TIN_C).add(EOritechItemRegistry.O_TIN_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_TIN_C).add(EOritechItemRegistry.O_TIN_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_TIN_C).add(EOritechItemRegistry.O_TIN_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_TIN_C).add(EOritechItemRegistry.O_TIN_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_TUNGSTEN_C).add(EOritechItemRegistry.O_TUNGSTEN_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_TUNGSTEN_C).add(EOritechItemRegistry.O_TUNGSTEN_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_TUNGSTEN_C).add(EOritechItemRegistry.O_TUNGSTEN_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_TUNGSTEN_C).add(EOritechItemRegistry.O_TUNGSTEN_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_URANINITE_C).add(EOritechItemRegistry.O_URANINITE_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_URANINITE_C).add(EOritechItemRegistry.O_URANINITE_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_URANINITE_C).add(EOritechItemRegistry.O_URANINITE_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_URANINITE_C).add(EOritechItemRegistry.O_URANINITE_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_URANIUM_C).add(EOritechItemRegistry.O_URANIUM_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_URANIUM_C).add(EOritechItemRegistry.O_URANIUM_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_URANIUM_C).add(EOritechItemRegistry.O_URANIUM_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_URANIUM_C).add(EOritechItemRegistry.O_URANIUM_GEM.get());

        tag(EOItemOritechTags.Items.O_CLUMP_ZINC_C).add(EOritechItemRegistry.O_ZINC_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_CLUMP_ZINC_C).add(EOritechItemRegistry.O_ZINC_SMALL_CLUMP.get());
        tag(EOItemOritechTags.Items.O_SMALL_DUST_ZINC_C).add(EOritechItemRegistry.O_ZINC_SMALL_DUST.get());
        tag(EOItemOritechTags.Items.O_GEM_ZINC_C).add(EOritechItemRegistry.O_ZINC_GEM.get());
    }
}
