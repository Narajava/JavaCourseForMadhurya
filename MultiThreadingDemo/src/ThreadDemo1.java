public class ThreadDemo1{
	public static void main(String[] args) {
		MyThread t=new MyThread();// new /born state
		t.start();//Runnable state
		
		for(int i=1;i<100;i++) {
			System.out.println("Main Thread"+i+" in control");
		}
	}
}



class MyThread extends Thread{

@Override
	public void run(){
for(int i=1;i<100;i++) {
	System.out.println("Child Thread"+i+" in control");
}
}

}