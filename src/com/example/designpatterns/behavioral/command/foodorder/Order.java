package com.example.designpatterns.behavioral.command.foodorder;

public class Order {
	private String foodItem;
	private Integer foodQuantity;

	public Order(String foodItem, Integer foodQuantity) {
		this.foodItem = foodItem;
		this.foodQuantity = foodQuantity;
	}

	public Integer getFoodQuantity() {
		return foodQuantity;
	}

	public String getFoodItem() {
		return foodItem;
	}

}
