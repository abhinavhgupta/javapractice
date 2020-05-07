package com.example.designpatterns.creational.builder;

import com.example.designpatterns.creational.builder.director.MealDirector;

public class Demo {

	public static void main(String[] args) {
		MealDirector director = new MealDirector();
		MealBuilder mealBuilder = null;
//		if (isKid) {
//			mealBuilder = new KidsMealBuilder();
//		} else {
//			mealBuilder = new AdultMealBuilder();
//		}
		Meal meal = director.createMeal(mealBuilder);
	}

}
