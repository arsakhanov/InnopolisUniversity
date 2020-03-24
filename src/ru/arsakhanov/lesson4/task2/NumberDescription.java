package ru.arsakhanov.lesson4.task2;

import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int userNumber = in.nextInt();

        if (userNumber % 2 == 0){
            System.out.println("Число четное");
        } else {System.out.println("Число нечетное");}

        if (userNumber < 0){
            System.out.println("Число отрицательное");
        }
            else if(userNumber > 0){
                System.out.println("Число положительное");
        }
                else System.out.println("Число нулевое");
    }

}
