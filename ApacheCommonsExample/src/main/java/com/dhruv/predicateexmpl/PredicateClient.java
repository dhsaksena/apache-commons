package com.dhruv.predicateexmpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;


public class PredicateClient 
{

	public static void main(String[] args) 
	{
	
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("ssa", 22));
		employeeList.add(new Employee("ssa", 24));
		employeeList.add(new Employee("ssa", 37));
		employeeList.add(new Employee("ssa", 20));
		employeeList.add(new Employee("ssa", 28));
		
		//filterList(employeeList);
		//selectAndReject(employeeList);
		
	
		
	}

	private static void selectAndReject(List<Employee> employeeList) {
		List<Employee> selectedList = new ArrayList<Employee>();
		List<Employee> rejectedList = new ArrayList<Employee>();
		
		CollectionUtils.select(employeeList, new Predicate<Employee>() {

			public boolean evaluate(Employee employee) {
				return employee.getAge()>23;
			}
		}, selectedList, rejectedList);	
		
		for(Employee employee : rejectedList)
		{
			System.out.println(employee);
		}
	}

	private static void filterList(List<Employee> employeeList) {
		CollectionUtils.filter(employeeList, new Predicate<Employee>() {

			public boolean evaluate(Employee employee) {
				return employee.getAge()>23;
			}
		});
		
		
		for(Employee employee : employeeList)
		{
			System.out.println(employee);
		}
	}
	
}
