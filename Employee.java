package com.sbi.project;

import java.time.LocalDate;


public class Employee {
	
	private int employeeNumber;
	private String name;
	private String job;
	private LocalDate joiningDate;
	private double salary;
	private Integer age;
	
	public Employee(int empno, String name, String job, LocalDate joiningDate, double salary, Integer age) {
		super();
		this.employeeNumber = empno;
		this.name = name;
		this.job = job;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.age = age;
		
	}
	
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Employee() {
		super();
		System.out.println("Employee created....");
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
