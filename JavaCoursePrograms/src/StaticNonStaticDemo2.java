
public class StaticNonStaticDemo2 {
	
	int a=10;
	static int x=10;
	
	
	
	public int add(int a,int b) {
		return a+b;
	}
	
	
	public static int mul(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		StaticNonStaticDemo2 obj1=new StaticNonStaticDemo2();
		System.out.println(obj1);
		obj1.a=obj1.a+1;
		System.out.println(obj1.a);
		x=x+1;
		System.out.println(x);
		StaticNonStaticDemo2 obj2=new StaticNonStaticDemo2();
		System.out.println(obj2);
		obj2.a=obj2.a+1;
		System.out.println(obj2.a);
		x=x+1;
		System.out.println(x);
	}

}
