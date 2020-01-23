package com.example.designpatterns.behavioral.command;

/**
 * Receiver
 * 
 * The Receiver class contains some business logic. Almost any object may act as
 * a receiver. Most commands only handle the details of how a request is passed
 * to the receiver, while the receiver itself does the actual work.
 * 
 * @author abhinav.h.gupta
 *
 */
public class ReceiverTextFile {
	private String name;

	// constructor

	public ReceiverTextFile(String name) {
		this.name = name;
	}

	public String open() {
		System.out.println();
		return "Opening file " + name;
	}

	public String save() {
		System.out.println();
		return "Saving file " + name;
	}
}
