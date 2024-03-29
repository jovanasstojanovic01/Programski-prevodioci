
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Sat Dec 02 16:31:57 CET 2023
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Sat Dec 02 16:31:57 CET 2023
  */
public class MPParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MPParser() {super();}

  /** Constructor which sets the default scanner. */
  public MPParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\040\000\002\003\006\000\002\002\004\000\002\004" +
    "\006\000\002\005\004\000\002\005\003\000\002\006\005" +
    "\000\002\007\003\000\002\007\003\000\002\007\003\000" +
    "\002\010\005\000\002\010\003\000\002\011\003\000\002" +
    "\011\003\000\002\012\011\000\002\013\004\000\002\013" +
    "\003\000\002\013\003\000\002\014\004\000\002\014\003" +
    "\000\002\015\010\000\002\016\005\000\002\017\005\000" +
    "\002\017\003\000\002\020\003\000\002\020\003\000\002" +
    "\021\003\000\002\021\003\000\002\021\003\000\002\021" +
    "\003\000\002\021\003\000\002\021\003\000\002\022\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\073\000\004\004\005\001\002\000\004\002\075\001" +
    "\002\000\004\025\006\001\002\000\004\026\007\001\002" +
    "\000\004\011\011\001\002\000\004\002\001\001\002\000" +
    "\010\006\012\007\015\010\016\001\002\000\004\005\ufffb" +
    "\001\002\000\004\005\073\001\002\000\014\005\ufffd\006" +
    "\ufffd\007\ufffd\010\ufffd\013\ufffd\001\002\000\004\005\ufffa" +
    "\001\002\000\004\005\ufff9\001\002\000\014\005\026\006" +
    "\012\007\015\010\016\013\024\001\002\000\006\012\ufff6" +
    "\030\ufff6\001\002\000\014\005\ufffe\006\ufffe\007\ufffe\010" +
    "\ufffe\013\ufffe\001\002\000\006\012\070\030\071\001\002" +
    "\000\006\012\ufff5\030\ufff5\001\002\000\004\025\033\001" +
    "\002\000\006\012\ufff7\030\ufff7\001\002\000\004\027\027" +
    "\001\002\000\006\005\030\024\031\001\002\000\024\012" +
    "\uffea\016\uffea\017\uffea\020\uffea\021\uffea\022\uffea\023\uffea" +
    "\026\uffea\030\uffea\001\002\000\024\012\uffe9\016\uffe9\017" +
    "\uffe9\020\uffe9\021\uffe9\022\uffe9\023\uffe9\026\uffe9\030\uffe9" +
    "\001\002\000\006\012\uffe2\030\uffe2\001\002\000\006\005" +
    "\030\024\031\001\002\000\004\026\046\001\002\000\020" +
    "\016\042\017\043\020\044\021\040\022\037\023\041\026" +
    "\uffeb\001\002\000\006\005\030\024\031\001\002\000\006" +
    "\005\uffe3\024\uffe3\001\002\000\006\005\uffe6\024\uffe6\001" +
    "\002\000\006\005\uffe4\024\uffe4\001\002\000\006\005\uffe5" +
    "\024\uffe5\001\002\000\006\005\uffe7\024\uffe7\001\002\000" +
    "\006\005\uffe8\024\uffe8\001\002\000\004\026\uffec\001\002" +
    "\000\004\031\047\001\002\000\004\011\011\001\002\000" +
    "\006\014\055\015\053\001\002\000\012\012\ufff2\014\055" +
    "\015\053\030\ufff2\001\002\000\006\012\ufff4\030\ufff4\001" +
    "\002\000\004\031\064\001\002\000\006\012\ufff1\030\ufff1" +
    "\001\002\000\004\025\057\001\002\000\012\012\uffef\014" +
    "\uffef\015\uffef\030\uffef\001\002\000\006\005\030\024\031" +
    "\001\002\000\004\026\061\001\002\000\004\031\062\001" +
    "\002\000\004\011\011\001\002\000\012\012\uffee\014\uffee" +
    "\015\uffee\030\uffee\001\002\000\004\011\011\001\002\000" +
    "\006\012\uffed\030\uffed\001\002\000\006\012\ufff3\030\ufff3" +
    "\001\002\000\012\012\ufff0\014\ufff0\015\ufff0\030\ufff0\001" +
    "\002\000\014\002\uffff\012\uffff\014\uffff\015\uffff\030\uffff" +
    "\001\002\000\006\005\026\013\024\001\002\000\006\012" +
    "\ufff8\030\ufff8\001\002\000\004\030\074\001\002\000\014" +
    "\005\ufffc\006\ufffc\007\ufffc\010\ufffc\013\ufffc\001\002\000" +
    "\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\073\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\007\001\001" +
    "\000\002\001\001\000\010\005\016\006\013\007\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\006\020\007" +
    "\012\010\021\011\024\012\022\022\017\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\020\031\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\017\033\020\034\001\001" +
    "\000\002\001\001\000\004\021\035\001\001\000\004\020" +
    "\044\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\047" +
    "\001\001\000\012\013\051\014\050\015\055\016\053\001" +
    "\001\000\006\015\066\016\065\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\017\057\020\034\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\004\062\001\001\000" +
    "\002\001\001\000\004\004\064\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\011\071\012\022\022\017\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

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



   public static void main( String[] args )
   {
      try
	  {
		   FileReader file = new FileReader( args[0] );
		   Scanner scanner = new MPLexer( file );
		   MPParser parser = new MPParser( scanner );
		   Symbol syntax_tree = parser.parse();
	  }
	  catch( Exception e )
	  {
		   e.printStackTrace();
	  }
   }

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
          case 31: // Assignment ::= ID ASSIGN Term 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Assignment*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // RelOp ::= GROREQ 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // RelOp ::= GR 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // RelOp ::= NOTEQ 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // RelOp ::= EQ 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // RelOp ::= LOWOREQ 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RelOp ::= LOW 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*RelOp*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Term ::= CONST 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Term ::= ID 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // RelExpression ::= Term 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // RelExpression ::= Term RelOp Term 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*RelExpression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ElseStatement ::= ELSE COLON Block 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*ElseStatement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Elif ::= ELIF LEFTPAR RelExpression RIGHTPAR COLON Block 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Elif*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-5)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ElifList ::= Elif 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*ElifList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ElifList ::= ElifList Elif 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*ElifList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ElsePart ::= ElseStatement 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*ElsePart*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ElsePart ::= ElifList 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*ElsePart*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ElsePart ::= ElifList ElseStatement 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*ElsePart*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // IfStatement ::= IF LEFTPAR RelExpression RIGHTPAR COLON Block ElsePart 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*IfStatement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-6)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Statement ::= IfStatement 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Statement ::= Assignment 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Statements ::= Statement 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Statements*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Statements ::= Statements SEMICOLON Statement 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Statements*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Type ::= BOOLEAN 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Type ::= REAL 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Type ::= INTEGER 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Variable ::= Type ID SEMICOLON 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*Variable*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Variables ::= Variable 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Variables*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Variables ::= Variables Variable 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*Variables*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= LEFTCB Variables Statements RIGHTCB 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
              CUP$MPParser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		RESULT = start_val;
              CUP$MPParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MPParser$parser.done_parsing();
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= MAIN LEFTPAR RIGHTPAR Block 
            {
              Object RESULT = null;
		 System.out.println("Prepoznat zbir"); 
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

