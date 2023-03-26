package InputOutputStreams;
import java.io.*;
public class BufferedInputStreamDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\MasteringJava\\src\\InputOutputStreams\\Test.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		/*int x;
		while((x=bis.read())!=-1)
		{
			System.out.print((char)x);
		}*/
		 System.out.print((char)bis.read());
	        System.out.print((char)bis.read());
	        System.out.print((char)bis.read());
	        bis.mark(10);
	        System.out.print((char)bis.read());
	        System.out.print((char)bis.read());
	        bis.reset();
	        
	        System.out.print((char)bis.read());
	        System.out.print((char)bis.read());
	        
	    //    System.out.println("String "+bis.readLine());
	}

}
