# Assignment 4 — SOLID Library Management System

## Overview

This project is a refactored **Library Management System** built on top of Assignment 3 and redesigned to fully comply with **SOLID principles** and **advanced OOP features** in Java. The system follows a strict **layered architecture** and demonstrates generics, lambdas, reflection (RTTI), interfaces with default/static methods, and robust exception handling.

---

## Architecture

```
controller → service → repository → database
```

* **Controller**: Handles user interaction / CLI calls only. No business logic.
* **Service**: Applies business rules, validation, exceptions (SRP, DIP).
* **Repository**: Generic CRUD operations, data access only.
* **Model**: Domain entities with abstraction and polymorphism.
* **Utils**: Reflection and sorting utilities.

---

## SOLID Principles

### SRP — Single Responsibility Principle

* Each class has exactly one responsibility.
* Example:

    * `LibraryController` → request delegation
    * `LibraryServiceImpl` → business logic
    * `BookRepository` → data persistence

### OCP — Open/Closed Principle

* `LibraryItem` is an abstract base class.
* New item types (e.g., `Newspaper`) can be added **without modifying existing logic**.

### LSP — Liskov Substitution Principle

* `Book` and `Magazine` correctly extend `LibraryItem`.
* Both can be used via base type references without breaking behavior.

### ISP — Interface Segregation Principle

* Interfaces are small and focused:

    * `CrudRepository<T>` only defines CRUD behavior.

### DIP — Dependency Inversion Principle

* Service layer depends on **repository interfaces**, not implementations.
* Dependencies are injected via constructors.

---

## Abstract Class & Polymorphism

### `LibraryItem` (Abstract Base Class)

* Shared fields: `id`, `title`
* Abstract methods: `getType()`, `isAvailable()`
* Concrete method: `displayInfo()`

### Subclasses

* `Book`
* `Magazine`

Polymorphism is demonstrated by handling both through `LibraryItem` references.

---

## Composition / Aggregation

### Relationship

```
Book → Category
```

* A `Book` contains a `Category` object.
* This relationship is represented both in OOP and database design.

---

## Generics

### Generic Repository

```java
CrudRepository<T>
```

* Used for type-safe CRUD operations.
* Demonstrates reusable and flexible design.

---

## Lambdas

Used in:

* Sorting books by title

```java
books.sort((a, b) -> a.getTitle().compareTo(b.getTitle()));
```

Demonstrates functional programming with concise syntax.

---

## Reflection (RTTI)

### `ReflectionUtils`

At runtime, the utility:

* Prints class name
* Lists fields
* Lists methods

This demonstrates **runtime type inspection** using Java Reflection API.

---

## Exception Handling

Custom exception hierarchy:

* `InvalidInputException`
* `DuplicateResourceException`
* `ResourceNotFoundException`
* `DatabaseOperationException`

Exceptions are applied in the **service layer**, not in controller.

---

## Database Design

### Tables

* `categories`
* `books`

### Relationship

* `books.category_id` → `categories.id` (Foreign Key)

### Sample Schema

```sql
CREATE TABLE categories (
  id INT PRIMARY KEY,
  name VARCHAR(100)
);

CREATE TABLE books (
  id INT PRIMARY KEY,
  title VARCHAR(200),
  author VARCHAR(100),
  price DOUBLE,
  category_id INT,
  FOREIGN KEY (category_id) REFERENCES categories(id)
);
```

---

## Demonstrated Features

✔ SOLID architecture
✔ Abstract class & polymorphism
✔ Composition
✔ Generics
✔ Lambdas
✔ Reflection (RTTI)
✔ Layered architecture
✔ Custom exceptions

---

## How to Run

1. Open project in IntelliJ IDEA
2. Ensure Java 17+ is installed
3. Run `Main.java`

---

## Screenshots (to include)

* Successful CRUD operations
* Sorted book list
* Reflection output
* Exception handling examples

---

## Reflection (Student Section)

Through this assignment, I learned how to apply SOLID principles in a real Java project, structure applications using layered architecture, and use advanced language features such as generics, lambdas, and reflection. This improved code readability, scalability, and maintainability.

---

## Author

**Guldariya Urazalieva**

price DOUBLE NOT NULL

type VARCHAR NOT NULL (EBook / PrintedBook)

## **5. Running the Application**
- Open project in IntelliJ IDEA.
- Ensure all packages and `Main.java` are present.
- Run `Main.java`.
