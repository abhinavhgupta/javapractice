package com.example.designpatterns.creational.builder;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 *
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */
public class AdultMealBuilder implements MealBuilder {
	Meal meal = new Meal();

	@Override
	public void buildDessert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildMain() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Meal getMeal() {
		return meal;
		
	}}
