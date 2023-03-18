package Methods;

public class WritingMethods {
	
	static int max(int x,int y)
	//int max(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =100;
		int y=20;
		
		int z;
		System.out.println(max(x,y));
		//WritingMethods wm = new WritingMethods();
		//System.out.println(wm.max(x, y));

	}

}
