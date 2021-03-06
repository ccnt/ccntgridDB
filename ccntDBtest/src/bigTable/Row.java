package bigTable;

import java.util.HashMap;
import java.util.Set;

import core.ConstNumber;

public class Row {
	private HashMap<String, Column> columnMap = null;
	
	public Row(){
		columnMap = new HashMap<String, Column>(ConstNumber.hashMapInitialCapacity);
	}
	
	public void addColumn(String columnKey){
		columnMap.put(columnKey, new Column());
	}
	
	public Column get(String key){
		return columnMap.get(key);
	}
	
	public Set<String> getColumnKey(){return columnMap.keySet();}
}
