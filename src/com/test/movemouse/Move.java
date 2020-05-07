package com.test.movemouse;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.util.Date;

public class Move {

	public static void main(String[] args) throws AWTException {
		Robot robot = new Robot();
		Point point ;
		while (true) {
			point = MouseInfo.getPointerInfo().getLocation();
			robot.mouseMove(point.x + 1, point.y + 1);
			System.out.println("x>> " + point.x + ",  y>>" + point.y+", "+ new Date());
			robot.delay(60000);
			point = MouseInfo.getPointerInfo().getLocation();
			robot.mouseMove(point.x - 1, point.y - 1);
			System.out.println("x>> " + point.x + ",  y>>" + point.y+", "+ new Date());
			robot.delay(60000);
		}

	}

}
