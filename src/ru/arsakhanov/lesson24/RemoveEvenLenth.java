package ru.arsakhanov.lesson24;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEvenLenth {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("foo");
        set.add("bazz");
        set.add("bar");
        set.add("fork");
        set.add("bort");
        set.add("spoon");
        set.add("!");
        set.add("dude");
        System.out.println(removeEvenLenth(set));
        print(set);
    }


    /**
     *  метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
      * @param set в параметрах передаем коллекцию(множество)
     * @return возвращаем коллекцию(множество) с удаленными из него элементами четной длины
     */
    public static Set<String> removeEvenLenth(Set<String>set){
        set.removeIf(x -> (x.length()%2) == 0);
        return set;
    }

    public static void print(Set<String> set){

        for (String x : set) {
            System.out.println(x);
        }

    }
}
