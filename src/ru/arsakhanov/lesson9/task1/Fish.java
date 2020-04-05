package ru.arsakhanov.lesson9.task1;

public class Fish extends Animal {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(name);
    }
}
