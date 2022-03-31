// This is a generated file. Not intended for manual editing.
package com.github.dgodyna.ijjettemplate.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.dgodyna.ijjettemplate.psi.JetTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.dgodyna.ijjettemplate.psi.*;

public class JetStringExprImpl extends ASTWrapperPsiElement implements JetStringExpr {

  public JetStringExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JetVisitor visitor) {
    visitor.visitStringExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JetVisitor) accept((JetVisitor)visitor);
    else super.accept(visitor);
  }

}
