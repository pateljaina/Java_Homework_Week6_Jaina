package javaprogrammes;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.5 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Programme14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input width of rectangle:  ");
        double width = scanner.nextDouble();
        System.out.println("Please input height of rectangle:  ");
        double height = scanner.nextDouble();
        scanner.close();

        double area = (width * height);
        double perimeter = (2 * (width + height));

        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
    }

}
