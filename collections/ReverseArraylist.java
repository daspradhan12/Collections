// question number 8 
package com.quantumtest.collections;

import java.io.*; 
import java.util.*; 

public class ReverseArraylist {
	public static void main ( String args []) { 
	
	ArrayList<String> alist = new ArrayList<String> () ;
	
	 
	 alist.add("Pradhan") ; 
     alist.add("Thais") ;
     alist.add("Ray") ;
     alist.add("Iza") ; 
     System.out.print ( "Elements before reversing "+ alist ); 
     
     Collections.reverse( alist);
     System.out.println ( " \n elements after reversing: "); 
     
     
     for (String temp : alist ) { 
		 System.out.println (temp ) ;
     
		 // for (int i = 0; i < alist.size(); i++) { 
        // System.out.print(alist.get(i) + " "); 
     
     }     
}
} 
