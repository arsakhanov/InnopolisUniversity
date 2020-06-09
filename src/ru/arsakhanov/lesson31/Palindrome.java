package ru.arsakhanov.lesson31;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = in.nextLine();
        System.out.println("Слово "+ word + firstMethodOfPalindrome(word));
        System.out.println("***************************************************************");
        secondMethodOfPalindrome(word);
    }


    /**
     * Метод позволяет проверить строку на палиндром путем перебора символов из начала и конца строки
     * @param word в качестве параметра передается переменная типа String
     * @return возвращает palandrome, если слово палиндром и notPalindroe иначе
     */
    public static String firstMethodOfPalindrome(String word){
        String palindrome = " палиндром";
        String notPalindrome = " не палиндром";
        word = word.toLowerCase();
        char[] chars = word.toCharArray();
        int i = 0;
        for(int j = chars.length-i-1; i<=j;){
            if(chars[i] != chars[j]){
                return notPalindrome;
            }else {i++; j--;}
        }
        return palindrome;
    }

    /**
     * Метод позволяет проверить строку на палиндром с помощью reverce()
     * @param word в качестве параметра передается переменная с типом String
     */
    public static void secondMethodOfPalindrome(String word){
        StringBuilder revercedWord = new StringBuilder(word);
        revercedWord.reverse();
        String word2 = revercedWord.toString();
        if(word2.equalsIgnoreCase(word)){
            System.out.println("Слово " + word + " - полиндром");
        }else System.out.println("Слово " + word + " - не полиндром");
    }

}
