package ru.arsakhanov.lesson3.task1;

import java.util.Scanner;

public class Gasoline {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цену бензина");
        double gasolinePricePerLiter = in.nextDouble();
        System.out.println("Введите количество литров бензина");
        int litersOfGasoline = in.nextInt();
        double totalPrice = gasolinePricePerLiter * litersOfGasoline;
        System.out.println("Сумма за бензин: " + totalPrice);
    }
}
