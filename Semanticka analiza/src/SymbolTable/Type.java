package SymbolTable;

public class Type extends SymbolNode {
	static int i = 0;
	public static int BOOLEAN = i++;
	public static int INTEGER = i++;
	public static int REAL = i++;
	public static int UNKNOWN = i++;
	public int tkind;
	
	public Type ( String name, 
			int typeKind, 
			SymbolNode next)
	{
		super( name, SymbolNode.TYPE, null, next );
		this.tkind = typeKind;
		this.type = this;
	}
}
