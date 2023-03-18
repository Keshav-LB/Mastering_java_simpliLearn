package ExceptionalHandling;
import java.io.*;
import java.util.*;

public class TrywithResources {
	 static void Divide() throws Exception
	    {
	        
	        
	        try(FileInputStream fi=new FileInputStream("C:\\Users\\KESHAV MISHRA\\eclipse-workspace\\MasteringJava\\src\\ExceptionalHandling\\Test");
	        		Scanner sc=new Scanner(fi) )
	        {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        System.out.println(a/c);
	        }
	        
	    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try
        {
        Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        //int x=sc.nextInt();
        
       // System.out.println(x);
	}

}
