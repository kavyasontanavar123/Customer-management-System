# Customer Management System - Spring Boot REST API

## Overview

The **Customer Management System** is a backend application built using **Spring Boot**. This project allows managing customer data via **REST APIs**. You can perform CRUD operations (Create, Read, Update, Delete) on customer records, such as customer names, addresses, and contact details. The application integrates with a **MySQL** database for storing customer information persistently.

## Key Features

- **Customer CRUD Operations**  
  Create, read, update, and delete customer data easily.

- **RESTful API**  
  Exposes the following endpoints for interacting with customer data:
  - **GET** `/api/customers`: Retrieve all customers.
  - **GET** `/api/customers/{id}`: Retrieve a customer by ID.
  - **POST** `/api/customers`: Add a new customer.
  - **PUT** `/api/customers/{id}`: Update an existing customer by ID.
  - **DELETE** `/api/customers/{id}`: Delete a customer by ID.

- **Spring Boot Framework**  
  Leverages **Spring Boot** for application setup, configuration, and deployment.

- **Database Integration with MySQL**  
  Uses **Spring JPA** to connect to a **MySQL** database for persistent storage.

- **Maven**  
  **Maven** is used for project management and dependency handling.

## Technologies Used

- **Spring Boot**: Framework for backend development.
- **Spring JPA**: For ORM-based database interaction with **MySQL**.
- **MySQL**: Database used for storing customer data.
- **Maven**: Build and dependency management tool.
