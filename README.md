# Product Management System

A **Spring Boot backend** project for managing products using **MongoDB**.  
This project demonstrates a full **CRUD API** with search functionality, timestamps, and a health check endpoint.

---

## 🛠 Technology Stack

- **Java 17**
- **Spring Boot 3.5.6**
- **Spring Data MongoDB**
- **MongoDB** (NoSQL)
- **Lombok**
- **RESTful APIs**
- **Maven**

---

## 🚀 Features

- Create, Read, Update, Delete products  
- Search products by name  
- Auto-managed timestamps (`createdAt`, `updatedAt`)  
- Health check endpoint (`/api/products/healthcheck`)  

---

## ⚙️ Configuration

`application.properties`:

```properties
spring.application.name=Product-Management-System
spring.data.mongodb.uri=mongodb://localhost:27017/productdb
spring.data.mongodb.database=productdb
server.port=8080
