package ru.arsakhanov.lesson27;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите последовательность чисел:");
        int n = in.nextInt();
        for(int i= 0; i <= n; i++) {
            System.out.print(fibonacciSeriesWithRecursion(i) + " ");
        }

        System.out.println();
        fibonacciSeriesWithIterasion(n);
    }

    /**
     * метода вычисляет ряд фибоначчи с помощью рекурсии
     * @param sequenceOfNumbers в параметры передается последовательность чисел
     * @return возвращает каждый элемент ряда фибоначчи
     */
    public static int fibonacciSeriesWithRecursion(int sequenceOfNumbers) {

        return sequenceOfNumbers <= 1 ? (Math.max(sequenceOfNumbers, 0)) :
                (fibonacciSeriesWithRecursion(sequenceOfNumbers - 1) +
                        fibonacciSeriesWithRecursion(sequenceOfNumbers - 2));

    }


    /**
     * Метод вычисляет ряд фибоначчи с помощью итерации
     * @param sequenceOfNumbers в параметры передается последовательность чисел
     */
    public static void  fibonacciSeriesWithIterasion(int sequenceOfNumbers){
        int a = 0;
        int b = 1;
        if(sequenceOfNumbers == 0){
            System.out.println(a);
        }else{
            int[] mas = new int[sequenceOfNumbers];
            System.out.print(a + " " + b);
            for(int i = 1; i < mas.length; i++){
                mas[i] = b + a;
                a = b;
                b = mas[i];
                System.out.print(" " + mas[i]);
            }
        }
    }
}

