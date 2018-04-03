import java_cup.runtime.*;
%%

%cup
%class AnalizadorLexico
%line
%column


%%

/* VARIABLES NECESARIAS */

"#define"		{return new java_cup.runtime.Symbol(sym.define, yyline, yycolumn);}

"("             {return new java_cup.runtime.Symbol(sym.aperturaParentesis, yyline, yycolumn);}

")"             {return new java_cup.runtime.Symbol(sym.cierreParentesis, yyline, yycolumn);}

"{"             {return new java_cup.runtime.Symbol(sym.aperturaLlaves, yyline, yycolumn);}

"}"             {return new java_cup.runtime.Symbol(sym.cierreLlaves, yyline, yycolumn);}

"void"			{return new java_cup.runtime.Symbol(sym.vvoid,yyline, yycolumn);}

","				{return new java_cup.runtime.Symbol(sym.coma,yyline, yycolumn);}

"int"			{return new java_cup.runtime.Symbol(sym.vint,yyline, yycolumn);}

"float"			{return new java_cup.runtime.Symbol(sym.vfloat,yyline, yycolumn);}

"return"		{return new java_cup.runtime.Symbol(sym.vreturn,yyline, yycolumn);}

";"             {return new java_cup.runtime.Symbol(sym.punto_coma, yyline, yycolumn);}

"="				{return new java_cup.runtime.Symbol(sym.igual,yyline, yycolumn);}
	
"+"				{return new java_cup.runtime.Symbol(sym.mas,yyline, yycolumn);}
	
"-"				{return new java_cup.runtime.Symbol(sym.menos,yyline, yycolumn);}
	
"*"				{return new java_cup.runtime.Symbol(sym.mult,yyline, yycolumn);}
	
"/"				{return new java_cup.runtime.Symbol(sym.diventera,yyline, yycolumn);}
	
"%"				{return new java_cup.runtime.Symbol(sym.divreal,yyline, yycolumn);}



/* IDENTIFICADORES ENUNCIADO */

[+-]?[0-9]+		{return new java_cup.runtime.Symbol(sym.numeric_integer_const, yyline, yycolumn);}

[+-]?[0-9]+"."[0-9]+		{return new java_cup.runtime.Symbol(sym.numeric_real_const, yyline, yycolumn);}

"0"[+-]?[0-7]+            {return new java_cup.runtime.Symbol(sym.numeric_integer_const, yyline, yycolumn);}

"0"[+-]?[0-7]+"."[0-7]+        {return new java_cup.runtime.Symbol(sym.numeric_real_const, yyline, yycolumn);}

"0x"[+-]?[0-9A-F]+        {return new java_cup.runtime.Symbol(sym.numeric_integer_const, yyline, yycolumn);}

"0x"[+-]?[0-9A-F]+"."[0-9A-F]+    {return new java_cup.runtime.Symbol(sym.numeric_real_const, yyline, yycolumn);}

[a-zA-Z$][a-zA-Z0-9$_]*        {return new java_cup.runtime.Symbol(sym.ident, yyline, yycolumn);}

"'"[^]"'"		{return new java_cup.runtime.Symbol(sym.constlit,yyline, yycolumn, yytext());}

"//"		{;}

"/*"[^]"*/"		{;}


" "		{;}

\n|\r|\t	{;}

.		{System.out.println("Error en el analizador lexico: " + yytext() + " en la linea " + yyline + " y el caracter de la posicion " + yycolumn);}


