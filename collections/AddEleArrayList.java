//question number 4
package com.quantumtest.collections;

import java.util.ArrayList;

public class AddEleArrayList {
	
	public static void main (String args [] ) { 
		
		ArrayList<String> alist=new ArrayList<String>();
		alist.add( "Pradhan");
		alist.add("Thais");
		alist.add("Ray");
		alist.add("Iza") ; 
		System.out.println(alist);
		alist.add( 3, "Iren");
		System.out.println(alist);
	}

}
