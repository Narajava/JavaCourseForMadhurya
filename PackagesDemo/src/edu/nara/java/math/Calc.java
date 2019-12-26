package edu.nara.java.math;

public class Calc {
	
	public int x=10;
	public int y=11;
	
	public int add(int a,int b) {
		System.out.println(y);
		return a+b;
	}
	
	public int getSumOfNnumbers(int num) {
		int sum=0;
		for (int i=1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}
	

}
