🚆 Train Booking System – Java Backend Project

A console-based Train Booking System built using Core Java, demonstrating real-world backend concepts such as authentication, seat booking logic, file-based persistence, and service-layer architecture.

This project is ideal for Java backend beginners who want hands-on experience building a complete backend workflow before moving to frameworks like Spring Boot.

🔍 Project Highlights

🔐 Secure user authentication using hashed passwords

🧱 Clean separation of concerns (Entities, Services, Utilities)

💺 Real-time seat availability & booking logic

📁 JSON-based persistence (acts as a local database)

⚙️ Uses Java Streams, Optional, UUIDs

🧠 Designed to mirror real backend systems (MVC-like flow)

🧰 Tech Stack
Category	Technology
Language	Java (Core Java)
Data Storage	JSON files
JSON Handling	Jackson ObjectMapper
Security	Password hashing
Utilities	Java Streams, Optional, UUID
Input	Scanner
📁 Project Structure
ticket.booking
│
├── App.java                     # Application entry point
│
├── entities
│   ├── User.java                # User model
│   ├── Trains.java              # Train model
│   └── Ticket.java              # Ticket model
│
├── service
│   ├── UserBookingService.java  # User & booking logic
│   └── TrainService.java        # Train search & seat management
│
├── util
│   └── UserServiceUtil.java     # Password hashing & verification
│
└── localDb
    ├── users.json               # Stores user data
    └── trains.json              # Stores train & seat data

⚙️ Functional Overview
1️⃣ User Signup

Accepts username and password

Password is hashed before storage

User data persisted in users.json

2️⃣ User Login

Validates credentials using hashed password comparison

Prevents plain-text password exposure

3️⃣ Search Trains

Search trains using source & destination

Displays station-wise timings

4️⃣ Seat Booking

Displays seat matrix (0 = available, 1 = booked)

Prevents double booking

Updates train seat data persistently

5️⃣ Fetch Bookings

Retrieves all tickets booked by the logged-in user

6️⃣ Cancel Booking

Cancels ticket using Ticket ID

Updates user booking records

🧠 Design Decisions (Why This Approach?)
🔹 Why JSON Instead of Database?

Beginner-friendly

No setup required

Helps understand persistence before moving to SQL/NoSQL

🔹 Why Service Layer?

Separates business logic from UI

Mirrors Spring Boot architecture

Makes the code maintainable and scalable

🔹 Why Password Hashing?

Mimics real-world authentication systems

Prevents security vulnerabilities

Teaches backend security fundamentals

🔄 Application Flow
App.java (Controller)
   ↓
UserBookingService / TrainService (Business Logic)
   ↓
Entities (User, Train, Ticket)
   ↓
JSON Files (Persistence Layer)

▶️ How to Run

Clone the repository

Ensure Java is installed

Run App.java

Follow the console menu prompts

📌 Sample Menu
1. Sign up
2. Login
3. Fetch Bookings
4. Search Trains
5. Book a seat
6. Cancel my Booking
7. Exit the App

📈 Learning Outcomes

By completing this project, you gain experience in:

Java backend architecture

Authentication & password security

File-based persistence

Streams & functional programming

Real-world booking logic

Writing clean, modular Java code

🚀 Future Enhancements

Convert to Spring Boot REST API

Replace JSON with MySQL/PostgreSQL

Add JWT-based authentication

Implement ticket pricing

Add admin role (add/update trains)

Write unit tests (JUnit)

👨‍💻 Author

Built as a Java Backend Learning Project
Focused on strong fundamentals, clean design, and real-world logic.
