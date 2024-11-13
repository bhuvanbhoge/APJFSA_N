package bhuvan;


	// Define the Shape interface
	interface Shape {
	    double getArea();  // Abstract method to calculate area
	}

	// Rectangle class implementing the Shape interface
	class Rectangle implements Shape {
	    private double length;
	    private double width;

	    // Constructor
	    Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    // Implement getArea method for Rectangle
	    public double getArea() {
	        return length * width;
	    }
	}

	// Circle class implementing the Shape interface
	class Circle implements Shape {
	    private double radius;

	    // Constructor
	    Circle(double radius) {
	        this.radius = radius;
	    }

	    // Implement getArea method for Circle
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	}

	// Triangle class implementing the Shape interface
	class Triangle implements Shape {
	    private double base;
	    private double height;

	    // Constructor
	    Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    // Implement getArea method for Triangle
	    public double getArea() {
	        return 0.5 * base * height;
	    }
	}
	public class AreaRecCirTri {
	    public static void main(String[] args) {
	        // Create objects of Rectangle, Circle, and Triangle
	        Shape rectangle = new Rectangle(10, 5);
	        Shape circle = new Circle(7);
	        Shape triangle = new Triangle(6, 8);

	        // Call getArea method for each shape and print the results
	        System.out.println("Rectangle Area: " + rectangle.getArea());
	        System.out.println("Circle Area: " + circle.getArea());
	        System.out.println("Triangle Area: " + triangle.getArea());
	    }

}

	
	
/*
	Expencted output:
		
		Rectangle Area: 50.0
		Circle Area: 153.93804002589985
		Triangle Area: 24.0

*/