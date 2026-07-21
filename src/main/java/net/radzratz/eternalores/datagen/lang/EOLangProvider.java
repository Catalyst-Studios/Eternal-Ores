package net.radzratz.eternalores.datagen.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.radzratz.eternalores.datagen.EODataProvider;
import net.radzratz.eternalores.datagen.lang.EN.EOLocalizationEN_US;
import net.radzratz.eternalores.datagen.lang.ES.*;

import java.util.ArrayList;
import java.util.List;

public class EOLangProvider {
    private static final List<LanguageProvider> langs = new ArrayList<>();

    public static void registerLangs(PackOutput packOutput) {
        if (!langs.isEmpty()) return;

        langs.add(new EOLocalizationEN_US(packOutput));

        langs.add(new EOLocalizationES_ES(packOutput));
    }

    public static void addLangs(EODataProvider provider, boolean includeClient) {
        for (LanguageProvider lang : langs) {
            provider.addSubProvider(includeClient, lang);
        }
    }
}
