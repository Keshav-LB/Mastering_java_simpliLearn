package JavaPrintingAndString;

public class StringMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str=new String("    Keshav_Kant_Mishra    ");
	        
	        
	        //System.out.println(str.length());
	        int len=str.length();
	        System.out.println("Length of string "+len);
	        
	        
	        String str2=str.toUpperCase();
	        System.out.println("String in Upper Case "+str2);
	        
	        String str5=str.toLowerCase();
	        System.out.println("String in Lower Case "+str5);	        
	        
	        str=str.trim();
	        System.out.println("Removing WhiteSpace::::"+str);
	        
	        String str3=str.substring(7,11);
	        System.out.println("Substring:"+str3);
	        
	        String str4=str.replace('e', '*');
	        System.out.println("Replacing e with * ::::"+str4);
	        
	        System.out.println(str4+ "******" +str);
	}

}
