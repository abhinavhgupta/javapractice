package com.example.designpatterns.behavioral.observer.second;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	String title;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.designpatterns.behavioral.observer.second.Subject#subscribe(com.
	 * example.designpatterns.behavioral.observer.second.Subscriber)
	 */
	@Override
	public void subscribe(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.designpatterns.behavioral.observer.second.Subject#unSubscribe(com
	 * .example.designpatterns.behavioral.observer.second.Observer)
	 */
	@Override
	public void unSubscribe(Observer subscriber) {
		this.subscribers.remove(subscriber);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.designpatterns.behavioral.observer.second.Subject#upload(java.
	 * lang.String)
	 */
	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscriber();

	}

	
	@Override
	public void notifySubscriber() {
		for (Observer subscriber : subscribers) {
			subscriber.update();
		}
	}

}
