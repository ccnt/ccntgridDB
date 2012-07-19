package test;

import bigTable.BigTable;
import bigTable.BigTableCollection;
import bigTable.Scan;
import core.Log;

public class BigTableTest {
	public static void main(String[] args){
		Log.stressTest.println("test start!");
		BigTable myBigTable = BigTableCollection.getInstance().newBigTable("员工薪资");
		
		myBigTable.addRow("HR部门");
		myBigTable.addRow("IT部门");
		myBigTable.addRow("marketing部门");
		myBigTable.addRow("BOSS部门");
		
		myBigTable.addColumn("HR部门", "张三");
		myBigTable.addColumn("HR部门", "李四");
		myBigTable.addColumn("IT部门", "王五");
		
		myBigTable.set("HR部门", "李四", "5000");
		myBigTable.set("IT部门", "王五", "3800");
		
		for (int i  = 0; i < 500000; i++){
			String name = "ID_"+ String.valueOf(i);
			//System.out.println(name);
			myBigTable.addColumn("HR部门", name);
			myBigTable.set("HR部门", name, "3800");
		}
		
		Scan.printBigTable(myBigTable);
		Log.commonLog.closeBuffer();
		
		Log.stressTest.println("test end  !");
	}
}
