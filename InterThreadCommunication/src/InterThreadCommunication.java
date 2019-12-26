class Work {
	int value = 0;

	public void putValue(int value) {
		this.value = value;
		System.out.println("SET : " + value);
	}

	public void getValue() {
		System.out.println("GET :" + value);
	}
}

class Producer extends Thread {
	Work work;

	public Producer(Work work) {
		this.work = work;
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
			work.putValue(count++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

class Consumer extends Thread {
	Work work;

	public Consumer(Work work) {
		this.work = work;
	}

	@Override
	public void run() {
		while (true) {
			work.getValue();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {

		Work queue = new Work();

		Producer p = new Producer(queue);

		Consumer c = new Consumer(queue);

		p.start();
		c.start();

	}

}
