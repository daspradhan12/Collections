// question number 9 
package com.quantum.comparable.comparator;

public  class Employee implements Comparable <Employee> {
	private String EmployeeName;
	private int Rollno;
	private int EmployeeAge;
	

	public Employee(String employeeName, int rollno, int employeeAge) {
	
		this.EmployeeName = employeeName;
		this.Rollno = rollno;
		this.EmployeeAge = employeeAge;
	}


	
	public String getEmployeeName() {
		return EmployeeName;
	}


	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}


	public int getRollno() {
		return Rollno;
	}


	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public int getEmployeeAge() {
		return EmployeeAge;
	}
	
	public void setEmployeeAge(int employeeAge) {
		EmployeeAge = employeeAge;
	}


	public int compareTo(Employee compareemp) { 
		int compareAge = (( Employee)compareemp).getEmployeeAge();
		
		return this.EmployeeAge-compareAge; 
		

	}






	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", Rollno=" + Rollno + ", EmployeeAge=" + EmployeeAge + "]";
	}



	
	}

	


	


