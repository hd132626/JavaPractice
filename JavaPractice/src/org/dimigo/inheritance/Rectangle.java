package org.dimigo.inheritance;

public class Rectangle extends Figure {

	private int width;
	private int height;
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.height=height;
		this.width=width;
	}
	public Rectangle(int width, int height) {
		this.height=height;
		this.width=width;
	}
	protected double calcArea() {
		return (width*height);
	}
	protected void printCenter() {
		System.out.print("사각형 ");
		super.printCenter();
	}
}
