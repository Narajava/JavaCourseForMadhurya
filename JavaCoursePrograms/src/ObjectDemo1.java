
public class ObjectDemo1 {
	
	int a=10;
	
	StaticNonStaticDemo staticNonStaticDemo=new StaticNonStaticDemo();
	
	public static void main(String[] args) {
		ObjectDemo1 objectDemo1=new ObjectDemo1();
		System.out.println(objectDemo1.a);
		System.out.println(objectDemo1.staticNonStaticDemo.a);
		objectDemo1.staticNonStaticDemo.sub();
		

	}

}
