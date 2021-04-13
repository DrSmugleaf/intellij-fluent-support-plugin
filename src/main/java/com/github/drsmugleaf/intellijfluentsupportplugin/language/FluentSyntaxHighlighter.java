package com.github.drsmugleaf.intellijfluentsupportplugin.language;

import com.github.drsmugleaf.intellijfluentsupportplugin.language.psi.FluentTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.*;

/**
 * Created by DrSmugleaf on 05/04/2021
 */
public class FluentSyntaxHighlighter implements SyntaxHighlighter {
    public static final TextAttributesKey KEY_VALUE_SEPARATOR =
            createTextAttributesKey("KEY_VALUE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{KEY_VALUE_SEPARATOR};
    public static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new FluentLexerAdapter();
    }

    @Override
    public @NotNull TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(FluentTypes.EQUALS)) {
            return SEPARATOR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
