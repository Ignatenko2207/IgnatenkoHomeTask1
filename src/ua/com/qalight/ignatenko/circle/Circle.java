package ua.com.qalight.ignatenko.circle;

import ua.com.qalight.ignatenko.AbstractShape;

public class Circle extends AbstractShape{

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
	}
}
