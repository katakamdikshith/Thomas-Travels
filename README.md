Thomas Travels – Driver Management System

Project Overview

Thomas Travels – Driver Management System is a Core Java console-based application designed to manage driver information and perform various operations based on driver details.

The application stores driver information such as driver ID, driver name, driver category, and total distance travelled. It provides functionality to search for drivers, count drivers by category, filter drivers by category, check whether a driver belongs to the car category, and identify the driver who has travelled the maximum distance.

Features

- Driver Information Management: Stores driver ID, name, category, and total distance travelled.
- Check Car Driver: Checks whether a driver belongs to the car category.
- Search Driver by ID: Retrieves driver information using the driver ID.
- Count Drivers by Category: Counts the number of drivers belonging to a specified category.
- Filter Drivers by Category: Retrieves all drivers belonging to a specified category.
- Maximum Distance Driver: Identifies the driver who has travelled the maximum distance.
- Case-Insensitive Search: Supports category comparisons without distinguishing uppercase and lowercase letters.

Technologies Used

- Java
- Core Java
- Object-Oriented Programming (OOP)
- Eclipse IDE
- Java Arrays
- 
Class Descriptions

1. Driver.java

The "Driver" class represents a driver and contains the following attributes:

- "driverId" – Unique identifier of the driver.
- "driverName" – Name of the driver.
- "driverCategory" – Category of the driver.
- "driverTotalDistance" – Total distance travelled by the driver.

It includes a default constructor, a parameterized constructor, getter and setter methods, and a "toString()" method.

2. Travel.java

The "Travel" class contains the business logic for processing driver information.

Methods include:

- "isCarDriver(Driver driver)" – Checks whether the driver category is Car.
- "RetrivebyDriverId(Driver[] drivers, int driverId)" – Searches for a driver by ID and returns the driver's details.
- "RetriveCountOfDriver(Driver[] drivers, String catagory)" – Counts drivers belonging to a specified category.
- "retriveDriver(Driver[] drivers, String catagory)" – Returns an array containing drivers from the specified category.
- "RetriveMaximumDistanceTravelledDriver(Driver[] driver)" – Returns the driver who has travelled the maximum distance.

3. TestDriver.java

The "TestDriver" class contains the "main()" method. It creates sample driver objects, stores them in an array, and tests the methods implemented in the "Travel" class.

Sample Driver Data

Driver ID| Driver Name| Category| Distance (KM)
101| Fayaz| CAR| 5000.0
102| hari| bike| 456.0
103| Krishna| Car| 5823.0
104| ranjith| auto| 5214.0
105| lokesh| lorry| 124.0

How to Run the Project

Using Eclipse IDE

1. Open Eclipse IDE.
2. Import the Thomas Travels Java project into your workspace.
3. Ensure that all Java files are inside the "com.thomasTravels" package.
4. Open "TestDriver.java".
5. Right-click the file.
6. Select Run As → Java Application.
7. View the output in the Eclipse Console.
