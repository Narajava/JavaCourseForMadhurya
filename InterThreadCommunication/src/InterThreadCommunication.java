class Work{
	int value=0;
	
	public void setValue(int val) {
		this.value=value;
		System.out.println("SET : "+value);
	}
	
	public void getValue() {
		System.out.println("GET :"+value);
	}
}

class Producer extends Thread{
	Work work;
	
	public Producer(Work work) {
	  this.work=work;
	}

	@Override
	public void run() {
		int count=0;
		while(true) {
			work.setValue(count);
			count++;
		}
	}
	
	
	
}

class Consumer extends Thread{
	Work work;
	
	public Consumer(Work work) {
	  this.work=work;	
	}
	
	@Override
	public void run() {
		while(true) {
			work.getValue();
		}
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		
		Work work=new Work();
		
		Producer p=new Producer(work);
		
		Consumer c=new Consumer(work);
		
		p.start();
		c.start();

	}

}
