package AST;

import java.io.BufferedWriter;
import java.io.IOException;

public class Term extends Expression {
	@Override
	public void translate(BufferedWriter out) throws IOException {
		out.write( "\t" + "true" + "\t\t" );
		out.newLine();
	}
}
