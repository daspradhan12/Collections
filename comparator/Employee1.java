// question number 17 

package com.quantum.comparable.comparator;

import java.util.Comparator;

public class Employee1 implements  Comparable <Employee1>  {
       private String EmpName;
       private int EmpAge; 
       int EmpSalary;
       private String EmpJoiningDate; 
       
	
	
	public Employee1(String empName, int empAge, int empSalary, String empJoiningDate) {
	
		this.EmpName = empName;
		this.EmpAge = empAge;
		this.EmpSalary = empSalary;
		this.EmpJoiningDate = empJoiningDate;
	}



	public String getEmpName() {
		return EmpName;
	}



	public void setEmpName(String empName) {
		EmpName = empName;
	}



	public int getEmpAge() {
		return EmpAge;
	}



	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}



	public int getEmpSalary() {
		return EmpSalary;
	}



	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}



	public String getEmpJoiningDate() {
		return EmpJoiningDate;
	}



	public void setEmpJoiningDate(String empJoiningDate) {
		EmpJoiningDate = empJoiningDate;
	}



	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return this.EmpAge - o.EmpAge ;
	}
	
	
	public String Comparator (Employee1  o) 
		{ 
			
			return this.EmpName ; 
			
		} 
	
		
		}

	
		
		
	





