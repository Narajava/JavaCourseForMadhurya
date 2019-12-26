
public class StaticNonStaticDemo {
	
	int a=20;
	
	static int x=10;
	
	void add() {
		System.out.println("Inside add()");
		mul();
	}
	
	void sub() {
		System.out.println("Inside sub()");
	}
	
	static void mul() {
		System.out.println("Inside mul()");
	}
	
    static void div() {
    	System.out.println("Inside div()");
    	StaticNonStaticDemo obj=new  StaticNonStaticDemo();  
    	obj.sub();
	}

	public static void main(String[] args) {
      mul();
     StaticNonStaticDemo obj=new  StaticNonStaticDemo();  
     obj.add();	
	}

}
