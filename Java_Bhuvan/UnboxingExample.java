//2. Write a java program for  Unboxing.


public class UnboxingExample {
	public static void main(String args[]) {
		//unboxing
	    Integer obj=new Integer(8);
	    int a=obj;
	    System.out.println("implicitly conversion: " + a);//implicitly conversion
	    int b=obj.intValue();// explicitly conversion
	    System.out.println("explicitly conversion: " + b);
	}
}

/*

Expected output: 
implicitly conversion: 8
explicitly conversion: 8

*/
