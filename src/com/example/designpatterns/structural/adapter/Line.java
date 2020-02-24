package com.example.designpatterns.structural.adapter;

public class Line {
	public void draw(int x, int y, int width, int height) {
		System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
				+ ", height: " + height);
	}
}
