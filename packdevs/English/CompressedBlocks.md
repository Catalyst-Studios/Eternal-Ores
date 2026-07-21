**Compressed Blocks**
-
As other mods have done it, Eternal Ores offers its own set of Compressed Blocks.

But something that we must point out, is that Eternal Ores Compressed Blocks are highly configurable, and you can also
create your own as well!

This allows you, and other packdevs, to create any type of compressed block you want with a single step.

We made sure to provide you most Vanilla Blocks, all of Eternal Ores blocks, and other mods compressed versions, so you do not need to.

To create your own compressed blocks, open up `'config/eternalores/compressed_blocks.json'` to get started.

Within our .json file we only need to add, inside a curly bracket pair, `"id": "mod_id:block_id"`, and done.

---

### Wait, just like that?

Correct, you only need to provide the .json file the `mod_id`, like `create`, and the wanted `block_id` to compress,
like `andesite_alloy_block`. Make sure to check the block id in-game.

```
[
  { 
    "id": "modid:block_id"
  }, To add more entries, just repeat the same steps and add a comma at the end of the curly
  
  A quick example;
  {
    "id": "create:andesite_alloy_block"
  },  
  {
    "id": "create:experience_block"
  },
  
  {
    If the block_id doesn't match an actual registered block, that entry is skipped with a warning in the log - check your logs if a block doesn't show up.
  },
  
  {
    "id": "oritech:steel_block"
    
    block_id collisions across mods are auto-resolved and both blocks can exist, no action needed.
    
    "id": "eternalores:steel_block"

    The highest registered block of the list with the same id has a higher priority.
    
    Meaning that if we register oritech's steel block, it will have its mod_id as the block name suffix.
    'steel_block_oritech'
  },
  
  {
    Only a single entry is allowed per curly bracket pair.
  },
  
  {
    Each block needs to be inside its curly brackets, else it will break and de-register any available block, so double check.
  },
  
  {
    Any unwanted compressed entry can be deleted safely.
  }
]
```

### However, there may be certain instances where our created block doesn't look like it should or its texture is missing.

Something we did not mention earlier, is that we have 3 optional fields we can add to our entries;
- `'model_override'`
- `'no_occlusion'`
- `'layers'`

And these 3 optional fields are our solution.

But with `model override` and `layers` you'll be forced to dig into said mod id `models/block` or `textures/block` paths. So prep yourself.

Over our `.json` file there are some entries with these fields by default, but let us explain what these do, even if they're a bit or very self-explanatory.

---
### Model Override

Model override, as the name suggests, overrides the default `block_id` model to other `model_id` from the same `mod_id` or different `mod_ids`.

To assign a `model_id` from a different `mod_id`, we have to make sure to write the complete `mod_id:model_id`.

Something like this; `{ "id": "eternalores:aluminum_block", "model_override": "immersiveengineering:storage_aluminum" }`

Something we should know, is that if both `block_id` and `model_id` matches, it will use `block_id | model_id` by default, if none matches, the block model
will not load at all. A bit quirky ngl.

But Minecraft's mushroom blocks are a great example if we need to use a specific `'model_id'` from said `'block_id'` of the same `'mod_id'`,
a tiny bitty confusing truth being told. If we take a look at Minecraft's mushroom block models, we will find 2 models per block, `'_block'` and `'_inventory'`.

**Inventory** is the model Minecraft uses to render the block on any GUI, which is the one that has the **red/brown/stem** textures on all faces.

**Block** one is similar, but not quite, as this model file has different textures per face.

However, other blocks, like **Create's** or **Mekanism's**, will have the same issue, where the model won't load at all.

If we take a look at Create's `assets/models/block/` path, asurine has not one, but 4 models that end with `_natural_x`.
In our override, we must declare the specific `_natural_x` to use, like `asurine_natural_0`.

In Mekanism's instance, it's kinda the same thing, model file with a different name, but not quite as **Reinforced Glowstone**, **Obsidian block**, and other models are
over its `models/block/storage` **subfolder**. In our model override, we must define if it's within a **subfolder** when putting our `model_id`.
```
[ 
    {
        "id": "minecraft:mushroom_stem", "model_override": "mushroom_stem_inventory"
    }
]
```
---
### No Occlusion
No Occlusion does what you expect. It assigns the noOcclusion Block Property to the specified block.

Certain blocks have special properties, such as glass-like, slime and honey blocks, these blocks use NoOcclusion, meaning, these blocks
will let Light through them and let you see through them.

It is not necessary to set the value as false in any entry at all, as it's already false by default. Only assign `"no_occlusion": true` if the block is glass-like,
or similar to honey/slime blocks.

In certain occasions it will work just fine without this field, if not make sure to add it.
```
[ 
    {
        "id": "minecraft:honey_block", "no_occlusion": true
    }
]    
```
---
### Layers
Layers is a bit special, and it's similar to model override, but not quite. As layers can define multiple "layers" of
different textures to a single model, either from the same `'mod_id'` or different ones, and if said `'block_id'` model uses **tints**, we need
to set it to **true**, otherwise the compressed block **tint value will disappear**.

Xycraft's Xychorium gem blocks are a great example for this one.

If we take a look at xychorium_storage model file, from xycraft world, they use 2 different textures for a single model, and there
is only one `xychorium_storage` model file, which handles all **5** types of xychorium colored gem blocks.

Base `cloudfx` texture is custom FX, and Texture Single `xychorium_storage_single`, which is the block overlay.

What we do here, it's not so different, since we are merging 2 different textures into a single model, respecting
each `block_id` with its assigned tint value.

Layers, as already stated, will inject a texture of specific id, to another, and to another, and so forth.

We can also use layers to tell other blocks to look like others, but this is too much effort, and we have an easier way available.
```
[
    {
       "id": "xycraft_world:xychorium_storage_blue", "layers": 
        [
            { 
                "texture": "xycraft_core:block/cloudfx", "tint": true 
            },
            
            { 
                "texture": "xycraft_world:block/connected/xychorium_storage_single", "tint": true 
            }
        ]
    }
]
```
---
### Additional example
And lastly, you can assign different values into a single entry `"no_occlusion": true, "model_override": "model_id"`

However, make sure to not mix **Layers** and **Model Override**. Otherwise, you'll end up creating a spaghetti of a model that will
either look very weird, terrible, or horrible.
```
[
  { 
    "id": "ae2:quartz_glass", "no_occlusion": true, "layers": 
    [
        { 
            "texture": "ae2:block/glass/quartz_glass_a", "tint": false 
        },
        
        { 
            "texture": "ae2:block/glass/quartz_glass_frame1111", "tint": false 
        }
    ] 
  }
]
```
---

Once you create your own compressed block, restart your game, and you now have a complete set of Compressed Blocks from
1x to 9x. These blocks are assigned to EO Compressed Block tab, so make sure to check if everything is in place.

Additionally;
- `compressed-block-config.toml` automatically overrides the previous file to add the newly added entries, this config
  allows you to disable any compression level of said block if desired.

- Tags are generated virtually at runtime, already defined and newly added entries should have the following tags:
  `'needs_stone_tool'`, `mineable/pickaxe`, `'c:compressed_blocks'` and `'c:compressed_blocks/material'`. These last 2 tags come
  in as common Item and Block Tags.

- Recipes are generated virtually at runtime, and they come from `original_block <-> 1x <-> 9x`

- Models and Blockstates are baked and generated virtually at runtime, block models are auto-assigned from its parent block model file (**if both block_id and model_id match**)

- Compressed Block langs are generated virtually at runtime

- And lastly, all compressed blocks drop themselves. If not, make sure to report it please xd

But what about their Sound and Hardness? Well, Sound is fetched automatically from the original block itself, and hardness is
hardcoded to `2.0`.

Fully compatible with any system that automatically de/compresses, liek Mega Cells Compression card, or anything similar.