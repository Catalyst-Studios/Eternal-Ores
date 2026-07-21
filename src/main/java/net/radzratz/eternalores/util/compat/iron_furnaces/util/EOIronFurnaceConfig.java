package net.radzratz.eternalores.util.compat.iron_furnaces.util;

import net.neoforged.neoforge.common.ModConfigSpec;

/*
 * Copyright 2025 pizzaatime and XenoMustache
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Source: https://github.com/Qelifern/IronFurnacesNeoForge
 *
 */
public class EOIronFurnaceConfig {
    private static final ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

    public static final ModConfigSpec spec;

    // Speed
    public static ModConfigSpec.IntValue speed;
    public static ModConfigSpec.IntValue factorySpeed;

    // Smelt multiplier
    public static ModConfigSpec.IntValue smeltMult;
    public static ModConfigSpec.IntValue factorySmeltMult;

    // Energy
    public static ModConfigSpec.IntValue generation;

    // Tier
    public static ModConfigSpec.IntValue tier;

    static {
        builder.comment("""
                Eternal Ores - Catalyrium Furnace Settings.
                
                This is a separate config for Iron Furnace Mod and Eternal Ores Mod Compatibility.
                
                It follows the same rules as Iron Furnace Mod Config.
                
                This only allows you to edit the Catalyrium Furnace Settings.
                """)
                .push("catalyrium_furnace");

        addSpeedSection();
        addSmeltingSection();
        addEnergySection();
        addTierSection();

        builder.pop();

        spec = builder.build();
    }

    private static void addSpeedSection() {
        builder.push("speed");
        speed = builder.comment("Ticks per operation. Vanilla furnace = 200. Default: 2").defineInRange("normal", 2, 1, 72000);

        factorySpeed = builder.comment("Ticks per operation for the factory variant. Default: 1").defineInRange("factory", 1, 0, 72000);
        builder.pop();
    }

    private static void addSmeltingSection() {
        builder.push("smelting");
        smeltMult = builder.comment("Items smelted at once. Vanilla = 1. Default: 16").defineInRange("normal_mult", 16, 1, 64);

        factorySmeltMult = builder.comment("Items smelted at once in factory variant. Default: 32").defineInRange("factory_mult", 32, 1, 64);
        builder.pop();
    }

    private static void addEnergySection() {
        builder.push("energy");
        generation = builder.comment("Energy generated per tick. Default: 2000").defineInRange("generation", 2000, 1, 100000);
        builder.pop();
    }

    private static void addTierSection() {
        builder.push("tier");
        tier = builder.comment("Catalyrium Furnace tier. Default: 2").defineInRange("tier", 2, 0, 2);
        builder.pop();
    }
}
