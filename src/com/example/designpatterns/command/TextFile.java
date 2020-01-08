package com.example.designpatterns.command;

public class TextFile {
	private String name;

	// constructor

	public TextFile(String name) {
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
