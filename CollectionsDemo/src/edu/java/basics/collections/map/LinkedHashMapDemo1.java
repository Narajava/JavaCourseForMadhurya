package edu.java.basics.collections.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		
		//not thread safe
		Map<String,String> map=new LinkedHashMap<>();
		map.put("Hyderrabad","TN");
		map.put("Amaravathi","AP");
		map.put("Bangalore", "KS");
		map.put("Patna","Bihar");
		map.put("Lukno","UP");
		map.put("Delhi", "Delhi");
		System.out.println(map);
		
		System.out.println(map.get("Lukno"));
		
		//to get all the values
		Collection<String> values=map.values();
		
		for(String str:values) {
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
