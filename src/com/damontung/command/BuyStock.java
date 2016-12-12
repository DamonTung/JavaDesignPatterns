/**
 * 
 */
package com.damontung.command;

/**
 * @author guangzhd
 *
 */
public class BuyStock implements Order {
	private Stock abcStock;

	public BuyStock(Stock abcStock) {
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
		abcStock.buy();
	}

}
