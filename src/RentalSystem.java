// src/RentalSystem.java
import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Vehicle> vehicles;

    public RentalSystem() {
        this.vehicles = new ArrayList<>();
    }

    // Add Vehicle
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Rent Vehicle
    public void rentVehicle(String vehicleID, int days) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleID().equalsIgnoreCase(vehicleID) && v.isAvailable()) {
                v.setAvailable(false);
                double totalCost = v.getDailyRate() * days;
                System.out.println("\n✅ Success: Vehicle " + vehicleID + " rented for " + days + " days.");
                System.out.printf("Total cost: $%.2f\n", totalCost);
                return;
            }
        }
        System.out.println("\n❌ Error: Vehicle with ID " + vehicleID + " is not available or does not exist.");
    }

    // Return Vehicle
    public void returnVehicle(String vehicleID) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleID().equalsIgnoreCase(vehicleID) && !v.isAvailable()) {
                v.setAvailable(true);
                System.out.println("\n✅ Success: Vehicle " + vehicleID + " returned successfully.");
                return;
            }
        }
        System.out.println("\n❌ Error: Vehicle with ID " + vehicleID + " was not currently rented or does not exist.");
    }

    // Display Available Vehicles
    public void displayAvailableVehicles() {
        System.out.println("\n--- Available Vehicles ---");
        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                v.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles currently available for rent.");
        }
        System.out.println("--------------------------");
    }
}