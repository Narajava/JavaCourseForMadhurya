public class ThreadSleepDemo {
	public static void main(String[] args) {
		MyThread7 t = new MyThread7();// new /born state
		t.start();// Runnable state

		/*for (int i = 1; i < 100; i++) {
			System.out.println("Main Thread" + i + " in control");
		}*/
	}
}

class MyThread7 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			System.out.println("Child Thread" + i + " in control");
		}
	}

}