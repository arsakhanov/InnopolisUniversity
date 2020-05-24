package ru.arsakhanov.lesson25.task2;

import java.util.*;

public class IsUniqueMap{

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Вася", "Иванов");
        map.put("Игорь", "Петров");
        map.put("Валерий", "Кухорев");
        map.put("Александр", "Иванов");
        map.put("Инокентий", "Булочкин");
        map.put("Виктор", "Пупкин");


        for(Map.Entry<String,String>entry: map.entrySet()){
            System.out.println(entry.getKey()+ "  " + entry.getValue());
        }

        System.out.println(isUnique(map));
    }


    /**
     * Метод проверяет есть ли в мапе одинаковые значения.
     * Значения передаются в сет и проверяются с помощью contains в сете
     * @param map в параметрах передается коллекция Map
     * @return возвращает true, если в мапе нет оддинаковых значений или если мап пустой
     * и false, если в мапе есть одинаковые значения
     */
    public static boolean isUnique(Map<String, String> map){
        Set<String> set = new HashSet<>();
       for(Map.Entry<String, String> entry: map.entrySet()){
           if (set.contains(entry.getValue())) {
               return false;
            } else set.add(entry.getValue());
           }
       return true;
    }
}
