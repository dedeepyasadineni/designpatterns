package com.epam.Facadepattern;

public class ShapesMaker {
	private ShapesDrawn circle;
	private ShapesDrawn rectangle;
	private ShapesDrawn square;
	public ShapesMaker() {
		circle = new CircleShape();
		rectangle = new RectangleShape();
		square = new SquareShape();
	}

	public void drawCircle() {
		
		circle.draw();
		
	}

	public void drawRectangle() {
		
			rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
		
	}
	
}