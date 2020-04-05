package ru.arsakhanov.lesson9.task3;

public class Swimmer extends Person {

    boolean canYouSwim;
    int timeWithoutOxugen;

    Swimmer(String name, int age, boolean canYouSwim, int timeWithoutOxugen){
        super(name, age);
        this.canYouSwim = canYouSwim;
        this.timeWithoutOxugen = timeWithoutOxugen;
    }

    @Override
    public void canSwim() {
        if(canYouSwim == true){
            System.out.println(name + ", плавание - жизненно важный навык и у тебя он есть. Молодец!!!");
        } else System.out.println(name + ", тебе лучше поскорее научиться плвать, а то совсем как лох");
    }

    @Override
    public void canSwimUnderWater() {
        if(timeWithoutOxugen == 5){
            System.out.println("Станешь водолазом");
        } else if(timeWithoutOxugen < 5){
            System.out.println("Станешь спасателем");
        } else System.out.println("Плыви в свою Атлантиду Аквамен");
    }

    @Override
    public void canRun() {
        System.out.println(name + ", бег полезен для выработки выносливости");
    }

    @Override
    public void sportWalking() {
        if(age > 60){
            System.out.println("Тебе лучше всего ходить по утрам и вечерам, старик");
        } else System.out.println(name + ", проглука никогда и никому не мешала");
    }
}
