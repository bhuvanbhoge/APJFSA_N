//1.Create an interface called "Person" with a method called "speak". Create two classes  called "Student" and "Teacher" that implement  the Person interface and implement the "speak" method. Create objects of both the Student and  Teacher classes and call their respective "speak"  methods.

package bhuvan;

//Define the Person interface
interface Person {
    void speak();
}

public class InterfaceStudTeacher {

    

    // Student class implementing the Person interface
    static class Stud implements Person {
        public void speak() {
            System.out.println("Student is speaking.");
        }
    }

    // Teacher class implementing the Person interface
    static class Teacher implements Person {
        public void speak() {
            System.out.println("Teacher is speaking.");
        }
    }

    public static void main(String[] args) {
        // Creating objects of Student and Teacher
        Person student = new Stud();
        Person teacher = new Teacher();
        
        // Calling the speak method
        student.speak();
        teacher.speak();
    }
}

/*
Expected output:

Student is speaking.
Teacher is speaking.

*/
