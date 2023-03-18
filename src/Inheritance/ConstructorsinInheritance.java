package Inheritance;

class Parent
{
    public Parent()
    {
        System.out.println("Parent Constrcutor");
    }
    Parent(int x)
    {
        System.out.println("Param of parent "+x);
    }
            
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
    Child(int y)
    {
        System.out.println("Param of child");
    }
    Child(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor");
    }
}
public class ConstructorsinInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent p=new Parent();  
		//Child c=new Child();  
		//GrandChild c=new GrandChild();
		 Child c=new Child(10,20);
		

	}

}
