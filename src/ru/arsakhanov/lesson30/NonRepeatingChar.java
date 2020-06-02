package ru.arsakhanov.lesson30;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingChar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Character character = findFirstNonRepeatingChar(str);
        System.out.println("Первый неповторяющийся элемент: " + character);
    }


    /**
     * Метод ищет первый неповторяющийся элемент в строке
     * @param s в параметры передается строка
     * @return возвращает первый неповторяющийся элмент в строке и null, если такого элемента на найдено
     */
    public static Character findFirstNonRepeatingChar(String s){

        Map<Character, Integer> map = new HashMap<>();
        int i;
        Character character;
        int lenths = s.length();

        //добавляю элменеты в hashmap
        for(i =0; i < lenths; i++){
            character = s.charAt(i);
            //если элементы уже встречаются, то увеличиваю их значение на 1
            if(map.containsKey(character)){
                map.put(character, map.get(character)+1);
            }else
                map.put(character, 1);
        }

        //проверяю есть ли в строке неповторяющегося элемента с помощью Hashmap
        for(i =0; i < lenths; i++){
            character = s.charAt(i);
            if(map.get(character)==1){
                return character;
            }
        }
        return null;
    }
}
