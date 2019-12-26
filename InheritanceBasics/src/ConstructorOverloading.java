
public class ConstructorOverloading {
	
	

	public ConstructorOverloading() {
	System.out.println("ConstructorOverloading()");
	}
	
	public ConstructorOverloading(int a) {
		System.out.println("ConstructorOverloading(int)");	
	}
	
	public ConstructorOverloading(float b) {
		System.out.println("ConstructorOverloading(float)");
	}
	
	public ConstructorOverloading(String message) {
		System.out.println("ConstructorOverloading(String)");
	}

	public static void main(String[] args) {

		//ConstructorOverloading constructorOverloading=new ConstructorOverloading(10);
		
		ConstructorOverloading constructorOverloading1=new ConstructorOverloading();
		
		ConstructorOverloading constructorOverloading2=new ConstructorOverloading(10.1f);
	}

}
