package com.github.dgodyna.ijjettemplate.psi;

import com.github.dgodyna.ijjettemplate.JetFileType;
import com.github.dgodyna.ijjettemplate.JetLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class JetFile extends PsiFileBase {

    public JetFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, JetLanguage.getINSTANCE());
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return JetFileType.getINSTANCE();
    }

    @Override
    public String toString() {
        return "Jet File";
    }

}