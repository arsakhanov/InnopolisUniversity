package ru.arsakhanov.lesson8.task1;


import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("Введите радиус круга:");
        double circleRadius = in.nextDouble();
        double areaOfCircle = PI * (circleRadius * circleRadius);
        System.out.println("Площадь круга = " + areaOfCircle);
    }
}
