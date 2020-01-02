package edu.java.basics.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		
		
		Set<String> stringValues=new LinkedHashSet<>();
		stringValues.add("Nara");
		stringValues.add("Simha");
		stringValues.add("Swamy");
		stringValues.add("Jessy");
		stringValues.add("Nara");
		stringValues.add(null);
		stringValues.add(null);
      //  System.out.println(stringValues);
        for(String str:stringValues) {
        	System.out.println(str);
        }
	}

}
