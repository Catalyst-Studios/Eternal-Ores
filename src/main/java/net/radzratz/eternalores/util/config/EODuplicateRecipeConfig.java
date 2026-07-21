package net.radzratz.eternalores.util.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import static net.radzratz.eternalores.util.EOUtils.capitalize;
import static net.radzratz.eternalores.util.EOUtils.replaceUnderscoreWithCapitalization;

public class EODuplicateRecipeConfig {
    public static final EODuplicateRecipeConfig CFG;
    public static final ModConfigSpec CONFIG_SPEC;

    public static ModConfigSpec.BooleanValue enabled;
    public static ModConfigSpec.EnumValue<Mode> mode;
    public static ModConfigSpec.BooleanValue verboseLogging;

    public static ModConfigSpec.BooleanValue oritechRecipes;
    public static ModConfigSpec.BooleanValue mekanismRecipes;
    public static ModConfigSpec.BooleanValue mekanismMoreMachineRecipes;
    public static ModConfigSpec.BooleanValue createRecipes;
    public static ModConfigSpec.BooleanValue createCraftsRecipes;
    public static ModConfigSpec.BooleanValue immersiveEngineeringRecipes;
    public static ModConfigSpec.BooleanValue enderIORecipes;
    public static ModConfigSpec.BooleanValue railcraftRecipes;
    public static ModConfigSpec.BooleanValue energizedPowerRecipes;
    public static ModConfigSpec.BooleanValue actuallyAdditionsRecipes;

    public enum Mode { ALWAYS_EO, PREFER_HIGHER_YIELD, PREFER_LOWER_YIELD }

    static {
        Pair<EODuplicateRecipeConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(EODuplicateRecipeConfig::new);
        CFG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    public EODuplicateRecipeConfig(ModConfigSpec.Builder bldr) {
        bldr.comment("""
                 Eternal Ores Duplicate Recipe Handler Config.

                 This config allows you to toggle duplicate/overlapping recipes.
                
                 Designed to help modpack developers clean up duplicate recipes with a few toggles,
                 without having to hunt each duplicate recipe down one by one manually.
                
                 We've provided two methods to fully toggle these duplicate/overlapping recipes.
                
                 Basic only toggles recipes that are, unwanted, not unified, or that smart system didn't
                 fully toggled, that may collide with Eternal Ores, and other mods recipes. Like Oritech's steel/electrum recipes,
                 Create Crafts and Additions electrum charger recipe, Mekanism slurry recipes (as they are not supported by Almost Unified yet), etc.
                
                 Smart compares recipe input ingredients across every supported recipe type, and where
                 it can also resolve BOTH recipes' outputs, requires those outputs to overlap too before
                 removing anything. If Smart can't confidently resolve a recipe's output, it leaves that
                 recipe untouched rather than risk removing something unrelated. Which acts as a safety net
                 for duplicate recipes that Almost Unified may not catch/hide.
                
                 These recipes are not necessarily conflicting, but in certain cases Eternal Ores'
                 outputs differ enough from the original recipe (in item, count, or time) that
                 Almost Unified can't recognize them as the same recipe.
                
                 [Only recipe types explicitly supported are affected]
                
                 [
                    Minecraft: Smelting and Blasting
                    Immersive Engineering: Crusher, Arc Furnace and Alloy
                    Oritech: Grinder, Pulverizer, Refinery, Atomic Forge, Centrifuge, Centrifuge Fluid and Foundry
                    Integrated Dynamics: Squeezer and Mechanical Squeezer
                    Mekanism More Machine: Stamper // BTW it's real recipe type id is Mekanism:Stamping for some reason
                    Railcraft: Crusher
                    Ender IO: Sag Milling and Alloy Smelting
                    Actually Additions: Crushing
                    Energized Power: Alloy Furnace and Pulverizer
                    Create: Splashing, Mixing and Crushing
                 ]
                
                 No core progression recipes are touched, and no mod functionality is affected in any way whatsoever.
                
                 Runs after Almost Unified finishes its own tag, item and recipe unification. If said Eternal Ores recipe
                 was unified, it is left as is.
                
                 Almost Unified is a MUST to use alongside this config. You've been warned.
                 See: https://www.curseforge.com/minecraft/mc-mods/almost-unified
                
                 Additionally, KubeJS or CraftTweaker are highly suggested in case we missed any duplicate recipe.
                 See: https://www.curseforge.com/minecraft/mc-mods/crafttweaker
                 See: https://www.curseforge.com/minecraft/mc-mods/kubejs
                
                 Each config change requires a /reload (or a server restart) to take effect - Eternal Ores
                 re-runs both Basic and Smart automatically whenever datapacks are (re)synced, so a plain
                 /reload is enough, no restart needed.
                """).push("external_recipe_handler");

        oritechRecipes = toggle(bldr, "oritech");
        mekanismRecipes = toggle(bldr, "mekanism");
        mekanismMoreMachineRecipes = toggle(bldr, "mekanism_more_machine");
        createRecipes = toggle(bldr, "create");
        createCraftsRecipes = toggle(bldr, "create_crafts_and_additions");
        immersiveEngineeringRecipes = toggle(bldr, "immersive_engineering");
        enderIORecipes = toggle(bldr, "enderio");
        railcraftRecipes = toggle(bldr, "railcraft");
        energizedPowerRecipes = toggle(bldr, "energizedpower");
        actuallyAdditionsRecipes = toggle(bldr, "actuallyadditions");

        bldr.pop();

        bldr.push("smart");

        enabled = bldr.comment(" [Server] Defines if Eternal Ores should compare recipe input ingredients, and outputs, in favor of EO's own implemented recipes.")
                .define("isSmartRecipeHandlerEnabled", false);

        mode = bldr.comment("""
                         [Server] Defines if Eternal Ores should replace overlapping recipes.
                         ALWAYS_EO: EO's recipe always wins, regardless of output yield.
                         PREFER_HIGHER_YIELD: EO's recipe only wins if its output count is >= the other recipe's.
                         PREFER_LOWER_YIELD: EO's recipe only wins if its output count is <= the other recipe's.
                        """)
                .defineEnum("mode", Mode.ALWAYS_EO);

        bldr.pop();

        bldr.push("debug");

        verboseLogging = bldr.comment("[Server] Only used for Debug.")
                .define("shouldLogsAppear", false);

        bldr.pop();
    }

    private ModConfigSpec.BooleanValue toggle(ModConfigSpec.Builder bldr, String modId) {
        return bldr
                .comment("[Server] Disables all whitelisted duplicate/overlapping " + replaceUnderscoreWithCapitalization(modId) + " recipes that conflict with Eternal Ores.")
                .define("are" + capitalize(modId) + "RecipesDisabled", false);
    }
}