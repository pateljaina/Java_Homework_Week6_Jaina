package javaprogrammes;
/**
 * Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String UppCase;
        System.out.println("Enter upper case line to convert to lower case");
        UppCase = scanner.nextLine();

        String LowCase = UppCase.toLowerCase();
        System.out.print("Your converted line is: " + LowCase);
        scanner.close();

    }
}
