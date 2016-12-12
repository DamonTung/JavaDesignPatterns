/**
 * 
 */
package com.damontung.composite.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.composite.Employee;

/**
 * @author guangzhd
 *
 */
public class EmployeeTest {

	@Test
	public void test() {
		Employee CEO = new Employee("DT", "CEO", 3000);
		Employee headSales = new Employee("Robert", "head sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 15000);

		Employee dt1 = new Employee("Lura", "Marketing", 10000);
		Employee dt2 = new Employee("Lura2", "Marketing", 10000);
		Employee dt3 = new Employee("Lura3", "Sales", 10000);
		Employee dt4 = new Employee("Lura4", "Sales", 10000);

		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(dt3);
		headSales.add(dt4);

		headMarketing.add(dt1);
		headMarketing.add(dt2);

		System.out.println(CEO);

		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);

			for (Employee employee : headEmployee.getSubordinates())
				System.out.println(employee);
		}
	}

}
