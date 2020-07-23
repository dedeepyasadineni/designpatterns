package com.epam.Bridgepattern;

public class RedColorCircle implements DrawAPI{

	public void drawaCricle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}