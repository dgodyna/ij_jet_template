package com.github.dgodyna.ijjettemplate

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon


class JetFileType : LanguageFileType(JetLanguage.INSTANCE) {
    override fun getName(): String {
        return "Jet File"
    }

    override fun getDescription(): String {
        return "Jet language file"
    }

    override fun getDefaultExtension(): String {
        return "jet"
    }

    override fun getIcon(): Icon? {
        return JetIcon.FILE
    }

    companion object {
        @JvmStatic
        val INSTANCE = JetFileType()
    }
}