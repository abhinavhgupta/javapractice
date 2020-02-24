package com.example.designpatterns.behavioral.state;

public class OutForDelivery implements PackageState {
	private static OutForDelivery instance = new OutForDelivery();

	private OutForDelivery() {
	}

	public static OutForDelivery instance() {
		// TODO Auto-generated method stub
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is out of delivery !!");
        ctx.setCurrentState(Delivered.instance());
	}

}
