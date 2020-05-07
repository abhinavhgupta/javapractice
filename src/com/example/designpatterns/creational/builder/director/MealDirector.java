package com.example.designpatterns.creational.builder.director;

import com.example.designpatterns.creational.builder.Meal;
import com.example.designpatterns.creational.builder.MealBuilder;

public class MealDirector {
	public Meal createMeal(MealBuilder builder) {
		builder.buildDrink();
		builder.buildMain();
		builder.buildDessert();
		return builder.getMeal();
	}
}
