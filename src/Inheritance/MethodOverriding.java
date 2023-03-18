package Inheritance;
class Rectangle1
{
    int length;
    int breadth;
    int x=10;
    
    Rectangle1(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    
    public void display()
    {
        System.out.println("Super Display of Rectangle Class");
    }
   
}

class Cuboid1 extends Rectangle1
{
    int height;
    int x=20;
    
    Cuboid1(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
   //@Override
    public void display()
    {
        System.out.println(super.x);
        System.out.println(x);
        System.out.println("Sub Display of Cuboid Class");
    }
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cuboid1 r = new Cuboid1(1,2,3);
		Rectangle1 r = new Cuboid1(1,2,3);
		r.display();
	}

}
