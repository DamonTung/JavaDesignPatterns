/**
 * 
 */
package com.damontung.singleton;

/**
 * @author guangzhd
 *
 */
public class SingletonObject {
	private static SingletonObject instance = new SingletonObject();

	// 隐藏构造函数，确保不能被外部实例化
	private SingletonObject() {

	}

	public static SingletonObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("This is Singleton Pattern example,,good luck!");
	}
}
