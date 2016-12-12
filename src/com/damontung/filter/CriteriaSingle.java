/**
 * 
 */
package com.damontung.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guangzhd
 *
 */
public class CriteriaSingle implements Criteria {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<>();

		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("single")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
