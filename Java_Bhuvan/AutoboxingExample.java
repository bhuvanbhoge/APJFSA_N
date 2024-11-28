//1. Write  a java program for Autoboxing.
package bhuvan;

public class AutoboxingExample {
	public static void main(String[] args) {
        // Primitive data types
		int id=10;
		Integer i=id;//autoboxing
		Integer e=Integer.valueOf(id);// explicitly conversion
	    System.out.println("id : "+id+"\n"+"i  : "+ i+"\n"+"e  : " +e);	
	    
       }
}

/*
Expected output:
id : 10
i  : 10
e  : 10
*/