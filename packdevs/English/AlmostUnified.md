**Almost Unified**
-

This is one of the mods that we highly strongly suggest and advise on using the most with Eternal Ores. Since EO adds 200+ materials and their forms
that other mods add, like; Aluminum, Bronze, Constantan, etc.

Almost Unified does an excellent job at what it does, however, certain materials that share the same tag, like **Certus Quartz** and **Charged Certus Quartz**, 
share the `c:gems/certus_quartz` tag, and if we add the type certus to `placeholders.json` it will hide one or another. Eternal Ores added its own Certus Quartz Gem 
which has the exact tag as well. Depending on how set the priority list, it will show any of these certus gems.

To make sure, the Charged Certus Quartz item, we need to place it over `"ignored_items"`
```
"ignored_items": [
"ae2:charged_certus_quartz_crystal"
],
```
One thing that im aware, is that plenty of people may prefer AE2 Certus and Fluix Gems textures over Eternal Ores ones. To show these original items, we only need to tell AU that we 
prefer said `tag` from said `mod` over our `"priority_overrides"`, this will hide Eternal Ores Certus or Fluix Gems, whilst maintaining the Unification intact.
```
"priority_overrides": {
"c:gems/fluix": "ae2",
"c:gems/certus_quartz": "ae2"
},
```
Over Almost Unified folder we made sure to provide you the entire Eternal Ores material list, over `placeholders.json`, and
all tag, mod, priorities overrides, unification over `materials.json`. This will ensure that AE2, Actually Additions and Ars Nouveau items and blocks
show and hide Eternal Ores versions, if preferred.

So make sure to grab these files for your projects, and if we are missing a mod/tag let us know.

Another important thing, there are 2 regexed recipe id's over `'materials.json'`, those recipes are completely ignored, **intentionally**. Those regexed recipes will output their
cobble/stone block type, respecting the 'original' idea/vision of those 2 recipe types, specifically for Ore Blocks. In case you decide to remove those regexed recipe
id's from `'materials.json'`, you'll end up with, possibly, 4 recipes that need `c:ores/material` tag as an input, with 4 possible cobble/stone block outputs, or none due to
Almost Unified recipe unification.

Oh, I forgot to mention, some implemented Recipes from Eternal Ores from certain mods aren't fully unified... 

¿Then why the heck would you implement these recipes in the first place if no unification will be made?

Not that I really knew honestly at the time tbh. But Oritech Fragment Forge recipes are a good example. The Fragment Forge original raw material recipe outputs differ lots,
oritech's gold, copper, platinum, nickel and iron do output their Clumps and Small Clumps Items, whilst those compat recipes from other mods like Mekanism who has Clump Items,
will output their corresponding material Clump, but mekanism doesn't have any Small Clumps, so these got replaced by Nuggets. However, Eternal Ores added its own Small Clump Items,
simply to make its integration with Oritech a bit smoother, and Eternal Ores implemented recipes do output both Clumps and Small Clumps. The same can be said with the majority of
ore block processing recipes, as they have **very** different outputs.

Unfortunately, Almost Unified doesn't fully recognize both Eternal Ores and Oritech's recipes Raw Material Recipes, since both `recipes` from the same `recipe type` differ in `results`, `time`,
`result count`, etc. But Eternal Ores added, something a bit annoying to some, that removes overlapping and duplicate recipes, one works by removing specific recipe id's, and the other
by comparing inputs and outputs.

This system can be toggled over the `external-recipe-handler` config, and is shipped as false by default.

**Basic** only toggles recipes that are, unwanted, not unified, or that smart system didn't fully toggle, that may collide with Eternal Ores and other mods recipes.
                
**Smart** compares recipe `input` ingredients across every supported `recipe type`, and where it can also resolve **BOTH** recipes' `outputs`, requires those `outputs` to **overlap** too before
removing anything. If Smart can't confidently resolve a recipe's `output`, it leaves that recipe **untouched** rather than risk removing something **unrelated**.

Runs after Almost Unified finishes its own tag, item and recipe unification. If said Eternal Ores recipe was unified, **it is left as is** and nothing is removed.