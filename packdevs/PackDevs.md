**For Pack Devs**
=
___

**Custom Materials**
=

Some custom materials include a "vanilla" recipe to ensure they exist, those recipes are meant
to be disabled.

With the creation of these materials you can go wild, I would love to see how hard or easy you do these
recipes!

___

**World Generation**
=
I know for a fact that not all of Eternal Ores included ores will be used, and these can be disabled without causing an
exception or an error with Eternal Ores mod.

**KubeJS Example**

KubeJS mod changed a bit on how it disables ore generation and here's a quick example for you to disable unneeded,
unwanted or duplicate ores from Eternal Ores Mod.

The root file should look like this;

your_modpack_instance\modpack_name\kubejs\data\mod_id\neoforge\biome_modifier\add_{ore_name}_ore.json

And the contents of the .json files should look like this.

___
{
"type": "neoforge:none",
"biomes": "#minecraft:is_overworld",
"features": "eternalores:amber_ore_placed",
"step": "underground_ores"
}
___

To ensure these ores don't spawn anywhere in the world the "type" needs to be set to (none) how it's shown.

To change the unwanted ore, simply change "features" ore name and the .json file name to add_{ore_name}_ore, 
most have the {ore_name}_ore_placed id.