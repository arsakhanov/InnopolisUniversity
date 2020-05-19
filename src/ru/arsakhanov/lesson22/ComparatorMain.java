package ru.arsakhanov.lesson22;

import java.util.Arrays;

public class ComparatorMain {

    public static void main(String[] args) {

        Person[] persons = new Person[5];
        persons[0] = new Person("Максим", 20);
        persons[1] = new Person("Максим", 25);
        persons[2] = new Person("Андрей", 30);
        persons[3] = new Person("Инокентий", 36);
        persons[4] = new Person("Александр", 27);

        Arrays.sort(persons, new PersonSuperComparator());
        for(Person person : persons){
            System.out.println(person.toString());
        }
    }
}
