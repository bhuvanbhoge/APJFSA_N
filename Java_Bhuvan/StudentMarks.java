package bhuvan;
import java.util.*;
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks>90) {
			System.out.println("O");
		}else if(marks>75) {
			System.out.print("A");
		}else if(marks>60) {
			System.out.print("B");
		}else if(marks>35) {
			System.out.print("C");
		}else {
			System.out.println("Fail");
		}

	}

}
