package edu.java.basics.arrays;

/**
 * 
 * This is responsible to deal with String array
 * 
 * @author Nara
 *
 */
public class ArrayDemo2 {

	public static void main(String[] args) {
		
		String strArray[]=new String[6];
		strArray[0]="Madhurya";
		strArray[1]="Aaardhya";
		strArray[2]="Jessy";
		
		for(String str:strArray) {
			System.out.println(str);
		}
		

	}

}
