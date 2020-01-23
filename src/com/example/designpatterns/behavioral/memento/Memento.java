package com.example.designpatterns.behavioral.memento;

/**
 * The object that is going to maintain the state of originator. Its just a
 * POJO.
 * 
 * @author abhinav.h.gupta
 *
 */
public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
