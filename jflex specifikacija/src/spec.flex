// import sekcija

%%

// sekcija opcija i deklaracija
%class MPLexer
%function next_token
%line
%column
%debug
%type Yytoken

%eofval{
return new Yytoken( sym.EOF, null, yyline, yycolumn);
%eofval}

%{
//dodatni clanovi generisane klase
KWTable kwTable = new KWTable();
Yytoken getKW()
{
	return new Yytoken( kwTable.find( yytext() ),
	yytext(), yyline, yycolumn );
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

[\t\n\r ] { ; }
\( { return new Yytoken( sym.LEFTPAR, yytext(), yyline, yycolumn ); }
\) { return new Yytoken( sym.RIGHTPAR, yytext(), yyline, yycolumn ); }
\{ { return new Yytoken( sym.CURVYLEFTPAR, yytext(), yyline, yycolumn ); }
\} { return new Yytoken( sym.CURVYRIGHTPAR, yytext(), yyline, yycolumn ); }

\< { return new Yytoken( sym.LESS,yytext(), yyline, yycolumn ); }
\<= { return new Yytoken( sym.LESSOREQUAL,yytext(), yyline, yycolumn ); }
== { return new Yytoken( sym.EQUAL,yytext(), yyline, yycolumn ); }
\<> { return new Yytoken( sym.NONEQUAL,yytext(), yyline, yycolumn ); }
> { return new Yytoken( sym.MORE,yytext(), yyline, yycolumn ); }
>= { return new Yytoken( sym.MOREOREQUAL,yytext(), yyline, yycolumn ); }

; { return new Yytoken( sym.SEMICOLON, yytext(), yyline, yycolumn ); }
: { return new Yytoken( sym.COLON, yytext(), yyline, yycolumn ); }
:= { return new Yytoken( sym.ASSIGN, yytext(), yyline, yycolumn ); }

//posebno bool
(true)|(false) { return new Yytoken( sym.BOOLEAN, yytext(), yyline, yycolumn ); }


{cifra}+\.{cifra}*(E[+-]{cifra}+)? { return new Yytoken( sym.REAL, yytext(), yyline, yycolumn ); }
//identifikatori
{slovo}({slovo}|{cifra})* { return new Yytoken(sym.ID, yytext(),yyline, yycolumn ); }

//kljucne reci
{slovo}+ { return getKW(); }

//konstante


{cifra}*#({slovo}|{cifra})+ { return new Yytoken( sym.INT, yytext(), yyline, yycolumn ); }
({slovo}|{cifra})+ { return new Yytoken( sym.INT, yytext(), yyline, yycolumn ); }

//obrada gresaka
. { if (yytext() != null && yytext().length() > 0) System.out.println( "ERROR: " + yytext() ); }
