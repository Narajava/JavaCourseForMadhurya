package edu.java.basics.collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

import edu.java.basics.collections.vector.Student;

public class ArryListDemo3 {

	public static void main(String[] args) {

		// Using generics for type safety <>
		List<String> listObj2 = new ArrayList<>();
		listObj2.add(new String("Madhurya"));
		String st = new String("Jessy");
		listObj2.add(st);
		listObj2.add(st);
		listObj2.add(null);
		// System.out.println(listObj2);

		System.out.println(listObj2.size());
		System.out.println(listObj2);
		
		

	}

}
