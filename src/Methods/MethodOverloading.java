package Methods;

public class MethodOverloading {
	public int max(int a,int b)
    {
        return a>b?a:b;
    }
    
    public int max(int a,int b,int c)
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading t=new MethodOverloading();
        t.max(10,5);
        t.max(10,15,5);
		
		 	

	}

}
