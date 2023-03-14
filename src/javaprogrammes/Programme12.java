package javaprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Programme12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value:   ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second value:   ");
        double b = scanner.nextDouble();
        System.out.println("Enter the third value:    ");
        double c = scanner.nextDouble();
        System.out.println("Enter the fourth value:   ");
        double d = scanner.nextDouble();
        scanner.close();

        double e = a * b;
        double f = b * b;
        double g = c - d;

        System.out.println((e - f) / g);

    }
}
