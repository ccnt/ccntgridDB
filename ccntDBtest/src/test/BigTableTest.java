package test;

import bigTable.BigTable;
import core.Log;

public class BigTableTest {
	public static void main(String[] args){
		Log.stressTest.println("test start!");
		BigTable myBigTable = new BigTable("Ô±¹¤Ð½×Ê");
		Log.stressTest.println("test end  !");
	}
}
