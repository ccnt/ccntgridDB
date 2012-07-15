package bigTable;

import java.util.HashMap;

import core.ConstNumber;

public class BigTableCollection implements BigTableCollectionInterface{
	private static BigTableCollection bigTableCollection= new BigTableCollection();
	private static HashMap<String, BigTable> collection = new HashMap<String, BigTable>(ConstNumber.hashMapInitialCapacity);
	
	private BigTableCollection(){}
	
	public static BigTableCollection getInstance(){
		return bigTableCollection;
	}
	
	@Override
	public BigTable openBigTable(String bigTableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigTable newBigTable(String bigTableName) {
		// TODO Auto-generated method stub
		if (collection.containsKey(bigTableName)){
			return null;
		}else{
			BigTable t = new BigTable(bigTableName);
			collection.put(bigTableName, t);
			return t;
		}
	}

	@Override
	public BigTable dropBigTable(String bigTableName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
