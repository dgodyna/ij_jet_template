// This is a generated file. Not intended for manual editing.
package com.github.dgodyna.ijjettemplate.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.dgodyna.ijjettemplate.psi.impl.*;

public interface JetTypes {

  IElementType IMPORT_STATEMENT = new JetElementType("IMPORT_STATEMENT");
  IElementType STATEMENT_LIST = new JetElementType("STATEMENT_LIST");
  IElementType STRING_EXPR = new JetElementType("STRING_EXPR");

  IElementType COMMENT = new JetTokenType("");
  IElementType IMPORT = new JetTokenType("import");
  IElementType LDOUBLE_BRACE = new JetTokenType("{{");
  IElementType RDOUBLE_BRACE = new JetTokenType("}}");
  IElementType STRING = new JetTokenType("STRING");
  IElementType TEXT = new JetTokenType("TEXT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == IMPORT_STATEMENT) {
        return new JetImportStatementImpl(node);
      }
      else if (type == STATEMENT_LIST) {
        return new JetStatementListImpl(node);
      }
      else if (type == STRING_EXPR) {
        return new JetStringExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
