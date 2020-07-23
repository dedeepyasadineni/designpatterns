package com.epam.Bridgepattern;

public class BridgePatternDemo {
	public static void main(String args[]) {
		Shape redCircle = new CircleShape(100,100,10,new RedColorCircle());
		Shape greenCircle = new CircleShape(100,100,10,new GreenColorCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}
}