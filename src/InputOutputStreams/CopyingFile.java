package InputOutputStreams;
import java.io.*;

public class CopyingFile {

	public static void main(String[] args) throws Exception{
		
		   FileInputStream fis=new FileInputStream("C:\\\\Users\\\\KESHAV MISHRA\\\\eclipse-workspace\\\\MasteringJava\\\\src\\\\InputOutputStreams\\\\Test.txt");
	        FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\KESHAV MISHRA\\\\eclipse-workspace\\\\MasteringJava\\\\src\\\\InputOutputStreams\\\\CopyofTest.txt");
	        
	     //   FileOutputStream fos=new FileOutputStream("Destination.txt");
	                
	       // SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
	        
	        
	        int b;
	        while((b=fis.read())!=-1)
	        {
	            if(b>=65 && b<=120)
	            	fos.write(b+32);
	            else
	            	fos.write(b);
	        }
	        
	      
	        fis.close();
	        fos.close();
	}

}
