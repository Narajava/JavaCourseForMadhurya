public class ThreadJoinDemo1 {
	public static void main(String[] args) {
		MyThread8 t = new MyThread8();// new /born state
		t.start();// Runnable state
        try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
		for (int i = 1; i < 10; i++) {
			System.out.println("Main Thread" + i + " in control");
		}
	}
}

class MyThread8 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child Thread" + i + " in control");
		}
	}

}