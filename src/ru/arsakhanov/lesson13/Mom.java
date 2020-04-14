package ru.arsakhanov.lesson13;

public class Mom {

    public static void main(String[] args) {
        try {
        Child.eat(Food.BANANA);
    } catch (DontLikeFoodException e) {
            System.err.println("Ну ка съешь "+ e.dontLikeFood + " за маму, за папу, за деду и т.д.");
        }
    }
}
