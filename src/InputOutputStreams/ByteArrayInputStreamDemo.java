package InputOutputStreams;
import java.io.*;
public class ByteArrayInputStreamDemo {

	public static void main(String[] args) throws Exception{
		
		 byte b[]={'a','b','c','d','e','f','g','h','i','j'};
		 
		 ByteArrayInputStream bis = new ByteArrayInputStream(b);
		 
		 String str = new String(bis.readAllBytes());
		 System.out.println(str);
		 
		 /*
		 //Printing and reading byte array b one by one
	      
	         int x;
	       
	        
	        while((x=bis.read())!=-1)
	        {
	        	 System.out.print((char)x);

	           // System.out.println((char)x);
	            
	        }*/
	        
	        bis.close();
	}

}
