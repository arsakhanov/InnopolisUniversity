package ru.arsakhanov.lesson9.task2;

public class Tiger implements Run, Swim {

    @Override
    public void canRun() {
        System.out.println("Тигр может бегать");
    }

    @Override
    public void canSwim() {
        System.out.println("Тигр может плавать");
    }
}
