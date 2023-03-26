package AnnotationsandJavaDoc;
class A
{
    public void display()
    {
        
    }
}

class B extends A
{
    @Override
    public void display()
    {
        
    }
    @Deprecated
    public void show()
    {
        
    }
    
}
public class BuiltInAnno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i;
	        @SuppressWarnings("deprecation")

	        B b=new B();
	  
	        b.show();
	}

}
