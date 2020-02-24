package com.example.designpatterns.behavioral.state;

public class Delivered implements PackageState {
	private static Delivered instance = new Delivered();

	private Delivered() {
	}

	public static Delivered instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is delivered !!");
	}

}
