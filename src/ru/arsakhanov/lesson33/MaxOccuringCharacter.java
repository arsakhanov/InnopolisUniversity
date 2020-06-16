package ru.arsakhanov.lesson33;

import java.util.*;

public class MaxOccuringCharacter {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        maxOccuringChar(str);
    }


    /**
     * Метод выводит на экран максимально встречающийся символ и его количесвто
     * @param s в параметры передается строка
     */
    public static void maxOccuringChar(String s){

        Map<Character, Integer> map = new HashMap<>();
        char character;
        for(int i=0; i<s.length(); i++){
            character = s.charAt(i);
            if(map.containsKey(character)){
                map.put(character, map.get(character)+1);
            }else map.put(character, 1);
        }

        char key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        int value = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        System.out.println("Character: " + key + " has occuring maximum times in String: " + value);

    }
}
