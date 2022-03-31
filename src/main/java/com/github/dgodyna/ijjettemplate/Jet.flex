// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.github.dgodyna.ijjettemplate;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.github.dgodyna.ijjettemplate.psi.JetTypes;
import com.intellij.psi.TokenType;

%%

%class JetLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

TEXT = [^{]*
COMMENT = \{\*(.)*\*\}
LDOUBLE_BRACE = "{{"
BRACE = "{"
STR =      "\""
ESCAPES = [abfnrtv]

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

ANY_CHAR = (.|[\n])



%state ST_ACTION
%%
<YYINITIAL> {
        {TEXT}                        { return JetTypes.TEXT; }
        {COMMENT}                     { return JetTypes.COMMENT; }
        {LDOUBLE_BRACE}               { yybegin(ST_ACTION);return JetTypes.LDOUBLE_BRACE; }
        {BRACE}                       { return JetTypes.TEXT; }
}

<ST_ACTION> {
  {STR} ( [^\"\\\n\r] | "\\" ("\\" | {STR} | {ESCAPES} | [0-8xuU] ) )* {STR}? { return JetTypes.STRING; }
  {WHITE_SPACE}         { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "{{"                  { return JetTypes.LDOUBLE_BRACE; }
  "}}"                  { yybegin(YYINITIAL);return JetTypes.RDOUBLE_BRACE; }
  "import"              { return JetTypes.IMPORT; }

}

<YYINITIAL,ST_ACTION> {
   {ANY_CHAR} { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
