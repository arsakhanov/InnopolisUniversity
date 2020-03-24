package ru.arsakhanov.lesson3.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);

        int userNumber;
        int difOfPrevNumber = randomNumber;     //Переменная для хранения разницы загаданного числа с предыдущим введенным числом
        int difOfNumber;                                      //Переменная для хранения разницы загаданного числа с введенным числом
        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("Введите число от 1 до 100 или введите цифру 0, если хотите выйти из игры");
            userNumber = in.nextInt();

            if (userNumber == 0) {
                continueProgram = false;
            } else {

                if (userNumber == randomNumber) {
                    System.out.println("Вы отгадали число");
                    continueProgram = false;
                } else if (userNumber == 101){
                        randomNumber = (int) (Math.random() * 100);

                        System.out.println("Вы изменили число, которое должны отгадать!");
                         }
                    else {
                    difOfNumber = Math.abs(randomNumber - userNumber); //Здесь вычитывается разница между загаданным и введенным числами
                    if (difOfNumber < difOfPrevNumber) {
                        System.out.println("Горячо");
                    }else if (difOfNumber == difOfPrevNumber){
                        System.out.println("Средне");
                    } else  {
                        System.out.println("Холодно");
                    }
                    difOfPrevNumber = difOfNumber;
                }

            }

        }
    }
}


