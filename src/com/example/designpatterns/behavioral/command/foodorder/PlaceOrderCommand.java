package com.example.designpatterns.behavioral.command.foodorder;

public class PlaceOrderCommand implements Command {
	
	private Cook cook;

	public PlaceOrderCommand(Cook cook) {
		this.cook = cook;
	}

	@Override
	public String execute() {
		return cook.serve();
	}

}
