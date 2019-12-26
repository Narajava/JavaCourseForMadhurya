
public class ThreadDemo3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("NaraThread");
		
		System.out.println(Thread.currentThread().getName());
		
		
		MyThread3 t=new MyThread3();
		t.start();
		System.out.println(t.getName());
		
		t.setName("ChildThread");
		System.out.println(t.getName());
		
		for(int i=0;i<100;i++){
			//System.out.println("main thread"+i);
		}

	}

}
//defining a Thread by extending Thread class
class MyThread3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			//System.out.println("Child Thread"+i);
		}
	}

}
