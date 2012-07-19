package test;

import bigTable.BigTable;
import bigTable.BigTableCollection;
import bigTable.Scan;
import core.Log;

public class BigTableTest {
	public static void main(String[] args){
		Log.stressTest.println("test start!");
		BigTable myBigTable = BigTableCollection.getInstance().newBigTable("Ա��н��");
		
		myBigTable.addRow("HR����");
		myBigTable.addRow("IT����");
		myBigTable.addRow("marketing����");
		myBigTable.addRow("BOSS����");
		
		myBigTable.addColumn("HR����", "����");
		myBigTable.addColumn("HR����", "����");
		myBigTable.addColumn("IT����", "����");
		
		myBigTable.set("HR����", "����", "5000");
		myBigTable.set("IT����", "����", "3800");
		
		for (int i  = 0; i < 500000; i++){
			String name = "ID_"+ String.valueOf(i);
			//System.out.println(name);
			myBigTable.addColumn("HR����", name);
			myBigTable.set("HR����", name, "3800");
		}
		
		Scan.printBigTable(myBigTable);
		Log.commonLog.closeBuffer();
		
		Log.stressTest.println("test end  !");
	}
}
