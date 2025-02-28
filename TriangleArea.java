import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();

        double areaInCm = 0.5 * base * height;
        double areaInInches = areaInCm / (2.54 * 2.54); // 1 inch = 2.54 cm

        System.out.println("The area of the triangle in square cm is " + areaInCm + " and in square inches is " + areaInInches);
    }
}
