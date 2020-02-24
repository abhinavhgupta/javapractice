package com.example.designpatterns.behavioral.state;

public class InTransition implements PackageState {

	private static InTransition instance = new InTransition();

	private InTransition() {
	}

	public static InTransition instance() {
		// TODO Auto-generated method stub
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is in transition !!");
		ctx.setCurrentState(OutForDelivery.instance());
	}

}
