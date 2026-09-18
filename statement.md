# Airline Management System

## 1. Problem Statement
The current manual or semi-automated systems for airline management are often inefficient, leading to data redundancy, booking errors, and slow customer service. There is a lack of a unified platform that seamlessly integrates passenger data management, real-time flight scheduling, and ticket generation. This project aims to solve these issues by providing a centralized desktop application that automates key airline operations, ensuring data accuracy and operational efficiency.

## 2. Scope of the Project
The scope of the Airline Management System is to build a Java-based desktop application that simulates the core functionalities of an airline's counter operations. 
The system covers:
* **Database Management:** Secure storage of passenger and flight records.
* **Transaction Processing:** Handling ticket bookings and cancellations.
* **Information Retrieval:** Querying flight status and passenger journey details.
* **Document Creation:** Auto-generating official boarding passes.

This project focuses on the **administrative and front-desk** side of operations rather than the end-user (passenger) mobile app experience.

## 3. Target Users
* **System Administrators:** Responsible for maintaining the database of flights, adding new routes, and managing user access.
* **Airline Counter Staff:** The primary users who interact with customers to book tickets, check flight availability, cancel reservations, and print boarding passes.

## 4. High-Level Features
* **Authentication Module:** Secure login system to prevent unauthorized access to passenger data.
* **Flight Management:** Ability to view and search for flights based on source and destination.
* **Passenger Registration:** A form-based module to add customer details (Name, Passport/Aadhar, Contact info).
* **Ticket Booking Engine:** Real-time seat reservation linking passengers to specific flights.
* **Cancellation System:** Automated process to remove reservations and update records.
* **Boarding Pass Generator:** A feature to retrieve a specific PNR and generate a visual boarding pass for the passenger.