//1.Write a Java program to Create Bankcustomer class with acno,atype,amt fields using constructor overloading.

package bhuvan;

class CustomerAccount {
    // Fields to store account number, account type, and amount
    private int acno;
    private String atype;
    private double amt;

    // Constructor with all parameters
    public CustomerAccount(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Constructor with account number and type only (default amount set to 0.0)
    public CustomerAccount(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0;
    }

    // Default constructor (sets default values for all fields)
    public CustomerAccount() {
        this.acno = 0;
        this.atype = "Unknown";
        this.amt = 0.0;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Account Balance: " + amt);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating CustomerAccount objects using different constructors
        CustomerAccount customer1 = new CustomerAccount(123456, "Savings", 5000.00);
        CustomerAccount customer2 = new CustomerAccount(789012, "Current", 600.00);
        CustomerAccount customer3 = new CustomerAccount(344556, "Savings", 30000.00);

        // Displaying customer details
        System.out.println("Customer 1 Details:");
        customer1.displayCustomerDetails();

        System.out.println("\nCustomer 2 Details:");
        customer2.displayCustomerDetails();

        System.out.println("\nCustomer 3 Details:");
        customer3.displayCustomerDetails();
    }
}

//Output:-
//Customer 1 Details:
//Account Number: 123456
//Account Type: Savings
//Account Balance: 5000.0
//
//Customer 2 Details:
//Account Number: 789012
//Account Type: Current
//Account Balance: 600.0
//
//Customer 3 Details:
//Account Number: 344556
//Account Type: Savings
//Account Balance: 30000.0

