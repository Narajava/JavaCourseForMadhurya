package edu.java.basics.collections.vector;

import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		int[] a=new int[3];
		a[0]=8;

		Vector listObj = new Vector();
		listObj.add(new String("Nara"));
		listObj.add(new Integer(8));
		//System.out.println(listObj);

		// assigning impl class object to it's interface
		List listObj1 = new Vector();
		listObj1.add(new String("Madhurya"));
		listObj1.add(new Integer(9));
		//System.out.println(listObj1);

		// Using generics for type safety <>
		List<String> listObj2 = new Vector<>();
		listObj2.add(new String("Madhurya"));
		listObj2.add(new String("Jessy"));
		//System.out.println(listObj2);
		
		System.out.println(listObj2.size());

		// Using generics for type safety <>
		List<Student> listObj3 = new Vector<>();
		Student st1=new Student(1,"Jessy");
		listObj3.add(st1);
		Student st2=new Student(2,"Aaaradhya");
		listObj3.add(st2);
	//	System.out.println(listObj3);
		
		//Reading elements from Vector
		 for(int i=0;i<listObj2.size();i++) {
			 System.out.println(listObj2.get(i));
		 }
		 
		//Reading elements from Vector
		 for(String str:listObj2) {
			 System.out.println(str);
		 }
		 
		 

	}

}
