package com.epam.Bridgepattern;

public class CircleShape extends Shape {
	private int x,y,radius;
	
	public CircleShape(int x,int y,int radius,DrawAPI drawAPI) {
		super(drawAPI);
		this.x=x;
		this.y=y;
		this.radius=radius;
		
	}
	
	public void draw() {
		
		drawAPI.drawaCricle(radius,x,y);
		
	}
	

}