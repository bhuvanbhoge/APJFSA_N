//2. Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.
//Formula:
//Perimeter of a square = 4 * s
//Perimeter of a rectangle = 2 * (l + b)
//Perimeter of a circle = 2 * (22/7) * r

package bhuvan;

class Perimeter {

    // Method to calculate the perimeter of a square
    public double calculatePerimeter(double side) {
        return 4 * side;
    }

    // Method to calculate the perimeter of a rectangle
    public double calculatePerimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    // Method to calculate the perimeter of a circle
    public double calculatePerimeter(int radius) {
        return 2 * (22.0 / 7) * radius;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Perimeter perimeter = new Perimeter();

        System.out.println("Perimeter of Square: " + perimeter.calculatePerimeter(5));    // side = 5
        System.out.println("Perimeter of Rectangle: " + perimeter.calculatePerimeter(6, 4)); // length = 6, breadth = 4
        System.out.println("Perimeter of Circle: " + perimeter.calculatePerimeter(7));    // radius = 7
    }
}

//Output:-
//Perimeter of Square: 31.428571428571427
//Perimeter of Rectangle: 20.0
//Perimeter of Circle: 44.0