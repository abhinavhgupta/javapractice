package com.example.designpatterns.creational.builder;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface MealBuilder {
	void buildDrink();

	void buildMain();

	void buildDessert();

	Meal getMeal();

}
