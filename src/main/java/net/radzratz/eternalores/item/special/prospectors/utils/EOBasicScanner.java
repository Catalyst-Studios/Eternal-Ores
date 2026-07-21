package net.radzratz.eternalores.item.special.prospectors.utils;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.radzratz.eternalores.util.config.EOToolsConfig;

import static net.radzratz.eternalores.item.special.prospectors.utils.EOProspectorUtils.resolveOreTag;

public class EOBasicScanner {
    public static ScanResult scanForOres(Level level, BlockPos center, String material, int radius) {
        if (EOToolsConfig.CFG.prospectorListAndColors.getBlacklist().contains(material)) {
            return ScanResult.empty(center.getY());
        }

        int oreCount = 0;
        BlockPos nearestOre = null;
        double nearestDistanceSq = Double.MAX_VALUE;

        for (int dx = -radius; dx <= radius; dx++) {
            for (int dy = -radius; dy <= radius; dy++) {
                for (int dz = -radius; dz <= radius; dz++) {

                    if ((dx * dx + dy * dy + dz * dz) > (radius * radius)) continue;

                    BlockPos checkPos = center.offset(dx, dy, dz);

                    if (checkPos.getY() < level.getMinBuildHeight() ||
                            checkPos.getY() > level.getMaxBuildHeight()) continue;

                    if (level.getBlockState(checkPos).is(resolveOreTag(material))) {
                        oreCount++;
                        double distSq = center.distSqr(checkPos);
                        if (distSq < nearestDistanceSq) {
                            nearestDistanceSq = distSq;
                            nearestOre = checkPos.immutable();
                        }
                    }
                }
            }
        }

        int nearestDistanceBlocks = nearestOre != null
                ? (int) Math.sqrt(nearestDistanceSq)
                : -1;

        return new ScanResult(oreCount, nearestDistanceBlocks, center.getY());
    }

    public record ScanResult(int oreCount, int nearestDistance, int playerY) {
        public static ScanResult empty(int playerY) {
            return new ScanResult(0, -1, playerY);
        }

        public boolean foundOres() {
            return oreCount > 0;
        }

        @Override
        public String toString() {
            if (!foundOres()) return "No ores found.";
            return String.format("%d ore(s) found - nearest: %d blocks", oreCount, nearestDistance);
        }
    }
}
