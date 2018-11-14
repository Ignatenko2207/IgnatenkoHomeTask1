package ua.com.qalight.ignatenko;

public abstract class AbstractShape implements Shape{

	public abstract double getArea();

	
	private int intField;
	
	
	
	public int getIntField() {
		return intField;
	}



	public void setIntField(int intField) {
		this.intField = intField;
	}



	public void someMethod() {
		System.out.println("some realisation!");
	}
	
}
