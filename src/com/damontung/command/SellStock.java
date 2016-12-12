/**
 * 
 */
package com.damontung.command;

/**
 * @author guangzhd
 *
 */
public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		super();
		this.abcStock = abcStock;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.command.Order#execute()
	 */
	@Override
	public void execute() {
		abcStock.sell();

	}

}
