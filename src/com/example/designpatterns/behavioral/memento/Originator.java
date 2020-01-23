package com.example.designpatterns.behavioral.memento;

/**
 * 
 * The object for which the state is to be saved. It creates the memento and
 * uses it in future to undo.
 * 
 * @author abhinav.h.gupta
 *
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento saveSateToMemento() {
		return new Memento(state);
	}

	public Memento saveSateToMemento(String state) {
		return new Memento(state);
	}

	public void getSateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
