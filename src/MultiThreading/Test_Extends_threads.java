package MultiThreading;

class Mythread extends Thread
{
public void run()
{
	int i=1;
	while(true)
	{
		System.out.println(i+"Hello");
		i++;
	}
}
}

public class Test_Extends_threads {
	

	public static void main(String[] args) {
		
		Mythread t = new Mythread();
		
		t.start();		
		
		int i=1;
		while(true)
		{
			System.out.println(i+"Worldddddddd");
			i++;
		}
	}

}
