package edu.java.basics.arrays;

public class VaribleLengthArgs {
	
	
	public void add(int[] a) {
		int sum=0;
		for(int val:a) {
			sum=sum+val;
		}
		System.out.println(sum);
	}
	
	public void mul(int...a) {
		int mul=1;
		for(int val:a) {
			mul=mul*val;
		}
		System.out.println(mul);
	}
	

	public static void main(String[] args) {
		
		VaribleLengthArgs obj=new VaribleLengthArgs();
		int x[]={1,2,3,4,5};
		obj.add(x);
		obj.mul(1,2,3,4,5,6);

	}

}
