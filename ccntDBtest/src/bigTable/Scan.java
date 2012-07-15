package bigTable;

import java.util.Iterator;
import java.util.Set;

public class Scan {
	public static void printBigTable(BigTable tmp){
		System.out.println("Big Table Name: " + tmp.returnTableName());
		Set<String> keySet = tmp.getRowKey();
		Iterator<String> ite = keySet.iterator();
		while (ite.hasNext()){
			String _tmp = ite.next();
			System.out.println("\tRow Name: " + _tmp);
			Set<String> keySet2 = tmp.getColumnKey(_tmp);
			Iterator<String> ite2 = keySet2.iterator();
			while(ite2.hasNext()){
				String __tmp = ite2.next();
				System.out.println("\t\tColumn Name: " + __tmp);
				Set<Long> keySet3 =tmp.getTimeStamp(_tmp, __tmp);
				Iterator<Long> ite3 = keySet3.iterator();
				while(ite3.hasNext()){
					long ___tmp = ite3.next();
					System.out.println("\t\t\t" + ___tmp + ":");
					
				}
			}
		}
	}
}
