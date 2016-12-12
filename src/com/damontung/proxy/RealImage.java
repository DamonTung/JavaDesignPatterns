/**
 * 
 */
package com.damontung.proxy;

/**
 * @author guangzhd
 *
 */
public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.proxy.Image#display()
	 */
	@Override
	public void display() {
		System.out.println("Displaying " + fileName + ". RealImage::display().");
	}

}
