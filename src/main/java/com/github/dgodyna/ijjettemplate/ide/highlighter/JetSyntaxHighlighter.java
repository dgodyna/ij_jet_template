// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package com.github.dgodyna.ijjettemplate.ide.highlighter;

import com.github.dgodyna.ijjettemplate.JetLexerAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.github.dgodyna.ijjettemplate.psi.JetTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class JetSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("JET_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("JET_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("JET_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("JET_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("JET_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    public static final TextAttributesKey BRACES =
            createTextAttributesKey("JET_BRACES", DefaultLanguageHighlighterColors.BRACES);


    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BRACES_KEYS = new TextAttributesKey[]{BRACES};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new JetLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(JetTypes.LDOUBLE_BRACE) || tokenType.equals(JetTypes.RDOUBLE_BRACE)) {
            return BRACES_KEYS;
        }
        if (tokenType.equals(JetTypes.STRING)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(JetTypes.IMPORT)) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(JetTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

}