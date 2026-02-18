# Credit Profile Service

This simple Spring Boot microservice demonstrates a basic credit profiling API. It exposes two endpoints:

* `GET /customers` – returns a list of customers with their credit scores.
* `GET /customers/{id}` – returns the credit details of a single customer by ID.

The project is intended as a starting point for demonstrating backend skills such as building REST APIs with Spring Boot, structuring a Java project, and organizing code using packages and classes. You can extend this service by connecting it to a database, adding CRUD operations, or introducing authentication.

## Getting Started

### Prerequisites

* Java 17 or newer
* Gradle (if you prefer not to use the Gradle wrapper included)

### Running the Application

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