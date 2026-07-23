**Configs**
-
Eternal Ores adds a decent amount of configs that do different or similar things. Some of these were explained
in other .md files, but we're going to re-explained each in here pretty quick in case you haven't read the other files.

But it is important for you to know that you have the following features in Eternal Ores configs.

### Chemicals Config
Only available if Mekanism mod is present.

It's only purpose is to disable any unwanted Infusion or Slurry types Eternal Ores offers.

### Compressed Blocks
There are 2 configs for our Compressed Blocks, Compressed-Block-Level-Settings is to disable any compression level of
any registered block, and Compressed_Blocks is to register any desired compressed block. Check CompressedBlocks.md.

### Events
This config is merely used to disable/enable certain events, like Eternal Ores Unstable Ingot explosion, if it can get
deleted if other sources outside the Crafting Table created it, etc. If Eternal Ores Redstone Block can emit a redstone
signal. And if players are able to throw pebbles, yes this is a thing.

### External Recipe Handler
Almost Unified mod is a MUST to be present for this to work perfectly, while not necessarily required, it is highly suggested.

Now this one ain't simple to describe in a few words.

Since this config has two functionalities, but both work a bit similar.

1- Basic - Disables any overlapping, unwanted, and none unified recipes of certain mods.

2- Smart - Replaces any overlapping, unwanted, and none unified recipes of certain recipe types by comparing Eternal Ores,
and said mod recipe type inputs and outputs. If both match, Eternal Ores recipe will replace said recipe entirely, if both recipes
inputs match, but not their outputs, it is ignored. Extremely useful for Eternal Ores ore processing chain recipes, and
a few others.

Any Eternal Ores recipe that was unified, is left as is, untouched. No core progression recipes are touched, and no mod 
functionality is affected in any way whatsoever.

But this was made since some of Eternal Ores recipe outputs differ from the Original mod recipe outputs.

### Furnace Settings
Only available if Iron Furnaces mod is present.

Lets you tweak any Custom Eternal Ores Furnace base or factory smelting speeds, the amount of energy each furnace produces,
items smelted at once for both base and factory, and the furnace tier.

There is only one furnace, sadly, but there is a slight chance that more may be added in the future.

### Materials
Helps you to disable any unwanted material set or specific form or block for all of Eternal Ores included sets.

### Mining Dimension Settings
Allows you to tweak Eternal Ores mining dimension layer heights, where they start/end and the max build height.

### Prospector Hud
This one is only created once you tweak the Basic Prospector overlay position. Nothing more.

### Tool Settings
Offers you to highly tweak most of Eternal Ores tools. Either by disabling them, if the tool can be repaired, if so how much
durability point per material nugget or stone button (don't ask xd) is restored. If the Mining Dimension teleporter is available.
And the prospectors scan radius, and their whitelisted and blacklisted materials they can search.

### Tooltips Settings
If you find a specific tooltip annoying, this config is for you.

### Tweaks
Tweaks config, firstly named as Mixins Config, lets you tweak the behaviour of certain machines and their inputs, like
Immersive Engineering and Energized Power Metal Presses, since both of these machines, for whatever reason, use an Itemstack as
their mold input and not the lovely Ingredient. 

Almost Unified does its job fabulously if Eternal Ores, Immersive Engineering, and ~~Energized Power~~ molds have 
the `c:tools/molds/plate` tag, tag introduced and created by Eternal Ores. 

If you find this tag annoying, and decide to delete it, you may want to toggle this config...

### World Gen Settings
The name suggests it, allows you to heavily modify EO's ores vein size, veins per chunk, if it's rare or not, if it's placement
is trapezoid or uniform, and if the ore, in any dimension (vanilla ore values only affect the mining dim, not their og dimension) 
is available or not.

---

### All Previously mentioned configs, *except Prospector HUD*, need to be shipped by default on your modpacks.