package bhuvan;

public class AreaPerimeterOfSquare {

	public void AreaOfSquare(float side) {

		float ans = side*side;   // calculating using formula

		System.out.println("Area of Square : "+ans);

	}

	//  Calculating perimeter of square 
	public void Perimeter(float side) {

		float val = 4*side;     // calculating using formula

		System.out.println("Perimeter of Square : "+val);

	}


	public static void main(String[] args) {

		AreaPerimeterOfSquare obj = new AreaPerimeterOfSquare();    //instance of class

		obj.AreaOfSquare(6);      //  Passing value of side as a parameter  

		obj.Perimeter(8);         //  Passing value of side as a parameter 

	}

}

/*
Expexted Output: 
Area of Square : 36.0
Perimeter of Square : 32.0
 */
 
