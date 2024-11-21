/**
 * The Address class represents a physical address with attributes like street, city, state, and zip code.
 * This class provides a constructor to initialize these attributes and getter and setter methods for accessing and modifying them.
 */
package bhuvan;

class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    /**
     * Constructor to initialize the Address object with street, city, state, and zipcode.
     */
    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    // Getter and setter methods for each field (no changes needed, just adding comments)

    /**
     * Gets the street of the address.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street of the address.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the city of the address.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the address.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the state of the address.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state of the address.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the zipcode of the address.
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the zipcode of the address.
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}

/**
 * The AddressJavaBean class demonstrates the creation of an Address object and displays its details.
 */
public class AddressJavaBean {
    public static void main(String[] args) {
        // Create an Address object with street, city, state, and zipcode
        Address ajb = new Address("7 Street Heaven", "Pune", "Maharashtra", "411001");

        // Print individual attributes of the Address object
        System.out.println("Street: " + ajb.getStreet());
        System.out.println("City: " + ajb.getCity());
        System.out.println("State: " + ajb.getState());
        System.out.println("Zipcode: " + ajb.getZipcode());
    }
}

/*
Expected Output:
Street: 7 Street Heaven
City: Pune
State: Maharashtra
Zipcode: 411001
*/
