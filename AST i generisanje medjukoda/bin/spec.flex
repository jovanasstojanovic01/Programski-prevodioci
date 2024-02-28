// import sekcija
import java_cup.runtime.*;

%%
// sekcija opcija i deklaracija
%class MPLexer

%cup

%line
%column

%eofval{
	return new Symbol( sym.EOF );
%eofval}

%{
   public int getLine()
   {
      return yyline;
   }
%}

//stanja
%xstate KOMENTAR

//makroi
slovo = [a-zA-Z]
cifra = [0-9]

%%

// pravila
\/\*\* { yybegin( KOMENTAR ); }
<KOMENTAR>~"*/" { yybegin( YYINITIAL ); }


[\t\n\r ] 									{ ; }
\( 											{ return new Symbol( sym.LEFTPAR  ); }
\) 											{ return new Symbol( sym.RIGHTPAR ); }

\{ 											{ return new Symbol( sym.LEFTCB  ); }
\} 											{ return new Symbol( sym.RIGHTCB ); }

// Separatori
; 											{ return new Symbol( sym.SEMICOLON ); }
: 											{ return new Symbol( sym.COLON 	   ); }

// RelOp
\<\> 										{ return new Symbol( sym.NOTEQ 	 ); }
\<\= 										{ return new Symbol( sym.LOWOREQ ); }
\< 											{ return new Symbol( sym.LOW 	 ); }
\=\= 										{ return new Symbol( sym.EQ 	 ); }
\>\= 										{ return new Symbol( sym.GROREQ  ); }
\> 											{ return new Symbol( sym.GR 	 ); }

// Assignment
\:\= 										{ return new Symbol( sym.ASSIGN ); }

// Const
// Boolean
"true" | "false" 							{ return new Symbol( sym.BOOLEANCONST, Boolean.parseBoolean( yytext() ) ); }

// Int
([2-9] | 1[0-6])?\#?{cifra}+ 				{ return new Symbol( sym.INTEGERCONST, Integer.parseInt( yytext() ) ); }

// Real
{cifra}+\.{cifra}*(\E (\+ | \-)? {cifra}+)? { return new Symbol( sym.REALCONST, Float.parseFloat( yytext() ) ); }


// Kljucne reci
"main" 										{ return new Symbol( sym.MAIN 	 ); }
"int" 										{ return new Symbol( sym.INTEGER );	}
"real" 										{ return new Symbol( sym.REAL 	 );	}
"boolean" 									{ return new Symbol( sym.BOOLEAN );	}
"if" 										{ return new Symbol( sym.IF 	 );	}
"elif" 										{ return new Symbol( sym.ELIF 	 );	}
"else" 										{ return new Symbol( sym.ELSE 	 );	}

// ID
{slovo}({slovo} | {cifra})* 				{ return new Symbol( sym.ID, yyline, yytext() ); }

// Obrada gresaka
. 											{ System.out.println( "ERROR: " + yytext() ); }