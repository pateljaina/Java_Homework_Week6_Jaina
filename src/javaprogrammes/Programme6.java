package javaprogrammes;
/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        Scanner record = new Scanner(System.in);
        double radius, area;
        System.out.println("Enter the radius of the circle");
        radius = record.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("Area of the circle is " + area);
        record.close();

    }
}
