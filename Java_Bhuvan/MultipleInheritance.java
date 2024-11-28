package bhuvan;

class Parent{
	String pName = "Lalit";
	void names(){
		System.out.print(pName);
	}
}

class Surname{
	String sName = "Bhoge";
	void names(){
		System.out.print(sName);
	}
}

public class MultipleInheritance {

	Parent parent =  new Parent();
	Surname surname = new Surname();
	
	String name = "Bhuvan";
	
	public static void main(String args[]) {
		MultipleInheritance m= new MultipleInheritance();
		System.out.print(m.name + " ");
		
		m.parent.names();
		System.out.print(" ");
		m.surname.names();
	}
}




