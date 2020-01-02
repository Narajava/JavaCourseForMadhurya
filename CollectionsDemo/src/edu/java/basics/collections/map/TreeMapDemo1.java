package edu.java.basics.collections.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		
		//not thread safe
		Map<String,String> map=new TreeMap<>();
		map.put("Hyderrabad","TN");
		map.put("Amaravathi","AP");
		map.put("Bangalore", "KS");
		map.put("Patna","Bihar");
		map.put("Lukno","UP");
		map.put("Delhi", "Delhi");
		System.out.println(map);
		
		//System.out.println(map.get("Lukno"));
		
		//to get all the values
		Collection<String> values=map.values();
		
		Set<String> valuesSet=new TreeSet<>(values);
		
		for(String str:valuesSet) {
			System.out.println(str);
		}
		
		//To get all the keys
		Set<String> strSet=map.keySet();
		
		Iterator<String> strIterator=strSet.iterator();
		
		while(strIterator.hasNext()) {
			System.out.println(strIterator.next());
		}

	}

}
