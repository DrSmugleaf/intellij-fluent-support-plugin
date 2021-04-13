package com.github.drsmugleaf.intellijfluentsupportplugin.language.psi;

import com.github.drsmugleaf.intellijfluentsupportplugin.language.FluentLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * Created by DrSmugleaf on 05/04/2021
 */
public class FluentTokenType extends IElementType {
    public FluentTokenType(@NotNull String debugName) {
        super(debugName, FluentLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "FluentTokenType." + super.toString();
    }
}
