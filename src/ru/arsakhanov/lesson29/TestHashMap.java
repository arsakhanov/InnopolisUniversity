package ru.arsakhanov.lesson29;

import java.util.*;

public class TestHashMap {

    public static void main(String[] args) {

        Map<String, Person>map;
        map = createMap();
        System.out.println(map);
        removeTheDuplicates(map);

        System.out.println("Измененный мап Базовым методом");
        System.out.println(map);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        map = createMap();
        System.out.println(map);
        removeTheDuplicates2(map);

        System.out.println("Измененный мап Альтернативным методом");
        System.out.println(map);
    }

    public static Map<String, Person> createMap()
    {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29,"Петрова","жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }

    public static void removeTheDuplicates(Map<String, Person> map){
        Hashtable<String, Person> copy = new Hashtable<>(map);
        Set<Person> set = new HashSet<>();

        for(Map.Entry<String, Person> entry: copy.entrySet()){
            if(!set.add(entry.getValue())){
                removeItemFromMapByValue(map, entry.getValue());
            }
        }
    }

    public static void removeTheDuplicates2(Map<String, Person> map){
        Hashtable<String, Person> copy = new Hashtable<>(map);
        Set<Person> set = new HashSet<>();

        for(Map.Entry<String, Person> entry: copy.entrySet()){
            if(!set.add(entry.getValue())){
                map.remove(entry.getKey());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value)
    {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
