# Introduction to Java Programming

Java is a versatile, high-level, object-oriented programming language designed for platform independence. This document provides an overview of Java's core concepts, features, and usage, covering its history, key characteristics, and fundamental components.

## Core Concepts

### What is Java?

Java is a robust programming language that abstracts hardware details, enabling "Write Once, Run Anywhere" (WORA) through the Java Virtual Machine (JVM). It emphasizes object-oriented principles, making it suitable for a wide range of applications.

### Object-Oriented Programming (OOP)

Java's OOP paradigm revolves around:

* **Classes and Objects:** Blueprints and instances that encapsulate data and behavior.
* **Encapsulation:** Bundling data and methods within classes.
* **Inheritance:** Creating new classes from existing ones.
* **Polymorphism:** Methods performing different tasks based on the object.
* **Abstraction:** Hiding complex details.

## History and Evolution

### Origins

* Created by Sun Microsystems in the mid-1990s.
* Led by James Gosling.
* Originally named "Oak," later changed to "Java."

### Key Milestones

* 1991: The Green Project.
* 1995: Public introduction of Java 1.0.
* 1996: Release of JDK 1.0.
* Evolution through to Java 22 released March 19th 2024.
* 2009: Oracle Acquisition.

### Ownership and Governance

* Owned and maintained by Oracle Corporation.
* Evolution governed by the Java Community Process (JCP).

## Key Features

* **Simple:** Easy to learn and use.
* **Object-Oriented:** Organizes software around objects and classes.
* **Platform-Independent:** WORA principle via JVM.
* **Secure:** Built-in security features.
* **Robust:** Strong error checking and memory management.
* **Multithreaded:** Supports concurrent execution.
* **Architecture-Neutral:** Bytecode runs on any JVM.
* **Interpreted and Compiled:** Hybrid approach for performance.
* **High Performance:** Just-In-Time (JIT) compilation.
* **Distributed:** Designed for networked environments.
* **Dynamic:** Adapts to evolving environments.
* **Portable:** Consistent behavior across platforms.
* **Rich Standard Library:** Extensive APIs for various tasks.

## Java Components

### JDK, JRE, and JVM

* **JDK (Java Development Kit):** Tools for developing Java applications.
    * Java Compiler (javac)
    * Java Runtime Environment (JRE)
    * Java Debugger (jdb)
    * Java Archive (jar)
    * Other Tools.
* **JVM (Java Virtual Machine):** Executes Java bytecode.
    * Class Loader
    * Bytecode Verifier
    * Interpreter
    * Just-In-Time (JIT) Compiler
    * Garbage Collector
    * Runtime.
* **JRE (Java Runtime Environment):** Environment for running Java applications.
    * Java Virtual Machine (JVM)
    * Core Libraries
    * Supporting Files.

### Workflow

* Writing Code (.java files)
* Compiling Code (.class files)
* Class Loading
* Bytecode Verification
* Execution (JVM)
* Memory Management (Garbage Collector)

## Basic Java Program

### HelloWorld Example

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
Class Declaration: public class HelloWorld
Main Method: public static void main(String[] args)
Print Statement: System.out.println("Hello, World!");
Data Types
Primitive Data Types
byte: 8-bit integer.   
short: 16-bit integer.   
int: 32-bit integer.   
long: 64-bit integer.
float: 32-bit floating-point.   
double: 64-bit floating-point.   
char: 16-bit Unicode character.   
boolean: true or false.
Non-Primitive (Reference) Data Types
Classes: Blueprints for objects.   
Objects: Instances of classes.
Arrays: Collections of values.   
Interfaces: Abstract method definitions.   
Enumerations (Enums): Groups of constants.
Strings: Sequences of characters.
Access Modifiers
public: Accessible from anywhere.
protected: Accessible within the same package and subclasses.
default (Package-Private): Accessible within the same package.
private: Accessible within the same class.
Classes and Objects
Class: A blueprint for creating objects.
Object: An instance of a class.

```java
public class Car {
    String model;
    int year;
    String color;

    public void startEngine() {
        System.out.println("Engine is starting..");
    }

    public void stopEngine() {
        System.out.println("Engine is stopping..");
    }
}

public class CarObj {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Audi";
        myCar.year = 2023;
        myCar.color = "Black";
        myCar.startEngine();
        myCar.stopEngine();
        System.out.println(myCar.model);
        System.out.println(myCar.year);
        System.out.println(myCar.color);
    }
}
```
