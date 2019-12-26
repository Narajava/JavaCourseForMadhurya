
public class ThisDemo2 {
	
	
	int a;

	public ThisDemo2() {
		 this(8);
        System.out.println("ThisDemo2()");
	}

	public ThisDemo2(int a) {
		this("Hi");
		this.a=a;
		System.out.println("ThisDemo2(int a)");
	}

	public ThisDemo2(String message) {
		System.out.println("ThisDemo2(String message)");
	}

	public ThisDemo2(String message1, String message2) {
		System.out.println("ThisDemo2(String message1, String message2)");
	}

	public static void main(String[] args) {
		ThisDemo2 obj=new ThisDemo2(8);
		System.out.println(obj.a);
	}

}
