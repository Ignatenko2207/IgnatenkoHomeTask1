package ua.com.qalight.ignatenko.triangle;

import ua.com.qalight.ignatenko.AbstractShape;

public class Triangle extends AbstractShape{

	private double height;
	private double base;
	
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	@Override
	public double getArea() {

		return base*height/2;
	}
	
	public Triangle(double baseAsParameter) {
		this.base = baseAsParameter;
	}
//	
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}
//	
	public Triangle() {
		
	}
	
	public void someMethodVol2(int someNewNomber, int otherNewNomber, String textToConcat) {
		
		
		int someNo = 50;
		int otherNo = 60;
		
		String intAsString = String.valueOf(someNo + otherNo + someNewNomber + otherNewNomber);
		
		char[] symbols = intAsString.toCharArray();
		
		int stringAsInt = Integer.parseInt(intAsString);
		
		System.out.println(intAsString + textToConcat);
//		return intAsString.length();
//		return String.valueOf(someNo+otherNo); // -> "248"
		
	}
	
}
