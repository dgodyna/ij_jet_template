package com.github.dgodyna.ijjettemplate

import com.intellij.lang.Language

class JetLanguage : Language("Jet Template") {
    companion object {
        @JvmStatic
        val INSTANCE = JetLanguage()
    }
}