package ru.arsakhanov.lesson9.task3;

public class Program {

    public static void main(String[] args) {

        Runner runner = new Runner("Иван", 22, 30, 15);
        runner.canRun();
        runner.sportWalking();
        runner.canSwim();
        runner.canSwimUnderWater();

        System.out.println();

        Swimmer swimmer = new Swimmer("Майкл", 23,true, 5);
        swimmer.canRun();
        swimmer.sportWalking();
        swimmer.canSwim();
        swimmer.canSwimUnderWater();
    }

}
