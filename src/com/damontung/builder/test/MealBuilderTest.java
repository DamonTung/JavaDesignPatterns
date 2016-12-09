/**
 * 
 */
package com.damontung.builder.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.builder.Meal;
import com.damontung.builder.MealBuilder;

/**
 * @author guangzhd
 *
 */
public class MealBuilderTest {

	@Test
	public void test() {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal: ");
		vegMeal.showItems();
		System.out.println("Total cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non Veg Meal: ");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
