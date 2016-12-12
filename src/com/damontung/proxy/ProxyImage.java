/**
 * 
 */
package com.damontung.proxy;

/**
 * @author guangzhd
 *
 */
public class ProxyImage implements Image {
	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.proxy.Image#display()
	 */
	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
