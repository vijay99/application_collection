# Spring Boot REST API with OpenAPI (Swagger) Documentation

## Overview
This project is a simple Spring Boot REST API for managing books, integrated with OpenAPI (Swagger) for interactive API documentation.

## Features
- Exposes REST endpoints for book management
- Generates OpenAPI documentation automatically
- Provides an interactive Swagger UI for API testing

## Tech Stack
- Java 17
- Spring Boot 3
- Spring Web
- OpenAPI (springdoc-openapi)

## Prerequisites
- Java 17 or later
- Maven

## Setup Instructions

### 1. Clone the Repository
```sh
git clone https://github.com/your-username/springboot-openapi-demo.git
cd springboot-openapi-demo
```

### 2. Build the Project
```sh
mvn clean install
```

### 3. Run the Application
```sh
mvn spring-boot:run
```

## API Endpoints
| Method | Endpoint       | Description |
|--------|--------------|-------------|
| GET    | `/books`      | Get all books |
| GET    | `/books/{id}` | Get book by ID |
| POST   | `/books`      | Add a new book |

## Access OpenAPI Documentation
Once the application is running, you can access the API documentation at:

- **Swagger UI:** [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- **OpenAPI JSON:** [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

## Example API Requests

### Fetch All Books
```sh
curl -X GET "http://localhost:8080/books" -H "Accept: application/json"
```

### Fetch a Book by ID
```sh
curl -X GET "http://localhost:8080/books/1" -H "Accept: application/json"
```

### Add a New Book
```sh
curl -X POST "http://localhost:8080/books" -d "name=New Book" -H "Content-Type: application/x-www-form-urlencoded"
```

## License
This project is open-source and available under the MIT License.


