
import java.util.Hashtable;
public class KWTable {

	private Hashtable<String, Integer> mTable;
	public KWTable()
	{
		// Inicijalizcaija hash tabele koja pamti kljucne reci
		mTable = new Hashtable<String, Integer>();
		mTable.put("main", 		sym.MAIN);
		mTable.put("int", 		sym.INTEGER);
		mTable.put("real", 		sym.REAL);
		mTable.put("boolean", 	sym.BOOLEAN);
		mTable.put("if", 		sym.IF);
		mTable.put("elif", 		sym.ELIF);
		mTable.put("else", 		sym.ELSE);
	}
	
	/**
	 * Vraca ID kljucne reci 
	 */
	public int find(String keyword)
	{
		Object symbol = mTable.get(keyword);
		if (symbol != null)
			return ((Integer)symbol).intValue();
		
		// Ako rec nije pronadjena u tabeli kljucnih reci radi se o identifikatoru
		return sym.ID;
	}
	

}
