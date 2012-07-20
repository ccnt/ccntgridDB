package bigTable;

import java.util.List;
import java.util.SortedMap;

public class BigTable {
	class RowKey{
		private String data = null;
		public RowKey(String t){
			data = t.substring(0);
		}
	}
	
	class Column{
		private String data = null;
		public Column(String t){
			data = t.substring(0);
		}
	}
	
	class ValueTimeStamp{
		private String value = null;
		private long timeStamp = 0;
		public ValueTimeStamp(String t){
			value = t.substring(0);
			timeStamp = System.currentTimeMillis();
		}
	}
	
	private SortedMap< RowKey, List< SortedMap< Column, List< ValueTimeStamp > > > > data = null;
	private String tableName = null;
	
	public BigTable(String t){
		tableName = t.substring(0);
	}
	
	public boolean putValue(){
		
		return false;
	}
	
	public void scanTable(){}
}
