//2. Create a program in java to implement multilevel inheritance and hierarchical inheritance .
//Take classes like : Doctor , Surgeon and Nurse
//Create methods and show method overriding.

package bhuvan;

// Base class - Doctor
class Doctor {
    String name = "Munna Bhai";
    String degree = "MBBS";
    int id = 2;
    
    void info() {
        System.out.println("Doctor name : " + name + "\n" + "Doctor degree : " + degree + "\n" + "Doctor id : " + id);
    }
}

// Derived class - Surgeon (extends Doctor)
class Surgeon extends Doctor {
    String name = "Circuit";
    String degree = "MD";
    int id = 666;

    void info() {
        System.out.println("Surgeon name : " + name + "\n" + "Surgeon degree : " + degree + "\n" + "Surgeon id : " + id);
    }
}

// Derived class - Nurse (extends Doctor)
class Nurse extends Doctor {
    String name = "Chinky";
    String degree = "DM";
    int id = 777;

    
    void info() {
        System.out.println("Nurse name : " + name + "\n" + "Nurse degree : " + degree + "\n" + "Nurse id : " + id);
    }
}

public class Hospital_Inheritance {
    public static void main(String[] args) {
        // Creating objects of Doctor, Surgeon, and Nurse
        Doctor d = new Doctor();
        Surgeon s = new Surgeon();
        Nurse n = new Nurse();

        // Calling info method for each object
        d.info();
        s.info();
        n.info();
    }
}

//Expected output
//Doctor name : Munna Bhai
//Doctor degree : MBBS
//Doctor id : 2
//Surgeon name : Circuit
//Surgeon degree : MD
//Surgeon id : 666
//Nurse name : Chinky
//Nurse degree : DM
//Nurse id : 777

