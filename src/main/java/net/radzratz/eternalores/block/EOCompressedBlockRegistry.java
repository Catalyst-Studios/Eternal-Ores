package net.radzratz.eternalores.block;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.util.config.EOCompressedBlockConfig;
import net.radzratz.eternalores.util.config.util.EOCompressedBlockEntry;
import net.radzratz.eternalores.util.config.util.EOCompressedBlockDefinitions;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

import static net.radzratz.eternalores.EternalOres.LOG;
import static net.radzratz.eternalores.block.EOBlockHelpers.EOCompressedSet.rgtrCompressed;

public class EOCompressedBlockRegistry {
    public static final DeferredRegister.Blocks EO_COMPRESSED_BLOCKS = DeferredRegister.createBlocks(EternalOres.id);

    private static final Map<String, EOBlockHelpers.EOCompressedSet> SETS = new LinkedHashMap<>();
    private static final Map<String, EOCompressedBlockEntry> RESOLVED = new LinkedHashMap<>();

    private static final float DEFAULT_HARDNESS = 2.0f;
    private static final EOBlockTier DEFAULT_TIER = EOBlockTier.T_STONE;

    static {
        Set<String> seenKeys = new HashSet<>();

        for (EOCompressedBlockEntry e : EOCompressedBlockDefinitions.load()) {
            String namespace = e.namespace();
            String blockId = e.blockId();

            if (!ModList.get().isLoaded(namespace)) {
                LOG.warn("[EOCompressedBlockRegistry] Skipping '{}' - required mod '{}' is not loaded.", e.id(), namespace);
                continue;
            }

            String key = seenKeys.add(blockId) ? blockId : blockId + "_" + namespace;
            if (!key.equals(blockId)) {
                LOG.info("[EOCompressedBlockRegistry] Duplicate blockId '{}' from '{}' — registering as '{}'.", blockId, namespace, key);
            }

            ResourceLocation origLoc = ResourceLocation.fromNamespaceAndPath(namespace, blockId);
            Supplier<SoundType> soundSupplier = () -> new DeferredSoundType(
                    1.0f, 1.0f,
                    () -> resolveOriginalSoundType(origLoc).getBreakSound(),
                    () -> resolveOriginalSoundType(origLoc).getStepSound(),
                    () -> resolveOriginalSoundType(origLoc).getPlaceSound(),
                    () -> resolveOriginalSoundType(origLoc).getHitSound(),
                    () -> resolveOriginalSoundType(origLoc).getFallSound()
            );

            Supplier<Boolean> noOcclusionSupplier = () -> Boolean.TRUE.equals(e.noOcclusion());

            EOCompressedBlockConfig.CompressedSetConfig cfg = EOCompressedBlockConfig.COMP_CFG.get(key);
            EOBlockHelpers.EOCompressedSet set = rgtrCompressed(key, DEFAULT_HARDNESS, soundSupplier, noOcclusionSupplier, DEFAULT_TIER, cfg);

            SETS.put(key, set);
            RESOLVED.put(key, e);
        }

        LOG.info("[EOCompressedBlockRegistry] Registered {} compressed block sets.", SETS.size());
    }

    public static EOBlockHelpers.EOCompressedSet get(String key) {
        return SETS.get(key);
    }

    public static Map<String, EOBlockHelpers.EOCompressedSet> getAll() {
        return SETS;
    }

    public static EOCompressedBlockEntry getEntry(String key) {
        return RESOLVED.get(key);
    }

    @SuppressWarnings("deprecation")
    private static SoundType resolveOriginalSoundType(ResourceLocation origLoc) {
        Block original = BuiltInRegistries.BLOCK.get(origLoc);
        return original != Blocks.AIR ? original.defaultBlockState().getSoundType() : SoundType.STONE;
    }

    public static void rgtr(IEventBus bus) {
        EO_COMPRESSED_BLOCKS.register(bus);
    }
}