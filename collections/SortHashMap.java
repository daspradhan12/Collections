//question number 2
package com.quantumtest.collections;

import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.TreeMap;


public class SortHashMap {
	
public static void main ( String[] args )  {
	
	Map<String, Integer> shm = new HashMap<>(); 
	
	shm.put("Rent", 600);
	shm.put("Chicken", 20);
	shm.put( "Grocery", 50) ;
	
	System.out.println(" Before Sorting: " + shm); 
	
	TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(shm); 
	  
    // Display the TreeMap which is naturally sorted 
    for (Map.Entry<String, Integer> entry : sorted.entrySet())  
        System.out.println("Key = " + entry.getKey() +  
                     ", Value = " + entry.getValue());     
	
   
	
}


}
