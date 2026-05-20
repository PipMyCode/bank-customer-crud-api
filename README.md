# Bank Customer CRUD API

A simple REST API for managing bank customer records.

This project was built with **Spring Boot**, **Spring Data JPA**, and **H2 in-memory database**. It supports basic CRUD operations for customer management.

## Features

- Create a new customer
- Get all customers
- Get a customer by ID
- Update customer details
- Delete a customer
- Store customer records using H2 in-memory database

## Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Project Structure

```text
src
└── main
    ├── java
    │   └── com
    │       └── bank
    │           └── customer
    │               ├── CustomerApplication.java
    │               ├── controller
    │               │   └── CustomerController.java
    │               ├── entity
    │               │   └── Customer.java
    │               ├── repository
    │               │   └── CustomerRepository.java
    │               └── service
    │                   └── CustomerService.java
    └── resources
        └── application.properties
```

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/customers` | Create a new customer |
| GET | `/api/customers` | Get all customers |
| GET | `/api/customers/{id}` | Get a customer by ID |
| PUT | `/api/customers/{id}` | Update a customer |
| DELETE | `/api/customers/{id}` | Delete a customer |

## Customer Fields

```json
{
  "id": 1,
  "firstName": "Marcus",
  "lastName": "Adigun",
  "email": "marcus@example.com",
  "phoneNumber": "08012345678"
}
```

## Example Create Customer Request

**POST** `/api/customers`

```json
{
  "firstName": "Marcus",
  "lastName": "Adigun",
  "email": "marcus@example.com",
  "phoneNumber": "08012345678"
}
```

## Example Update Customer Request

**PUT** `/api/customers/1`

```json
{
  "firstName": "Marcus",
  "lastName": "Updated",
  "email": "marcus.updated@example.com",
  "phoneNumber": "08111111111"
}
```

## H2 Database Console

H2 console is available at:

```text
http://localhost:8080/h2-console
```

Use this JDBC URL:

```text
jdbc:h2:mem:bankdb
```

Default username:

```text
sa
```

Leave the password empty.

## How to Run the Project

Clone the repository:

```bash
git clone <your-repository-url>
```

Go into the project folder:

```bash
cd customer
```

Run the application:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

## What I Practiced

This project helped me practice:

- Building REST APIs with Spring Boot
- Creating entities with JPA annotations
- Using Spring Data JPA repositories
- Structuring a project with controller, service, repository, and entity layers
- Testing API endpoints with Postman
- Using H2 as an in-memory database

## Author

Marcus Adigun
