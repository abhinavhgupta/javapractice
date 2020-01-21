package com.example.designpatterns.behavioral.observer.second;

public class OberverTest {

	public static void main(String[] args) {
		Channel channel = new Channel();
		
		Subscriber subscriber1 = new Subscriber("subscriber1");
		Subscriber subscriber2 = new Subscriber("subscriber2");
		Subscriber subscriber3 = new Subscriber("subscriber3");
		Subscriber subscriber4 = new Subscriber("subscriber4");
		Subscriber subscriber5 = new Subscriber("subscriber5");
		Subscriber subscriber6 = new Subscriber("subscriber6");
		
		channel.subscribe(subscriber1);
		channel.subscribe(subscriber2);
		channel.subscribe(subscriber3);
		channel.subscribe(subscriber4);
		channel.subscribe(subscriber5);
		channel.subscribe(subscriber6);
		
		
		subscriber1.subscribeChannel(channel);
		subscriber2.subscribeChannel(channel);
		subscriber3.subscribeChannel(channel);
		subscriber4.subscribeChannel(channel);
		subscriber5.subscribeChannel(channel);
		subscriber6.subscribeChannel(channel);
		
		channel.upload("How to pass time");

	}

}
