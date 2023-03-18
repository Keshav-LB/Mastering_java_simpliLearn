package ConditionalStatements;

public class IfElseWithrelationalOptr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=15,c=4;
        
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }

	}

}
