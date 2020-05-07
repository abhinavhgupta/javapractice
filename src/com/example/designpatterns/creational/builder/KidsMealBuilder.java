package com.example.designpatterns.creational.builder;

public class KidsMealBuilder implements MealBuilder {
	
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
