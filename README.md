# Spring Boot Project for User Profiles and Patient Records Management

This project provides a RESTful API for managing user profiles and patient records. It is built using Spring Boot and provides the following features:

## Features

1. **User Profile Management**:
	* View and edit user profiles after registration
2. **Patient Records Management**:
	* Create new patient records, including patient name, age, and medical history
	* View and update patient records
	* Delete patient records when necessary

## RESTful APIs

### User Profile APIs

* `GET /api/profiles/{id}`: View a user's profile
* `PUT /api/profiles/{id}`: Update a user's profile

### Patient Records APIs

* `POST /api/patients`: Create a new patient record
* `GET /api/patients`: View all patient records
* `GET /api/patients/{id}`: View a specific patient record
* `PUT /api/patients/{id}`: Update a patient record
* `DELETE /api/patients/{id}`: Delete a patient record

### Prerequisites

* Java 8
* Maven 3.1.x
* PostgreSQL instance

### Postgres Instance Configuration

Update the `src/main/resources/application.properties` file with your PostgreSQL instance configuration:
```properties
spring. datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

### API Endpoints
	
##	Create a Patient Record

POST :- /api/patients

JSON
{
  "name": "Jane Doe",
  "age": 30,
  "medicalHistory": "Diabetes"
}

# Update a Patient Record
PUT:- /api/patients/{id}

{
  "name": "Jane Doe",
  "age": 31,
  "medicalHistory": "Diabetes, High Blood Pressure"
}

## View Patient Records
GET /api/patients

## Delete a Patient Record
DELETE /api/patients/{id}


### Configuration

The project uses an `application.properties` file to configure the database connection and other settings.

### Steps to Run
Clone the repository

Update the application.properties file with your PostgreSQL instance configuration

create a maven build using maven build tool.
OR
Run the application using mvn spring-boot:run

Use a tool like Postman or cURL to test the API endpoints
