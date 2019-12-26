
public class GoodStudent extends Student {
	
	public void visitLibrary() {
		System.out.println("Inside GoodStudent.visitLibrary()");
	}
	
	public void readJouranals() {
		System.out.println("Inside GoodStudent.readJouranals()");
	}
	
	@Override
	public void sleep() {
		System.out.println("Inside GoodStudent.sleep()");
	}

}
