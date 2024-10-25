package bhuvan;

public class NarrowingTypeCasting {
	double doubleVar = 12;
	long longVar = 7;

	public void TypeCasting() {

		// Printing values before type casting

		System.out.println("Before Type casting Double : "+doubleVar);
		System.out.println("Before Type casting Long : "+longVar);


		int x = (int)doubleVar;    // Type casting datatype Double into Integer
		int y = (int)longVar;      // Type casting datatype Long into Integer


		// Printing values after type casting

		System.out.println("After Type casting Double : "+x);
		System.out.println("After Type casting Long : "+y);

	}


	public static void main(String[] args) {

		NarrowingTypeCasting obj = new NarrowingTypeCasting();

		obj.TypeCasting();

	}

}

/*
Expected output
Before Type casting Double : 12.0
Before Type casting Long : 7
After Type casting Double : 12
After Type casting Long : 7
*/
