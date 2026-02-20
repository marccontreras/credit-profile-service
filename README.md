# Credit Profile Service (Spring Boot + PostgreSQL)

A small **Spring Boot** backend service that exposes REST endpoints to manage customer credit data.
Built as a portfolio-quality microservice with:

- **PostgreSQL** persistence
- **Flyway** database migrations
- **Swagger/OpenAPI** documentation
- **Spring Actuator** health checks and metrics
- DTO + validation + consistent error responses

---

## ✅ What This Project Demonstrates

- REST API design (CRUD-style endpoints)
- Clean layering: Controller → Service → Repository
- Data validation and structured error handling
- Production-friendly infrastructure (Docker Compose + migrations)
- Observability basics (health/info/metrics)

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- PostgreSQL
- Flyway
- Springdoc OpenAPI (Swagger UI)
- Spring Actuator
- Gradle

---

## 📦 Project Structure

```
credit-profile-service/
├── Dockerfile
├── docker-compose.yml
├── build.gradle
├── settings.gradle
├── src/main/java/com/example/creditprofile
│   ├── CreditProfileServiceApplication.java
│   ├── controller
│   │   └── CustomerController.java
│   ├── dto
│   │   ├── CreateCustomerRequest.java
│   │   └── CustomerResponse.java
│   ├── entity
│   │   └── CustomerEntity.java
│   ├── exception
│   │   ├── GlobalExceptionHandler.java
│   │   └── NotFoundException.java
│   ├── repository
│   │   └── CustomerRepository.java
│   └── service
│       └── CustomerService.java
└── src/main/resources
    ├── application.yml
    └── db/migration
        └── V1__init.sql
``` id="v4l1"

---

## ▶ Run with Docker (Recommended)

This starts **PostgreSQL + API** and runs Flyway migrations automatically.

```bash
docker-compose up --build
```

Service endpoints:

- API: `http://localhost:8080`
- Swagger UI: `http://localhost:8080/swagger-ui`
- OpenAPI JSON: `http://localhost:8080/api-docs`
- Health: `http://localhost:8080/actuator/health`

---

## ▶ Run Locally (Without Docker)

1) Start PostgreSQL locally and create a database:

- DB: `creditdb`
- User: `credit`
- Password: `credit`

2) Run the service:

```bash
./gradlew bootRun
```

---

## 🔍 API Endpoints

### List customers (paged)

```bash
curl "http://localhost:8080/customers?page=0&size=20"
```

### Get customer by ID

```bash
curl "http://localhost:8080/customers/1"
```

### Create customer

```bash
curl -X POST "http://localhost:8080/customers" \
  -H "Content-Type: application/json" \
  -d '{ "fullName": "Dani Costa", "creditScore": 710 }'
```

---

## 🧪 Tests

```bash
./gradlew test
```

---

## 🔥 Next Improvements (Nice portfolio upgrades)

- Add filtering/search (e.g., minScore/maxScore)
- Add a proper domain model for risk band / utilization
- Add Redis caching for frequently requested customers
- Add a Kafka event on customer creation/updates
- Add Testcontainers-based integration tests for endpoints

---

## 📄 License

MIT
