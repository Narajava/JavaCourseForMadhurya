package edu.java.basics.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		
		Set<String> stringValues=new HashSet<>();
		stringValues.add("Nara");
		stringValues.add("Simha");
		stringValues.add("Swamy");
		stringValues.add("Jessy");
		stringValues.add("Nara");
		stringValues.add(null);
		stringValues.add(null);
      //  System.out.println(stringValues);
      /*  for(String str:stringValues) {
        	System.out.println(str);
        }*/
        
        Iterator<String> stringIterator=stringValues.iterator();
        

		while(stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
		
	}

}
