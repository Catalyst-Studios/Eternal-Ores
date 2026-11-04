package net.radzratz.eternalores.util.compat.prodbees;

import com.google.gson.JsonElement;
import cy.jdkdigital.productivebees.datagen.BeeProvider;
import cy.jdkdigital.productivebees.setup.BeeReloadListener;
import cy.jdkdigital.productivebees.util.BeeCreator;
import net.minecraft.core.Registry;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;

import static net.radzratz.eternalores.util.EOUtils.EO;

public class EOProdBeesBuilder extends BeeProvider {
    public record Output(ResourceLocation id, int min, int max, float chance, boolean isFluid) {
        public static Output item(String id, int min, int max) {
            return new Output(ResourceLocation.parse(id), min, max, 1f, false);
        }

        public static Output fluid(String id, int mb) {
            return new Output(ResourceLocation.parse(id), mb, mb, 1f, true);
        }

        public Output chance(float c) {
            return new Output(id, min, max, c, isFluid);
        }
    }

    public record Conversion(String source, String item, float chance) {
        public Conversion(String source, String item) {
            this(source, item, 1f);
        }
    }

    public record Breeding(String parent1, String parent2, float parentDeathChance) {
        public Breeding(String parent1, String parent2) {
            this(parent1, parent2, 0f);
        }
    }

    public record EOBee(String id, String name, BeeConfig config, Output output, @Nullable Conversion from, @Nullable Breeding breed) {
        public ResourceLocation beeId() {
            return EO(id);
        }
    }

    public static final List<EOBee> BEES = List.of(
            bee("peat_coal", "Peat Coal Bee", Output.item("eternalores:peat_coal", 1, 5),
                    new Conversion("productivebees:coal", "eternalores:peat_coal_block"), c -> c
                            .primaryColor("#7c3939").secondaryColor("#652626")
                            .flowerTag("c:storage_blocks/peat_coal")
                            .size(0.5)),
            bee("anthracite_coal", "Anthracite Coal Bee", Output.item("eternalores:anthracite_coal", 1, 3),
                    new Conversion("productivebees:coal", "eternalores:anthracite_coal_block"), c -> c
                            .primaryColor("#7c3939").secondaryColor("#652626")
                            .flowerTag("c:storage_blocks/anthracite_coal")
                            .size(0.5)),
            bee("bituminous_coal", "Beetuminous Coal Bee", Output.item("eternalores:bituminous_coal", 1, 3),
                    new Conversion("productivebees:coal", "eternalores:bituminous_coal_block"), c -> c
                            .primaryColor("#7c3939").secondaryColor("#652626")
                            .flowerTag("c:storage_blocks/bituminous_coal")
                            .size(0.5)),
            bee("coal_coke", "Coal Coke Bee", Output.item("eternalores:coke_coal", 1, 2).chance(0.75f),
                    new Conversion("productivebees:coal", "eternalores:coke_coal_block"), c -> c
                            .primaryColor("#7c3939").secondaryColor("#652626")
                            .flowerTag("c:storage_blocks/coal_coke")
                            .size(0.5)),
            bee("lignite_coal", "Lignite Coal Bee", Output.item("eternalores:lignite_coal", 1, 3),
                    new Conversion("productivebees:coal", "eternalores:lignite_coal_block"), c -> c
                            .primaryColor("#7c3939").secondaryColor("#652626")
                            .flowerTag("c:storage_blocks/lignite_coal")
                            .size(0.5)),

            bee("catalyrium", "Catabeerium", Output.item("eternalores:catalyrium_dust", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#213352").secondaryColor("#9d2600")
                    .model("eternalores:geo/entity/cat_bee.geo.json")
                    .beeTexture("catalyrium")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .waterproof()
                    .attackResponse("lava")
                    .coldResistant()
                    .selfHeal()
                    .fireproof()
                    .noSelfBreed()
                    .attributes(Map.of(
                            "productivity", "productivity.very_high",
                            "endurance", "endurance.strong",
                            "temper", "temper.aggressive",
                            "behaviour", "behaviour.metaturnal",
                            "weather_tolerance", "weather_tolerance.any"
                    ))
                    .flowerTag("c:storage_blocks/catalyrium")
                    .size(6).speed(2.5f)),
            bee("cosmic_matter", "Cosmic Matter Bee", Output.item("eternalores:cosmic_matter_dust", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#000000").secondaryColor("#262626")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .waterproof()
                    .attackResponse("lava")
                    .coldResistant()
                    .selfHeal()
                    .fireproof()
                    .noSelfBreed()
                    .flowerTag("c:storage_blocks/cosmic_matter")
                    .noSelfBreed()
                    .size(1).speed(2.5f)),
            bee("eternity", "Beeternity", Output.item("eternalores:eternity_dust", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#a6d2e2").secondaryColor("#4b4189").tertiaryColor("#993c4b").particleColor("#c27ef7")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .waterproof()
                    .attackResponse("lava")
                    .coldResistant()
                    .selfHeal()
                    .fireproof()
                    .noSelfBreed()
                    .flowerTag("c:storage_blocks/eternity")
                    .noSelfBreed()
                    .size(1).speed(2.5f)),
            bee("universium", "UniBeersium", Output.item("eternalores:universium_dust", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#9b007d")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .waterproof()
                    .attackResponse("lava")
                    .coldResistant()
                    .selfHeal()
                    .fireproof()
                    .noSelfBreed()
                    .flowerTag("c:storage_blocks/universium")
                    .noSelfBreed()
                    .size(1).speed(2.5f)),
            bee("gravitronium", "GraBeetronium", Output.item("eternalores:gravitronium_dust", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#90a6c5").secondaryColor("#576a85")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .waterproof()
                    .attackResponse("lava")
                    .coldResistant()
                    .selfHeal()
                    .fireproof()
                    .noSelfBreed()
                    .flowerTag("c:storage_blocks/gravitronium")
                    .noSelfBreed()
                    .size(1).speed(2.5f)),
            bee("aurorium", "Aurobeeum", Output.item("eternalores:aurorium_dust", 1, 4).chance(0.40f), c -> c
                    .primaryColor("#9b9bff").secondaryColor("#7b73d7")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .waterproof()
                    .attackResponse("lava")
                    .coldResistant()
                    .selfHeal()
                    .fireproof()
                    .noSelfBreed()
                    .flowerTag("c:storage_blocks/aurorium")
                    .noSelfBreed()
                    .size(1).speed(2.5f)),
            bee("missing", "entity.productivebees.missing_bee", Output.item("eternalores:missing_ingot", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#fc00cf").secondaryColor("#000000")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .teleporting()
                    .noSelfBreed()
                    .flowerTag("c:ingots/missing")
                    .size(1).speed(3.0f)),
            bee("nethersteel", "Nethersteel Bee", Output.item("eternalores:nethersteel_nugget", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#fc00cf")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .fireproof()
                    .noSelfBreed()
                    .flowerTag("c:storage_blocks/nethersteel")
                    .size(1)),
            bee("shadowsteel", "Shadowsteel Bee", Output.item("eternalores:shadowsteel_nugget", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#fc00cf")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .fireproof()
                    .noSelfBreed()
                    .flowerTag("c:storage_blocks/shadowsteel")
                    .size(1)),

            bee("alumite", "Alumite Bee", Output.item("eternalores:alumite_nugget", 1, 5).chance(0.75f), c -> c
                    .primaryColor("#fbb4ec")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/alumite")
                    .size(1)),
            bee("americium", "Americium Bee", Output.item("eternalores:americium_nugget", 1, 3).chance(0.75f), c -> c
                    .primaryColor("#51ccad")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/americium")
                    .size(1)),
            bee("annealed_copper", "Annealed Copper Bee", Output.item("eternalores:annealed_copper_nugget", 1, 7).chance(0.50f),
                    new Breeding("eternalores:oxygen", "productivebees:copper"), c -> c
                            .primaryColor("#df9d5e")
                            .flowerTag("c:storage_blocks/annealed_copper")
                            .size(1)),
            bee("battery_alloy", "Beeattery Alloy", Output.item("eternalores:battery_alloy_nugget", 1, 8).chance(0.65f),
                    new Breeding("productivebees:lead", "productivebees:antimony"), c -> c
                            .primaryColor("#a07ab4")
                            .flowerTag("c:storage_blocks/battery_alloy")
                            .size(1)),
            bee("black_bronze", "Black Bronze Bee", Output.item("eternalores:black_bronze_dust", 1, 3).chance(0.50f), c -> c
                    .primaryColor("#867250")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/black_bronze")
                    .size(1)),
            bee("cast_iron", "Cast Iron Bee", Output.item("eternalores:cast_iron_nugget", 1, 7).chance(0.85f),
                    new Breeding("eternalores:bituminous_coal", "productivebees:iron"), c -> c
                            .primaryColor("#9eafbf")
                            .flowerTag("c:storage_blocks/cast_iron")
                            .size(1)),
            bee("cast_steel", "Cast Steel Bee", Output.item("eternalores:cast_steel_nugget", 1, 7).chance(0.85f),
                    new Breeding("eternalores:bituminous_coal", "productivebees:steel"), c -> c
                            .primaryColor("#7f8987")
                            .flowerTag("c:storage_blocks/cast_steel")
                            .size(1)),
            bee("blue_steel", "Blue Steel Bee", Output.item("eternalores:blue_steel_nugget", 1, 3).chance(0.50f), c -> c
                    .primaryColor("#47619e")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/blue_steel")
                    .size(1)),
            bee("black_steel", "Black Steel Bee", Output.item("eternalores:black_steel_nugget", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#4e5c7d")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/black_steel")
                    .size(1)),
            bee("britannia_silver", "Breetanny", Output.item("eternalores:britannia_silver_nugget", 1, 5).chance(0.85f),
                    new Breeding("productivebees:copper", "productivebees:silver"), c -> c
                            .primaryColor("#e6e6e6")
                            .flowerTag("c:storage_blocks/britannia_silver")
                            .size(1)),
            bee("modularium", "Modularium Bee", Output.item("eternalores:modularium_nugget", 1, 5).chance(0.85f), c -> c
                    .primaryColor("#f94a00")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/modularium")
                    .size(1)),
            bee("stainless_steel", "Stainless Steel Bee", Output.item("eternalores:stainless_steel_dust", 1, 3).chance(0.50f), c -> c
                    .primaryColor("#b1cade")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/stainless_steel")
                    .size(1)),
            bee("kanthal", "Kanthal Bee", Output.item("eternalores:kanthal_dust", 1, 3).chance(0.50f), c -> c
                    .primaryColor("#787474")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/kanthal")
                    .size(1)),
            bee("tantalum", "Tantalum Bee", Output.item("eternalores:tantalum_dust", 1, 4).chance(0.40f), c -> c
                    .primaryColor("#9aa1b8")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/tantalum")
                    .size(1)),
            bee("magnesium", "Magnesium Bee", Output.item("eternalores:magnesium_dust", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#cdd3d8")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/magnesium")
                    .size(1)),
            bee("osgloglas", "Osgloglas Bee", Output.item("eternalores:osgloglas_nugget", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#85e84e")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/osgloglas")
                    .size(1)),
            bee("wrought_iron", "Wrought Iron Bee", Output.item("eternalores:wrought_iron_nugget", 1, 4).chance(0.40f),
                    new Breeding("productivebees:iron", "productivebees:coal"), c -> c
                            .primaryColor("#969277")
                            .flowerTag("c:storage_blocks/wrought_iron")
                            .size(1)),
            bee("yttrium", "Yttrium Bee", Output.item("eternalores:yttrium_dust", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#b19a75")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/yttrium")
                    .size(1)),
            bee("quartz_enriched_copper", "Quartz Enriched Bee", Output.item("eternalores:quartz_enriched_copper_nugget", 1, 7).chance(0.40f),
                    new Breeding("productivebees:copper", "productivebees:crystalline"), c -> c
                            .primaryColor("#f4a688")
                            .flowerTag("c:storage_blocks/quartz_enriched_copper")
                            .size(1)),
            bee("rhodium", "Rhodium Bee", Output.item("eternalores:rhodium_dust", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#e94ec2")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/rhodium")
                    .size(1)),
            bee("plutonium", "Plutonium Bee", Output.item("eternalores:plutonium_small_dust", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#fde0e0").secondaryColor("#dfc1c0")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/plutonium")
                    .size(1)),
            bee("rubidium", "Rubeedium", Output.item("eternalores:rubidium_dust", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#aea5ce")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/rubidium")
                    .size(1)),
            bee("ruthenium", "Ruthenium Bee", Output.item("eternalores:ruthenium_dust", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#a9d7d7")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/ruthenium")
                    .size(1)),
            bee("samarium", "Samarium Bee", Output.item("eternalores:samarium_dust", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#c6c99a")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/samarium")
                    .size(1)),
            bee("cupronickel", "Cupronickel Bee", Output.item("eternalores:cupronickel_nugget", 1, 4).chance(0.40f),
                    new Breeding("productivebees:copper", "productivebees:nickel"), c -> c
                            .primaryColor("#f4c88c")
                            .flowerTag("c:storage_blocks/cupronickel")
                            .size(1)),
            bee("cesium", "Cesium Bee", Output.item("eternalores:cesium_nugget", 1, 4).chance(0.40f), c -> c
                    .primaryColor("#badfb8")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/cesium")
                    .size(1)),
            bee("francium", "Francium Bee", Output.item("eternalores:francium_dust", 1, 4).chance(0.40f), c -> c
                    .primaryColor("#b1e0e5")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/francium")
                    .size(1)),
            bee("hafnium", "Hafnium Bee", Output.item("eternalores:hafnium_dust", 1, 5).chance(0.40f), c -> c
                    .primaryColor("#c0b8df")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/hafnium")
                    .size(1)),
            bee("indium", "Indium Bee", Output.item("eternalores:indium_dust", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#ab7dd9")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/indium")
                    .size(1)),

            bee("phosphorus", "Phosphorus Bee", Output.item("eternalores:phosphorus_small_dust", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#c66e4c")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/phosphorus")
                    .size(1)),
            bee("cadmium", "Cadmium Bee", Output.item("eternalores:cadmium_small_dust", 1, 5).chance(0.40f), c -> c
                    .primaryColor("#9e98c4")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/cadmium")
                    .size(1)),
            bee("calcium", "Calcium Bee", Output.item("eternalores:calcium_small_dust", 1, 7).chance(0.40f), c -> c
                    .primaryColor("#dad7c6")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/calcium")
                    .size(1)),
            bee("californium", "Californium Bee", Output.item("eternalores:californium_small_dust", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#acd7d9")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/californium")
                    .size(1)),
            bee("cerium", "Cerium Bee", Output.item("eternalores:cerium_small_dust", 1, 5).chance(0.40f), c -> c
                    .primaryColor("#aabd8b")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/cerium")
                    .size(1)),
            bee("selenium", "Selenium Bee", Output.item("eternalores:selenium_small_dust", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#5df3af")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/selenium")
                    .size(1)),

            bee("biomass", "Biobee", Output.item("eternalores:biomass", 1, 35).chance(1f), c -> c
                    .primaryColor("#6f6b23").secondaryColor("#514514")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:fuels/bio/block")
                    .size(1).renderer("thicc")),

            bee("ardite", "Ardite Bee", Output.item("eternalores:raw_ardite", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#f2b124").secondaryColor("#f28524").tertiaryColor("#d66113")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/ardite")
                    .size(1)),
            bee("palladium", "Palladium Bee", Output.item("eternalores:raw_palladium", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#ecbce9").secondaryColor("#a779a6")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/palladium")
                    .size(1)),
            bee("neodymium", "Neobeemium", Output.item("eternalores:raw_neodymium", 1, 4).chance(0.40f), c -> c
                    .primaryColor("#b48fa2").secondaryColor("#a0768c")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/neodymium")
                    .size(1)),
            bee("molybdenum", "Molybeenum", Output.item("eternalores:raw_molybdenum", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#b0dcf0").secondaryColor("#82a9bd")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/molybdenum")
                    .size(1)),
            bee("ultimatitanium", "Ultimatitanium Bee", Output.item("eternalores:raw_ultimatitanium", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#9565a3").secondaryColor("#7b4a89")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/ultimatitanium")
                    .size(1)),
            bee("vanadium", "Vanadium Bee", Output.item("eternalores:raw_vanadium", 1, 3).chance(0.40f), c -> c
                    .primaryColor("#636984").secondaryColor("#434962")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/vanadium")
                    .size(1)),
            bee("sculkite", "Sculkite Bee", Output.item("eternalores:raw_sculkite", 1, 2).chance(0.40f), c -> c
                    .primaryColor("#05625d").secondaryColor("#034150").tertiaryColor("#041e24")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/sculkite")
                    .size(1)),
            bee("gallium", "Gallium Bee", Output.item("eternalores:raw_gallium", 1, 4).chance(0.40f), c -> c
                    .primaryColor("#c0c1c1").secondaryColor("#878b90")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/gallium")
                    .size(1)),
            bee("necroticarite", "Necroticarite Bee", Output.item("eternalores:necroticarite_shard", 1, 9).chance(0.40f), c -> c
                    .primaryColor("#a824de").secondaryColor("#4d0077")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:storage_blocks/necroticarite")
                    .size(1).renderer("default_crystal")),
            bee("obsidian_gem", "Obsidian Gem Bee", Output.item("eternalores:obsidian_shard", 1, 7).chance(0.40f),
                    new Conversion("productivebees:obsidian", "eternalores:obsidian_block", 0.35f), c -> c
                            .primaryColor("#764cc2").secondaryColor("#663fae")
                            .flowerTag("c:storage_blocks/obsidian")
                            .size(1).renderer("default_crystal")),

            bee("strange_matter", "Strange Matter Bee", Output.item("eternalores:strange_matter_pellet", 1, 1).chance(0.45f), c -> c
                    .primaryColor("#63eb60").secondaryColor("#32c32f").tertiaryColor("#67c082").particleColor("#7bc379")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .waterproof()
                    .attackResponse("lava")
                    .coldResistant()
                    .selfHeal()
                    .fireproof()
                    .noSelfBreed()
                    .particleType("pop")
                    .flowerTag("c:storage_blocks/strange_matter")
                    .size(1.0).speed(1.5).renderer("thicc")),
            bee("exotic_matter", "Exotic Matter Bee", Output.item("eternalores:exotic_matter_pellet", 1, 1).chance(0.45f), c -> c
                    .primaryColor("#63eb60").secondaryColor("#32c32f").tertiaryColor("#67c082").particleColor("#7bc379")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .waterproof()
                    .attackResponse("lava")
                    .coldResistant()
                    .selfHeal()
                    .fireproof()
                    .noSelfBreed()
                    .particleType("pop")
                    .flowerTag("c:storage_blocks/exotic_matter")
                    .size(1.0).speed(1.5).renderer("thicc")),
            bee("antimatter", "Antimatter Bee", Output.item("eternalores:antimatter_pellet", 1, 1).chance(0.45f), c -> c
                    .primaryColor("#63eb60").secondaryColor("#32c32f").tertiaryColor("#67c082").particleColor("#7bc379")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .waterproof()
                    .attackResponse("lava")
                    .coldResistant()
                    .selfHeal()
                    .fireproof()
                    .noSelfBreed()
                    .particleType("pop")
                    .flowerTag("c:storage_blocks/antimatter")
                    .size(1.0).speed(1.5).renderer("thicc")),

            bee("mercury", "Mercury Bee", Output.fluid("eternalores:fluid_mercury", 25), c -> c
                    .primaryColor("#c5c5c5")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/mercury")
                    .size(0.7)),

            bee("hydrogen", "Hydrogen Bee", Output.fluid("eternalores:gas_hydrogen", 50), c -> c
                    .primaryColor("#3e80d1")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/hydrogen")
                    .size(0.5).speed(1.5)),
            bee("oxygen", "Oxygen Bee", Output.fluid("eternalores:gas_oxygen", 50), c -> c
                    .primaryColor("#46def2")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/oxygen")
                    .size(0.5).speed(1.5)),
            bee("steamy", "Steamy Bee", Output.fluid("eternalores:gas_steam", 50),
                    new Conversion("productivebees:water", "#c:buckets/steam", 0.5f), c -> c
                            .primaryColor("#f4f2ec")
                            .flowerTag("c:buckets/steam")
                            .size(0.5).speed(1.5)),
            bee("nitrogen", "Nitrogen Bee", Output.fluid("eternalores:gas_nitrogen", 50), c -> c
                    .primaryColor("#3eb4a0")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/nitrogen")
                    .size(0.5).speed(1.5)),
            bee("chlorine", "Chlorine Bee", Output.fluid("eternalores:gas_chlorine", 50), c -> c
                    .primaryColor("#3fc1b4")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/chlorine")
                    .size(0.5).speed(1.5)),
            bee("helium", "Helium Bee", Output.fluid("eternalores:gas_helium", 50), c -> c
                    .primaryColor("#feff4e")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/helium")
                    .size(0.5).speed(1.5)),
            bee("carbon_dioxide", "Carbon Dioxide Bee", Output.fluid("eternalores:gas_carbon_dioxide", 50), c -> c
                    .primaryColor("#737373")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/carbon_dioxide")
                    .size(0.5).speed(1.5)),
            bee("sulfur_dioxide", "Sulfur Dioxide Bee", Output.fluid("eternalores:gas_sulfur_dioxide", 50),
                    new Conversion("productivebees:sulfur", "#c:buckets/sulfur_dioxide", 0.5f), c -> c
                            .primaryColor("#e09c06")
                            .flowerTag("c:buckets/sulfur_dioxide")
                            .size(0.5).speed(1.5)),
            bee("ammonia", "Ammonia Bee", Output.fluid("eternalores:gas_ammonia", 50), c -> c
                    .primaryColor("#626bb4")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/ammonia")
                    .size(0.5).speed(1.5)),
            bee("neon", "Neon Bee", Output.fluid("eternalores:gas_neon", 50), c -> c
                    .primaryColor("#5d3df0")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/neon")
                    .size(0.5).speed(1.5)),
            bee("argon", "Argon Bee", Output.fluid("eternalores:gas_argon", 50), c -> c
                    .primaryColor("#00eb0f")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/argon")
                    .size(0.5).speed(1.5)),
            bee("krypton", "Krypton Bee", Output.fluid("eternalores:gas_krypton", 50), c -> c
                    .primaryColor("#00fd04")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/krypton")
                    .size(0.5).speed(1.5)),
            bee("xenon", "Xenon Bee", Output.fluid("eternalores:gas_xenon", 50), c -> c
                    .primaryColor("#21ef94")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/xenon")
                    .size(0.5).speed(1.5)),
            bee("radon", "Radon Bee", Output.fluid("eternalores:gas_radon", 50), c -> c
                    .primaryColor("#eb0087")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/radon")
                    .size(0.5).speed(1.5)),
            bee("methane", "Methane Bee", Output.fluid("eternalores:gas_methane", 50), c -> c
                    .primaryColor("#e9ac02")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/methane")
                    .size(0.5).speed(1.5)),
            bee("phosphine", "Phosphine Bee", Output.fluid("eternalores:gas_phosphine", 50), c -> c
                    .primaryColor("#dc7a1b")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/phosphine")
                    .size(0.5).speed(1.5)),
            bee("ozone", "Ozone Bee", Output.fluid("eternalores:gas_ozone", 50), c -> c
                    .primaryColor("#86f0e6")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/ozone")
                    .size(0.5).speed(1.5)),
            bee("tritium", "Tritium Bee", Output.fluid("eternalores:gas_tritium", 50), c -> c
                    .primaryColor("#a2f47a")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/tritium")
                    .size(0.5).speed(1.5)),
            bee("deuterium", "Deuterium Bee", Output.fluid("eternalores:gas_deuterium", 50), c -> c
                    .primaryColor("#f4524a")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/deuterium")
                    .size(0.5).speed(1.5)),
            bee("carbon", "Carbon Bee", Output.fluid("eternalores:gas_carbon", 50), c -> c
                    .primaryColor("#454545")
                    .description("productivebees.ingredient.description.only_spawnegg")
                    .flowerTag("c:buckets/carbon")
                    .size(0.5).speed(1.5))
    );

    private final PackOutput packOutput;

    public EOProdBeesBuilder(PackOutput output) {
        super(output);
        this.packOutput = output;
    }

    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cache) {
        PackOutput.PathProvider paths = packOutput.createPathProvider(PackOutput.Target.DATA_PACK, "productivebees");
        List<CompletableFuture<?>> futures = new ArrayList<>();
        Map<ResourceLocation, CompoundTag> data = new HashMap<>();

        for (EOBee bee : BEES) {
            ResourceLocation path = EO("eternalores/" + bee.id());
            JsonElement json = getBee(bee.config()).get();

            data.put(path, BeeCreator.create(path, json.getAsJsonObject()));
            futures.add(DataProvider.saveStable(cache, json, paths.json(path)));
        }

        BeeReloadListener.INSTANCE.setData(data);
        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    @Override
    protected List<BeeConfig> getBeeConfigs() {
        return BEES.stream().map(EOBee::config).toList();
    }

    private static EOBee bee(String id, String name, Output output, UnaryOperator<BeeConfig> config) {
        return bee(id, name, output, null, null, config);
    }

    private static EOBee bee(String id, String name, Output output, Conversion from, UnaryOperator<BeeConfig> config) {
        return bee(id, name, output, from, null, config);
    }

    private static EOBee bee(String id, String name, Output output, Breeding breed, UnaryOperator<BeeConfig> config) {
        return bee(id, name, output, null, breed, config);
    }

    private static EOBee bee(String id, String name, Output output, Conversion from, Breeding breed, UnaryOperator<BeeConfig> config) {
        return new EOBee(id, name, config.apply(new BeeConfig("eternalores/" + id)), output, from, breed);
    }

    public static EOBee get(String id) {
        return BEES.stream().filter(b -> b.id().equals(id)).findFirst().orElseThrow();
    }

    public static <T> T getBee(Registry<T> registry, ResourceLocation id) {
        return registry.getOptional(id).orElseThrow(() -> new IllegalStateException("This bee is not registered DUMBASS: " + id));
    }
}