package ru.arsakhanov.lesson4.task4;

import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int userNumber = in.nextInt();      //количество n-ых чисел в прогрессии
        System.out.println("Введите первое число прогрессии");
        int firstNumber = in.nextInt();     //первое число в прогрессии
        System.out.println("Введите разность прогрессии");
        int progressionDifference = in.nextInt();   //Разность арифмитической или геометрической прогрессии
        double arithmeticProgresion = firstNumber + progressionDifference * (userNumber - 1);
        double geometricalProgression = firstNumber * Math.pow(progressionDifference, userNumber - 1);
        System.out.println("Арифметическая прогресси = " + arithmeticProgresion);
        System.out.println("Геометрическая прогрессия = " + geometricalProgression);
    }
}
