//question number 9
package com.quantum.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AListSortComparator {

	public static void main(String args[]){
		
		   ArrayList<Student> alist = new ArrayList<Student>();
		   alist.add(new Student(223, "Pradhan", 26));
		   alist.add(new Student(245, "Onimesh", 24));
		   alist.add(new Student(209, "Aditha", 32));

		   System.out.println("Student Name Sorting:");
		   Collections.sort(alist, Student.StuNameComparator);

		   for(Student str: alist){
				System.out.println(str);
		   }

		   /* Sorting on Rollno property*/
		   System.out.println("RollNum Sorting:");
		   Collections.sort(alist, Student.StuRollno);
		   for(Student str: alist){
				System.out.println(str);
		   }
		}
}
