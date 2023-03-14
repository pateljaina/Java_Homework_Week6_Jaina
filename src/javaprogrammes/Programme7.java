package javaprogrammes;
/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C
 */

import java.util.Scanner;

public class Programme7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert Fahrenheit to Celsius, please enter Fahrenheit value");
        double value = scanner.nextDouble();
        double valueFinal = (value - 32) * 5 / 9;
        System.out.println(Math.round(valueFinal * 10.0) / 10.0);
        scanner.close();
    }

}

