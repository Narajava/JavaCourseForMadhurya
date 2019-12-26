import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
	    //to read the input from console we need scanner object
		Scanner scanner=new Scanner(System.in);
		
		try {
		System.out.print("Enter number 1 : ");
		int num1=scanner.nextInt();
		System.out.print("Enter number 2 : ");
		int num2=scanner.nextInt();
		if(num2 !=0) {
		  int z=num1/num2;
		  System.out.println("Z value : "+z);
		}else {
			System.out.println("Invalid denominator value");
		}
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured ");
		} catch (Exception e) {
			System.out.println("Exception e");
			e.printStackTrace();
		}
		
		System.out.println("Hello World!");

	}

}
