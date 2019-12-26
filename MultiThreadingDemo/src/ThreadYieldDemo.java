
public class ThreadYieldDemo {
	public static void main(String[] args) {
		MyThread5 t=new MyThread5();//instantiation of MyThread
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread"+i);
		}

	}

}
//defining a Thread by extending Thread class
class MyThread5 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println("Child Thread"+i);
		}
	}

}
