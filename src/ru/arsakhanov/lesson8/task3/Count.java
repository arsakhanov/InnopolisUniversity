package ru.arsakhanov.lesson8.task3;

public class Count {
    private static int countObject;

    public static int getCountObject() {
        return countObject;
    }

    private static void createObject(){
        countObject ++;
    }

    public static void main(String[] args) {
        System.out.println("Счетчик до создания объектов = " + getCountObject());
        for (int i=0; i<10; i++){
            createObject();
        }
        System.out.println("Счетчик после создания объектов = " + getCountObject());
    }
}
