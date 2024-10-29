// Write a program for 
package bhuvan;
import java.io.Serializable;

class Employee implements Serializable{
    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;

    // Getter and Setter for empId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter and Setter for empName
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter and Setter for empAge with basic validation
    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        if (empAge > 0) { // Validates that age is positive
            this.empAge = empAge;
        } else {
            System.out.println("Invalid age. Age must be positive.");
        }
    }

    // Getter and Setter for empSalary with basic validation
    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        if (empSalary >= 0) { // Validates that salary is non-negative
            this.empSalary = empSalary;
        } else {
            System.out.println("Invalid salary. Salary must be non-negative.");
        }
    }
}

public class JavaBeanEmployeeData {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setEmpId(666);
        obj.setEmpName("Selmon Boi");
        obj.setEmpAge(56);
        obj.setEmpSalary(500000.0);

        // Print the employee details
        System.out.println("Employee Id: " + obj.getEmpId());
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Age: " + obj.getEmpAge());
        System.out.println("Employee Salary: " + obj.getEmpSalary());
    }
}

/*Expected output : 
 
Employee Id: 666
Employee Name: Selmon Boi
Employee Age: 56
Employee Salary: 500000.0

*/
