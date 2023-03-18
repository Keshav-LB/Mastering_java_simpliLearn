package InnerClasses;
class Outer
{
    int x=10;
    static int y=20;
    
    static class My
    {
        public void show()
        {
            System.out.println(y);
        }
    }
    
    
}
public class LocalandAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.My m=new Outer.My();
        m.show();
	}

}
