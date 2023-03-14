package javaprogrammes;
/**
 * Write a Java program to add two binary numbers
 */

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        binary();
    }

    public static void binary() {
        int a, b;
        System.out.println("Please input first binary number");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt(2);
        System.out.println("Please input second binary number");
        b = scanner.nextInt(2);
        System.out.println("Sum of two binary numbers:" + Integer.toBinaryString(a + b));
        scanner.close();

    }
}




