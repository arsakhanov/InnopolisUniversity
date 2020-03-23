package ru.arsakhanov.lesson3.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double randomNumber = (int) (Math.random() * 100);
        int[] userNumber = new int [100];
        userNumber[0] = 0;
        double difOfPrevNumber = randomNumber - 0;     //Переменная для хранения разницы загаданного числа с предыдущим введенным числом
        double difOfNumber;                                      //Переменная для хранения разницы загаданного числа с введенным числом
        for (int i= 1; i <= userNumber.length; i++)
        {
            System.out.println("Введите число от 1 до 100 или введите цифру 0, если хотите выйти из игры");
            userNumber[i] = in.nextInt();
            if (userNumber[i] == 0) {break;}
            if (userNumber[i] == randomNumber)
            {
                System.out.println("Вы отгадали число"); break;
            }

            difOfNumber = Math.abs(randomNumber - userNumber[i]); //Здесь вычитывается разница между загаданным и введенным числами

            if (difOfNumber < difOfPrevNumber)
            {
                System.out.println("Горячо");

            }
                else if (difOfNumber > difOfPrevNumber)
                {
                    System.out.println("Холодно");
                }

            difOfPrevNumber = difOfNumber;
        }
    }
}


