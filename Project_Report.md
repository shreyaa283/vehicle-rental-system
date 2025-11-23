Project Report: Console-Based Vehicle Rental System

Course: CSE2006
Student Name:Shreya Mandaogade 
Registration Number: 24BCE10614
Submission Date:  24 November 2025

1. Problem Definition

The objective of this project is to address the need for a simple, efficient, and reliable system to manage a fleet of rental vehicles.

Problem Statement: In a small-scale vehicle rental operation, tracking vehicle availability, calculating rental charges, and managing the check-in/check-out process can be manual and error-prone. A digital system is required to automate these core functions to ensure accurate inventory management and quick service delivery.

Domain Chosen: Transportation & Logistics.

2. Requirement Analysis

The system must satisfy the following functional and non-functional requirements:

Functional Requirements

Vehicle Management: The system must be able to store, initialize, and manage a list of vehicles (Car, Bike, Van, etc.).

Availability Tracking: Each vehicle must have a status (available or rented).

Rental Process: The system must allow a user to rent an available vehicle by providing its ID and the rental duration (in days).

Cost Calculation: The system must calculate the total rental cost based on the vehicle's daily rate and the duration.

Return Process: The system must allow a user to return a rented vehicle, updating its status back to available.

Display: The system must display a current list of vehicles available for rent.

Non-Functional Requirements

Usability: The system must be easy to navigate via a clear console menu.

Reliability: The system must handle input errors gracefully (e.g., entering letters when a number is expected).

Performance: All transactions (rent, return) must be completed instantly.

3. Top-Down Design / Modularization

The project follows the principles of Object-Oriented Programming (OOP) and is modularized into four distinct components (classes), following a clear separation of concerns.

Class

Responsibility

Key Attributes

Vehicle

Represents the data structure for a single vehicle.

vehicleID, make, model, dailyRate, isAvailable

Customer

Represents the customer data (reserved for future integration).

customerID, name

RentalSystem

Manages the collection of vehicles and contains all business logic (renting, returning, displaying).

List<Vehicle> vehicles

App

The main execution entry point (the console interface).

Manages the main menu and user interaction.

4. Algorithm Development

The core business logic resides in the RentalSystem class.

Algorithm for Renting a Vehicle (rentVehicle(ID, days))

Input: vehicleID (String), days (Integer).

Search: Iterate through the vehicles list.

Condition Check: For each vehicle, check if:

The vehicle's ID matches the vehicleID (case-insensitive).

The vehicle's isAvailable status is true.

Success: If conditions are met:

Set isAvailable to false.

Calculate totalCost = dailyRate * days.

Print success message with the calculated cost.

Terminate the function (return).

Failure: If the loop completes without finding a matching, available vehicle, print an error message.

Algorithm for Returning a Vehicle (returnVehicle(ID))

Input: vehicleID (String).

Search: Iterate through the vehicles list.

Condition Check: For each vehicle, check if:

The vehicle's ID matches the vehicleID (case-insensitive).

The vehicle's isAvailable status is false (i.e., it is currently rented).

Success: If conditions are met:

Set isAvailable to true.

Print a success message.

Terminate the function (return).

Failure: If the loop completes, print an error message (vehicle was not rented or does not exist).

5. Implementation Details

The project is implemented in Java, utilizing fundamental language features and standard libraries.

Data Structures: java.util.ArrayList is used within RentalSystem to maintain a dynamic and easily iterable list of Vehicle objects.

Input/Output: java.util.Scanner is used in App.java to handle user input from the console.

OOP Concepts Applied:

Encapsulation: All class attributes (vehicleID, dailyRate, etc.) are declared private, and access is controlled via public getter and setter methods.

Abstraction: The user interacts only with the menu options in App.java, abstracting away the complex list iteration and calculation logic contained in RentalSystem.java.

Code Highlights (App.java):

The App.java features a do-while loop for the main menu, ensuring the system runs until the user explicitly chooses the Exit option (4). Input validation (scanner.hasNextInt()) is included to prevent crashes from non-numeric input.

6. Testing and Refinement

The system was tested using the following scenarios:

Test Case

Steps

Expected Outcome

Actual Outcome

TC-01: Successful Rental

Rent C001 for 5 days.

Vehicle C001 status changes to unavailable. Total cost of $250.00 is displayed.

Success.

TC-02: Double Rental Attempt

Attempt to rent C001 again immediately after TC-01.

Error message: "Vehicle with ID C001 is not available."

Success.

TC-03: Successful Return

Return C001.

Vehicle C001 status changes back to available. Success message displayed.

Success.

TC-04: Invalid ID Input

Attempt to rent vehicle ID X999.

Error message: "Vehicle with ID X999 is not available or does not exist."

Success.

TC-05: Non-numeric Input

Enter "A" when prompted for menu choice.

System displays "Invalid input. Please enter a number." and re-displays the menu.

Success.

Refinement Notes

The initial implementation satisfies all core functional requirements. The current refinement note is that the Customer.java class exists but is not currently linked to the rental process; future work would involve integrating customer creation and rental assignment to fully track rentals.
