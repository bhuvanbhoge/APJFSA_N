package bhuvan;

class S_Parent{
	String pName = "Lalit";
}


public class SingleInheritance extends S_Parent{
	String name = "Bhuvan";
	
	public static void main(String args[]) {
		SingleInheritance s= new SingleInheritance();
		System.out.print(s.name + " ");
		System.out.print(s.pName);
	}
}
