// This is a generated file. Not intended for manual editing.
package com.github.dgodyna.ijjettemplate.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.dgodyna.ijjettemplate.psi.impl.*;

public interface JetTypes {

  IElementType PROPERTY = new JetElementType("PROPERTY");

  IElementType COMMENT = new JetTokenType("COMMENT");
  IElementType CRLF = new JetTokenType("CRLF");
  IElementType KEY = new JetTokenType("KEY");
  IElementType SEPARATOR = new JetTokenType("SEPARATOR");
  IElementType VALUE = new JetTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new JetPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
