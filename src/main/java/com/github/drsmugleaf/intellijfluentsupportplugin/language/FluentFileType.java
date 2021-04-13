package com.github.drsmugleaf.intellijfluentsupportplugin.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by DrSmugleaf on 05/04/2021
 */
public class FluentFileType extends LanguageFileType {
    public static final LanguageFileType INSTANCE = new FluentFileType();

    private FluentFileType() {
        super(FluentLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "Fluent File";
    }

    @Override
    public @NotNull String getDescription() {
        return "";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "ftl";
    }

    @Override
    public @Nullable Icon getIcon() {
        return FluentIcons.FILE;
    }
}

