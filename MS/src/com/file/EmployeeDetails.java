package com.file;

public class EmployeeDetails {
	private String empId;
	private String name;
	private double salary;
	private int age;
	
	public EmployeeDetails() {
		
	}
	

	public EmployeeDetails(String empId, String name, double salary, int age) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}



	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", name=" + name + ", salary=" + salary + ", age=" + age
				+ ", getEmpId()=" + getEmpId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
