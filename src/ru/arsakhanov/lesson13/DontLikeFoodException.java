package ru.arsakhanov.lesson13;

public class DontLikeFoodException extends Exception {

    public Food dontLikeFood;

    public DontLikeFoodException(Food dontLikeFood) {
        this.dontLikeFood = dontLikeFood;
    }
}
