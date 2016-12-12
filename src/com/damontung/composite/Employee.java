/**
 * 
 */
package com.damontung.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guangzhd
 *
 */
public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	/**
	 * @return the subordinates
	 */
	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ("Employee: [Name: " + name + ", Dept: " + dept + ", Salary: " + salary + "]");
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

}
