
public class ThreadYieldDemo2 {
	public static void main(String[] args) {
		MyThread6 t1=new MyThread6();
		
		MyThread6 t2=new MyThread6();
		t1.start();
		t2.start();
		
		for(int i=0;i<10;i++){
			// Control passes to child thread  
            Thread.yield();  
			System.out.println("main thread"+i);
		}

	}

}
//defining a Thread by extending Thread class
class MyThread6 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() +"Child Thread"+i);
		}
	}

}
