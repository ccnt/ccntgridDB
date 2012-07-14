package bigTable;

import java.util.HashMap;

public class BigTable extends Table{
	private HashMap<String, Row> rowMap = null;
	
	public BigTable(String tableName){
		super(tableName);
		
	}
	
}
