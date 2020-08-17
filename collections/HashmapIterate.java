//question number 1
package com.quantumtest.collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapIterate {
	public static void main ( String[] args ) { 
		Map<String, Integer> map = new HashMap<String, Integer> ();
		map.put ("Pradhan", 25 ) ;
		map.put ("Thais", 24); 
		
		map.forEach(( key,value) -> System.out.println (key + " = " + value));
	}
	

}
