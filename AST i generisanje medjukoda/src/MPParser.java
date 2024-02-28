
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Fri Dec 22 22:21:52 CET 2023
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.*;
import SymbolTable.*;
import AST.*;

/** CUP v0.10k generated parser.
  * @version Fri Dec 22 22:21:52 CET 2023
  */
public class MPParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MPParser() {super();}

  /** Constructor which sets the default scanner. */
  public MPParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\044\000\002\003\006\000\002\002\004\000\002\004" +
    "\006\000\002\006\004\000\002\006\003\000\002\007\005" +
    "\000\002\022\003\000\002\022\003\000\002\022\003\000" +
    "\002\005\005\000\002\005\003\000\002\010\003\000\002" +
    "\010\003\000\002\011\011\000\002\014\004\000\002\014" +
    "\003\000\002\014\003\000\002\014\002\000\002\015\004" +
    "\000\002\015\003\000\002\012\010\000\002\013\005\000" +
    "\002\021\005\000\002\021\003\000\002\020\003\000\002" +
    "\020\003\000\002\016\003\000\002\016\003\000\002\016" +
    "\003\000\002\016\003\000\002\016\003\000\002\016\003" +
    "\000\002\017\005\000\002\023\003\000\002\023\003\000" +
    "\002\023\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\076\000\004\004\005\001\002\000\004\002\100\001" +
    "\002\000\004\023\006\001\002\000\004\024\007\001\002" +
    "\000\004\010\011\001\002\000\004\002\001\001\002\000" +
    "\010\005\012\006\015\007\016\001\002\000\004\030\ufffb" +
    "\001\002\000\004\030\076\001\002\000\014\005\ufffd\006" +
    "\ufffd\007\ufffd\012\ufffd\030\ufffd\001\002\000\004\030\ufffa" +
    "\001\002\000\004\030\ufff9\001\002\000\014\005\012\006" +
    "\015\007\016\012\024\030\026\001\002\000\006\011\ufff6" +
    "\026\ufff6\001\002\000\014\005\ufffe\006\ufffe\007\ufffe\012" +
    "\ufffe\030\ufffe\001\002\000\006\011\073\026\074\001\002" +
    "\000\006\011\ufff5\026\ufff5\001\002\000\004\023\036\001" +
    "\002\000\006\011\ufff7\026\ufff7\001\002\000\004\025\027" +
    "\001\002\000\012\030\030\031\031\032\035\033\033\001" +
    "\002\000\024\011\uffe9\015\uffe9\016\uffe9\017\uffe9\020\uffe9" +
    "\021\uffe9\022\uffe9\024\uffe9\026\uffe9\001\002\000\024\011" +
    "\uffe0\015\uffe0\016\uffe0\017\uffe0\020\uffe0\021\uffe0\022\uffe0" +
    "\024\uffe0\026\uffe0\001\002\000\006\011\uffe1\026\uffe1\001" +
    "\002\000\024\011\uffde\015\uffde\016\uffde\017\uffde\020\uffde" +
    "\021\uffde\022\uffde\024\uffde\026\uffde\001\002\000\024\011" +
    "\uffe8\015\uffe8\016\uffe8\017\uffe8\020\uffe8\021\uffe8\022\uffe8" +
    "\024\uffe8\026\uffe8\001\002\000\024\011\uffdf\015\uffdf\016" +
    "\uffdf\017\uffdf\020\uffdf\021\uffdf\022\uffdf\024\uffdf\026\uffdf" +
    "\001\002\000\012\030\030\031\031\032\035\033\033\001" +
    "\002\000\004\024\051\001\002\000\020\015\045\016\046" +
    "\017\047\020\043\021\042\022\044\024\uffea\001\002\000" +
    "\012\030\030\031\031\032\035\033\033\001\002\000\012" +
    "\030\uffe2\031\uffe2\032\uffe2\033\uffe2\001\002\000\012\030" +
    "\uffe5\031\uffe5\032\uffe5\033\uffe5\001\002\000\012\030\uffe3" +
    "\031\uffe3\032\uffe3\033\uffe3\001\002\000\012\030\uffe4\031" +
    "\uffe4\032\uffe4\033\uffe4\001\002\000\012\030\uffe6\031\uffe6" +
    "\032\uffe6\033\uffe6\001\002\000\012\030\uffe7\031\uffe7\032" +
    "\uffe7\033\uffe7\001\002\000\004\024\uffeb\001\002\000\004" +
    "\027\052\001\002\000\004\010\011\001\002\000\012\011" +
    "\ufff0\013\060\014\055\026\ufff0\001\002\000\012\011\ufff2" +
    "\013\060\014\055\026\ufff2\001\002\000\004\027\067\001" +
    "\002\000\006\011\ufff4\026\ufff4\001\002\000\006\011\ufff1" +
    "\026\ufff1\001\002\000\004\023\062\001\002\000\012\011" +
    "\uffee\013\uffee\014\uffee\026\uffee\001\002\000\012\030\030" +
    "\031\031\032\035\033\033\001\002\000\004\024\064\001" +
    "\002\000\004\027\065\001\002\000\004\010\011\001\002" +
    "\000\012\011\uffed\013\uffed\014\uffed\026\uffed\001\002\000" +
    "\004\010\011\001\002\000\006\011\uffec\026\uffec\001\002" +
    "\000\006\011\ufff3\026\ufff3\001\002\000\012\011\uffef\013" +
    "\uffef\014\uffef\026\uffef\001\002\000\014\002\uffff\011\uffff" +
    "\013\uffff\014\uffff\026\uffff\001\002\000\006\012\024\030" +
    "\026\001\002\000\006\011\ufff8\026\ufff8\001\002\000\004" +
    "\026\077\001\002\000\014\005\ufffc\006\ufffc\007\ufffc\012" +
    "\ufffc\030\ufffc\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\076\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\007\001\001" +
    "\000\002\001\001\000\010\006\016\007\013\022\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\005\021\007" +
    "\020\010\024\011\022\017\017\022\012\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\020\031\023\033\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\020\037\021\036\023" +
    "\033\001\001\000\002\001\001\000\004\016\040\001\001" +
    "\000\006\020\047\023\033\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\052\001\001\000\012\012\060\013\056" +
    "\014\055\015\053\001\001\000\006\012\071\013\070\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\020\037\021" +
    "\062\023\033\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\065\001\001\000\002\001\001\000\004\004" +
    "\067\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\010\074\011\022\017" +
    "\017\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MPParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MPParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MPParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

	symbolTable = new SymbolTable();

    }


 
   SymbolTable symbolTable;
   

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MPParser$actions {
  private final MPParser parser;

  /** Constructor */
  CUP$MPParser$actions(MPParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MPParser$do_action(
    int                        CUP$MPParser$act_num,
    java_cup.runtime.lr_parser CUP$MPParser$parser,
    java.util.Stack            CUP$MPParser$stack,
    int                        CUP$MPParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MPParser$result;

      /* select the action based on the action number */
      switch (CUP$MPParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Konstanta ::= REALCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Float c = (Float)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
		System.out.println("17C. smena");
		RESULT = new Constant( parser.symbolTable.getType( "real" ), c );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(17/*Konstanta*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Konstanta ::= INTEGERCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Integer c = (Integer)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
		System.out.println("17B. smena");
		RESULT = new Constant( parser.symbolTable.getType( "integer" ), c );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(17/*Konstanta*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Konstanta ::= BOOLEANCONST 
            {
              Constant RESULT = null;
		int cleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Boolean c = (Boolean)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		
		System.out.println("17A. smena");
		RESULT = new Constant( parser.symbolTable.getType( "boolean" ), c ); 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(17/*Konstanta*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // Assignment ::= ID ASSIGN Term 
            {
              Assignment RESULT = null;
		int imeleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int imeright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		String ime = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Term t = (Term)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("16. smena");
        Variable var = parser.symbolTable.getVar( ime );
		RESULT = new Assignment( var, t);
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Assignment*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // RelOp ::= GROREQ 
            {
              String RESULT = null;
		 
		System.out.println("15F");
		RESULT = ">="; 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // RelOp ::= GR 
            {
              String RESULT = null;
		 
		System.out.println("15E. smena"); 
		RESULT = ">";
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // RelOp ::= NOTEQ 
            {
              String RESULT = null;
		 
		System.out.println("15D. smena");
		RESULT = "<>"; 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // RelOp ::= EQ 
            {
              String RESULT = null;
		 
		System.out.println("15C. smena");
		RESULT = "=="; 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // RelOp ::= LOWOREQ 
            {
              String RESULT = null;
		 
		System.out.println("15B. smena");
		RESULT = "<="; 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RelOp ::= LOW 
            {
              String RESULT = null;
		 
		System.out.println("15A. smena"); 
		RESULT = "<";
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Term ::= Konstanta 
            {
              Term RESULT = null;
		int kleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int kright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Constant k = (Constant)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("14B. smena");
		RESULT = new ConstantExpression( k );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Term ::= ID 
            {
              Term RESULT = null;
		int imeleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int imeright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		String ime = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("14A. smena"); 
		Variable var = parser.symbolTable.getVar( ime );
		RESULT = new VariableExpression( var );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // RelExpression ::= Term 
            {
              RelExpression RESULT = null;
		int tleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Term t = (Term)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("13B. smena");
		RESULT = new RelExpression( t );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // RelExpression ::= Term RelOp Term 
            {
              RelExpression RESULT = null;
		int op1left = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int op1right = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		Term op1 = (Term)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int relOpleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int relOpright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		String relOp = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		int op2left = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int op2right = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Term op2 = (Term)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("13A. smena");
		RESULT = new RelExpression( op1, relOp, op2);
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // ElseStatement ::= ELSE COLON Block 
            {
              IfStatement RESULT = null;
		int bleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Block b = (Block)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("12. smena");
		RESULT = new IfStatement( b );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*ElseStatement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Elif ::= ELIF LEFTPAR RelExpression RIGHTPAR COLON Block 
            {
              IfStatement RESULT = null;
		int releft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left;
		int reright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).right;
		RelExpression re = (RelExpression)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Block b = (Block)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("11. smena");
		RESULT = new IfStatement( re, b, new ArrayList<IfStatement>() );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Elif*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-5)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ElifList ::= Elif 
            {
              ArrayList RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		IfStatement e = (IfStatement)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("10B. smena");
		RESULT = new ArrayList<IfStatement>();
		RESULT.add( e ); 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ElifList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ElifList ::= ElifList Elif 
            {
              ArrayList RESULT = null;
		int elleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int elright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		ArrayList el = (ArrayList)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		IfStatement e = (IfStatement)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("10A. smena");
		RESULT = el;
		RESULT.add( e ); 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*ElifList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ElsePart ::= 
            {
              ArrayList RESULT = null;
		 
		System.out.println("9D. smena");
		RESULT = new ArrayList<IfStatement>();
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*ElsePart*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ElsePart ::= ElseStatement 
            {
              ArrayList RESULT = null;
		int esleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int esright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		IfStatement es = (IfStatement)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("9C. smena");
		RESULT = new ArrayList<IfStatement>();
		RESULT.add( es ); 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*ElsePart*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ElsePart ::= ElifList 
            {
              ArrayList RESULT = null;
		int elleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int elright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		ArrayList el = (ArrayList)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("9B. smena");
		RESULT = el;
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*ElsePart*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ElsePart ::= ElifList ElseStatement 
            {
              ArrayList RESULT = null;
		int elleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int elright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		ArrayList el = (ArrayList)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		int esleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int esright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		IfStatement es = (IfStatement)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("9A. smena"); 
		RESULT = el;
		RESULT.add( es );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*ElsePart*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // IfStatement ::= IF LEFTPAR RelExpression RIGHTPAR COLON Block ElsePart 
            {
              IfStatement RESULT = null;
		int releft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).left;
		int reright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).right;
		RelExpression re = (RelExpression)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Block b = (Block)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		int epleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int epright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		ArrayList ep = (ArrayList)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("8. smena");
		RESULT = new IfStatement( re, b, ep ); 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*IfStatement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-6)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Statement ::= IfStatement 
            {
              Statement RESULT = null;
		int ileft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		IfStatement i = (IfStatement)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("7B. smena");
		RESULT = i; 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Statement ::= Assignment 
            {
              Statement RESULT = null;
		int aleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Assignment a = (Assignment)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("7A. smena");
		RESULT = a; 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Statements ::= Statement 
            {
              Block RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("6B. smena");
		RESULT = new Block();
        RESULT.addStatement( s ); 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Statements*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Statements ::= Statements SEMICOLON Statement 
            {
              Block RESULT = null;
		int ssleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		Block ss = (Block)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("6A. smena"); 
		RESULT = ss;
		RESULT.addStatement( s );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Statements*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Type ::= BOOLEAN 
            {
              Type RESULT = null;
		 
		System.out.println("5C. smena");
		RESULT = parser.symbolTable.getType( "boolean" ); 
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Type ::= REAL 
            {
              Type RESULT = null;
		 
		System.out.println("5B. smena"); 
		RESULT = parser.symbolTable.getType( "real" );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Type ::= INTEGER 
            {
              Type RESULT = null;
		 
		System.out.println("5A. smena");
		RESULT = parser.symbolTable.getType( "integer" );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Variable ::= Type ID SEMICOLON 
            {
              Object RESULT = null;
		int tleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).value;
		int imeleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int imeright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		String ime = (String)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		 
		System.out.println("4. smena");
		parser.symbolTable.addVar( ime, t );
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Variable*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Variables ::= Variable 
            {
              Object RESULT = null;
		 
		System.out.println("3B. smena");
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*Variables*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Variables ::= Variables Variable 
            {
              Object RESULT = null;
		 
		System.out.println("3A. smena");
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*Variables*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= LEFTCB Variables Statements RIGHTCB 
            {
              Block RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Block s = (Block)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		 
		System.out.println("2. smena"); 
		RESULT = s;
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Block start_val = (Block)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		RESULT = start_val;
              CUP$MPParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MPParser$parser.done_parsing();
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= MAIN LEFTPAR RIGHTPAR Block 
            {
              Block RESULT = null;
		int bleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right;
		Block b = (Block)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).value;
		 
		System.out.println("1. smena"); 
		RESULT = b;
	
              CUP$MPParser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
