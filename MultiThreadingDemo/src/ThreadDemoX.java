

class MyThreadX extends Thread
{
	MyThreadX() 
	{
		System.out.print(" MyThread");
	}
	
       public void run() 
	{
		System.out.print(" bar");
	}
	public void run(String s) 
	{
		System.out.println(" baz");
	}
}
public class ThreadDemoX 
{
	public static void main (String [] args) 
	{
		Thread t = new MyThreadX() 
		{
			public void run() 
			{
				System.out.println(" foo");
			}
		};
		t.start();
	}
}