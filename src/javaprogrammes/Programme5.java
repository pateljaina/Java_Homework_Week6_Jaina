package javaprogrammes;
/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.
 */

import java.util.Scanner;

public class Programme5 {
    static int a, b;

    public void addition() {//instance method
        int result;
        result = a + b;
        System.out.println("Addition of 2 numbers is " + result);
    }

    public void subtraction() {//instance method
        int result;
        result = a - b;
        System.out.println("Subtraction of 2 numbers is " + result);
    }

    public static void multiplication() {//static method
        int result;
        result = a * b;
        System.out.println("Multiplication of 2 numbers is " + result);
    }

    public static void division() {//static method
        int result;
        result = a / b;
        System.out.println("Division of 2 numbers is " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        a = scanner.nextInt();
        System.out.println("Enter number 2: ");
        b = scanner.nextInt();
        Programme5 obj1 = new Programme5();
        obj1.addition();
        obj1.subtraction();
        multiplication();
        division();
        scanner.close();
    }
}



