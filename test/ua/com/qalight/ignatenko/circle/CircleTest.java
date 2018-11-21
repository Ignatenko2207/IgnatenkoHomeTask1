package ua.com.qalight.ignatenko.circle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testGetArea() {
		Circle circle = new Circle();
		circle.setRadius(3);
		double result = circle.getArea();
		
		assertNotNull(circle.getArea());
		
		assertTrue(result > 28.0 && result < 29.0);
	}

}
