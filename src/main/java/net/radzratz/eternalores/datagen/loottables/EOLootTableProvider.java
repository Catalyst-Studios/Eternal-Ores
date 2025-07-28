package net.radzratz.eternalores.datagen.loottables;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
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
import net.radzratz.eternalores.block.EOBlockRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

import static net.radzratz.eternalores.util.EOMaterialHelper.*;
import static net.radzratz.eternalores.util.EOUtils.EO;

@SuppressWarnings("all")
public class EOLootTableProvider extends BlockLootSubProvider
{
    public EOLootTableProvider(HolderLookup.Provider registries) { super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries); }

    int a = 1;
    int b = 2;
    int c = 3;

    @Override
    protected void generate()
    {
        generate("andesite", "andesite", a, a);
        generate("cobble", "cobble", a, a);
        generate("dirt", "dirt", a, a);
        generate("diorite", "diorite", a, a);
        generate("granite", "granite", a, a);
        generate("gravel", "gravel", a, a);
        generate("sand", "sand", a, a);

        generate("catalyrium", "catalyrium", a, a);

        generate("aluminum", "raw_aluminum", a, b);
        generate("cobalt", "raw_cobalt", a, a);
        generate("lead", "raw_lead", a, b);
        generate("nickel", "raw_nickel", a, b);
        generate("osmium", "raw_osmium", a, b);
        generate("platinum", "raw_platinum", a, b);
        generate("plutonium", "raw_plutonium", a, b);
        generate("sulfur", "sulfur", a, b);
        generate("tin", "raw_tin", a, b);
        generate("uranium", "raw_uranium", a, b);
        generate("silver", "raw_silver", a, b);
        generate("zinc", "raw_zinc", a, c);
        generate("gallium", "raw_gallium", a, b);
        generate("iridium", "raw_iridium", a, b);
        generate("uraninite", "raw_uraninite", a, c);
        generate("tungsten", "raw_tungsten", a, c);
        generate("ardite", "raw_ardite", a, a);

        generate("sapphire", "gem_sapphire", a, b);
        generate("fluorite", "fluorite", a, b);
        generate("apatite", "gem_apatite", a, b);
        generate("cinnabar", "gem_cinnabar", a, b);
        generate("onyx", "gem_onyx", a, b);
        generate("amber", "gem_amber", a, b);
        generate("niter", "gem_niter", a, b);
        generate("ruby", "gem_ruby", a, b);
        generate("peridot", "gem_peridot", a, b);
        generate("necroticarite", "gem_necroticarite", a, b);
        generate("obsidian", "gem_obsidian", a, b);

        generate("nether_star", "nether_star", a, a);

        generate("bronze", "bronze", a, a);
        generate("britannia_silver", "britannia_silver", a, a);
        generate("silicon", "silicon", a, a);
        generate("pig_iron", "pig_iron", a, a);
        generate("shadowsteel", "shadowsteel", a, a);
        generate("nethersteel", "nethersteel", a, a);
        generate("wrought_iron", "wrought_iron", a, a);
        generate("cast_steel", "cast_steel", a, a);
        generate("cast_iron", "cast_iron", a, a);
        generate("rose_gold", "rose_gold", a, a);
        generate("pewter", "pewter", a, a);
        generate("titanium", "titanium", a, a);
        generate("blue_steel", "blue_steel", a, a);
        generate("brass", "brass", a, a);
        generate("constantan", "constantan", a, a);
        generate("graphite", "graphite", a, a);
        generate("steel", "steel", a, a);
        generate("enderium", "enderiun", a, a);
        generate("invar", "invar", a, a);
        generate("signalum", "signalum", a, a);
        generate("lumium", "lumium", a, a);
        generate("electrum", "electrum", a, a);
        generate("ultimatitanium", "ultimatitanium", a, a);
    }

    private void generate(String name, String itemDrop, int min, int max)
    {
        Block o = getBlock(name + ore);
        Block d = getBlock(slate + name + ore);
        Block n = getBlock(nether + name + ore);
        Block e = getBlock(end + name + ore);
        Block r = getBlock(raw + name + block);
        Block s = getBlock(name + block);
        for (int x = 1; x <= 9; x++)
        {
            String blockId = comp + name + "_" + x + "x";
            Block c = getBlock(blockId);
            if (c != null) dropSelf(c);
        }

        Item drop = getItem(itemDrop);

        if (o != null && drop != null) this.add(o, block -> oreDrops(block, drop, min, max));
        if (d != null && drop != null) this.add(d, block -> oreDrops(block, drop, min, max));
        if (n != null && drop != null) this.add(n, block -> oreDrops(block, drop, min, max));
        if (e != null && drop != null) this.add(e, block -> oreDrops(block, drop, min, max));

        if (r != null) this.dropSelf(r);
        if (s != null) this.dropSelf(s);
    }

    private Block getBlock(String name) { ResourceLocation rl = EO(name);return BuiltInRegistries.BLOCK.containsKey(rl) ? BuiltInRegistries.BLOCK.get(rl) : null; }

    private Item getItem(String name) { ResourceLocation rl = EO(name); return BuiltInRegistries.ITEM.containsKey(rl) ? BuiltInRegistries.ITEM.get(rl) : null; }

    protected LootTable.Builder oreDrops(Block pBlock, Item item, float minDrops, float maxDrops)
    {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() { return EOBlockRegistry.BLOCKS.getEntries().stream().map(Holder::value)::iterator; }
}
