package com.example.designpatterns.behavioral.command.foodorder;

public class Waiter {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public String bringFood() {
		return command.execute();

	}
}
