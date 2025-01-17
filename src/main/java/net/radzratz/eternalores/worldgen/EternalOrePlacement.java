package net.radzratz.eternalores.worldgen;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class EternalOrePlacement {

    public static List<PlacementModifier> orePlacement(PlacementModifier pCountPlacement, PlacementModifier pHeightRange) {
        System.out.println("Loading Ore Placements");
        return List.of(pCountPlacement, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        System.out.println("Loading Common Ore Placement");
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        System.out.println("Loading Rare Ore Placement");
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }
}
