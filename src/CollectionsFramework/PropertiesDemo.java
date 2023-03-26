package CollectionsFramework;
import java.util.*;
import java.io.*;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

        Properties p=new Properties();
        
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");
        
        
        p.storeToXML(new FileOutputStream("MyData.xml"), "Laptop");
        
        
        p.load(new FileInputStream("MyData.txt"));
        
        System.out.println(p);
	}

}
