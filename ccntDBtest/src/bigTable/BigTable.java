package bigTable;

import java.util.HashMap;
import java.util.Set;

import core.ConstNumber;

public class BigTable extends Table{
	private HashMap<String, Row> rowMap = null;
	
	public BigTable(String tableName){
		super(tableName);
		
		rowMap = new HashMap<String, Row>(ConstNumber.hashMapInitialCapacity);
		
	}
	
	public int returnRowLength(){return rowMap.size();}
	
	public Set<String> getRowKey(){return rowMap.keySet();}
	
	public Set<String> getColumnKey(String rowKey){return rowMap.get(rowKey).getColumnKey();}
	
	public Set<Long> getTimeStamp(String rowKey, String columnKey){return rowMap.get(rowKey).get(columnKey).getTimeStampKey();}
	
	public Table addRow(String rowKey) {
		// TODO Auto-generated method stub
		rowMap.put(rowKey, new Row());
		return this;
	}
	
	public Table addColumn(String rowKey, String columnKey) {
		// TODO Auto-generated method stub
		rowMap.get(rowKey).addColumn(columnKey);
		return this;
	}
	
	public Table set(String rowKey, String columnKey, String value) {
		// TODO Auto-generated method stub
		rowMap.get(rowKey).get(columnKey).put(value);
		return this;
	}
}
