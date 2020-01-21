package com.example.designpatterns.behavioral.observer.second;

public interface Subject {

	void subscribe(Subscriber subscriber);

	void unSubscribe(Observer subscriber);

	void upload(String title);

	void notifySubscriber();

}