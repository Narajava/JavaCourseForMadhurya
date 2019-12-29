package edu.java.basics.collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

import edu.java.basics.collections.vector.Student;

public class ArryListDemo1 {

	public static void main(String[] args) {
		

		
		int[] a=new int[3];
		a[0]=8;

		ArrayList listObj = new ArrayList();
		listObj.add(new String("Nara"));
		listObj.add(new Integer(8));
		//System.out.println(listObj);

		// assigning impl class object to it's interface
		List listObj1 = new ArrayList();
		listObj1.add(new String("Madhurya"));
		listObj1.add(new Integer(9));
		//System.out.println(listObj1);

		// Using generics for type safety <>
		List<String> listObj2 = new ArrayList<>();
		listObj2.add(new String("Madhurya"));
		listObj2.add(new String("Jessy"));
		//System.out.println(listObj2);
		
		System.out.println(listObj2.size());

		// Using generics for type safety <>
		List<Student> listObj3 = new ArrayList<>();
		Student st1=new Student(1,"Jessy");
		listObj3.add(st1);
		Student st2=new Student(2,"Aaaradhya");
		listObj3.add(st2);
	//	System.out.println(listObj3);
		
		//Reading elements from ArrayList
		 for(int i=0;i<listObj2.size();i++) {
			 System.out.println(listObj2.get(i));
		 }
		 
		//Reading elements from ArrayList
		 for(String str:listObj2) {
			 System.out.println(str);
		 }
		 
		 

	

	}

}
