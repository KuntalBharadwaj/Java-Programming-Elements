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

### 1. Display Student Result
```java
class DisplayResult {
    public static void main(String[] args) {
        String name = "Sam";
        int rollNumber = 1;
        double percentMarks = 99.99;
        char result = 'P';
        System.out.println("Displaying Result: \n" + name + " with Roll Number " + rollNumber + " has Scored " + percentMarks + "% Marks and Result is " + result);
    }
}
```

### 2. Travel Computation
```java
class TravelComputation {
    public static void main(String[] args) {
        String name = "Eric";
        String fromCity = "Chennai", viaCity = "Vellore", toCity = "Bangalore";
        double distanceFromToVia = 156.6;
        int timeFromToVia = 4 * 60 + 4;
        double distanceViaToFinalCity = 211.8;
        int timeViaToFinalCity = 4 * 60 + 25;
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
    }
}
```

### 3. Basic Calculator
```java
import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
    }
}
```

### 4. Triangle Area Calculation
```java
import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base (cm): ");
        double base = input.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq cm is " + areaCm + " and in sq inches is " + areaIn);
    }
}
```

### 5. Square Side Calculation
```java
import java.util.Scanner;
class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
```

### 6. Distance Conversion
```java
import java.util.Scanner;
class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}
```

### 7. Purchase Price Calculation
```java
import java.util.Scanner;
class PurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
```

---

## Conclusion
Following best programming practices improves code readability, maintainability, and efficiency. By practicing these Java programs, you can build a strong foundation in coding.

