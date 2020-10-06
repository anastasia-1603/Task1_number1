package ru.vsu.cs.lazutkina;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double leg1 = readDouble("first");
        double leg2 = readDouble("second");

        System.out.printf("Area of a triangle: %.5f\n", calculateArea(leg1, leg2));
        System.out.printf("Perimeter of a triangle: %.5f\n", calculatePerimeter(leg1, leg2));
    }

    private static double calculateArea(double leg1, double leg2)
    {
        return (leg1 * leg2) / 2;
    }

    private static double calculateHypotenuse(double leg1, double leg2)
    {
        return Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }

    private static double calculatePerimeter(double leg1, double leg2)
    {
        return leg1 + leg2 + calculateHypotenuse(leg1, leg2);
    }

    private static double readDouble(String name)
    {
        System.out.printf("Input the %s leg of the triangle: ", name);
        Scanner scan = new Scanner(System.in);
        return checkPositiveAndZero(scan.nextDouble());
    }

    private static double checkPositiveAndZero(double number)
    {
        if (number <= 0)
        {
            System.out.print("Error! Input positive non-zero number: ");
            Scanner num = new Scanner(System.in);
            return checkPositiveAndZero(num.nextDouble());
        }
        else return number;
    }
}
