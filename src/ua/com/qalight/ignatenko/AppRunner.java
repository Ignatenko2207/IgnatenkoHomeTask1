package ua.com.qalight.ignatenko;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import ua.com.qalight.ignatenko.circle.Circle;
import ua.com.qalight.ignatenko.triangle.Triangle;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

		public static void main(String[] args) {
			
			Shape triangle1 = new Triangle(60, 45);
			Shape triangle2 = new Triangle(12, 15);
			Shape triangle3 = new Triangle(14, 16);
			Shape triangle4 = new Triangle(23, 12);
			Shape triangle5 = new Triangle(45, 60);
			Shape circle1 = new Circle(45.0);
			Shape circle2 = new Circle(60.0);
			
			List<Shape> shapes = new ArrayList<>();
			
			shapes.add(triangle1);
			shapes.add(triangle2);
			shapes.add(triangle3);
			shapes.add(triangle4);
			shapes.add(triangle5);
			shapes.add(circle1);
			shapes.add(circle2);
			
			
			Shape maxShape = shapes.get(0);
			for (int i = 0; i < shapes.size(); i++) {
				if(maxShape.getArea() < shapes.get(i).getArea()) {
					maxShape = shapes.get(i);
				}				
			}
			
			logger.info(String.valueOf("Maximal area of shapes is " + maxShape.getArea() + " and type is " + maxShape.getClass().getSimpleName()));
			
		}

	
	

}
