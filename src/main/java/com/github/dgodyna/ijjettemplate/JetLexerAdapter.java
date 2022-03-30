package com.github.dgodyna.ijjettemplate;

import com.intellij.lexer.FlexAdapter;

public class JetLexerAdapter extends FlexAdapter {

    public JetLexerAdapter() {
        super(new JetLexer(null));
    }

}