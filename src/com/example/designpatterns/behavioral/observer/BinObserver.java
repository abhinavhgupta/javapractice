package com.example.designpatterns.behavioral.observer;

public class BinObserver extends Observer {
	
	public BinObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary " + Integer.toBinaryString(subject.getState()));

	}

}
