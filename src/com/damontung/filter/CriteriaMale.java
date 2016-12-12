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
public class CriteriaMale implements Criteria {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<>();

		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("male")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
