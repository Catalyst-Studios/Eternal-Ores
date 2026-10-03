package net.radzratz.eternalores.util.recipes.duplicate_handler;

import com.google.gson.JsonObject;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.material.Fluid;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.EOLoggers;
import net.radzratz.eternalores.util.config.EODuplicateRecipeConfig;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static net.radzratz.eternalores.EternalOres.LOG;
import static net.radzratz.eternalores.util.EOUtils.*;

public class EODuplicateRecipeHandler {
    private static final Logger DUP_LOG = EOLoggers.get("EOSmartDuplicateHandler", "duplicates");

    private record RecipeInfo(RecipeHolder<?> holder, Set<Item> inputItems, Set<Fluid> inputFluids, Set<Item> outputItems, Set<Fluid> outputFluids) {
        boolean isEO() {
            return holder.id().getNamespace().equals(EternalOres.id);
        }
    }

    private record OutputTags(Set<TagKey<Item>> itemTags, Set<TagKey<Fluid>> fluidTags) {}

    private record RecipeGroup(String modId, Supplier<Boolean> enabled, List<String> staticIds, List<String> templatedIds) {
        RecipeGroup(String modId, Supplier<Boolean> enabled, List<String> staticIds) {
            this(modId, enabled, staticIds, List.of());
        }
    }

    public static String typeKeyOf(RecipeType<?> type) {
        var key = BuiltInRegistries.RECIPE_TYPE.getKey(type);
        return key != null ? key.toString() : type.toString();
    }

    private static final double CATALYST_FREQUENCY_THRESHOLD = 0.3;
    private static final int CATALYST_MIN_RECIPES = 4;

    public static final Set<String> TYPES = Set.of(
            // reminder to;
            // Check every single recipe type on its recipe type registry, not over them .json files
            // as I have been trolled two times already, which is weird that it happened 2 times already
            "minecraft:smelting", "minecraft:blasting",
            "immersiveengineering:crusher", "immersiveengineering:arc_furnace", "immersiveengineering:metal_press", "immersiveengineering:alloy",
            "oritech:grinder", "oritech:pulverizer", "oritech:refinery", "oritech:atomic_forge", "oritech:centrifuge", "oritech:centrifuge_fluid", "oritech:foundry",
            "integrateddynamics:squeezer", "integrateddynamics:mechanical_squeezer",
            "mekanism:stamping", // to whoever is reading this, yes ik mekanism doesn't have a stamping recipe type, but t'was registered in mekmm mod like that xd
            "railcraft:crushing", // similar to mekanism:stamping, this time the mod id is correct but not the type name, its crushing, not crusher ffs
            "excessive_utilities:crusher",
            "enderio:sag_milling", "enderio:alloy_smelting",
            "actuallyadditions:crushing",
            "energizedpower:alloy_furnace", "energizedpower:pulverizer", "energizedpower:metal_press",
            "create:splashing", "create:mixing", "create:crushing",
            "hephaestus:melting", "hephaestus:casting_table", "hephaestus:casting_basin", "hephaestus:alloying",
            "slag:alloying", "slag:basin_casting", "slag:table_casting", "slag:melting"
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
                    "biosteel_blockblockinv",
                    "crafting/alloy/steel",
                    "compat/energizedpower/alloyfurnace/biosteel",
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
                    "pulverizer/compat/enderio/dust/lapis",
                    "pulverizer/dyes/blue",
                    "grinder/pearl_enderic",
                    "grinder/stone_enderic",
                    "grinder/bone",
                    "grinder/biosteel",
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
                    "compat/ae2/certus_quartz_dust_to_silicon",
                    "compat/ae2/sand_to_silicon"
            ), List.of(
                    "processing/{mat}/slurry/clean",
                    "processing/{mat}/slurry/dirty/from_raw_ore",
                    "processing/{mat}/slurry/dirty/from_raw_block",
                    "processing/{mat}/slurry/dirty/from_ore"
            )),
            new RecipeGroup(MEKANISM_MORE_MACHINE, EODuplicateRecipeConfig.mekanismMoreMachineRecipes,
                    List.of(), List.of(
                    "compat/immersiveengineering/stamper/{mat}_plate",
                    "compat/immersiveengineering/stamper/{mat}_stick",
                    "compat/immersiveengineering/stamper/{mat}_rod"
            )),
            new RecipeGroup(CREATE, EODuplicateRecipeConfig.createRecipes, List.of(
                    "crushing/tuff",
                    "crushing/tuff_recycling",
                    "crushing/ochrum",
                    "crushing/deepslate_zinc_ore",
                    "crushing/zinc_ore",
                    "splashing/immersiveengineering/crushed_raw_nickel",
                    "splashing/immersiveengineering/crushed_raw_uranium"
            )),
            new RecipeGroup(CREATE_CRAFTS_ADDITIONS, EODuplicateRecipeConfig.createCraftsRecipes, List.of(
                    "charging/electrify_gold_ingot",
                    "charging/electrify_gold_rod",
                    "charging/electrify_gold_wire",
                    "charging/electrify_gold_sheet",
                    "charging/electrify_gold_nugget",
                    "compat/immersiveengineering/constantan",
                    "mixing/electrum",
                    "crushing/ochrum_recycling",
                    "crushing/tuff_recycling"
            )),
            new RecipeGroup(IMMERSIVE_ENGINEERING, EODuplicateRecipeConfig.immersiveEngineeringRecipes, List.of(
                    "crafting/gunpowder_from_dusts",
                    "crusher/bone_meal",
                    "arcfurnace/dust_tungsten",
                    "arcfurnace/ore_tungsten",
                    "arcfurnace/raw_block_tungsten",
                    "arcfurnace/raw_ore_tungsten",
                    "arcfurnace/steel"
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
                    "rolling/{mat}_plate",
                    "crusher/crushing_raw_{mat}_block"
            )),
            new RecipeGroup(ENERGIZED_POWER, EODuplicateRecipeConfig.energizedPowerRecipes, List.of(
                    "alloy_furnace/steel_ingot",
                    "pulverizer/bone_meal_from_pulverizer_bones"
            )),
            new RecipeGroup(ACTUALLY_ADDITIONS, EODuplicateRecipeConfig.actuallyAdditionsRecipes, List.of(
                    "crushing/bone"
            ))
    );

    public static void runDuplicateHandlers(RecipeManager recipeManager, RegistryAccess ignoredAccess) {
        LOG.info("[EOCommonEvents] Recipe (re)load triggered - running duplicate handlers... (details at logs/etrnalores/duplicates.log)");
        DUP_LOG.info("========== Recipe (re)load triggered ==========");

        List<RecipeHolder<?>> all = new ArrayList<>(recipeManager.getRecipes());
        Set<ResourceLocation> toRemove = new HashSet<>();

        for (RecipeGroup group : GROUPS) {
            if (group.enabled().get()) collect(toRemove, group);
        }
        DUP_LOG.info("[Basic] marked {} recipes for removal.", toRemove.size());

        if (EODuplicateRecipeConfig.enabled.get()) {
            resolveAll(all, toRemove);
        }

        List<RecipeHolder<?>> result = toRemove.isEmpty() ? all : all.stream()
                .filter(h -> !toRemove.contains(h.id()))
                .collect(Collectors.toList());

        LOG.info("[EOCommonEvents] {} recipes remaining after duplicate handling ({} removed total). Details at: logs/eternalores/duplicates.log",
                result.size(), all.size() - result.size());
        LOG.info("========== {} recipes remaining after duplicate handling ({} removed total) ==========",
                result.size(), all.size() - result.size());
        recipeManager.replaceRecipes(result);

        EORecipeCache.clear();
    }

    private static void collect(Set<ResourceLocation> list, RecipeGroup group) {
        for (String path : group.staticIds()) {
            list.add(ResourceLocation.fromNamespaceAndPath(group.modId(), path));
        }
        for (String template : group.templatedIds()) {
            for (String mat : MATERIALS) {
                list.add(ResourceLocation.fromNamespaceAndPath(group.modId(), template.replace("{mat}", mat)));
            }
        }
    }

    private static void resolveAll(List<RecipeHolder<?>> all, Set<ResourceLocation> toRemove) {
        boolean verbose = EODuplicateRecipeConfig.verboseLogging.get();
        int notWhitelisted = 0;

        Map<String, List<RecipeHolder<?>>> byType = new LinkedHashMap<>();
        for (RecipeHolder<?> holder : all) {
            if (toRemove.contains(holder.id())) continue; // already marked by the static groups
            String typeKey = typeKeyOf(holder.value().getType());
            if (!TYPES.contains(typeKey)) {
                notWhitelisted++;
                continue;
            }
            byType.computeIfAbsent(typeKey, k -> new ArrayList<>()).add(holder);
        }

        int totalRemoved = 0;
        for (var typeEntry : byType.entrySet()) {
            totalRemoved += resolveType(typeEntry.getKey(), typeEntry.getValue(), toRemove, verbose);
        }

        DUP_LOG.info("[Smart] {} recipes outside the whitelist (untouched), {} conflicting recipes removed across {} whitelisted type(s).",
                notWhitelisted, totalRemoved, byType.size());
    }

    private static int resolveType(String typeKey, List<RecipeHolder<?>> recipesOfType, Set<ResourceLocation> toRemove, boolean verbose) {
        List<RecipeInfo> eoList = new ArrayList<>();
        List<RecipeInfo> foreignList = new ArrayList<>();
        int skippedNoInput = 0;

        for (RecipeHolder<?> holder : recipesOfType) {
            JsonObject raw = EORecipeCache.get(holder.id());
            if (raw == null) continue;

            EORawMaterialExtractor.Extracted in = EORawMaterialExtractor.extractInputs(raw);
            if (in.isEmpty()) {
                skippedNoInput++;
                if (verbose) DUP_LOG.warn("[{}] no resolvable input item/fluid for id={}", typeKey, holder.id());
                continue;
            }
            EORawMaterialExtractor.Extracted out = EORawMaterialExtractor.extractOutputs(raw);
            RecipeInfo info = new RecipeInfo(holder, in.items(), in.fluids(), out.items(), out.fluids());
            (info.isEO() ? eoList : foreignList).add(info);
        }

        if (eoList.isEmpty()) {
            if (verbose) DUP_LOG.info("[{}] no EternalOres recipes in this type - nothing to compare against, skipping.", typeKey);
            return 0;
        }
        if (foreignList.isEmpty()) return 0;

        List<RecipeInfo> combined = new ArrayList<>(eoList.size() + foreignList.size());
        combined.addAll(eoList);
        combined.addAll(foreignList);
        if (combined.size() >= CATALYST_MIN_RECIPES) {
            Map<Item, Integer> itemFreq = new HashMap<>();
            Map<Fluid, Integer> fluidFreq = new HashMap<>();
            for (RecipeInfo r : combined) {
                for (Item item : r.inputItems()) itemFreq.merge(item, 1, Integer::sum);
                for (Fluid fluid : r.inputFluids()) fluidFreq.merge(fluid, 1, Integer::sum);
            }
            int threshold = (int) Math.ceil(combined.size() * CATALYST_FREQUENCY_THRESHOLD);
            Set<Item> catalystItems = itemFreq.entrySet().stream()
                    .filter(e -> e.getValue() >= threshold).map(Map.Entry::getKey).collect(Collectors.toSet());
            Set<Fluid> catalystFluids = fluidFreq.entrySet().stream()
                    .filter(e -> e.getValue() >= threshold).map(Map.Entry::getKey).collect(Collectors.toSet());

            if (!catalystItems.isEmpty() || !catalystFluids.isEmpty()) {
                if (verbose) {
                    DUP_LOG.info("[{}] Auto-detected catalyst(s) present in >= {}% of this type's recipes, stripping from input matching: items={} fluids={}",
                            typeKey, (int) (CATALYST_FREQUENCY_THRESHOLD * 100), itemIds(catalystItems), fluidIds(catalystFluids));
                }
                eoList = stripCatalysts(eoList, catalystItems, catalystFluids, typeKey, verbose);
                foreignList = stripCatalysts(foreignList, catalystItems, catalystFluids, typeKey, verbose);
                if (eoList.isEmpty() || foreignList.isEmpty()) return 0;
            }
        }

        // precompute each EO recipe's output tags (item + fluid, separately) once per type
        Map<ResourceLocation, OutputTags> eoOutputTagsCache = new HashMap<>();
        for (RecipeInfo m : eoList) {
            eoOutputTagsCache.put(m.holder().id(), new OutputTags(itemTagsOf(m.outputItems()), fluidTagsOf(m.outputFluids())));
        }

        int removed = 0, removedInputOnly = 0, ambiguousExact = 0, ambiguousTag = 0, noMatch = 0;

        for (RecipeInfo f : foreignList) {
            // candidate pool = EO recipes that share any input item OR fluid with f
            // deliberately loose (not containsAll) so catalysts/additives
            // don't prevent a match - the output check below is what actually
            // disambiguate these
            List<RecipeInfo> inputCandidates = eoList.stream()
                    .filter(m -> sharesAny(m.inputItems(), m.inputFluids(), f.inputItems(), f.inputFluids()))
                    .toList();

            if (inputCandidates.isEmpty()) {
                noMatch++;
                if (verbose) DUP_LOG.info("[{}] Skipping {} - no EternalOres recipe shares any input item/fluid.", typeKey, f.holder().id());
                continue;
            }

            // among those, prefer an EO recipe whose output items/fluids exactly overlap f's output
            List<RecipeInfo> exactOutputMatches = inputCandidates.stream()
                    .filter(m -> sharesAny(m.outputItems(), m.outputFluids(), f.outputItems(), f.outputFluids()))
                    .toList();

            RecipeInfo winner;
            String matchKind;

            if (exactOutputMatches.size() == 1) {
                winner = exactOutputMatches.getFirst();
                matchKind = "exact output";
            } else if (exactOutputMatches.size() > 1) {
                if (tryInputOnlyFallback(f, foreignList, inputCandidates, typeKey, verbose)) {
                    toRemove.add(f.holder().id());
                    removed++;
                    removedInputOnly++;
                } else {
                    ambiguousExact++;
                    if (verbose) {
                        DUP_LOG.info("[{}] Skipping {} - {} EternalOres recipe(s) match input AND output exactly, ambiguous, and another foreign recipe of this type also shares the input: {}",
                                typeKey, f.holder().id(), exactOutputMatches.size(),
                                exactOutputMatches.stream().map(r -> r.holder().id().toString()).toList());
                    }
                }
                continue;
            } else {
                // no exact output overlap among input-match candidates - fallback to
                // comparing output TAGS
                // candidate tags come from eoOutputTagsCache instead of being recomputed here
                Set<TagKey<Item>> fItemTags = itemTagsOf(f.outputItems());
                Set<TagKey<Fluid>> fFluidTags = fluidTagsOf(f.outputFluids());
                List<RecipeInfo> tagMatches = inputCandidates.stream()
                        .filter(m -> {
                            OutputTags mTags = eoOutputTagsCache.get(m.holder().id());
                            return !Collections.disjoint(mTags.itemTags(), fItemTags)
                                    || !Collections.disjoint(mTags.fluidTags(), fFluidTags);
                        })
                        .toList();

                if (tagMatches.size() == 1) {
                    winner = tagMatches.getFirst();
                    matchKind = "output by tag";
                } else if (tagMatches.size() > 1) {
                    if (tryInputOnlyFallback(f, foreignList, inputCandidates, typeKey, verbose)) {
                        toRemove.add(f.holder().id());
                        removed++;
                        removedInputOnly++;
                    } else {
                        ambiguousTag++;
                        if (verbose) {
                            DUP_LOG.info("[{}] Skipping {} - {} EternalOres recipe(s) match input and share an output tag, still ambiguous, and another foreign recipe of this type also shares the input: {}",
                                    typeKey, f.holder().id(), tagMatches.size(),
                                    tagMatches.stream().map(r -> r.holder().id().toString()).toList());
                        }
                    }
                    continue;
                } else {
                    // output didn't help at all. before giving up, check if this input
                    // is exclusive to f among foreign recipes of this type
                    // if no other foreign recipe shares it, f can only be a duplicate regardless
                    // of the output mismatch
                    // if another foreign recipe does share this input, we bail out
                    if (tryInputOnlyFallback(f, foreignList, inputCandidates, typeKey, verbose)) {
                        toRemove.add(f.holder().id());
                        removed++;
                        removedInputOnly++;
                    } else {
                        noMatch++;
                        if (verbose) {
                            DUP_LOG.info("[{}] Skipping {} - {} EternalOres recipe(s) share input but none matches output (item, fluid, or tag), and another foreign recipe of this type also shares the input: {}",
                                    typeKey, f.holder().id(), inputCandidates.size(),
                                    inputCandidates.stream().map(r -> r.holder().id().toString()).toList());
                        }
                    }
                    continue;
                }
            }

            toRemove.add(f.holder().id());
            removed++;
            if (verbose) {
                DUP_LOG.info("[{}] Removing {} in favor of {} (match: {})",
                        typeKey, f.holder().id(), winner.holder().id(), matchKind);
            }
        }

        DUP_LOG.info("[{}] {} EO recipe(s), {} foreign recipe(s) evaluated, {} skipped (no resolvable input), {} removed ({} via input-only fallback), {} no-match, {} ambiguous-exact-output, {} ambiguous-tag-output.",
                typeKey, eoList.size(), foreignList.size(), skippedNoInput, removed, removedInputOnly, noMatch, ambiguousExact, ambiguousTag);

        return removed;
    }

    private static boolean sharesAny(Set<Item> items1, Set<Fluid> fluids1, Set<Item> items2, Set<Fluid> fluids2) {
        // if the two (item, fluid) input/output pairs share any item or any fluid, it returns true
        return !Collections.disjoint(items1, items2) || !Collections.disjoint(fluids1, fluids2);
    }

    private static List<RecipeInfo> stripCatalysts(List<RecipeInfo> list, Set<Item> catalystItems, Set<Fluid> catalystFluids, String typeKey, boolean verbose) {
        List<RecipeInfo> result = new ArrayList<>(list.size());
        // only helpful in cases where certain/specific recipes add a catalyst item/fluid
        // but this removes catalyst items/fluids from each recipe info's input sets
        for (RecipeInfo r : list) {
            Set<Item> cleanedItems = new HashSet<>(r.inputItems());
            cleanedItems.removeAll(catalystItems);
            Set<Fluid> cleanedFluids = new HashSet<>(r.inputFluids());
            cleanedFluids.removeAll(catalystFluids);
            if (cleanedItems.isEmpty() && cleanedFluids.isEmpty()) {
                if (verbose) {
                    DUP_LOG.warn("[{}] {} - input was entirely catalyst item/fluid after stripping, cannot match on input, dropping from comparison.",
                            typeKey, r.holder().id());
                }
                continue;
            }
            result.add(new RecipeInfo(r.holder(), cleanedItems, cleanedFluids, r.outputItems(), r.outputFluids()));
        }
        return result;
    }

    private static boolean tryInputOnlyFallback(RecipeInfo f, List<RecipeInfo> foreignList, List<RecipeInfo> inputCandidates, String typeKey, boolean verbose) {
        // only called when input matched an EO recipe but output matching couldn't pick a unique winner
        List<RecipeInfo> otherForeignSharingInput = foreignList.stream()
                .filter(other -> other != f)
                .filter(other -> sharesAny(other.inputItems(), other.inputFluids(), f.inputItems(), f.inputFluids()))
                .toList();

        if (!otherForeignSharingInput.isEmpty()) {
            if (verbose) {
                DUP_LOG.info("[{}] Input-only fallback DENIED for {} - {} other foreign recipe(s) of this type also share the input, output stays the only safe tiebreaker: {}",
                        typeKey, f.holder().id(), otherForeignSharingInput.size(),
                        otherForeignSharingInput.stream().map(r -> r.holder().id().toString()).toList());
            }
            return false;
        }

        if (verbose) {
            DUP_LOG.info("[{}] Input-only fallback: removing {} - input is exclusive to EO candidate(s) {} within this type, output mismatch ignored (f.outputItems={}, f.outputFluids={}, candidate output item(s)={}, candidate output fluid(s)={}).",
                    typeKey, f.holder().id(),
                    inputCandidates.stream().map(r -> r.holder().id().toString()).toList(),
                    itemIds(f.outputItems()), fluidIds(f.outputFluids()),
                    inputCandidates.stream().map(r -> itemIds(r.outputItems())).toList(),
                    inputCandidates.stream().map(r -> fluidIds(r.outputFluids())).toList());
        }
        return true;
    }

    private static List<String> itemIds(Set<Item> items) {
        return items.stream()
                .map(i -> BuiltInRegistries.ITEM.getKey(i).toString())
                .toList();
    }

    private static List<String> fluidIds(Set<Fluid> fluids) {
        return fluids.stream()
                .map(f -> BuiltInRegistries.FLUID.getKey(f).toString())
                .toList();
    }

    private static Set<TagKey<Item>> itemTagsOf(Set<Item> items) {
        Set<TagKey<Item>> tags = new HashSet<>();
        for (Item item : items) {
            BuiltInRegistries.ITEM.wrapAsHolder(item).tags().forEach(tags::add);
        }
        return tags;
    }

    private static Set<TagKey<Fluid>> fluidTagsOf(Set<Fluid> fluids) {
        Set<TagKey<Fluid>> tags = new HashSet<>();
        for (Fluid fluid : fluids) {
            BuiltInRegistries.FLUID.wrapAsHolder(fluid).tags().forEach(tags::add);
        }
        return tags;
    }
}