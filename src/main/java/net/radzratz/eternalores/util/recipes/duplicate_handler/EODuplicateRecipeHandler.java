package net.radzratz.eternalores.util.recipes.duplicate_handler;

import com.google.gson.JsonObject;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.config.EODuplicateRecipeConfig;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static net.radzratz.eternalores.EternalOres.LOG;
import static net.radzratz.eternalores.util.EOUtils.*;

public class EODuplicateRecipeHandler {
    private record RecipeInfo(RecipeHolder<?> holder, Set<Item> input, Set<Item> output) {
        boolean isEO() {
            return holder.id().getNamespace().equals(EternalOres.id);
        }
    }

    private record RecipeGroup(String modId, Supplier<Boolean> enabled, List<String> staticIds, List<String> templatedIds) {
        RecipeGroup(String modId, Supplier<Boolean> enabled, List<String> staticIds) {
            this(modId, enabled, staticIds, List.of());
        }
    }

    public static String typeKeyOf(RecipeType<?> type) {
        var key = BuiltInRegistries.RECIPE_TYPE.getKey(type);
        return key != null ? key.toString() : type.toString();
    }

    public static final Set<String> TYPES = Set.of(
            "minecraft:smelting", "minecraft:blasting",
            "immersiveengineering:crusher", "immersiveengineering:arc_furnace", "immersiveengineering:metal_press", "immersiveengineering:alloy",
            "oritech:grinder", "oritech:pulverizer", "oritech:refinery", "oritech:atomic_forge", "oritech:centrifuge", "oritech:centrifuge_fluid", "oritech:foundry",
            "integrateddynamics:squeezer", "integrateddynamics:mechanical_squeezer",
            "mekanism:stamping", // to whoever is reading this, yes ik mekanism doesn't have a stamping recipe type, but t'was registered in mekmm mod like that xd
            "railcraft:crusher",
            "enderio:sag_milling", "enderio:alloy_smelting",
            "actuallyadditions:crushing",
            "energizedpower:alloy_furnace", "energizedpower:pulverizer", "energizedpower:metal_press",
            "create:splashing", "create:mixing", "create:crushing"
    );

    public static List<String> MATERIALS = List.of(
            "copper", "iron", "gold", "platinum", "lead", "osmium", "electrum", "netherite", "coal", "lapis", "fluorite",
            "aluminum", "tin", "silver", "nickel", "zinc", "uranium", "biosteel", "obsidian", "quartz", "emerald",
            "steel", "redstone", "certus", "fluix", "prismarine", "bronze", "charcoal", "diamond", "gravel", "electrum",
            "constantan", "brass", "cobalt", "ardite", "tungsten", "rose_gold", "invar"
    );

    private static final List<RecipeGroup> GROUPS = List.of(
            new RecipeGroup(ORITECH, EODuplicateRecipeConfig.oritechRecipes, List.of(
                    "biosteel_ingot_from_smelting_biosteel_dust",
                    "biosteel_ingot_from_blasting_biosteel_dust",
                    "crafting/alloy/steel",
                    "compat/energizedpower/alloyfurance/biosteel",
                    "compat/immersiveengineering/alloying/biosteel",
                    "compat/immersiveengineering/arcalloying/biosteel",
                    "compat/enderio/alloy/biosteel",
                    "mixing/compat/create/biosteel",
                    "foundry/alloy/biosteel",
                    "crafting/alloy/electrum",
                    "foundry/alloy/electrum",
                    "compat/energizedpower/alloyfurance/oritech_electrum",
                    "compat/immersiveengineering/alloying/electrum",
                    "compat/immersiveengineering/arcalloying/electrum",
                    "compat/mekanism/infusing/electrum_dust",
                    "compat/mekanism/infusing/biosteel_dust",
                    "mixing/compat/create/electrum",
                    "pulverizer/pearl_enderic",
                    "pulverizer/recycle/4_quartz_dust",
                    "pulverizer/bone",
                    "grinder/pearl_enderic",
                    "grinder/stone_enderic",
                    "grinder/bone",
                    "foundry/alloy/compat/immersiveengineering/constantan",
                    "foundry/alloy/compat/mekanism/bronze",
                    "foundry/alloy/compat/create/brass",
                    "foundry/alloy/steel",
                    "refinery/compat/energizedpowerrawsheol/tin",
                    "refinery/compat/immersiveengineering/rawsheol/lead",
                    "centrifuge/fluid/compat/clumpwet/crushed_uranium",
                    "centrifuge/fluid/clumpacid/nickel",
                    "centrifuge/fluid/clumpacid/gold",
                    "centrifuge/fluid/clumpacid/iron",
                    "centrifuge/fluid/clumpacid/platinum",
                    "centrifuge/fluid/clumpacid/copper",
                    "centrifuge/fluid/clump/nickel",
                    "centrifuge/fluid/clump/gold",
                    "centrifuge/fluid/clump/iron",
                    "centrifuge/fluid/clump/platinum",
                    "centrifuge/fluid/clump/copper",
                    "centrifuge/fluid/compat/mekanism/clump/tin",
                    "centrifuge/fluid/compat/mekanism/clump/lead",
                    "centrifuge/fluid/compat/create/clump/zinc",
                    "centrifuge/fluid/compat/create/clumpacid/zinc",
                    "centrifuge/fluid/compat/mekanism/clumpacid/osmium",
                    "centrifuge/fluid/compat/mekanism/clump/osmium",
                    "centrifuge/fluid/compat/mekanism/clumpacid/lead",
                    "centrifuge/fluid/compat/mekanism/clump/lead",
                    "centrifuge/fluid/compat/mekanism/clumpacid/tin",
                    "centrifuge/fluid/compat/mekanism/clump/tin"
            )),
            new RecipeGroup(MEKANISM, EODuplicateRecipeConfig.mekanismRecipes, List.of(
                    "crushing/prismarine/shard_from_brick",
                    "crushing/prismarine/shard_from_block",
                    "crushing/bone",
                    "crushing/stone/to_cobblestone",
                    "crushing/cobblestone_to_gravel",
                    "crushing/flint_to_gunpowder",
                    "compat/ae2/decorative/certus_quartz/crushing/block_to_chiseled_block",
                    "processing/quartz/from_dust",
                    "enriching/enriched/gold",
                    "enriching/enriched/tin",
                    "compat/ae2/certus_quartz_dust_to_silicon"
            ), List.of(
                    "processing/{mat}/slurry/clean",
                    "processing/{mat}/slurry/dirty/from_raw_ore",
                    "processing/{mat}/slurry/dirty/from_raw_block",
                    "processing/{mat}/slurry/dirty/from_ore"
            )),
            new RecipeGroup(MEKANISM_MORE_MACHINE, EODuplicateRecipeConfig.mekanismMoreMachineRecipes,
                    List.of(), List.of(
                    "compat/immersiveengineering/stamper/{mat}_plate"
            )),
            new RecipeGroup(CREATE, EODuplicateRecipeConfig.createRecipes, List.of(
                    "crushing/tuff",
                    "crushing/tuff_recycling",
                    "crushing/ochrum"
            )),
            new RecipeGroup(CREATE_CRAFTS_ADDITIONS, EODuplicateRecipeConfig.createCraftsRecipes, List.of(
                    "charging/electrify_gold_ingot",
                    "charging/electrify_gold_rod",
                    "charging/electrify_gold_wire",
                    "charging/electrify_gold_sheet",
                    "charging/electrify_gold_nugget",
                    "crushing/ochrum_recycling",
                    "crushing/tuff_recycling"
            )),
            new RecipeGroup(IMMERSIVE_ENGINEERING, EODuplicateRecipeConfig.immersiveEngineeringRecipes, List.of(
                    "crafting/gunpowder_from_dusts",
                    "crusher/bone_meal"
            )),
            new RecipeGroup(ENDERIO, EODuplicateRecipeConfig.enderIORecipes, List.of(
                    "sag_milling/bone"
            )),
            new RecipeGroup(RAILCRAFT, EODuplicateRecipeConfig.railcraftRecipes, List.of(
                    "crusher/crushing_prismarine",
                    "crusher/crushing_prismarine_bricks",
                    "crusher/crushing_dark_prismarine",
                    "crusher/crushing_bone",
                    "crusher/crushing_quartz_block"
            ), List.of(
                    "rolling/{mat}_plate"
            )),
            new RecipeGroup(ENERGIZED_POWER, EODuplicateRecipeConfig.energizedPowerRecipes, List.of(
                    "alloy_furnace/steel_ingot",
                    "pulverizer/bone_meal_from_pulverizer_bones"
            )),
            new RecipeGroup(ACTUALLY_ADDITIONS, EODuplicateRecipeConfig.actuallyAdditionsRecipes, List.of(
                    "crushing/bone"
            ))
    );

    public static void runDuplicateHandlers(RecipeManager recipeManager, RegistryAccess access) {
        LOG.info("[EOCommonEvents] Recipe (re)load triggered - running duplicate handlers...");

        Set<String> recipesToRemove = new HashSet<>();
        for (RecipeGroup group : GROUPS) {
            if (group.enabled().get()) collect(recipesToRemove, group);
        }

        List<RecipeHolder<?>> afterBasic = recipeManager.getRecipes().stream()
                .filter(h -> !recipesToRemove.contains(h.id().toString()))
                .collect(Collectors.toList());

        LOG.info("[EOCommonEvents] Basic: removed {} recipes.", recipeManager.getRecipes().size() - afterBasic.size());
        recipeManager.replaceRecipes(afterBasic);

        if (EODuplicateRecipeConfig.enabled.get()) {
            List<RecipeHolder<?>> resolved = resolve(recipeManager, access);
            LOG.info("[EOCommonEvents] Smart: {} recipes remaining after resolution.", resolved.size());
            recipeManager.replaceRecipes(resolved);
        }

        EORecipeCache.clear();
    }

    private static void collect(Set<String> list, RecipeGroup group) {
        String prefix = group.modId() + ":";
        for (String path : group.staticIds()) {
            list.add(prefix + path);
        }
        for (String template : group.templatedIds()) {
            for (String mat : MATERIALS) {
                list.add(prefix + template.replace("{mat}", mat));
            }
        }
    }

    public static List<RecipeHolder<?>> resolve(RecipeManager recipeManager, RegistryAccess access) {
        List<RecipeHolder<?>> all = new ArrayList<>(recipeManager.getRecipes());
        Set<String> toRemove = new HashSet<>();
        boolean verbose = EODuplicateRecipeConfig.verboseLogging.get();
        int notWhitelisted = 0;
        int skippedNoInput = 0;

        Map<String, List<RecipeHolder<?>>> byType = new LinkedHashMap<>();
        for (RecipeHolder<?> holder : all) {
            String typeKey = typeKeyOf(holder.value().getType());
            if (!TYPES.contains(typeKey)) {
                notWhitelisted++;
                continue;
            }
            byType.computeIfAbsent(typeKey, k -> new ArrayList<>()).add(holder);
        }

        for (var typeEntry : byType.entrySet()) {
            skippedNoInput += resolveType(typeEntry.getKey(), typeEntry.getValue(), access, toRemove, verbose);
        }

        LOG.info("[EOSmartDuplicateHandler] {} recipes outside the whitelist (untouched), {} whitelisted but skipped (no resolvable input item found).",
                notWhitelisted, skippedNoInput);

        if (toRemove.isEmpty()) {
            LOG.info("[EOSmartDuplicateHandler] No conflicting recipes found.");
            return all;
        }

        List<RecipeHolder<?>> filtered = all.stream()
                .filter(h -> !toRemove.contains(h.id().toString()))
                .collect(Collectors.toList());

        LOG.info("[EOSmartDuplicateHandler] Removed {} conflicting recipes.", toRemove.size());
        return filtered;
    }

    private static int resolveType(String typeKey, List<RecipeHolder<?>> recipesOfType,
                                   RegistryAccess access, Set<String> toRemove, boolean verbose) {
        List<RecipeInfo> infos = new ArrayList<>();
        int skipped = 0;

        for (RecipeHolder<?> holder : recipesOfType) {
            JsonObject raw = EORecipeCache.get(holder.id());
            if (raw == null) {
                skipped++;
                continue;
            }
            Set<Item> input = EORawMaterialExtractor.extractInputItems(raw);
            if (input.isEmpty()) {
                skipped++;
                if (verbose) LOG.warn("[EOSmartDuplicateHandler] no resolvable input item for id={}, type={}", holder.id(), typeKey);
                continue;
            }
            Set<Item> output = EORawMaterialExtractor.extractOutputItems(raw);
            infos.add(new RecipeInfo(holder, input, output));
        }

        List<RecipeInfo> mineAll = infos.stream().filter(RecipeInfo::isEO).toList();
        List<RecipeInfo> foreignAll = infos.stream().filter(i -> !i.isEO()).toList();
        if (mineAll.isEmpty() || foreignAll.isEmpty()) return skipped;

        Map<Item, List<RecipeInfo>> byInputItem = new HashMap<>();
        for (RecipeInfo info : infos) {
            for (Item item : info.input()) {
                byInputItem.computeIfAbsent(item, k -> new ArrayList<>()).add(info);
            }
        }

        EODuplicateRecipeConfig.Mode mode = EODuplicateRecipeConfig.mode.get();

        for (RecipeInfo f : foreignAll) {
            Set<RecipeInfo> sharingInput = new LinkedHashSet<>();
            for (Item item : f.input()) {
                List<RecipeInfo> candidates = byInputItem.get(item);
                if (candidates != null) sharingInput.addAll(candidates);
            }
            sharingInput.remove(f);
            if (sharingInput.isEmpty()) continue; // nothing shares this input at all, not our concern

            RecipeInfo winner;

            if (sharingInput.size() == 1) {
                RecipeInfo only = sharingInput.iterator().next();
                winner = only.isEO() ? only : null;
            } else {
                winner = sharingInput.stream()
                        .filter(RecipeInfo::isEO)
                        .filter(m -> !Collections.disjoint(m.output(), f.output()))
                        .findFirst().orElse(null);
            }

            if (winner == null) {
                if (verbose) {
                    LOG.info("[EOSmartDuplicateHandler] Skipping {} - input is shared by {} other recipe(s) in {} and none of ours matches its output, too ambiguous.",
                            f.holder().id(), sharingInput.size(), typeKey);
                }
                continue;
            }

            boolean removeOther = switch (mode) {
                case ALWAYS_EO -> true;
                case PREFER_HIGHER_YIELD -> getCount(winner.holder(), access) >= getCount(f.holder(), access);
                case PREFER_LOWER_YIELD -> getCount(winner.holder(), access) <= getCount(f.holder(), access);
            };

            if (removeOther) {
                toRemove.add(f.holder().id().toString());
                if (verbose) {
                    LOG.info("[EOSmartDuplicateHandler] Removing conflicting recipe {} in favor of {}", f.holder().id(), winner.holder().id());
                }
            } else if (verbose) {
                LOG.info("[EOSmartDuplicateHandler] Keeping {} - yield rule didn't favor {}", f.holder().id(), winner.holder().id());
            }
        }

        return skipped;
    }

    private static int getCount(RecipeHolder<?> holder, RegistryAccess access) {
        try {
            ItemStack result = holder.value().getResultItem(access);
            return result.isEmpty() ? 0 : result.getCount();
        } catch (Exception e) {
            return 0;
        }
    }
}