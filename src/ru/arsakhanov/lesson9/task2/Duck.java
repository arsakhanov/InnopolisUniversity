package ru.arsakhanov.lesson9.task2;

public class Duck implements  Fly, Run, Swim {

    @Override
    public void canFly() {
        System.out.println("Утка может летать");
    }

    @Override
    public void canRun() {
        System.out.println("Утка может бегать");
    }

    @Override
    public void canSwim() {
        System.out.println("Утка может плавать");
    }
}
