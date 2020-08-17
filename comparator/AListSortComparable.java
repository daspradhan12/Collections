//question number 9
package com.quantum.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class AListSortComparable {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		   ArrayList<Employee> arraylist = new ArrayList<Employee>();
		   arraylist.add(new Employee("Chaitanya",104, 26));
		   arraylist.add(new Employee( "Rahul",101, 24));
		   arraylist.add(new Employee( "Ajeet", 103, 32));

		   Collections.sort(arraylist);

		   for(Employee str: arraylist){
				System.out.println(str);
		   }
		}

}
