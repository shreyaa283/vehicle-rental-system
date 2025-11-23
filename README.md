**Vehicle Rental System (Java Console Application)**

This is a simple console-based application implemented in Java that simulates a basic Vehicle Rental System. It allows users to manage a fleet of vehicles, check availability, rent vehicles for a specified number of days, and return them.

**Project Structure and Classes**

The project is structured with four main classes:

Vehicle.java:

Represents a vehicle (car, bike, van, etc.) with properties like ID, make, model, daily rental rate, and availability status.

Customer.java:

Represents a customer with an ID and a name. This class is currently defined but not fully integrated into the rental workflow of App.java.

RentalSystem.java:

Manages the core logic of the system.

It maintains a list of Vehicle objects.

It contains methods for:

addVehicle(): Adds a new vehicle to the fleet.

rentVehicle(): Checks availability, updates the status, and calculates the total rental cost.

returnVehicle(): Updates the vehicle's status back to available.

displayAvailableVehicles(): Lists all vehicles currently available for rent.

App.java:

The main application driver that runs the console menu.

It initializes the RentalSystem with three default vehicles.

It manages the user interface and interaction flow using a menu.

**How to Use the Program**

To run and use this application, you must have the Java Development Kit (JDK) installed and configured on your system.

Steps to Compile and Run:

Save the Files: Ensure all four Java files (App.java, Vehicle.java, Customer.java, RentalSystem.java) are in the same directory.

Compile: Open your terminal or command prompt and navigate to the directory containing the files. Compile the source code:

javac *.java


Run: Execute the main class:

java App


Console Menu Guide:

Once running, the application presents the following interactive menu options:

Option 1: Display Available Vehicles

Lists the ID, Make, Model, and Daily Rate for all vehicles currently ready to rent. No input is required for this option.

Option 2: Rent a Vehicle

You will be prompted to enter the Vehicle ID (e.g., C001) and the rental duration in days.

Option 3: Return a Vehicle

You will be prompted to enter the Vehicle ID (e.g., C001). The vehicle's status will be set back to available.

Option 4: Exit

Shuts down the application.

Example Vehicle IDs (Initial Stock):

The system starts with the following vehicles initialized:

C001 (Toyota Camry, $50.00 per day)

B001 (Yamaha R3, $30.00 per day)

V001 (Ford Transit, $75.00 per day)
