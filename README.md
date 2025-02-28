# Programming Best Practices

## Introduction
This repository contains practice programs following the best programming practices. The key principles include:
- **Using variables for all values** (Fixed, User Inputs, and Results)
- **Avoiding hard-coded values** wherever possible
- **Proper naming conventions** for variables and classes
- **Following proper indentation** for readability

---

## Key Programming Concepts

### 1. Variables
Variables store data values in a program. Examples:
```java
String name = "Sam";
int rollNumber = 1;
double percentage = 99.99;
char result = 'P';
```

### 2. Data Types
Common data types in Java:
- `int`: Integer values
- `double`: Decimal values
- `char`: Single character
- `String`: Text values
- `boolean`: True or False

### 3. Operators
Operators perform operations on variables:
- **Arithmetic Operators**: `+`, `-`, `*`, `/`, `%`
- **Comparison Operators**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical Operators**: `&&`, `||`, `!`

### 4. Conditional Statements
Used to make decisions in programs.
```java
if (percentage >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### 5. Loops
Used for repetition.
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```

### 6. Methods
Functions that perform specific tasks.
```java
public static double calculateAverage(double a, double b, double c) {
    return (a + b + c) / 3;
}
```

---

## Practice Programs

### 1. Compute Age
```java
int birthYear = 2000;
int currentYear = 2024;
int age = currentYear - birthYear;
System.out.println("Harry's age in 2024 is " + age);
```

### 2. Average Marks in PCM
```java
double maths = 94, physics = 95, chemistry = 96;
double average = (maths + physics + chemistry) / 3;
System.out.println("Sam's average mark in PCM is " + average);
```

### 3. Kilometers to Miles Conversion
```java
double km = 10.8;
double miles = km / 1.6;
System.out.println("The distance " + km + " km in miles is " + miles);
```

### 4. Profit and Loss Calculation
```java
double costPrice = 129, sellingPrice = 191;
double profit = sellingPrice - costPrice;
double profitPercent = (profit / costPrice) * 100;
System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
```

### 5. Distribute Pens Equally
```java
int totalPens = 14;
int students = 3;
int pensPerStudent = totalPens / students;
int remainingPens = totalPens % students;
System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
```

### 6. University Fee Discount
```java
double fee = 125000;
double discountPercent = 10;
double discount = (discountPercent / 100) * fee;
double finalFee = fee - discount;
System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
```

### 7. Volume of Earth
```java
double radius = 6378;
double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);
System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and in cubic miles is " + volumeMiles3);
```

### 8. Basic Calculator
```java
Scanner input = new Scanner(System.in);
System.out.print("Enter first number: ");
double num1 = input.nextDouble();
System.out.print("Enter second number: ");
double num2 = input.nextDouble();
System.out.println("Addition: " + (num1 + num2));
System.out.println("Subtraction: " + (num1 - num2));
System.out.println("Multiplication: " + (num1 * num2));
System.out.println("Division: " + (num1 / num2));
```

### 9. Maximum Handshakes Among Students
```java
Scanner input = new Scanner(System.in);
System.out.print("Enter number of students: ");
int n = input.nextInt();
int handshakes = (n * (n - 1)) / 2;
System.out.println("Maximum possible handshakes: " + handshakes);
```

---

## Conclusion
Following best programming practices improves code readability, maintainability, and efficiency. By practicing these simple Java programs, you can build a strong foundation in coding.

