

# Parking Lot Management System

## 🚗 Overview

The Parking Lot Management System is a Java-based application that manages a parking lot with 3 floors and various types of parking spots. Customers can enter, park their vehicles, and exit the parking lot while paying parking charges based on the vehicle type and duration of parking.

## 🌟 Features

- **Multi-floor Parking:** The parking lot has 3 floors with different capacities for handicapped, bicycle, car, EV car, and truck parking spots.
- **Payment Options:** Customers can pay parking charges in Indian Rupees (₹), US Dollars ($), or Euros (€) using different payment modes (Cash, Card, Scan).
- **Electric Vehicle Charging:** EV car parking spots have electric panels for vehicle charging, with an additional charge. 🔌
- **Real-time Availability:** Attendants can monitor real-time availability of parking spots for different vehicle types on a display board. 🚥
- **Exit Gate Assignment:** Attendants assign exit gates based on vehicle types for customer safety and convenience. 🚪

## 📚 Classes and Interfaces

- **Person Interface:** Contains customer details and vehicle information.
- **AccountDetails Class:** Stores customer payment information.
- **Attendant Class:** Records customer details and manages parking operations.
- **Floor Class:** Represents a parking floor with specific capacities for different vehicle types.
- **F0, F1, F2 Classes:** Subclasses of Floor representing ground floor, first floor, and second floor respectively.
- **PaymentMode Classes:** Includes cashMode, cardMode, and scanMode classes for different payment options.
- **ParkingLot Class:** Main class managing the entire parking lot operations.

## 🚀 Usage

1. **Entry Point:**
   - The attendant records customer details, assigns a unique ID, and assigns a parking floor based on spot availability.
   - Customers receive a unique ID for exit verification. 🔑

2. **Exit Point:**
   - Customers provide their unique ID for exit verification.
   - Attendants calculate parking charges based on entry and exit times, vehicle type, and duration.
   - Customers can pay using Cash, Card, or Scan methods.
   - Attendants assign exit gates for safe and convenient exits.

## 🛠️ Installation and Setup

1. **Clone the Repository:**
   ```
   git clone <repository-url>
   ```

2. **Compile and Run:**
   ```
   javac ParkingLot.java
   java ParkingLot
   ```

3. **Follow On-screen Instructions:** Enter customer details and follow prompts for parking and exiting.

## 🤝 Contributing

Contributions are welcome! Please fork the repository and create a pull request with your improvements. 🙌
