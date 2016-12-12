/**
 * 
 */
package com.damontung.command.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.command.Broker;
import com.damontung.command.BuyStock;
import com.damontung.command.SellStock;
import com.damontung.command.Stock;

/**
 * @author guangzhd
 *
 */
public class BrokerTest {

	@Test
	public void test() {
		Stock abcStock = new Stock();

		BuyStock buyStock = new BuyStock(abcStock);

		SellStock sellStock = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);

		broker.placeOrders();
	}

}
