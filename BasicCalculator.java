import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Performing calculations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Displaying results
        System.out.println("The addition, subtraction, multiplication, and division of numbers " + 
                           number1 + " and " + number2 + " are " + addition + ", " + subtraction + 
                           ", " + multiplication + ", and " + division);
        input.close();
    }
}
