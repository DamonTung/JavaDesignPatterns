/**
 * 
 */
package com.damontung.filter;

import java.util.List;

/**
 * @author guangzhd
 *
 */
public class AndCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.filter.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPerson = criteria.meetCriteria(persons);

		return otherCriteria.meetCriteria(firstCriteriaPerson);
	}

}
