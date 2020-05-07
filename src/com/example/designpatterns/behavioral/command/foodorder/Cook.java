package com.example.designpatterns.behavioral.command.foodorder;

public class Cook {
	private String name;

	public Cook(String name) {
		this.name = name;
	}
	
	public String serve() {
		System.out.println("cooked & ready to serve " + name);
		return "cooked & ready to serve " + name;
	}
	
	
}
