package com.github.dgodyna.ijjettemplate.ide.completion;

import com.github.dgodyna.ijjettemplate.psi.JetTypes;
import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.patterns.PsiElementPattern;
import com.intellij.psi.PsiElement;

import static com.intellij.patterns.PlatformPatterns.psiElement;


public class JetCompletionContributor extends CompletionContributor {
    public JetCompletionContributor() {
        extend(CompletionType.BASIC, importString(), new JetPathsCompletionProvider());
    }

    private static PsiElementPattern.Capture<PsiElement> importString() {
        return psiElement().withElementType(JetTypes.STRING)  ;
//                .withParent(JetStringLiteral.class)
//                .withSuperParent(20, JetImportStatement.class);
    }


}
