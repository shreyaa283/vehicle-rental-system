// src/Customer.java
public class Customer {
    private String customerID;
    private String name;

    // Constructor
    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }

    // Getters
    public String getCustomerID() { return customerID; }
    public String getName() { return name; }

    public void displayDetails() {
        System.out.println("Customer ID: " + customerID + ", Name: " + name);
    }
}