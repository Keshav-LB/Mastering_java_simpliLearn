package InputOutputStreams;
import java.io.*;
public class Copying2filesin1Destination {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 FileInputStream fis1=new FileInputStream("C:\\\\Users\\\\KESHAV MISHRA\\\\eclipse-workspace\\\\MasteringJava\\\\src\\\\InputOutputStreams\\\\Test.txt");
	        FileInputStream fis2=new FileInputStream("C:\\\\\\\\Users\\\\\\\\KESHAV MISHRA\\\\\\\\eclipse-workspace\\\\\\\\MasteringJava\\\\\\\\src\\\\\\\\InputOutputStreams\\\\\\\\CopyofTest.txt");
	        
	        FileOutputStream fos=new FileOutputStream("C:\\\\\\\\Users\\\\\\\\KESHAV MISHRA\\\\\\\\eclipse-workspace\\\\\\\\MasteringJava\\\\\\\\src\\\\\\\\InputOutputStreams\\\\\\\\Destination.txt");
	                
	        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
	        
	        
	        int b;
	        while((b=sis.read())!=-1)
	        {
	            
	            fos.write(b);
	        }
	        
	        sis.close();
	        fis1.close();
	        fis2.close();
	        fos.close();
	}

}
