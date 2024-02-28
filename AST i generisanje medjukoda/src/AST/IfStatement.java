package AST;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class IfStatement extends Statement {
	private static RelExpression emptyCond = new RelExpression(new Term());
	private RelExpression condition;
	private ArrayList<IfStatement> elifList = new ArrayList<IfStatement>();
	private Block thenBlock;
	
	public IfStatement(RelExpression c, Block tb, ArrayList<IfStatement> el)
	{
		this.condition = c;
		this.thenBlock = tb;
		this.elifList = el;
	}
	
	public IfStatement(Block tb)
	{
		this.condition = emptyCond;
		this.thenBlock = tb;
		this.elifList = new ArrayList<IfStatement>();
	}
	
	public void addStatement(IfStatement i)
	{
		this.elifList.add(i);
	}
	
	
	@Override
	public void translate(BufferedWriter out) throws IOException 
	{
		condition.translate( out );
		String endLabel = ASTNode.genLab();
		String elseLabel = ASTNode.genLab();
		
		out.write( "\tJumpIfZero\tR1, " + elseLabel );
		out.newLine();
		thenBlock.translate( out );
		out.write( "\tJump\t\t" + endLabel );
		out.newLine();
		out.write( elseLabel + ":" );
		out.newLine();
		
		for (int i = 0; i < elifList.size(); i++) {
			IfStatement is = elifList.get(i);
			is.translate(out, endLabel);
		}
		
		out.write( endLabel + ":" );
		out.newLine();
	}
	
	public void translate(BufferedWriter out, String endLabel) throws IOException 
	{
		if (condition == emptyCond) {
			thenBlock.translate( out );
			return;
		}
		String nextLabel = ASTNode.genLab();
		condition.translate( out );
		out.write( "\tJumpIfZero\tR1, " + nextLabel );
		out.newLine();
		thenBlock.translate( out );
		out.write( "\tJump\t\t" + endLabel );
		out.newLine();
		out.write( nextLabel + ":" );
		out.newLine();
	}
}

/*
 * 		out.write( "\tJump\t" + endLabel );
		out.newLine();
		out.write( elseLabel + ":" );
		out.newLine();
		elifBlock.translate( out );
		out.write( endLabel + ":" );
 */
