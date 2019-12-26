
public class ThreadDemo4 {
	public static void main(String[] args) {
		MyThread4 t=new MyThread4();//instantiation of MyThread
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<100;i++){
			System.out.println("main thread"+i);
		}
	}

}
//defining a Thread by extending Thread class
class MyThread4 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Child Thread"+i);
		}
	}

}
