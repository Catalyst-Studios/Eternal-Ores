**Materials**
-

Before we say anything else, yes, there are over 200+ different material sets.

Eternal Ores main vision is to give, you packdevs, an unholy amount of different material sets to use in your modpacks.
I am aware that not all materials will be used, but this should give you part of the foundation of creating a modpack.

And don't you worry, as all these materials can be disabled by sets, meaning you can yeet aluminum as a whole,
or individually, yeeting only the aluminum ingot and not the rest, via config.

And just a quick note, Eternal Ores adds its own versions of Black Quartz, Certus Quartz, Fluix and Source materials. So please make sure
to scroll down a bit to find the Almost Unified section!

Go as wild as you can with all these materials, I'd love to see those lovely processing lines and recipes for these materials!

**Tools**
-
In case you didn't know, Eternal Ores adds 4 types of tools, **Crushing Hammers**, **Gem Cutters**, **Wire Cutters** and **Prospectors**.

- Crushing Hammers; Based on AllTheOres hammers, they are used to Crush every single material into dusts, dupe those raw mats, 
Plates, Rods and Gears.
- Gem Cutters; Similar to the hammers, but they are used to create Pebbles, and CUT those gems into plates, rods, and gears.
- Wire Cutters; What can we say about these? Other than they cut plates into foils and foils into wires.
- Prospectors; There are two of these, the Basic and the Advanced. Both of these work similar, they can be linked to an ore via
`c:ores/material` tag, and tell you where those sweet ores are. However, these may work similar, by right-clicking you can link 
the ore to the prospector, both prospectors search areas can be edited, but both have their differences.
- Basic Prospector; Displays a decent sized bar over your HUD, on the left side corner by default, can be changed wherever ya want, and tells you
how close - far you are from said ore. By default, **red = really far** - **yellow = kinda close** - **green = really close**,
these colors can be toggled if you desire, but they look nice imo.
- Advanced Prospector; This one is the best, as its plain X-Ray, you still need to link the tool with the ore to find it btw.
And if you're wondering, yes it works with both Sodium and Embeddium. (i frickin made sure it worked, and it costed me sanity)

Another thing about the prospectors, you can easily add more ore entries over `tools-config.json`, all needed details are explained
over there.

As to why the hammers can turn most materials into their forms (plates, gears and rods), but not them gems... I had a funsie idea ya know?
I wanted to create a special tool to transform those gems into their forms, simply because it's weird to use a hammer to turn
a gem into a plate. And yes, it was kinda dumb, but it's a cool tool, a cootool.

Tools like hammers, gem cutters and wire cutters, can be repaired with their corresponding material_nugget, except for the stone hammer,
that one needs a stone button because of reasons, each nugget/button will replenish 30 points of durability to said tool over the Crafting Table, 
this value can be tweaked over `tools-config.json`, and you can toggle if players can or can't repair the tool, 
or if it can only be repaired over the grinding stone or anvil. And also these tools can't be mixed with the
Forbidden and Arcanus Stella Eterna.

Oh, did I mention the Finder and Teleporter? Didn't ya said there were only 4 tools? Well **I lied**, the finder is a tool only for debug
that yeets a chunk of everything it has, _except a tiny list of blocks including bedrock_, and leaves our lovely ores exposed, so you can
verify if said unwanted ore still generates after tweaking the config. Survival/Adventure mode players cannot use the Finder, still,
we suggest you add some extra layers to ensure this Tool does not exist at all on your packs. And lastly the Teleporter, 
can't say much about this one ngl, since this is your way into Eternal Ores Mining Dimension!

And lastly, them Molds... These aren't tools, but still are worth mentioning, these molds can create Plates, Rods, Gears and Foils
over certain machines, a vanilla'ish recipe is available so players can create them.

In case you don't want any of these tools or molds, you can disable them over `tools-config.json`.

**Recipes and Tweaks**
-
Now this is what most of us look when creating a ModPack, them sweet **recipes**!

Our recipes have been tweaked so most packDevs don't suffer with these... And we all know that this is the best and worst
thing of creating a ModPack. Every single one of our recipes end with their corresponding `material name`, like `aluminum`,
and not `the_longest_name_you_could_ever_imagine_being_placed_into_a_darned_recipe_id`, but do know that they are separated 
into subfolders. This way, any unwanted recipe you want to remove with KubeJS or CraftTweaker can be regexed.

About them tweaks, aka mixins, there are only 2. Which changes Immersive Engineering and ~~Energized Power~~ metal presses mold input
to use Tags instead of a hardcoded ItemStack. Almost Unified does its job fabulously if Eternal Ores, Immersive Engineering, 
and ~~Energized Power~~ molds have the `c:tools/molds/plate` tag, tag introduced and created by Eternal Ores. If you find this tag 
annoying, and decide to delete it, you may want to toggle this config...

**Compat Items, Chemicals and Blocks**
-
Eternal Ores also adds some items and blocks from certain mods. 

Like;
- Iron Furnaces (Catalyrium Furnace, and quite possibly more in the future, but me dunno xd)
- Ender IO (Capacitors and Grinding Balls)
- GeOre (Everything GeOre adds, except glasses, spyglasses and worldgen)
- Mekanism (The subtitle says it)
- Powah! (Fuels and Coolants)

These Blocks and Items have their respective tags and recipes. If anything is borked, yell at RadzRatz please.

Why where these items, chemicals and blocks added to Eternal Ores, since its main focus is to add only Materials?

All of these were added into Eternal Ores to make it feel more 'complete with its mod integration', and not only add recipes, which
in most integrated mods is the case, but not with the mentioned mods.

But in short, im against mod spam that adds a single or couple of things that could be included into a single one, like a lib for a lib from a lib that's a lib, etc. So no
Eternal Ores Chemicals, Furnaces, GeOres or Capacitors addons. I really despite that.
___