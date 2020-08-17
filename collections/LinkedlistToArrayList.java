//question number 6
package com.quantumtest.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List; 

public class LinkedlistToArrayList {
	
  public static void main ( String[] args ) { 
	  LinkedList<String> linkedlist = new LinkedList<String>();
	  
	  linkedlist.add( "Pradhan");
	  linkedlist.add("Thais");
	  linkedlist.add("Ray");
	  linkedlist.add("Iza") ; 
	  
	  List<String> list = new ArrayList<String>(linkedlist); 
	  
	  for (String str : list){
	      System.out.println(str);
	    }	  
	  
  }
}
