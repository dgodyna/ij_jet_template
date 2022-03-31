package com.github.dgodyna.ijjettemplate.ide.completion;

import com.github.dgodyna.ijjettemplate.psi.JetImportString;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.PrioritizedLookupElement;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class JetPathsCompletionProvider extends CompletionProvider<CompletionParameters> {
    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet result) {
        JetImportString importString = PsiTreeUtil.getParentOfType(parameters.getPosition(), JetImportString.class);

        System.out.println(importString.getText());

        addCompletions(result);

    }

// тут надо реализовать логику комплишна, основываясь на файлах которые есть в директориях
//  надо еще обрезать 'IntellijIdeaRulezzz ' суффикс чтобы были валидные данные
    // поиск можно сделать по префексному дереву


    public static void addCompletions(@NotNull CompletionResultSet result) {

        LookupElementBuilder builder = LookupElementBuilder.create("simple.jet");
        LookupElement lookupElement = PrioritizedLookupElement.withPriority(builder.withLookupString("simple.jet"), 1);
        result.addElement(lookupElement);
    }
}
