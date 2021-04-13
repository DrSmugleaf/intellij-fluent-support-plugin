package com.github.drsmugleaf.intellijfluentsupportplugin.language;

import com.intellij.lang.Language;

/**
 * Created by DrSmugleaf on 05/04/2021
 */
public class FluentLanguage extends Language {
    public static final FluentLanguage INSTANCE = new FluentLanguage();

    protected FluentLanguage() {
        super("Fluent");
    }
}
