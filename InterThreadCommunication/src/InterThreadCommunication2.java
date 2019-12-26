class Work1{
	int value=0;
	boolean valProduced=false;
	
	public synchronized void putValue(int value) {
		if(valProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.value=value;
		System.out.println("SET : "+value);
		valProduced=true;
		notify();
	}
	
	public synchronized void getValue() {
		if(!valProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("GET :"+value);
		valProduced=false;
		notify();
	}
}

class Producer1 extends Thread{
	Work1 work;
	
	public Producer1(Work1 work) {
	  this.work=work;
	}

	@Override
	public void run() {
		int count=0;
		while(true) {
			work.putValue(count++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
}

class Consumer1 extends Thread{
	Work1 work;
	
	public Consumer1(Work1 work) {
	  this.work=work;	
	}
	
	@Override
	public void run() {
		while(true) {
			work.getValue();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class InterThreadCommunication2 {

	public static void main(String[] args) {
		
		Work1 queue=new Work1();
		
		Producer1 p=new Producer1(queue);
		
		Consumer1 c=new Consumer1(queue);
		
		p.start();
		c.start();

	}

}
