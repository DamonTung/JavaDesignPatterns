/**
 * 
 */
package com.damontung.iterator;

import javax.xml.stream.events.Namespace;

/**
 * @author guangzhd
 *
 */
public class NameRespository implements Container {
	public String[] names = { "Robert", "John", "Julie", "Lora" };

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.iterator.Container#getIterator()
	 */
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}

	}
}
