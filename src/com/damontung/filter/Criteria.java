/**
 * 
 */
package com.damontung.filter;

import java.util.List;

/**
 * @author guangzhd
 *
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
