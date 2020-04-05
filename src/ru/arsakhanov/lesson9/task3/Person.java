package ru.arsakhanov.lesson9.task3;

public abstract class Person implements Run, Swim{

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
