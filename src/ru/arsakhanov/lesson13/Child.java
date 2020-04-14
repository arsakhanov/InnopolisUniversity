package ru.arsakhanov.lesson13;


public class Child {

    public static void eat(Food food){


        try {
            if (food.equals(Food.APPLE)){
                System.err.println("Съел " + food +" за обе щеки");
            }
            else throw new Error();
        } catch (Error e){
            System.err.println("Ну ка съешь "+ food + " за маму, за папу, за деду и т.д.");
        }finally {
            System.err.println("Спасибо мама!");
        }
    }

    public enum Food{
        APPLE,
        BANANA,
        CHOCOLATE,
        PORRIDGE;
    }
}
