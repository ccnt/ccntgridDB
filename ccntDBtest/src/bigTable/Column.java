package bigTable;

import java.util.HashMap;

import core.ConstNumber;

public class Column {
	private HashMap<Long, String> dataMap = null;
	
	public Column(){
		dataMap = new HashMap<Long, String>(ConstNumber.hashMapInitialCapacity);
	}
	
	public void put(String value){
		dataMap.put(System.currentTimeMillis(), value);
	}
}
