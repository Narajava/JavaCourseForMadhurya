package edu.java.basics.arrays;

/**
 * This is responsible to describe arrays concept.
 * 
 * @author NARA
 *
 */
public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		a[0]=11;
		a[1]=21;
		a[2]=31;
		a[3]=41;
		
		//a[5]=11; : ArrayIndexoutOfBoundsException
		
		System.out.println(a);
		System.out.println(a.length);
		
        System.out.println("Reading values");
        
        for(int i=0;i<a.length;i++) {//traditional for loop
        System.out.println(a[i]);	
        }
        
        for(int i:a) {//for-each loop
        	System.out.println(i);
        }
        
	}

}
