class Student{
	
	static int count=0;
	
	public synchronized int incCount() {
		System.out.println(Thread.currentThread().getName()+":"+count);
		return (count++); 
	}
	
}

class MyThread9 extends Thread {
	Student student;
	
	public MyThread9(Student student) {
		this.student=student;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			  student.incCount();
		}
	}

}

class MyThread10 extends Thread {
	Student student;
	public MyThread10(Student student) {
		this.student=student;
	}

	@Override
	public void run() {
		for (int i = 100; i <= 200; i++) {
			student.incCount();
		}
	}

}

public class WhyThreadSafety {

	public static void main(String[] args) {
      Student student=new Student();
      MyThread9 t1=new MyThread9(student);
      MyThread10 t2=new MyThread10(student);
      t1.start();
      t2.start();
      
      try {
		t1.join();
		  t2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
      System.out.println(student.count);
	}

}
