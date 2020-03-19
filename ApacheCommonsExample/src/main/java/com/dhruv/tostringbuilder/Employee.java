package com.dhruv.tostringbuilder;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Employee 
{
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private int salary;
	
	private String department;
	
	private Date hiringDate;


	
	public Employee(String firstName, String lastName, int age, int salary, String department, Date hiringDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.hiringDate = hiringDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}

	@Override
	public String toString() 
	{
		//ToStringBuilder.reflectionToString(this)
		//ToStringBuilder.reflectionToString(this , new CustomStyle())
		//new ToStringBuilder(this , ToStringStyle.MULTI_LINE_STYLE).append("Salaty" , salary).toString()
		
		return new ToStringBuilder(this , ToStringStyle.MULTI_LINE_STYLE).append("Salaty" , salary).toString();
	}

	
	
}
