package ru.arsakhanov.lesson4.task1;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstNumber = in.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = in.nextInt();
        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " минимальное");
        }
            else if (firstNumber > secondNumber)
            {
                System.out.println(secondNumber +  " минимальное");
            }
                else {System.out.println("Числа равны");}
    }
}
