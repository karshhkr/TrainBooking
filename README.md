# Train Ticket Booking Backend 🚆

A backend REST API for a train ticket booking system, built with Java and Spring Boot.

> **Status:** 🚧 Work in progress — core entities and user auth logic are in place; APIs and DB integration are being built out.

## Tech Stack

- **Java 21**
- **Spring Boot 4.1**
- **Gradle**
- **Jackson** (JSON serialization/deserialization)
- Local JSON files as a temporary data store (MySQL/JPA planned)

## Current Features

- [x] User & Train entity models
- [x] Local JSON-based data storage (`users.json`, `trains.json`)
- [x] User signup logic
- [x] User login logic (credential validation)
- [ ] REST API endpoints
- [ ] MySQL + Spring Data JPA integration
- [ ] Seat booking logic
- [ ] Spring Security (password hashing, auth)

## Project Structure

```
src/main/java/TrainTicket/Booking/
├── entities/       # User, Train, Ticket
├── Service/        # UserBookingService, TrainService
├── localDb/        # users.json, trains.json (temporary local storage)
└── TrainBookingApplication.java
```

## Running Locally

```bash
git clone https://github.com/karshhkr/TrainBooking.git
cd TrainBooking
./gradlew build
./gradlew bootRun
```

## Roadmap

- Migrate from JSON files to MySQL with JPA
- Add REST controllers for signup/login/booking
- Implement seat locking and booking confirmation flow
- Add Spring Security with password hashing

---
*Built as a self-driven backend project to practice Spring Boot, REST API design, and Java fundamentals.*
