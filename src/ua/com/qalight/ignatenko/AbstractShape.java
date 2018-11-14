package ua.com.qalight.ignatenko;

public abstract class AbstractShape implements Shape{

	public double getArea() {
		return 0;
	}

	
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
