package ru.arsakhanov.lesson3.task1;

import java.util.Scanner;

public class SecondsInHour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        double seconds = in.nextDouble();
        double hourInSeconds = seconds/3600;
        System.out.println(seconds + " Секунд переведенные в часы = " + hourInSeconds);
    }
}
