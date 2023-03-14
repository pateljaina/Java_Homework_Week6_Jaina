package javaprogrammes;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */

public class Programme17 {

    public static void main(String[] args) {
        int d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a decimal number:   ");
        d = scanner.nextInt();

        String bin = Integer.toBinaryString(d);

        System.out.println("Binary number is :" + bin);
        scanner.close();

    }
}


