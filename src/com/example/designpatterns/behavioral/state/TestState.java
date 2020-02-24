package com.example.designpatterns.behavioral.state;

public class TestState {

	public static void main(String[] args) {
		 DeliveryContext ctx = new DeliveryContext(null, "Test123");
         
	        ctx.update();
	        ctx.update();
	        ctx.update();
	        ctx.update();
	        ctx.update();
	}

}
