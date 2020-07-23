package com.epam.Facadepattern;

public class FacadePattern {
	public static void main(String args[]) {
		ShapesMaker shape = new ShapesMaker();
		shape.drawCircle();
		shape.drawRectangle();
		shape.drawSquare();
	}

}