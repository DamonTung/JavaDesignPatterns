/**
 * 
 */
package com.damontung.decorator;

/**
 * @author guangzhd
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.decorator.ShapeDecorator#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratorShape.draw();
		setRedBorder(decoratorShape);
	}

	private void setRedBorder(Shape shape) {
		System.out.println("Border Color: Red");
	}
}
