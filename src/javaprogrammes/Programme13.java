package javaprogrammes;
/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 */

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Please enter the second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("Please enter third number: ");
        double number3 = scanner.nextDouble();
        System.out.print("The average of 3 numbers is: " + calculateAverage(number1, number2, number3));
        scanner.close();
    }
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }


}



