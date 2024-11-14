//1. Write a Java Program  to pass  this keyword as argument in the constructor call.

package bhuvan;
class Car {
    String model;
    int year;

    // Constructor with model and year
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Constructor that takes another Car object
    Car(Car anotherCar) {
        this.model = anotherCar.model;
        this.year = anotherCar.year;
    }

    // Method to display car details
    void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class ThisKeywordConstructorCar {
	public static void main(String[] args) {
        // Creating a Car object
        Car car1 = new Car("Toyota Corolla", 2020);

        // Passing the current object (car1) to create a new Car object
        Car car2 = new Car(car1);

        // Displaying the details of both cars
        System.out.println("Original Car:");
        car1.display();
        
        System.out.println("\nCopied Car:");
        car2.display();
    }
}

/*
Expected output :
Original Car:
Car Model: Toyota Corolla
Car Year: 2020

Copied Car:
Car Model: Toyota Corolla
Car Year: 2020

*/