import java.util.Scanner;

public class ThrowDemo1 {

	public static void main(String[] args) throws Exception {
	Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter number 1 : ");
		int num1=scanner.nextInt();
		
		if(num1 == 0) {
			throw new Exception("It's my condition");
		}
		
		System.out.println("Program executed successfully");

	}

}
