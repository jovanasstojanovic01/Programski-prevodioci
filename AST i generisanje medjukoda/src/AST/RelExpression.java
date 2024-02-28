package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import SymbolTable.Constant;
import SymbolTable.Type;

public class RelExpression extends Expression {
	private Term left;
	private String relOp;
	private Term right;
	
	public RelExpression(Term l, String ro, Term r)
	{
		this.left = l;
		this.relOp = ro;
		this.right = r;
	}
	
	public RelExpression(Term l)
	{
		this.left = l;
		this.relOp = "==";
		this.right = l;
	}
	
	@Override
	public void translate(BufferedWriter out) throws IOException 
	{
		left.translate( out );
		right.translate( out );
		left.genLoad( "R1", out );
		right.genLoad( "R2", out );
		switch(relOp) {
		case "==":
			out.write( "\tCompare_Equal\tR1, R2\t\t");
			break;
		case "<>":
			out.write( "\tCompare_Equal\tR1, R2\t\t");
			out.newLine();
			out.write( "\tNot\tR1\t\t");
			break;
		case "<":
			out.write( "\tCompare_Less\tR1, R2\t\t");
			break;
		case ">":
			out.write( "\tCompare_Greater\tR1, R2\t\t");
			break;
		case "<=":
			out.write( "\tCompare_Less\tR1, R2\t\t");
			out.newLine();
			out.write( "\tMov\tR3, R1\t\t");
			out.newLine();
			out.write( "\tCompare_Equal\tR1, R2\t\t");
			out.newLine();
			out.write( "\tOr\tR1, R3\t\t");
			break;
		case ">=":
			out.write( "\tCompare_Greater\tR1, R2\t\t");
			out.newLine();
			out.write( "\tMov\tR3, R1\t\t");
			out.newLine();
			out.write( "\tCompare_Equal\tR1, R2\t\t");
			out.newLine();
			out.write( "\tOr\tR1, R3\t\t");
			break;
		}
		out.newLine();
	}
}
