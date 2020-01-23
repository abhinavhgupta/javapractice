package com.example.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * The object that keeps track of multiple memento. Like maintaining savepoints.
 * 
 * @author abhinav.h.gupta
 *
 */
public class CareTaker {

	private List<Memento> mementos = new ArrayList<Memento>();

	public void addMemento(Memento memento) {
		mementos.add(memento);
	}

	public Memento getMemento(int index) {
		return mementos.get(index);
	}
}
