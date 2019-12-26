import java.util.Scanner;

public class ThrowDemo2 {

	public void generateException()throws TooOldException {
	    Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=scanner.nextInt();
		if(age > 100) {
			throw new TooOldException("You are too old to take this program");
		}
		if (age < 0) {
			throw new InvalidAgeException("Invalid age given by user");
		}
		
		System.out.println("You are successfully registred for this program");
		

	}

}
