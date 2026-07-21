package net.radzratz.eternalores.datagen.loot_tables;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.radzratz.eternalores.block.types.EOCompressedBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries;
import net.radzratz.eternalores.util.compat.iron_furnaces.furnaces.EOIFurnacesFurnaceBlock;
import net.radzratz.eternalores.util.loot_tables.EOConditionalLootSubProvider;
import net.radzratz.eternalores.util.compat.geore.GEOreRegistry;
import net.radzratz.eternalores.util.compat.geore.blocks.GEOreBuddingBlock;
import net.radzratz.eternalores.util.compat.geore.blocks.GEOreClusterBlock;
import net.radzratz.eternalores.util.compat.geore.blocks.GEOreShardBlock;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOSetRegistries.EO_BLOCKS;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.allGeOreBlockEntries;
import static net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries.allIronFurnacesBlockEntries;

public class EOBlockLootTableProvider extends EOConditionalLootSubProvider {
    private static final List<ICondition> GEORE = List.of(GEORE_MOD);
    private static final List<ICondition> IRON_FURNACE = List.of(IRON_FURNACES_MOD);

    public EOBlockLootTableProvider(HolderLookup.Provider lookup) {
        super(lookup);
    }

    @Override
    protected void generate() {
        allBlockEntries().forEach(entry -> {
            Block block = entry.value();

            if (block instanceof EOCompressedBlock) return;

            if (block instanceof EOreBlock oreBlock) {
                Item drop = oreBlock.getDrops().get();
                int min = oreBlock.getMinDrop();
                int max = oreBlock.getMaxDrop();

                this.add(block, b -> crteDrops(b, drop, min, max));
            } else {
                this.dropSelf(block);
            }
        });

        if (georeMod) {
            conditioned(GEORE, () -> allGeOreBlockEntries().forEach(entry -> {
                Block block = entry.value();

                switch (block) {
                    case GEOreBuddingBlock ignoredGeOreBuddingBlock -> this.add(block, noDrop());
                    case GEOreShardBlock ignoredGeOreShardBlock -> this.dropSelf(block);
                    case GEOreClusterBlock cluster -> {
                        Item drop = cluster.getDrops().get();
                        this.add(block, b -> crteDrops(b, drop, 1, 2));
                    }
                    case AmethystClusterBlock ignoredAmethystClusterBlock -> this.add(block, createSilkTouchOnlyTable(block));
                    default -> {
                    }
                }
            }));
        }

        if (ironFurnaceMod) {
            conditioned(IRON_FURNACE, () -> allIronFurnacesBlockEntries().forEach(entry -> {
                Block block = entry.value();

                if (block instanceof EOIFurnacesFurnaceBlock) {
                    this.add(block, createNameableBlockEntityTable(block));
                }
            }));
        }
    }

    private LootTable.Builder crteDrops(Block ore, Item item, int min, int max) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        var count = SetItemCountFunction.setCount(UniformGenerator.between(min, max));
        var countBonus = ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE));

        return this.createSilkTouchDispatchTable(ore, LootItem.lootTableItem(item).apply(count).apply(countBonus));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        Stream<Block> blocks = EO_BLOCKS.getEntries().stream().map(Holder::value);

        if (georeMod) {
            blocks = Stream.concat(blocks, GEOreRegistry.GEORE_BLOCKS.getEntries().stream().map(Holder::value));
        }

        if (ironFurnaceMod) {
            blocks = Stream.concat(blocks, EOIronFurnaceRegistries.FURNACE_BLOCK.getEntries().stream().map(Holder::value));
        }

        return blocks::iterator;
    }
}
