package net.radzratz.eternalores.util.loot_tables;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.neoforged.neoforge.common.conditions.ICondition;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import static net.minecraft.world.flag.FeatureFlags.REGISTRY;

public abstract class EOConditionalLootSubProvider extends BlockLootSubProvider {
    private final Map<ResourceKey<LootTable>, List<ICondition>> conditionMap = new LinkedHashMap<>();
    private List<ICondition> activeConditions = List.of();

    protected EOConditionalLootSubProvider(HolderLookup.Provider registries) {
        super(Set.of(), REGISTRY.allFlags(), registries);
    }

    protected void conditioned(List<ICondition> conditions, Runnable body) {
        List<ICondition> previous = this.activeConditions;
        this.activeConditions = conditions;
        body.run();
        this.activeConditions = previous;
    }

    @Override
    protected void add(@NotNull Block block, LootTable.@NotNull Builder builder) {
        super.add(block, builder);
        if (!activeConditions.isEmpty()) {
            conditionMap.put(block.getLootTable(), activeConditions);
        }
        // if no conditioned scope is active, the table is registered normally
        // without any condition entry
    }

    public Map<ResourceKey<LootTable>, List<ICondition>> getConditionMap() {
        return Collections.unmodifiableMap(conditionMap);
    }
}
