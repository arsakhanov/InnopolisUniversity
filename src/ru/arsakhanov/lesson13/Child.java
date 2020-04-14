package ru.arsakhanov.lesson13;


public class Child {

    public static void eat(Food food) throws DontLikeFoodException {

        try {
            if (food.equals(Food.APPLE)){
                System.err.println("Съел " + food +" за обе щеки");
            }
            else throw new DontLikeFoodException(food);
        //} //catch (Error e){
           // System.err.println("Ну ка съешь "+ food + " за маму, за папу, за деду и т.д.");
        }finally {
            System.err.println("Спасибо мама!");
        }
    }


}
