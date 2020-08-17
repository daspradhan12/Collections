package com.quantumtest.collections;

// question number 3 

import java.util.ArrayList;

import java.util.Collections;

public class ArraylistSort {

	public static void main(String[] args) 
    {
		ArrayList<String> alist=new ArrayList<String>();  
	       alist.add("Pradhan");
	       alist.add("Thais");
	       alist.add("Ray");
	       alist.add("Iza");
	       System.out.println("ArrayList in descending order:");
	       Collections.sort(alist, Collections.reverseOrder());
	       for(String str: alist){
				System.out.println(str);
			}
	 	  
		  
	      
    }
}

