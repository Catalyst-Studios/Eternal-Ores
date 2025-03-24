package net.radzratz.eternalores.datagen;

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
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class EternalBlockLootTableProvider extends BlockLootSubProvider {
    protected EternalBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        System.out.println("Loading Loot Table Provider");

        //METAL BLOCKS
        dropSelf(EternalGeneralBlocks.ALUMINUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.BRONZE_BLOCK.get());
        dropSelf(EternalGeneralBlocks.COBALT_BLOCK.get());
        dropSelf(EternalGeneralBlocks.ELECTRUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.ENDERIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.INVAR_BLOCK.get());
        dropSelf(EternalGeneralBlocks.IRIDIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.LEAD_BLOCK.get());
        dropSelf(EternalGeneralBlocks.LUMIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.OSMIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.URANIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.ULTIMATITANIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.TIN_BLOCK.get());
        dropSelf(EternalGeneralBlocks.PLATINUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.PLUTONIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.NICKEL_BLOCK.get());
        dropSelf(EternalGeneralBlocks.SIGNALUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.SILVER_BLOCK.get());
        dropSelf(EternalGeneralBlocks.STEEL_BLOCK.get());
        dropSelf(EternalGeneralBlocks.GRAPHITE_BLOCK.get());
        dropSelf(EternalGeneralBlocks.CONSTANTAN_BLOCK.get());
        dropSelf(EternalGeneralBlocks.BRASS_BLOCK.get());
        dropSelf(EternalGeneralBlocks.ZINC_BLOCK.get());
        dropSelf(EternalGeneralBlocks.BLUE_STEEL_BLOCK.get());
        dropSelf(EternalGeneralBlocks.GALLIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.TITANIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.PEWTER_BLOCK.get());
        dropSelf(EternalGeneralBlocks.ROSE_GOLD_BLOCK.get());
        dropSelf(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.get());
        dropSelf(EternalGeneralBlocks.CAST_IRON_BLOCK.get());
        dropSelf(EternalGeneralBlocks.URANINITE_BLOCK.get());
        dropSelf(EternalGeneralBlocks.CAST_STEEL_BLOCK.get());
        dropSelf(EternalGeneralBlocks.WROUGHT_IRON_BLOCK.get());
        dropSelf(EternalGeneralBlocks.NETHERSTEEL_BLOCK.get());
        dropSelf(EternalGeneralBlocks.SHADOWSTEEL_BLOCK.get());
        dropSelf(EternalGeneralBlocks.PIG_IRON_BLOCK.get());

        //COMPRESSED BLOCKS
        dropSelf(EternalGeneralBlocks.COBBLE_1.get());
        dropSelf(EternalGeneralBlocks.COBBLE_2.get());
        dropSelf(EternalGeneralBlocks.COBBLE_3.get());
        dropSelf(EternalGeneralBlocks.COBBLE_4.get());
        dropSelf(EternalGeneralBlocks.COBBLE_5.get());
        dropSelf(EternalGeneralBlocks.COBBLE_6.get());
        dropSelf(EternalGeneralBlocks.COBBLE_7.get());
        dropSelf(EternalGeneralBlocks.COBBLE_8.get());
        dropSelf(EternalGeneralBlocks.COBBLE_9.get());

        dropSelf(EternalGeneralBlocks.SAND_1.get());
        dropSelf(EternalGeneralBlocks.SAND_2.get());
        dropSelf(EternalGeneralBlocks.SAND_3.get());
        dropSelf(EternalGeneralBlocks.SAND_4.get());
        dropSelf(EternalGeneralBlocks.SAND_5.get());
        dropSelf(EternalGeneralBlocks.SAND_6.get());
        dropSelf(EternalGeneralBlocks.SAND_7.get());
        dropSelf(EternalGeneralBlocks.SAND_8.get());
        dropSelf(EternalGeneralBlocks.SAND_9.get());

        dropSelf(EternalGeneralBlocks.DIRT_1.get());
        dropSelf(EternalGeneralBlocks.DIRT_2.get());
        dropSelf(EternalGeneralBlocks.DIRT_3.get());
        dropSelf(EternalGeneralBlocks.DIRT_4.get());
        dropSelf(EternalGeneralBlocks.DIRT_5.get());
        dropSelf(EternalGeneralBlocks.DIRT_6.get());
        dropSelf(EternalGeneralBlocks.DIRT_7.get());
        dropSelf(EternalGeneralBlocks.DIRT_8.get());
        dropSelf(EternalGeneralBlocks.DIRT_9.get());

        dropSelf(EternalGeneralBlocks.ANDESITE_1.get());
        dropSelf(EternalGeneralBlocks.ANDESITE_2.get());
        dropSelf(EternalGeneralBlocks.ANDESITE_3.get());
        dropSelf(EternalGeneralBlocks.ANDESITE_4.get());
        dropSelf(EternalGeneralBlocks.ANDESITE_5.get());
        dropSelf(EternalGeneralBlocks.ANDESITE_6.get());
        dropSelf(EternalGeneralBlocks.ANDESITE_7.get());
        dropSelf(EternalGeneralBlocks.ANDESITE_8.get());
        dropSelf(EternalGeneralBlocks.ANDESITE_9.get());

        dropSelf(EternalGeneralBlocks.GRAVEL_1.get());
        dropSelf(EternalGeneralBlocks.GRAVEL_2.get());
        dropSelf(EternalGeneralBlocks.GRAVEL_3.get());
        dropSelf(EternalGeneralBlocks.GRAVEL_4.get());
        dropSelf(EternalGeneralBlocks.GRAVEL_5.get());
        dropSelf(EternalGeneralBlocks.GRAVEL_6.get());
        dropSelf(EternalGeneralBlocks.GRAVEL_7.get());
        dropSelf(EternalGeneralBlocks.GRAVEL_8.get());
        dropSelf(EternalGeneralBlocks.GRAVEL_9.get());

        dropSelf(EternalGeneralBlocks.GRANITE_1.get());
        dropSelf(EternalGeneralBlocks.GRANITE_2.get());
        dropSelf(EternalGeneralBlocks.GRANITE_3.get());
        dropSelf(EternalGeneralBlocks.GRANITE_4.get());
        dropSelf(EternalGeneralBlocks.GRANITE_5.get());
        dropSelf(EternalGeneralBlocks.GRANITE_6.get());
        dropSelf(EternalGeneralBlocks.GRANITE_7.get());
        dropSelf(EternalGeneralBlocks.GRANITE_8.get());
        dropSelf(EternalGeneralBlocks.GRANITE_9.get());

        dropSelf(EternalGeneralBlocks.DIORITE_1.get());
        dropSelf(EternalGeneralBlocks.DIORITE_2.get());
        dropSelf(EternalGeneralBlocks.DIORITE_3.get());
        dropSelf(EternalGeneralBlocks.DIORITE_4.get());
        dropSelf(EternalGeneralBlocks.DIORITE_5.get());
        dropSelf(EternalGeneralBlocks.DIORITE_6.get());
        dropSelf(EternalGeneralBlocks.DIORITE_7.get());
        dropSelf(EternalGeneralBlocks.DIORITE_8.get());
        dropSelf(EternalGeneralBlocks.DIORITE_9.get());

        //GEM BLOCKS
        dropSelf(EternalGeneralBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(EternalGeneralBlocks.FLUORITE_BLOCK.get());
        dropSelf(EternalGeneralBlocks.APATITE_BLOCK.get());
        dropSelf(EternalGeneralBlocks.CINNABAR_BLOCK.get());
        dropSelf(EternalGeneralBlocks.AMBER_BLOCK.get());
        dropSelf(EternalGeneralBlocks.ONYX_BLOCK.get());
        dropSelf(EternalGeneralBlocks.NITER_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RUBY_BLOCK.get());
        dropSelf(EternalGeneralBlocks.PERIDOT_BLOCK.get());
        dropSelf(EternalGeneralBlocks.NECROTICARITE_BLOCK.get());

        //RAW ORE BLOCKS
        dropSelf(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_COBALT_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_NICKEL_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_OSMIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_PLATINUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_SILVER_BLOCK.get());
        dropSelf(EternalGeneralBlocks.SULFUR_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_TIN_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_URANIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_ZINC_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_GALLIUM_BLOCK.get());
        dropSelf(EternalGeneralBlocks.RAW_URANINITE_BLOCK.get());

        //ORE BLOCK TO RAW ORE/GEM
        //ALUMINUM ORE BLOCKS
        add(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_ALUMINUM.get(),1,2));
        add(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_ALUMINUM.get(),1,2));

        //COBALT ORE BLOCKS
        add(EternalGeneralBlocks.COBALT_ORE_BLOCK.get(), block -> createOreDrop(EternalGeneralBlocks.COBALT_ORE_BLOCK.get(), EternalGeneralItems.RAW_COBALT.get()));
        add(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get(), block -> createOreDrop(EternalGeneralBlocks.COBALT_ORE_BLOCK.get(), EternalGeneralItems.RAW_COBALT.get()));

        //LEAD ORE BLOCKS
        add(EternalGeneralBlocks.LEAD_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.LEAD_ORE_BLOCK.get(), EternalGeneralItems.RAW_LEAD.get(),1,2));
        add(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get(), EternalGeneralItems.RAW_LEAD.get(),1,2));

        //NICKEL ORE BLOCKS
        add(EternalGeneralBlocks.NICKEL_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.NICKEL_ORE_BLOCK.get(), EternalGeneralItems.RAW_NICKEL.get(),1,2));
        add(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get(), EternalGeneralItems.RAW_NICKEL.get(),1,2));

        //OSMIUM ORE BLOCKS
        add(EternalGeneralBlocks.OSMIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.OSMIUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_OSMIUM.get(), 1, 2));
        add(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_OSMIUM.get(), 1,2));

        //PLATINUM ORE BLOCKS
        add(EternalGeneralBlocks.PLATINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.PLATINUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_PLATINUM.get(),1,2));
        add(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_PLATINUM.get(),1,2));

        //PLUTONIUM ORE BLOCKS
        add(EternalGeneralBlocks.PLUTONIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.PLUTONIUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_PLUTONIUM.get(),1,2));
        add(EternalGeneralBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_PLUTONIUM.get(),1,2));

        //SULFUR ORE BLOCKS
        add(EternalGeneralBlocks.SULFUR_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.SULFUR_ORE_BLOCK.get(), EternalGeneralItems.SULFUR.get(),1,2));
        add(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get(), EternalGeneralItems.SULFUR.get(),1,2));

        //TIN ORE BLOCKS
        add(EternalGeneralBlocks.TIN_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.TIN_ORE_BLOCK.get(), EternalGeneralItems.RAW_TIN.get(),1,2));
        add(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.get(), EternalGeneralItems.RAW_TIN.get(),1,2));

        //URANIUM ORE BLOCKS
        add(EternalGeneralBlocks.URANIUM_ORE_BLOCK.get(), block -> createOreDrop(EternalGeneralBlocks.URANIUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_URANIUM.get()));
        add(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get(), block -> createOreDrop(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_URANIUM.get()));

        //SILVER ORE BLOCKS
        add(EternalGeneralBlocks.SILVER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.SILVER_ORE_BLOCK.get(), EternalGeneralItems.RAW_SILVER.get(),1,2));
        add(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get(), EternalGeneralItems.RAW_SILVER.get(),1,2));

        //ZINC ORE BLOCKS
        add(EternalGeneralBlocks.ZINC_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.ZINC_ORE_BLOCK.get(), EternalGeneralItems.RAW_ZINC.get(),1,3));
        add(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get(), EternalGeneralItems.RAW_ZINC.get(),1,3));

        //GALLIUM ORE BLOCKS
        add(EternalGeneralBlocks.GALLIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.GALLIUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_GALLIUM.get(),1,2));
        add(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_GALLIUM.get(),1,2));

        //IRIDIUM TO RAW ORE
        add(EternalGeneralBlocks.IRIDIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.IRIDIUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_IRIDIUM.get(),1,2));
        add(EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get(), EternalGeneralItems.RAW_IRIDIUM.get(),1,2));

        //URANINITE TO RAW ORE
        add(EternalGeneralBlocks.URANINITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.URANINITE_ORE_BLOCK.get(), EternalGeneralItems.RAW_URANINITE.get(),1,3));
        add(EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get(), EternalGeneralItems.RAW_URANINITE.get(),1,3));

        //GEMS
        //FLUORITE TO GEM
        add(EternalGeneralBlocks.FLUORITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.FLUORITE_ORE_BLOCK.get(), EternalGeneralItems.FLUORITE.get(), 1,2));
        add(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get(), EternalGeneralItems.FLUORITE.get(),1,2));

        //SAPPHIRE TO GEM
        add(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.get(), EternalGeneralItems.GEM_SAPPHIRE.get(), 1,2));
        add(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get(), EternalGeneralItems.GEM_SAPPHIRE.get(),1,2));

        //APATITE TO GEM
        add(EternalGeneralBlocks.APATITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.APATITE_ORE_BLOCK.get(), EternalGeneralItems.GEM_APATITE.get(), 1,2));
        add(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get(), EternalGeneralItems.GEM_APATITE.get(),1,2));

        //CINNABAR TO GEM
        add(EternalGeneralBlocks.CINNABAR_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.CINNABAR_ORE_BLOCK.get(), EternalGeneralItems.GEM_CINNABAR.get(), 1,2));
        add(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get(), EternalGeneralItems.GEM_CINNABAR.get(),1,2));

        //ONYX TO GEM
        add(EternalGeneralBlocks.ONYX_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.ONYX_ORE_BLOCK.get(), EternalGeneralItems.GEM_ONYX.get(), 1,2));
        add(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get(), EternalGeneralItems.GEM_ONYX.get(),1,2));

        //AMBER TO GEM
        add(EternalGeneralBlocks.AMBER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.AMBER_ORE_BLOCK.get(), EternalGeneralItems.GEM_AMBER.get(), 1,2));
        add(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get(), EternalGeneralItems.GEM_AMBER.get(),1,2));

        //NITER TO GEM
        add(EternalGeneralBlocks.NITER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.NITER_ORE_BLOCK.get(), EternalGeneralItems.GEM_NITER.get(), 1,2));
        add(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.get(), EternalGeneralItems.GEM_NITER.get(),1,2));

        //RUBY TO GEM
        add(EternalGeneralBlocks.RUBY_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.RUBY_ORE_BLOCK.get(), EternalGeneralItems.GEM_RUBY.get(), 1,2));
        add(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get(), EternalGeneralItems.GEM_RUBY.get(),1,2));

        //PERIDOT TO GEM
        add(EternalGeneralBlocks.PERIDOT_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.PERIDOT_ORE_BLOCK.get(), EternalGeneralItems.GEM_PERIDOT.get(), 1,2));
        add(EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get(), EternalGeneralItems.GEM_PERIDOT.get(),1,2));
        //OBSIDIAN ORE TO GEM
        add(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.get(), EternalGeneralItems.GEM_OBSIDIAN_SHARD.get(),1,2));
        //NECROTICARITE TO GEM
        add(EternalGeneralBlocks.NECROTICARITE_ORE_BLOCK.get(), block -> createMultipleOreDrops(EternalGeneralBlocks.NECROTICARITE_ORE_BLOCK.get(), EternalGeneralItems.GEM_NECROTICARITE.get(),1,2));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return EternalGeneralBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
