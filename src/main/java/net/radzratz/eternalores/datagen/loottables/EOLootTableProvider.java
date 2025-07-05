package net.radzratz.eternalores.datagen.loottables;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.radzratz.eternalores.block.EOBlocks;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

@SuppressWarnings("all")
public class EOLootTableProvider extends BlockLootSubProvider
{
    public EOLootTableProvider(HolderLookup.Provider registries)
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate()
    {
        //METAL BLOCKS
        dropSelf(EOBlocks.ALUMINUM_BLOCK.get());
        dropSelf(EOBlocks.ARDITE_BLOCK.get());
        dropSelf(EOBlocks.BRONZE_BLOCK.get());
        dropSelf(EOBlocks.CATALYRIUM_BLOCK.get());
        dropSelf(EOBlocks.COBALT_BLOCK.get());
        dropSelf(EOBlocks.ELECTRUM_BLOCK.get());
        dropSelf(EOBlocks.ENDERIUM_BLOCK.get());
        dropSelf(EOBlocks.INVAR_BLOCK.get());
        dropSelf(EOBlocks.IRIDIUM_BLOCK.get());
        dropSelf(EOBlocks.LEAD_BLOCK.get());
        dropSelf(EOBlocks.LUMIUM_BLOCK.get());
        dropSelf(EOBlocks.OSMIUM_BLOCK.get());
        dropSelf(EOBlocks.URANIUM_BLOCK.get());
        dropSelf(EOBlocks.ULTIMATITANIUM_BLOCK.get());
        dropSelf(EOBlocks.TIN_BLOCK.get());
        dropSelf(EOBlocks.PLATINUM_BLOCK.get());
        dropSelf(EOBlocks.PLUTONIUM_BLOCK.get());
        dropSelf(EOBlocks.NICKEL_BLOCK.get());
        dropSelf(EOBlocks.SIGNALUM_BLOCK.get());
        dropSelf(EOBlocks.SILVER_BLOCK.get());
        dropSelf(EOBlocks.STEEL_BLOCK.get());
        dropSelf(EOBlocks.GRAPHITE_BLOCK.get());
        dropSelf(EOBlocks.CONSTANTAN_BLOCK.get());
        dropSelf(EOBlocks.BRASS_BLOCK.get());
        dropSelf(EOBlocks.ZINC_BLOCK.get());
        dropSelf(EOBlocks.BLUE_STEEL_BLOCK.get());
        dropSelf(EOBlocks.GALLIUM_BLOCK.get());
        dropSelf(EOBlocks.TITANIUM_BLOCK.get());
        dropSelf(EOBlocks.PEWTER_BLOCK.get());
        dropSelf(EOBlocks.ROSE_GOLD_BLOCK.get());
        dropSelf(EOBlocks.BRITANNIA_SILVER_BLOCK.get());
        dropSelf(EOBlocks.CAST_IRON_BLOCK.get());
        dropSelf(EOBlocks.URANINITE_BLOCK.get());
        dropSelf(EOBlocks.CAST_STEEL_BLOCK.get());
        dropSelf(EOBlocks.WROUGHT_IRON_BLOCK.get());
        dropSelf(EOBlocks.NETHERSTEEL_BLOCK.get());
        dropSelf(EOBlocks.SHADOWSTEEL_BLOCK.get());
        dropSelf(EOBlocks.PIG_IRON_BLOCK.get());

        //COMPRESSED BLOCKS
        dropSelf(EOBlocks.COBBLE_1.get());
        dropSelf(EOBlocks.COBBLE_2.get());
        dropSelf(EOBlocks.COBBLE_3.get());
        dropSelf(EOBlocks.COBBLE_4.get());
        dropSelf(EOBlocks.COBBLE_5.get());
        dropSelf(EOBlocks.COBBLE_6.get());
        dropSelf(EOBlocks.COBBLE_7.get());
        dropSelf(EOBlocks.COBBLE_8.get());
        dropSelf(EOBlocks.COBBLE_9.get());

        dropSelf(EOBlocks.SAND_1.get());
        dropSelf(EOBlocks.SAND_2.get());
        dropSelf(EOBlocks.SAND_3.get());
        dropSelf(EOBlocks.SAND_4.get());
        dropSelf(EOBlocks.SAND_5.get());
        dropSelf(EOBlocks.SAND_6.get());
        dropSelf(EOBlocks.SAND_7.get());
        dropSelf(EOBlocks.SAND_8.get());
        dropSelf(EOBlocks.SAND_9.get());

        dropSelf(EOBlocks.DIRT_1.get());
        dropSelf(EOBlocks.DIRT_2.get());
        dropSelf(EOBlocks.DIRT_3.get());
        dropSelf(EOBlocks.DIRT_4.get());
        dropSelf(EOBlocks.DIRT_5.get());
        dropSelf(EOBlocks.DIRT_6.get());
        dropSelf(EOBlocks.DIRT_7.get());
        dropSelf(EOBlocks.DIRT_8.get());
        dropSelf(EOBlocks.DIRT_9.get());

        dropSelf(EOBlocks.ANDESITE_1.get());
        dropSelf(EOBlocks.ANDESITE_2.get());
        dropSelf(EOBlocks.ANDESITE_3.get());
        dropSelf(EOBlocks.ANDESITE_4.get());
        dropSelf(EOBlocks.ANDESITE_5.get());
        dropSelf(EOBlocks.ANDESITE_6.get());
        dropSelf(EOBlocks.ANDESITE_7.get());
        dropSelf(EOBlocks.ANDESITE_8.get());
        dropSelf(EOBlocks.ANDESITE_9.get());

        dropSelf(EOBlocks.GRAVEL_1.get());
        dropSelf(EOBlocks.GRAVEL_2.get());
        dropSelf(EOBlocks.GRAVEL_3.get());
        dropSelf(EOBlocks.GRAVEL_4.get());
        dropSelf(EOBlocks.GRAVEL_5.get());
        dropSelf(EOBlocks.GRAVEL_6.get());
        dropSelf(EOBlocks.GRAVEL_7.get());
        dropSelf(EOBlocks.GRAVEL_8.get());
        dropSelf(EOBlocks.GRAVEL_9.get());

        dropSelf(EOBlocks.GRANITE_1.get());
        dropSelf(EOBlocks.GRANITE_2.get());
        dropSelf(EOBlocks.GRANITE_3.get());
        dropSelf(EOBlocks.GRANITE_4.get());
        dropSelf(EOBlocks.GRANITE_5.get());
        dropSelf(EOBlocks.GRANITE_6.get());
        dropSelf(EOBlocks.GRANITE_7.get());
        dropSelf(EOBlocks.GRANITE_8.get());
        dropSelf(EOBlocks.GRANITE_9.get());

        dropSelf(EOBlocks.DIORITE_1.get());
        dropSelf(EOBlocks.DIORITE_2.get());
        dropSelf(EOBlocks.DIORITE_3.get());
        dropSelf(EOBlocks.DIORITE_4.get());
        dropSelf(EOBlocks.DIORITE_5.get());
        dropSelf(EOBlocks.DIORITE_6.get());
        dropSelf(EOBlocks.DIORITE_7.get());
        dropSelf(EOBlocks.DIORITE_8.get());
        dropSelf(EOBlocks.DIORITE_9.get());

        //GEM BLOCKS
        dropSelf(EOBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(EOBlocks.FLUORITE_BLOCK.get());
        dropSelf(EOBlocks.APATITE_BLOCK.get());
        dropSelf(EOBlocks.CINNABAR_BLOCK.get());
        dropSelf(EOBlocks.AMBER_BLOCK.get());
        dropSelf(EOBlocks.ONYX_BLOCK.get());
        dropSelf(EOBlocks.NITER_BLOCK.get());
        dropSelf(EOBlocks.RUBY_BLOCK.get());
        dropSelf(EOBlocks.PERIDOT_BLOCK.get());
        dropSelf(EOBlocks.NECROTICARITE_BLOCK.get());

        //MISC BLOCKS
        dropSelf(EOBlocks.NETHER_STAR_BLOCK.get());

        //RAW ORE BLOCKS
        dropSelf(EOBlocks.RAW_ALUMINUM_BLOCK.get());
        dropSelf(EOBlocks.RAW_ARDITE_BLOCK.get());
        dropSelf(EOBlocks.RAW_CATALYRIUM_BLOCK.get());
        dropSelf(EOBlocks.RAW_COBALT_BLOCK.get());
        dropSelf(EOBlocks.RAW_IRIDIUM_BLOCK.get());
        dropSelf(EOBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(EOBlocks.RAW_NICKEL_BLOCK.get());
        dropSelf(EOBlocks.RAW_OSMIUM_BLOCK.get());
        dropSelf(EOBlocks.RAW_PLATINUM_BLOCK.get());
        dropSelf(EOBlocks.RAW_PLUTONIUM_BLOCK.get());
        dropSelf(EOBlocks.RAW_SILVER_BLOCK.get());
        dropSelf(EOBlocks.SULFUR_BLOCK.get());
        dropSelf(EOBlocks.RAW_TIN_BLOCK.get());
        dropSelf(EOBlocks.RAW_URANIUM_BLOCK.get());
        dropSelf(EOBlocks.RAW_ZINC_BLOCK.get());
        dropSelf(EOBlocks.RAW_GALLIUM_BLOCK.get());
        dropSelf(EOBlocks.RAW_URANINITE_BLOCK.get());

        //ORE BLOCK TO RAW ORE/GEM
        //ALUMINUM ORE BLOCKS
        add(EOBlocks.ALUMINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.ALUMINUM_ORE_BLOCK.get(), EOItems.RAW_ALUMINUM.get(),1,2));
        add(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get(), EOItems.RAW_ALUMINUM.get(),1,2));

        //COBALT ORE BLOCKS
        add(EOBlocks.COBALT_ORE_BLOCK.get(), block -> createOreDrop(EOBlocks.COBALT_ORE_BLOCK.get(), EOItems.RAW_COBALT.get()));
        add(EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get(), block -> createOreDrop(EOBlocks.COBALT_ORE_BLOCK.get(), EOItems.RAW_COBALT.get()));

        //LEAD ORE BLOCKS
        add(EOBlocks.LEAD_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.LEAD_ORE_BLOCK.get(), EOItems.RAW_LEAD.get(),1,2));
        add(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get(), EOItems.RAW_LEAD.get(),1,2));

        //NICKEL ORE BLOCKS
        add(EOBlocks.NICKEL_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.NICKEL_ORE_BLOCK.get(), EOItems.RAW_NICKEL.get(),1,2));
        add(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get(), EOItems.RAW_NICKEL.get(),1,2));

        //OSMIUM ORE BLOCKS
        add(EOBlocks.OSMIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.OSMIUM_ORE_BLOCK.get(), EOItems.RAW_OSMIUM.get(), 1, 2));
        add(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get(), EOItems.RAW_OSMIUM.get(), 1,2));

        //PLATINUM ORE BLOCKS
        add(EOBlocks.PLATINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.PLATINUM_ORE_BLOCK.get(), EOItems.RAW_PLATINUM.get(),1,2));
        add(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get(), EOItems.RAW_PLATINUM.get(),1,2));

        //PLUTONIUM ORE BLOCKS
        add(EOBlocks.PLUTONIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.PLUTONIUM_ORE_BLOCK.get(), EOItems.RAW_PLUTONIUM.get(),1,2));
        add(EOBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get(), EOItems.RAW_PLUTONIUM.get(),1,2));

        //SULFUR ORE BLOCKS
        add(EOBlocks.SULFUR_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.SULFUR_ORE_BLOCK.get(), EOItems.SULFUR.get(),1,2));
        add(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get(), EOItems.SULFUR.get(),1,2));

        //TIN ORE BLOCKS
        add(EOBlocks.TIN_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.TIN_ORE_BLOCK.get(), EOItems.RAW_TIN.get(),1,2));
        add(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.get(), EOItems.RAW_TIN.get(),1,2));

        //URANIUM ORE BLOCKS
        add(EOBlocks.URANIUM_ORE_BLOCK.get(), block -> createOreDrop(EOBlocks.URANIUM_ORE_BLOCK.get(), EOItems.RAW_URANIUM.get()));
        add(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get(), block -> createOreDrop(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get(), EOItems.RAW_URANIUM.get()));

        //SILVER ORE BLOCKS
        add(EOBlocks.SILVER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.SILVER_ORE_BLOCK.get(), EOItems.RAW_SILVER.get(),1,2));
        add(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get(), EOItems.RAW_SILVER.get(),1,2));

        //ZINC ORE BLOCKS
        add(EOBlocks.ZINC_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.ZINC_ORE_BLOCK.get(), EOItems.RAW_ZINC.get(),1,3));
        add(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get(), EOItems.RAW_ZINC.get(),1,3));

        //GALLIUM ORE BLOCKS
        add(EOBlocks.GALLIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.GALLIUM_ORE_BLOCK.get(), EOItems.RAW_GALLIUM.get(),1,2));
        add(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get(), EOItems.RAW_GALLIUM.get(),1,2));

        //IRIDIUM TO RAW ORE
        add(EOBlocks.IRIDIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.IRIDIUM_ORE_BLOCK.get(), EOItems.RAW_IRIDIUM.get(),1,2));
        add(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get(), EOItems.RAW_IRIDIUM.get(),1,2));

        //URANINITE TO RAW ORE
        add(EOBlocks.URANINITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.URANINITE_ORE_BLOCK.get(), EOItems.RAW_URANINITE.get(),1,3));
        add(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get(), EOItems.RAW_URANINITE.get(),1,3));

        //GEMS
        //FLUORITE TO GEM
        add(EOBlocks.FLUORITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.FLUORITE_ORE_BLOCK.get(), EOItems.FLUORITE.get(), 1,2));
        add(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get(), EOItems.FLUORITE.get(),1,2));

        //SAPPHIRE TO GEM
        add(EOBlocks.SAPPHIRE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.SAPPHIRE_ORE_BLOCK.get(), EOItems.GEM_SAPPHIRE.get(), 1,2));
        add(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get(), EOItems.GEM_SAPPHIRE.get(),1,2));

        //APATITE TO GEM
        add(EOBlocks.APATITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.APATITE_ORE_BLOCK.get(), EOItems.GEM_APATITE.get(), 1,2));
        add(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get(), EOItems.GEM_APATITE.get(),1,2));

        //CINNABAR TO GEM
        add(EOBlocks.CINNABAR_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.CINNABAR_ORE_BLOCK.get(), EOItems.GEM_CINNABAR.get(), 1,2));
        add(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get(), EOItems.GEM_CINNABAR.get(),1,2));

        //ONYX TO GEM
        add(EOBlocks.ONYX_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.ONYX_ORE_BLOCK.get(), EOItems.GEM_ONYX.get(), 1,2));
        add(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get(), EOItems.GEM_ONYX.get(),1,2));

        //AMBER TO GEM
        add(EOBlocks.AMBER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.AMBER_ORE_BLOCK.get(), EOItems.GEM_AMBER.get(), 1,2));
        add(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get(), EOItems.GEM_AMBER.get(),1,2));

        //NITER TO GEM
        add(EOBlocks.NITER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.NITER_ORE_BLOCK.get(), EOItems.GEM_NITER.get(), 1,2));
        add(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.get(), EOItems.GEM_NITER.get(),1,2));

        //RUBY TO GEM
        add(EOBlocks.RUBY_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.RUBY_ORE_BLOCK.get(), EOItems.GEM_RUBY.get(), 1,2));
        add(EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get(), EOItems.GEM_RUBY.get(),1,2));

        //PERIDOT TO GEM
        add(EOBlocks.PERIDOT_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.PERIDOT_ORE_BLOCK.get(), EOItems.GEM_PERIDOT.get(), 1,2));
        add(EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get(), EOItems.GEM_PERIDOT.get(),1,2));
        //OBSIDIAN ORE TO GEM
        add(EOBlocks.OBSIDIAN_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.OBSIDIAN_ORE_BLOCK.get(), EOItems.GEM_OBSIDIAN_SHARD.get(),1,2));
        //NECROTICARITE TO GEM
        add(EOBlocks.NECROTICARITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.NECROTICARITE_ORE_BLOCK.get(), EOItems.GEM_NECROTICARITE.get(),1,2));
        //ARDITE TO RAW ORE
        add(EOBlocks.ARDITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EOBlocks.ARDITE_ORE_BLOCK.get(), EOItems.RAW_ARDITE.get(),1,1));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops)
    {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks()
    {
        return EOBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
