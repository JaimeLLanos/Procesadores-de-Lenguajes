
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\052\000\002\002\004\000\002\002\004\000\002\003" +
    "\006\000\002\003\002\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\004\004\000\002\004\003\000" +
    "\002\006\004\000\002\007\007\000\002\007\007\000\002" +
    "\010\005\000\002\011\006\000\002\011\004\000\002\011" +
    "\002\000\002\012\003\000\002\012\003\000\002\012\003" +
    "\000\002\013\004\000\002\013\003\000\002\014\005\000" +
    "\002\014\006\000\002\014\007\000\002\014\006\000\002" +
    "\014\005\000\002\015\003\000\002\015\005\000\002\017" +
    "\003\000\002\017\005\000\002\016\005\000\002\016\003" +
    "\000\002\020\003\000\002\020\003\000\002\020\003\000" +
    "\002\020\003\000\002\020\003\000\002\021\006\000\002" +
    "\021\005\000\002\021\005\000\002\021\003\000\002\021" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\012\004\006\010\ufffe\013\ufffe\014\ufffe\001" +
    "\002\000\010\010\021\013\016\014\017\001\002\000\004" +
    "\002\015\001\002\000\004\030\007\001\002\000\010\023" +
    "\012\024\013\025\011\001\002\000\012\004\006\010\ufffe" +
    "\013\ufffe\014\ufffe\001\002\000\032\004\ufffb\006\ufffb\010" +
    "\ufffb\012\ufffb\013\ufffb\014\ufffb\015\ufffb\016\ufffb\017\ufffb" +
    "\020\ufffb\021\ufffb\022\ufffb\001\002\000\032\004\ufffd\006" +
    "\ufffd\010\ufffd\012\ufffd\013\ufffd\014\ufffd\015\ufffd\016\ufffd" +
    "\017\ufffd\020\ufffd\021\ufffd\022\ufffd\001\002\000\032\004" +
    "\ufffc\006\ufffc\010\ufffc\012\ufffc\013\ufffc\014\ufffc\015\ufffc" +
    "\016\ufffc\017\ufffc\020\ufffc\021\ufffc\022\ufffc\001\002\000" +
    "\010\010\uffff\013\uffff\014\uffff\001\002\000\004\002\000" +
    "\001\002\000\004\030\ufff0\001\002\000\004\030\uffef\001" +
    "\002\000\004\002\001\001\002\000\004\030\ufff1\001\002" +
    "\000\012\002\ufff9\010\021\013\016\014\017\001\002\000" +
    "\004\030\025\001\002\000\012\002\ufff8\010\ufff8\013\ufff8" +
    "\014\ufff8\001\002\000\004\005\026\001\002\000\014\006" +
    "\ufff2\010\030\012\ufff2\013\016\014\017\001\002\000\006" +
    "\006\112\012\111\001\002\000\006\006\033\030\ufff1\001" +
    "\002\000\004\030\032\001\002\000\006\006\ufff3\012\ufff3" +
    "\001\002\000\004\007\035\001\002\000\012\002\ufff6\010" +
    "\ufff6\013\ufff6\014\ufff6\001\002\000\014\010\021\013\016" +
    "\014\017\027\040\030\036\001\002\000\006\005\100\026" +
    "\101\001\002\000\016\010\021\011\077\013\016\014\017" +
    "\027\040\030\036\001\002\000\014\005\051\023\012\024" +
    "\013\025\011\030\054\001\002\000\016\010\uffed\011\uffed" +
    "\013\uffed\014\uffed\027\uffed\030\uffed\001\002\000\004\030" +
    "\044\001\002\000\006\012\045\015\046\001\002\000\006" +
    "\012\uffe7\015\uffe7\001\002\000\004\030\047\001\002\000" +
    "\016\010\uffec\011\uffec\013\uffec\014\uffec\027\uffec\030\uffec" +
    "\001\002\000\006\012\uffe6\015\uffe6\001\002\000\022\006" +
    "\uffd8\012\uffd8\015\uffd8\016\uffd8\017\uffd8\020\uffd8\021\uffd8" +
    "\022\uffd8\001\002\000\014\005\051\023\012\024\013\025" +
    "\011\030\054\001\002\000\022\006\uffe2\012\uffe2\015\uffe2" +
    "\016\uffe2\017\uffe2\020\uffe2\021\uffe2\022\uffe2\001\002\000" +
    "\016\015\073\016\063\017\064\020\066\021\062\022\065" +
    "\001\002\000\024\005\055\006\uffd9\012\uffd9\015\uffd9\016" +
    "\uffd9\017\uffd9\020\uffd9\021\uffd9\022\uffd9\001\002\000\016" +
    "\005\051\006\057\023\012\024\013\025\011\030\054\001" +
    "\002\000\006\006\071\012\070\001\002\000\022\006\uffdb" +
    "\012\uffdb\015\uffdb\016\uffdb\017\uffdb\020\uffdb\021\uffdb\022" +
    "\uffdb\001\002\000\020\006\uffe5\012\uffe5\016\063\017\064" +
    "\020\066\021\062\022\065\001\002\000\014\005\051\023" +
    "\012\024\013\025\011\030\054\001\002\000\014\005\uffde" +
    "\023\uffde\024\uffde\025\uffde\030\uffde\001\002\000\014\005" +
    "\uffe1\023\uffe1\024\uffe1\025\uffe1\030\uffe1\001\002\000\014" +
    "\005\uffe0\023\uffe0\024\uffe0\025\uffe0\030\uffe0\001\002\000" +
    "\014\005\uffdd\023\uffdd\024\uffdd\025\uffdd\030\uffdd\001\002" +
    "\000\014\005\uffdf\023\uffdf\024\uffdf\025\uffdf\030\uffdf\001" +
    "\002\000\022\006\uffe3\012\uffe3\015\uffe3\016\063\017\064" +
    "\020\066\021\062\022\065\001\002\000\014\005\051\023" +
    "\012\024\013\025\011\030\054\001\002\000\022\006\uffdc" +
    "\012\uffdc\015\uffdc\016\uffdc\017\uffdc\020\uffdc\021\uffdc\022" +
    "\uffdc\001\002\000\020\006\uffe4\012\uffe4\016\063\017\064" +
    "\020\066\021\062\022\065\001\002\000\016\010\uffe8\011" +
    "\uffe8\013\uffe8\014\uffe8\027\uffe8\030\uffe8\001\002\000\016" +
    "\006\075\016\063\017\064\020\066\021\062\022\065\001" +
    "\002\000\022\006\uffda\012\uffda\015\uffda\016\uffda\017\uffda" +
    "\020\uffda\021\uffda\022\uffda\001\002\000\016\010\uffee\011" +
    "\uffee\013\uffee\014\uffee\027\uffee\030\uffee\001\002\000\012" +
    "\002\ufff5\010\ufff5\013\ufff5\014\ufff5\001\002\000\016\005" +
    "\051\006\105\023\012\024\013\025\011\030\054\001\002" +
    "\000\014\005\051\023\012\024\013\025\011\030\054\001" +
    "\002\000\016\015\103\016\063\017\064\020\066\021\062" +
    "\022\065\001\002\000\016\010\uffeb\011\uffeb\013\uffeb\014" +
    "\uffeb\027\uffeb\030\uffeb\001\002\000\006\006\107\012\070" +
    "\001\002\000\004\015\106\001\002\000\016\010\uffe9\011" +
    "\uffe9\013\uffe9\014\uffe9\027\uffe9\030\uffe9\001\002\000\004" +
    "\015\110\001\002\000\016\010\uffea\011\uffea\013\uffea\014" +
    "\uffea\027\uffea\030\uffea\001\002\000\010\010\021\013\016" +
    "\014\017\001\002\000\004\007\035\001\002\000\012\002" +
    "\ufff7\010\ufff7\013\ufff7\014\ufff7\001\002\000\004\030\115" +
    "\001\002\000\006\006\ufff4\012\ufff4\001\002\000\004\002" +
    "\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\006\002\004\003\003\001\001\000\010\004" +
    "\017\006\021\012\022\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\005\007\001\001\000\004\003\013\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\004\115\006\021\012\022\001\001\000\004\007\023\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\011\026" +
    "\012\030\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\033\001\001" +
    "\000\002\001\001\000\010\012\041\013\036\014\040\001" +
    "\001\000\002\001\001\000\006\012\041\014\075\001\001" +
    "\000\010\005\047\016\052\021\051\001\001\000\002\001" +
    "\001\000\004\015\042\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\005\047\016\073\021\051" +
    "\001\001\000\002\001\001\000\004\020\060\001\001\000" +
    "\002\001\001\000\012\005\047\016\057\017\055\021\051" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\020" +
    "\060\001\001\000\010\005\047\016\066\021\051\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\020\060\001\001" +
    "\000\010\005\047\016\071\021\051\001\001\000\002\001" +
    "\001\000\004\020\060\001\001\000\002\001\001\000\004" +
    "\020\060\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\005\047\016\057\017\103\021\051" +
    "\001\001\000\010\005\047\016\101\021\051\001\001\000" +
    "\004\020\060\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\012\113\001\001\000\004\010\112" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



public void syntax_error(Symbol s){

		report_error("Error de sintaxis en la linea " + s.left + " caracter " + s.right + "\n", 		null);

	}

	
	public void syntax_error(){

		report_error("Error no puede haber dos funciones principales en el programa ", null);

	}

	
	public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{

		report_error("" , null);

}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // PROGRAM ::= DEFINES PARTES 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PROGRAM",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= PROGRAM EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // DEFINES ::= define ident CTES DEFINES 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEFINES",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // DEFINES ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEFINES",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CTES ::= numeric_integer_const 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CTES",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CTES ::= numeric_real_const 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CTES",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CTES ::= constlit 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CTES",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // PARTES ::= PART PARTES 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PARTES",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // PARTES ::= PART 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PARTES",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // PART ::= TYPE RESTPART 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PART",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // RESTPART ::= ident aperturaParentesis LISTPARAM cierreParentesis BLQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("RESTPART",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // RESTPART ::= ident aperturaParentesis vvoid cierreParentesis BLQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("RESTPART",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // BLQ ::= aperturaLlaves SENTLIST cierreLlaves 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("BLQ",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // LISTPARAM ::= LISTPARAM coma TYPE ident 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTPARAM",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // LISTPARAM ::= TYPE ident 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTPARAM",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // LISTPARAM ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTPARAM",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // TYPE ::= vvoid 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TYPE",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // TYPE ::= vint 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TYPE",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // TYPE ::= vfloat 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TYPE",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SENTLIST ::= SENTLIST SENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENTLIST",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SENTLIST ::= SENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENTLIST",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SENT ::= TYPE LID punto_coma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENT",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SENT ::= ident igual EXP punto_coma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENT",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // SENT ::= ident aperturaParentesis LEXP cierreParentesis punto_coma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENT",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // SENT ::= ident aperturaParentesis cierreParentesis punto_coma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENT",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENT ::= vreturn EXP punto_coma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("SENT",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // LID ::= ident 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LID",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // LID ::= LID coma ident 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LID",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // LEXP ::= EXP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LEXP",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // LEXP ::= LEXP coma EXP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LEXP",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // EXP ::= EXP OP EXP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // EXP ::= FACTOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // OP ::= mas 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // OP ::= menos 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // OP ::= mult 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // OP ::= diventera 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // OP ::= divreal 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OP",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // FACTOR ::= ident aperturaParentesis LEXP cierreParentesis 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // FACTOR ::= ident aperturaParentesis cierreParentesis 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // FACTOR ::= aperturaParentesis EXP cierreParentesis 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // FACTOR ::= ident 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // FACTOR ::= CTES 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("FACTOR",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
