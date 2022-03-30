package com.github.dgodyna.ijjettemplate.psi

import org.jetbrains.annotations.NonNls
import com.github.dgodyna.ijjettemplate.JetLanguage
import com.intellij.psi.tree.IElementType

class JetElementType(debugName: @NonNls String) : IElementType(debugName, JetLanguage.INSTANCE)