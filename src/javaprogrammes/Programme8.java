package javaprogrammes;
/**
 * Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base in cms?");
        double base = scanner.nextDouble();
        System.out.println("What is the height in cms?");
        double height = scanner.nextDouble();

        double area = (base * height) / 2;
        System.out.println("Area of the triangle is: " + area + "cm2");
        scanner.close();

    }
}
