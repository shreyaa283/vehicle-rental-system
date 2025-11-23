// src/Vehicle.java
public class Vehicle {
    private String vehicleID;
    private String make;
    private String model;
    private double dailyRate;
    private boolean isAvailable;

    // Constructor
    public Vehicle(String vehicleID, String make, String model, double dailyRate) {
        this.vehicleID = vehicleID;
        this.make = make;
        this.model = model;
        this.dailyRate = dailyRate;
        this.isAvailable = true; // Initially available
    }

    // Getters and Setters (essential for accessing private members)
    public String getVehicleID() { return vehicleID; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public double getDailyRate() { return dailyRate; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) { isAvailable = available; }

    // Method to display information
    public void displayDetails() {
        System.out.println("ID: " + vehicleID + ", Make: " + make + ", Model: " + model + ", Rate/Day: $" + dailyRate + ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}