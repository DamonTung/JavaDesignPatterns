/**
 * 
 */
package com.damontung.filter.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.damontung.filter.AndCriteria;
import com.damontung.filter.Criteria;
import com.damontung.filter.CriteriaFemale;
import com.damontung.filter.CriteriaMale;
import com.damontung.filter.CriteriaSingle;
import com.damontung.filter.OrCriteria;
import com.damontung.filter.Person;

/**
 * @author guangzhd
 *
 */
public class PersonTest {

	@Test
	public void test() {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleFemale = new OrCriteria(single, female);

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));
		
		System.out.println("\nFemals: ");
		printPersons(female.meetCriteria(persons));
		
		System.out.println("\nSingle males: ");
		printPersons(singleMale.meetCriteria(persons));
		
		System.out.println("\nSingle or Females: ");
		printPersons(singleFemale.meetCriteria(persons));
	}

	public void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [name: " + person.getName() + ", Gender : " + person.getGender()
					+ ", Marital status: " + person.getMaritalStatus());
		}
	}

}
