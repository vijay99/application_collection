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

# Added JWT implementation ,use below information for testing with jwt token

Test a Secured API with JWT Authentication
Login and Get Token

```sh
curl -X POST http://localhost:8080/auth/login -H "Content-Type: application/json" -d "{\"username\":\"admin\", \"password\":\"password\"}"
```
🔹 This will return a JWT token in the response.

Use Token to Access a Secure API

```sh
curl -X GET http://localhost:8080/protected-endpoint -H "Authorization: Bearer YOUR_JWT_TOKEN"

```
Replace YOUR_JWT_TOKEN with the actual token from the login response.

📌 Useful curl Commands
Command	Description
```sh
curl http://localhost:8080/api	Simple GET request
curl -X POST <URL> -d "<data>"	Send POST request
curl -X PUT <URL> -d "<data>"	Send PUT request
curl -X DELETE <URL>	Send DELETE request
curl -H "Authorization: Bearer <token>" <URL>	Send request with JWT token
```



