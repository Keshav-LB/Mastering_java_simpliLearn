package InputOutputStreams;
import java.io.*;
public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		 
		 
		 ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
		 
		 bos.write('a');
		 
		 bos.write('b');
		 
		 bos.write('c');
		 
		 bos.write('d');
		 
		/*byte b[]= bos.toByteArray();
		
		for(byte x:b)
			System.out.println((char)x);*/
		bos.writeTo(new FileOutputStream("C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\MasteringJava\\src\\InputOutputStreams\\ByteArrayOutputStramFile.txt"));
		
		 bos.close();
	}

}
