package ru.arsakhanov.lesson9.task2;

public class InterfaceImplementation {

    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.canFly();
        duck.canRun();
        duck.canSwim();

        Swim fish = new Fish();
        fish.canSwim();

        Tiger tiger = new Tiger();
        tiger.canRun();
        tiger.canSwim();
    }
}
