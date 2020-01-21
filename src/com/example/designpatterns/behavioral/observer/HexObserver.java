package com.example.designpatterns.behavioral.observer;

public class HexObserver extends Observer {
	public HexObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hexadecimal " + Integer.toHexString(subject.getState()));

	}

}
