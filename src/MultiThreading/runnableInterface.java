package MultiThreading;

class My implements Runnable
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

public class runnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My m = new My();
		Thread t = new Thread(m);
		
		t.start();		
		
		int i=1;
		while(true)
		{
			System.out.println(i+"Worldddddddd");
			i++;
		}
	}

}
