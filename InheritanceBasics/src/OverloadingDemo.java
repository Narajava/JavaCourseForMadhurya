
public class OverloadingDemo {
	
	
	/*public void add(int a,int b) {
		System.out.println(a+b);
	}
	*/
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void add(float a,int b) {
		System.out.println("add(float a,int b)");
		System.out.println(a+b);
	}
	
	public void add(String name,String wishMessage) {
		System.out.println(wishMessage+" "+name);
	}
	
	public static void main(String[] args) {
		OverloadingDemo obj=new OverloadingDemo();
		obj.add(10, 20);
		obj.add(10, 20,30);
		obj.add(10.1f, 20);
		obj.add("Nara", "Good morning");
	}

}
