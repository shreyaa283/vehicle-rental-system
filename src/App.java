// src/App.java
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        Scanner scanner = new Scanner(System.in);

        // 1. Initialize data (Add vehicles to the system)
        rentalSystem.addVehicle(new Vehicle("C001", "Toyota", "Camry", 50.00));
        rentalSystem.addVehicle(new Vehicle("B001", "Yamaha", "R3", 30.00));
        rentalSystem.addVehicle(new Vehicle("V001", "Ford", "Transit", 75.00));

        int choice;
        do {
            System.out.println("\n===== Vehicle Rental System =====");
            System.out.println("1. Display Available Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Return a Vehicle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Input handling
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
                choice = 0;
            }

            switch (choice) {
                case 1:
                    rentalSystem.displayAvailableVehicles();
                    break;

                case 2:
                    System.out.print("Enter Vehicle ID to rent: ");
                    String rentID = scanner.nextLine();
                    System.out.print("Enter rental duration (days): ");
                    int rentDays = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    rentalSystem.rentVehicle(rentID, rentDays);
                    break;

                case 3:
                    System.out.print("Enter Vehicle ID to return: ");
                    String returnID = scanner.nextLine();
                    rentalSystem.returnVehicle(returnID);
                    break;

                case 4:
                    System.out.println("Thank you for using the Vehicle Rental System. Goodbye!");
                    break;

                default:
                    if (choice != 0) {
                        System.out.println("Invalid option. Please try again.");
                    }
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}