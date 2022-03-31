package com.github.dgodyna.ijjettemplate.ide.editor;

import com.github.dgodyna.ijjettemplate.psi.JetTypes;
import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JetBraceMatcher implements PairedBraceMatcher {
    @Override
    public BracePair @NotNull [] getPairs() {
        return  new BracePair[]{new BracePair(JetTypes.LDOUBLE_BRACE, JetTypes.RDOUBLE_BRACE, false)};
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return false;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return 0;
    }
}
