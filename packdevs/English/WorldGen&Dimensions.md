**World Generation and Dimensions**
=
We know for a fact that not all of Eternal Ores included ores will be used, and these can be disabled via Config!

But before you proceed, lets point out a very important thing.

- If you disable any ore, aluminum_overworld as an example, it will not generate nor its Stone, and Slate versions within
  the Overworld. But it will be available over the Mining Dimension.

All Ore values are separated so you can control which ore spawns in which dimension, at what height, if it's rare, uniform or trapezoid over
`world-gen-config.json`, do know that the list is **BIG**.

Eternal Ores included Ores and Vanilla Ores generate naturally within the Mining Dimension, other Mods Ores DO NOT SPAWN
naturally within the Mining Dimension.

Read the section below if you're interested in generating other mods ores in the mining dimension in your modpack.

---
We'd also like to talk about our Mining Dimension.

This dimension, as the name suggests and as other mods done it, is where you may find all of EO ores and Vanilla Ores by
default.

- EO ores can be disabled via config, as we stated earlier.


- Vanilla ores can be disabled via config as well, however, these will only disappear from the Mining Dimension.

And what about other mods ores, where are they?

Well, those need to be added via Datapack with either KubeJS or CraftTweaker.

However, next Eternal Ores update will try to include a way for you to inject any ore you desire with a few steps.

And here is an example of how the files should look like, both code or direct .json files should work.

Biome Modifier
```
{
    "type": "neoforge:add_features",
    "biomes": "#eternalores:is_mining_dim",
    "features": "modid:ore_name",
    "step": "underground_ores"
}
```

Placed Features

For the mining dimension, lets say that an ore has stone and deepslate variant, for this we need to change the max and min
inclusive values with the following values;

- max = 155 - (or below this range)


- min = -128 (or above this range)

But what if the ore is only found in the nether or end? Here are the values of where the stone layer starts - end, etc.

- Stone Height Max = 155;
- Stone Height Min = -64;


- Slate Height Max = -65;
- Slate Height Min = -128;


- Nether Height Max = -129;
- Nether Height Min = -160;


- End Height Max = -161;
- End Height Min = -191;

```
{
  "feature": "modid:ore_name",
  "placement": [
    {
      "type": "minecraft:count",
      "count": 10 - edit this if necessary
    },
    {
      "type": "minecraft:in_square"
    },
    {
      "type": "minecraft:height_range",
      "height": {
        "type": "minecraft:uniform", - edit this if necessary (uniform or trapezoid)
        "max_inclusive": {
          "absolute": 80 - edit this
        },
        "min_inclusive": {
          "absolute": -64 - edit this
        }
      }
    },
    {
      "type": "minecraft:biome"
    }
  ]
}
```

Configured Features

And lastly, the type of ore and which block to replace, we've provided the complete list of Stone, Slate, Netherrack and
End Stone. If the ore only spawns in the nether, then you can safely delete the unwanted feature;

```
      {
        "state": {
          "Name": "modid:ore_name"
        },
        "target": {
          "predicate_type": "minecraft:tag_match",
          "tag": "minecraft:stone_ore_replaceables"
        }
      },
```

Here's the complete Configured Feature if you want to add all layers for the wanted ore.

```
{
  "type": "minecraft:ore",
  "config": {
    "discard_chance_on_air_exposure": 0.0, - may be edited, but not worth since its for the mining dim
    "size": 9, - edit this if necessary
    "targets": [
      {
        "state": {
          "Name": "modid:ore_name"
        },
        "target": {
          "predicate_type": "minecraft:tag_match",
          "tag": "minecraft:stone_ore_replaceables"
        }
      },
      {
        "state": {
          "Name": "eternalores:deepslate_aluminum_ore_block"
        },
        "target": {
          "predicate_type": "minecraft:tag_match",
          "tag": "minecraft:deepslate_ore_replaceables"
        }
      },
      {
        "state": {
          "Name": "modid:ore_name"
        },
        "target": {
          "predicate_type": "minecraft:tag_match",
          "tag": "minecraft:netherrack"
        }
      },
      {
        "state": {
          "Name": "modid:ore_name"
        },
        "target": {
          "predicate_type": "minecraft:tag_match",
          "tag": "minecraft:end_stone"
        }
      }
    ]
  }
}
```

And with all these examples, we hope to give you an idea of how you may do these with KubeJS or CraftTweaker
files, not direct .json files.