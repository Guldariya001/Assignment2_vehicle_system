# Vehicle Management System

## Project Overview
This project demonstrates Object-Oriented Programming principles such as inheritance,
abstraction, composition, and method overriding using a Vehicle Management System.

## OOP Concepts Used
- Inheritance: Car, Motorcycle, and Truck extend the abstract Vehicle class
- Abstraction: Vehicle is an abstract class with abstract methods
- Composition & Aggregation: Vehicles have Driver objects, and one driver can drive multiple vehicles
- Method Overriding: Each subclass provides its own engine behavior

## Class Hierarchy
- Vehicle (abstract)
    - Car
    - Motorcycle
    - Truck

Protected fields are used to allow access in subclasses while maintaining encapsulation.

## How to Compile and Run
```bash
javac *.java
java Main


## Relection

Inheritance simplified the design by allowing common vehicle properties to be stored in one superclass.
Method overriding allowed each vehicle type to have its own engine behavior.

One challenge was correctly using protected access modifiers so that subclasses could access fields
without breaking encapsulation.