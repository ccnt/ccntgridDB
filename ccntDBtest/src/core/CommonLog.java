package core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;   



public class CommonLog {
	private static CommonLog commonLog = new CommonLog();
	private static String logFileName = "log\\log.CommonLog.txt";
	private static FileOutputStream fout = null;
	private static FileChannel fc = null;
	private static ByteBuffer buffer = null;
	
	private CommonLog(){}
	
	public static CommonLog getInstance(){
		return commonLog;
	}
	
	public static void println(String msg){
		try{
			
			if (fout == null){
				fout = new FileOutputStream( logFileName ); 
				fc = fout.getChannel();
				
			}
			
			buffer = ByteBuffer.allocate( 64 );
			byte[] tmp = msg.getBytes();
			//System.out.println(tmp.length);
			for (int l = 0; l < tmp.length; l++){
				buffer.put( tmp[l]);
			}
			
			buffer.flip(); 
			fc.write( buffer );
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void closeBuffer(){
		try {
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
