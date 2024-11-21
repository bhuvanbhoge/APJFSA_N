//1.Write a java program to create Bankcustomer class with acno,atype,amt fields using parameterized constructor.
package bhuvan;

// BankCustomer class to represent a customer's bank details
class BankCustomer {
    private int acno;         // Account number
    private String atype;      // Account type
    private double amt;        // Account balance amount

    // Parameterized constructor to initialize the account details
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Getter methods to retrieve the values of fields
    public int getAcno() {
        return acno;
    }

    public String getAtype() {
        return atype;
    }

    public double getAmt() {
        return amt;
    }

    // Main method to demonstrate creating a BankCustomer object
    public static void main(String[] args) {
        // Creating an instance of BankCustomer with sample values
        BankCustomer customer = new BankCustomer(12345, "Savings", 10000.50);
        
        // Displaying the customer's details using getter methods
        System.out.println("Account Number: " + customer.getAcno());
        System.out.println("Account Type: " + customer.getAtype());
        System.out.println("Amount: " + customer.getAmt());
    }
}

/*
Expected Output:
Account Number: 12345
Account Type: Savings
Amount: 10000.5
*/
