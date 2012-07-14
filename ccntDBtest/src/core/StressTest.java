package core;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class StressTest {
	private static StressTest stressTest = new StressTest();
	private static String logFileName = "log\\log.StressTest.txt";
	private static FileWriter fw = null;
	
	private StressTest(){}
	
	public static StressTest getInstance(){
		return stressTest;
	}
	
	public static void println(String msg){
		try{
			fw = new FileWriter(logFileName, true); 
			SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String data = sDateFormat.format(new java.util.Date());
			data += "%% "+msg+"\n";
			fw.write(data);
			fw.flush();
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
