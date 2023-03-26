package InputOutputStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\MasteringJava\\src\\InputOutputStreams\\Test.txt");)
        {
			byte b[] = new byte[fis.available()];
			      fis.read(b);
			      
			      String str = new String(b);
			      System.out.println(str);
			      fis.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

	}

}
