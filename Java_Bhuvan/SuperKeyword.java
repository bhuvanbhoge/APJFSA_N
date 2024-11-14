//2. Write a Java program  to invoke parent class constructor using super keyword.

package bhuvan;

//Parent class - Aeroplane
class Aeroplane {
 String type;
 int capacity;

 // Constructor of Aeroplane
 Aeroplane(String type, int capacity) {
     this.type = type;
     this.capacity = capacity;
     System.out.println("Aeroplane constructor called.");
 }

 // Method to display aeroplane details
 void displayTypeAndCapacity() {
     System.out.println("Aeroplane Type: " + type);
     System.out.println("Capacity: " + capacity + " passengers");
 }
}

//Child class - PassengerPlane
class PassengerPlane extends Aeroplane {
 String airline;

 // Constructor of PassengerPlane that uses super to invoke Aeroplane constructor
 PassengerPlane(String type, int capacity, String airline) {
     super(type, capacity); // Calls the constructor of the parent class Aeroplane
     this.airline = airline;
     System.out.println("PassengerPlane constructor called.");
 }

 // Method to display passenger plane details
 void displayDetails() {
     displayTypeAndCapacity();
     System.out.println("Airline: " + airline);
 }
}



public class SuperKeyword {
	 public static void main(String[] args) {
	     // Create a PassengerPlane object
	     PassengerPlane plane = new PassengerPlane("Commercial", 180, "Air India");

	     // Display the details of the passenger plane
	     plane.displayDetails();
	 }

}

/*
expected output :
Aeroplane constructor called.
PassengerPlane constructor called.
Aeroplane Type: Commercial
Capacity: 180 passengers
Airline: Air India

*/