package com.github.drsmugleaf.intellijfluentsupportplugin.language;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by DrSmugleaf on 05/04/2021
 */
public class FluentLexerAdapter extends FlexAdapter {
    public FluentLexerAdapter() {
        super(new FluentLexer(null));
    }
}
