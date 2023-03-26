package InputOutputStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		try
		{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\MasteringJava\\src\\InputOutputStreams\\Test.txt");
		String str = "Learn Java Programming, By keshav";
		
		fos.write(str.getBytes());
		fos.close();
		}
		
		catch(FileNotFoundException e)
		{
			
		}
		catch(IOException e)
		{
			
		}
		
	}

}
