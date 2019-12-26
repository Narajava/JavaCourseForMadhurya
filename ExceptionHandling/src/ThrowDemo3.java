
public class ThrowDemo3 {

	public static void main(String[] args) {
		
		try {
			ThrowDemo2 obj=new ThrowDemo2();
			obj.generateException();
		} catch (InvalidAgeException|TooOldException e) {
			System.out.println("Invalid age Exception occured"+e.getMessage());
		} catch ( Exception e) {
			System.out.println("Exception occured");
		}

	}

}
