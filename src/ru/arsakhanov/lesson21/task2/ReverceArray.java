package ru.arsakhanov.lesson21.task2;

import ru.arsakhanov.lesson21.task1.InitializationAndPrintArray;

public class ReverceArray {

    public static void main(String[] args) {
        //работа с одномерным массивом
        int[] array = new int[10];
        InitializationAndPrintArray.arrayInitialization(array);
        System.out.println("Исходный массив:");
        InitializationAndPrintArray.printArray(array);
        System.out.println("\nОбратный массив:");
        reverceArray(array);
        InitializationAndPrintArray.printArray(array);
        System.out.println("");

        //работа с двумерным массивом
        int[][] array2 = new int[5][5];
        InitializationAndPrintArray.twoDimensionalArrayInitialization(array2);
        System.out.println("Исходный массив:");
        InitializationAndPrintArray.printTwoDimensionalArray(array2);
        System.out.println("Обратный массив:");
        reverceTwoDimensionalArray(array2);
        InitializationAndPrintArray.printTwoDimensionalArray(array2);
    }

    /**
     * метод, который меняет элементы массива в обратном порядке
     * @param array на вход задается массив
     */
    public static void reverceArray(int[] array){
        int tmp;
        int i = 0;
        for (int j = array.length-i-1; i<=j; i++, j--){
                tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
            }
    }

    /**
     * Метода, который меняет элементы двумерного массива в обратном порыдке
     * алгоритм доходим до середины меняя элементы в начале и в конце массива
     * @param array в параметре нужно указать двумерный массив
     */
    public static void reverceTwoDimensionalArray(int[][] array){
        int tmp;
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            for (int k = array[0].length - j - 1; j <= k; j++, k--) {
                tmp = array[i][k];
                array[i][k] = array[i][j];
                array[i][j] = tmp;
            }
        }
    }

}
