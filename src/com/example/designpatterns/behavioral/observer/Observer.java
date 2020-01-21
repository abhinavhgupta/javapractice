package com.example.designpatterns.behavioral.observer;

public abstract class Observer {
	protected Subject subject;
    public abstract void update();
}
