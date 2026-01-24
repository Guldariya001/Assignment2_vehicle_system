# **Library Management API**

## **1. Project Overview**
This project is a Java-based application for managing a library database.
It demonstrates object-oriented programming (OOP) principles, a multi-layer architecture (MVC), and basic data management using an in-memory database simulation.

### **Entities**
- **Book:** Represents a book with title, author, and price.
- **EBook & PrintedBook:** Subclasses of Book demonstrating inheritance and specialization.
- **Author:** Represents the author of a book.
- **DatabaseConnection:** Simulates database storage for books.

## **2. OOP Design**
- **Abstraction:** `Book` defines common properties for all types of books.
- **Inheritance:** `EBook` and `PrintedBook` extend `Book`.
- **Polymorphism:** In `Main.java`, different types of books are stored in a `List<Book>`.
- **Encapsulation:** All fields are private with public getters and setters.
- **Interfaces:** `Validatable` and `PricedItem` define common behaviors.

## **3. Application Layers**
- **model:** Data classes and interfaces.
- **repository:** Storage and retrieval of books.
- **service:** Book logic.
- **controller:** Manages application flow.
- **exception:** Custom exceptions.
- **utils:** Helper classes.

## **4. Database Schema**
- Uses `DatabaseConnection` class to store book objects in memory.

**Example Schema:**
Book:
title VARCHAR NOT NULL

author VARCHAR NOT NULL

price DOUBLE NOT NULL

type VARCHAR NOT NULL (EBook / PrintedBook)

## **5. Running the Application**
- Open project in IntelliJ IDEA.
- Ensure all packages and `Main.java` are present.
- Run `Main.java`.
