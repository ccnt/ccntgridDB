package test;

import bigTable.BigTable;
import core.Log;

public class BigTableTest {
	public static void main(String[] args){
		Log.stressTest.println("test start!");
		BigTable myBigTable = new BigTable("Ա��н��");
		Log.stressTest.println("test end  !");
	}
}
