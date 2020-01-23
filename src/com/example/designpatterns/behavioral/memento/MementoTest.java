package com.example.designpatterns.behavioral.memento;

public class MementoTest {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.addMemento(originator.saveSateToMemento("State #1"));
		originator.setState("State #3");
		careTaker.addMemento(originator.saveSateToMemento());
		originator.setState("State #4");
		System.out.println("Current State " + originator.getState());

		originator.getSateFromMemento(careTaker.getMemento(0));
		System.out.println("First State " + originator.getState());
		originator.getSateFromMemento(careTaker.getMemento(1));
		System.out.println("Second State " + originator.getState());
	}
}
