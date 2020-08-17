// question number 7 
package com.quantumtest.collections;

import java.util.HashSet;

public class HashSetToArray {
	
	public static void main ( String args [] )  { 
		
		 HashSet<String> hset = new HashSet<String>();
		 hset.add( "Pradhan");
		 hset.add("Thais");
		 hset.add("Ray");
		 hset.add("Iza") ; 
		
		 System.out.println("HashSet contains: "+ hset);
		 
		 String[] array = new String[hset.size()] ; 
		 hset.toArray(array) ; 
		 System.out.println ("Array Elements: ") ;
		 for (String temp : array ) { 
			 System.out.println (temp ) ;
 		 }
		
	}

}
