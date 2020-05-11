package ru.arsakhanov.lesson21.task1;

public class ShiftElementArray {

    public static void main(String[] args) {

        int[][] array = new int[4][5];
        InitializationAndPrintArray.twoDimensionalArrayInitialization(array);
        System.out.println("Массив до сдвига элементов:");
        InitializationAndPrintArray.printTwoDimensionalArray(array);
        toLeft(array);
        System.out.println("Массив после сдвига элементов:");
        InitializationAndPrintArray.printTwoDimensionalArray(array);

    }

    /**
     * метод, который смещает положение всех элементов на один сдвиг влево, кроме последнего
     * вместо последнего элемента ставится число 0
     * @param array в параметре задается двумерный массив
     */
    public static void toLeft(int[][] array){
        int tmp;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length-1; j++){
                tmp = array[i][j+1];
                array[i][j] = tmp;
                array[i][j+1] = 0;
            }
        }
    }

}
