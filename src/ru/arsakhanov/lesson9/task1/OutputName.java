package ru.arsakhanov.lesson9.task1;

public class OutputName {

    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        tiger.setName("Шерхан");
        tiger.getName();

        Lion leaderLion = new Lion();
        leaderLion.setName("Муфаса");
        leaderLion.getName();

        Lion sonLion = new Lion();
        sonLion.setName("Симба");
        sonLion.getName();

        Cat cat = new Cat();
        cat.setName("Гарфилд");
        cat.getName();

        Duck richDuck = new Duck();
        richDuck.setName("Скрудж Макдак");
        richDuck.getName();

        Fish lostFish = new Fish();
        lostFish.setName("Немо");
        lostFish.getName();
    }
}
