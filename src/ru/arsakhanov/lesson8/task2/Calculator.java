package ru.arsakhanov.lesson8.task2;

public class Calculator {

    public static void main(String[] args) {
        Addition(5.5, 5.7);
        Subtraction(100, 50);
        Division(90, 10);
        Multiplication(5, 5);
        percentageOfNumber(50000, 20);
    }

    public static void Addition( double a, double b){
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void Subtraction(double a, double b){
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void Division(double a, double b){
        if(b != 0){
            System.out.println(a + " : " + b + " = " + (a / b));
        }
        else throw new NullPointerException("НЕЛЬЗЯ ДЕЛИТЬ НА НУЛЬ!!!");
    }

    public static void Multiplication(double a, double b){
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public static void percentageOfNumber(double number, int percent){
        System.out.println("Процент " + percent + " от числа " + number + " = " + ((number/100)*percent));
    }

}
