package ssm.chengpai.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/**
 * javaNio读写文件
 * @author Administrator
 *
 */
public class Dome {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in=new FileInputStream("D:/1.txt");
		FileChannel changel=in.getChannel();
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		FileOutputStream out=new FileOutputStream("D:/2.txt");
		FileChannel changel1=out.getChannel();
		   while (true) {
	            buffer.clear();
	 
	        int r = changel.read( buffer );
	 
	        if (r==-1) {
	           break;
	            }
	       buffer.flip();
	       changel1.write( buffer );
		   }
	     }
		
	}


