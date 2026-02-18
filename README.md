# 🚀 Credit Profile Service

A production-style Spring Boot microservice exposing RESTful APIs for managing customer credit profiles.

This project demonstrates backend engineering best practices including layered architecture, clean code organization, RESTful API design, and extensibility toward real-world financial systems.

---

## 📌 Overview

The Credit Profile Service provides APIs to retrieve customer credit score data.  

Although currently implemented with in-memory storage for simplicity, the project is structured following microservice architecture principles and can be easily extended into a production-ready system.

---

## 🌐 API Endpoints

| Method | Endpoint | Description |
|--------|----------|------------|
| GET | `/api/v1/customers` | Retrieve all customer credit profiles |
| GET | `/api/v1/customers/{id}` | Retrieve a specific customer’s credit profile by ID |

---

## 🏗 Architecture & Design

The service follows a clean layered architecture:

controller → service → repository → model


### Layers

- **Controller Layer** – Handles HTTP requests and response mapping
- **Service Layer** – Contains business logic and validation
- **Repository Layer** – Abstracted data access (currently in-memory implementation)
- **Model Layer** – Domain entities representing customer credit data

This structure ensures:

- Clear separation of concerns  
- Maintainability  
- Testability  
- Scalability readiness  

---

## 🛠 Tech Stack

- Java 17  
- Spring Boot 3  
- Gradle  
- RESTful API design  
- Clean Architecture principles  

---

## ▶ Running the Application

### Prerequisites

- Java 17+
- Gradle (optional — Gradle Wrapper included)

### Start Locally

Clone the repository and run the application using the Gradle wrapper:

```bash
./gradlew bootRun
```

The service will start on `http://localhost:8080`.

### Building a JAR

To build an executable JAR file, run:

```bash
./gradlew clean build
```

The resulting JAR will be located in `build/libs/credit-profile-service-0.0.1-SNAPSHOT.jar`.

### Making Requests

You can test the endpoints with `curl` or a tool like Postman:

```bash
curl http://localhost:8080/customers
curl http://localhost:8080/customers/1
```

## License

This project is licensed under the MIT License.
