package com.example.designpatterns.behavioral.observer.second;

public class Subscriber implements Observer {

	private String name;
	private Channel channel;

	public Subscriber(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.designpatterns.behavioral.observer.second.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Hey " + name + ", Video uploaded " + channel.title);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.designpatterns.behavioral.observer.second.Observer#
	 * subscribeChannel(com.example.designpatterns.behavioral.observer.second.
	 * Channel)
	 */
	@Override
	public void subscribeChannel(Channel channel) {
		this.channel = channel;
	}

}
