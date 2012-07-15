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
		
		Scan.printBigTable(myBigTable);
		
		Log.stressTest.println("test end  !");
	}
}
