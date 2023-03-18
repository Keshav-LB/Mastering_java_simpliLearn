/*
 *There	are	two	types	of	classes	Abstract	class	and	Concrete	class		
• If	abstract	keyword	is	used	before	the	class	then	it	is	an	Abstract	
Class	if	nothing	is	written	before	class	then	it	is	a	Concrete	class
• Object	of	an	Abstract	class	cannot	be	created	but	object	of	Concrete	
class	can	be	created
• reference	of	abstract	class	is	allowed */


package AbstractClass;
abstract class Super
{
    public Super() { System.out.println("Super Constructor"); }
    
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    
    abstract public void meth2();
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Super s=new Sub();
        s.meth1();
        s.meth2();
	}

}

