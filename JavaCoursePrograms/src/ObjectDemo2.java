
public class ObjectDemo2 {
	
	int a=10;
	
	static StaticNonStaticDemo2 staticNonStaticDemo2=new StaticNonStaticDemo2();

	public static void main(String[] args) {
		int sum=ObjectDemo2.staticNonStaticDemo2.add(10, 11);
		
		System.out.println(sum);
		
		System.out.println(ObjectDemo2.staticNonStaticDemo2.mul(10, 11));
	}

}
