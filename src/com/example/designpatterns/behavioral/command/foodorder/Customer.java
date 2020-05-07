package com.example.designpatterns.behavioral.command.foodorder;

public class Customer {

	public static void main(String[] args) {
		
		Order order= new Order("Soup", 1);
		Waiter waiter = new Waiter();

		Command command = new SoupCommand(new Cook(""));

		waiter.setCommand(command);
		waiter.bringFood();
	}
}
