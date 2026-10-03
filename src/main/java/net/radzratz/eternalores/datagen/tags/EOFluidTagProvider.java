package net.radzratz.eternalores.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.tags.fluid.EOFluidTagEntries;
import net.radzratz.eternalores.util.tags.fluid.util.ITagFluidProvider;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.tags.fluid.EOFluidTags.Fluids.*;
import static net.radzratz.eternalores.util.tags.fluid.EOFluidTags.Molten.*;

public class EOFluidTagProvider extends FluidTagsProvider {
    private final List<ITagFluidProvider> entryProviders = new ArrayList<>();

    public EOFluidTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper helper) {
        super(output, provider, EternalOres.id, helper);
        entryProviders.add(new EOFluidTagEntries());
    }

    public IntrinsicHolderTagsProvider.IntrinsicTagAppender<Fluid> getFluidTags(TagKey<Fluid> tag) {
        return super.tag(tag);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        for (ITagFluidProvider tagProvider : entryProviders) {
            tagProvider.addTags(this, provider);
        }

        tag(BLOOD_FLUID).addOptional(EC("blood"));

        hephaestus(COBALT_MOLTEN, "cobalt");
        hephaestus(QUARTZ_MOLTEN, "quartz");
        hephaestus(DIAMOND_MOLTEN, "diamond");
        hephaestus(EMERALD_MOLTEN, "emerald");
        hephaestus(AMETHYST_MOLTEN, "amethyst");
        hephaestus(ALUMINUM_MOLTEN, "aluminum");
        hephaestus(ANCIENT_DEBRIS_MOLTEN, "ancient_debris");
        hephaestus(BRASS_MOLTEN, "brass");
        hephaestus(BRONZE_MOLTEN, "bronze");
        hephaestus(CONSTANTAN_MOLTEN, "constantan");
        hephaestus(COPPER_MOLTEN, "copper");
        hephaestus(ELECTRUM_MOLTEN, "electrum");
        hephaestus(ENDER_MOLTEN, "ender");
        hephaestus(ENDERIUM_MOLTEN, "enderium");
        hephaestus(GOLD_MOLTEN, "gold");
        hephaestus(INVAR_MOLTEN, "invar");
        hephaestus(IRIDIUM_MOLTEN, "iridium");
        hephaestus(IRON_MOLTEN, "iron");
        hephaestus(LAPIS_MOLTEN, "lapis");
        hephaestus(LEAD_MOLTEN, "lead");
        hephaestus(LUMIUM_MOLTEN, "lumium");
        hephaestus(NETHERITE_MOLTEN, "netherite");
        hephaestus(NICKEL_MOLTEN, "nickel");
        hephaestus(OBSIDIAN_MOLTEN, "obsidian");
        hephaestus(OSMIUM_MOLTEN, "osmium");
        hephaestus(PLATINUM_MOLTEN, "platinum");
        hephaestus(REDSTONE_MOLTEN, "redstone");
        hephaestus(SIGNALUM_MOLTEN, "signalum");
        hephaestus(SHULKER_SHELL_MOLTEN, "shulker_shell");
        hephaestus(STEEL_MOLTEN, "steel");
        hephaestus(TIN_MOLTEN, "tin");
        hephaestus(URANIUM_MOLTEN, "uranium");
        hephaestus(ZINC_MOLTEN, "zinc");
    }

    private void hephaestus(TagKey<Fluid> iTag, String path) {
        tag(iTag).addOptional(HPF("molten_" + path));
    }
}
