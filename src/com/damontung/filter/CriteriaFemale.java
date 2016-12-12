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
public class CriteriaFemale implements Criteria {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("female")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
