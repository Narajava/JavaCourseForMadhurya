import java.io.Serializable;

public class ThreadDemo2 {
	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();// new /born state
		Thread t = new Thread(myThread);
		t.start();// Runnable state

		for (int i = 1; i < 100; i++) {
			System.out.println("Main Thread" + i + " in control");
		}
	}
}

class MyThread1 extends A implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println("Child Thread" + i + " in control");
		}
	}

}

class A{
	
}