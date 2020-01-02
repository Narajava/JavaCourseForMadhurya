package edu.java.basics.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		
		SortedSet<String> stringValues=new TreeSet<>();
		stringValues.add("Nara");
		stringValues.add("Simha");
		stringValues.add("Swamy");
		stringValues.add("Jessy");
		stringValues.add("Nara");
      //  System.out.println(stringValues);
        for(String str:stringValues) {
        	System.out.println(str);
        }
	}

}
