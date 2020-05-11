package ru.arsakhanov.lesson21.task1;

/**
 * Класс, в котором есть методы инициализации и вывода массива на экран
 */
public class InitializationAndPrintArray {

    /**
     * Инициализация одномерного массива рандомными числами
     * @param array в качестве параметра передается одномерный массив
     */
    public static void arrayInitialization(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10);
        }
    }

    /**
     * Вывод на экран одномерного массива
     * @param array в качестве параметра передается одномерный массив
     */
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Инициализация двумерного массива рандомными числами
     * @param array в качестве параметра передается двумерный массив
     */
    public static void twoDimensionalArrayInitialization(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
    }

    /**
     * Метода выводит на экран двумерный массив
      * @param array в качестве параметра передается двумерный массив
     */
    public static void printTwoDimensionalArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
