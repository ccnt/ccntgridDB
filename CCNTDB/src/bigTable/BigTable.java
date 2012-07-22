package bigTable;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class BigTable {
	class ValueTimeStamp{
		private String value = null;
		private long timeStamp = 0;
	}
	private TreeMap<String, ArrayList<TreeMap<String, ArrayList<ValueTimeStamp>>>> data = null;
	private String tableName = null;
	
	public BigTable(String t){
		tableName = t.substring(0);
		data = new TreeMap<String, ArrayList<TreeMap<String, ArrayList<ValueTimeStamp>>>>();
	}
	
	public boolean putValue(String rowName, String columnName, String value){
		if (data.containsKey(rowName)){
			ArrayList tmp = data.get(rowName);
			int searchIndex = 0;
			while (searchIndex < tmp.size()){
				TreeMap _tmp = (TreeMap) tmp.get(searchIndex);
				
			}
		}else{
			
		}
		return false;
	}
	
	public void scanTable(){}
}
