
public class Parent {
	
	int a=10;
	
	int x=11;
	
	
	public Parent() {
		super();
		System.out.println("Constructor from Parent");
	}
	
	public Parent(int a) {
		System.out.println("Constructor from Parent(int a)");
	}
	
	public void wishMessage() {
		System.out.println("Good morning from Parent");
	}

	public void sayHi() {
		System.out.println("Hi from parent");	
	}
}
