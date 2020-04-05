package ru.arsakhanov.lesson9.task2;

public class Fish implements Swim {

    @Override
    public void canSwim() {
        System.out.println("Рыбка немо может только плавать");
    }
}
