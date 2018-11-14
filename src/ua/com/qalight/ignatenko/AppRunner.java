package ua.com.qalight.ignatenko;

import java.util.logging.Logger;

import ua.com.qalight.ignatenko.triangle.Triangle;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());


	public static void main(String[] args) {

		Triangle triangle = new Triangle(60, 45);
		
		logger.info(String.valueOf(triangle.getArea()));
		logger.info(String.valueOf(triangle.getArea()));
		logger.info(String.valueOf(triangle.getArea()));
	}
	

}
