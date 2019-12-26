
public class Child extends Parent {
	
	int a=12;
	
	int x=13;
	
	public Child() {
		super(8);
		System.out.println("Constructor from Child");
	}
	
	public void add() {
		System.out.println("Child Sum"+(a+x));
		System.out.println("Parent Sum"+(super.a+super.x));
		
		System.out.println("add from Child");
	}

	@Override
	public void wishMessage() {
		System.out.println("Good morning from Child");
	}
	public static void main(String[] args) {
		Child c1=new Child();
		c1.add();
	}

}
