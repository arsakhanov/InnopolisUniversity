package ru.arsakhanov.lesson9.task3;

public class Runner extends Person {

    private int runSpeed;
    private int walkSpeed;

    Runner (String name, int age, int runSpeed, int walkSpeed){
        super(name, age);
        this.runSpeed = runSpeed;
        this.walkSpeed = walkSpeed;
    }

    @Override
    public void canRun() {
        if(runSpeed == 44){
            System.out.println("Скорость вашей пробежки равна скорости Усейна Болта");
        }
            else if(runSpeed < 44){
            System.out.println("Вы очень хороший бегун");
        } else System.out.println("Что ты такое???");
    }

    @Override
    public void sportWalking() {
        if(walkSpeed >= 7 && walkSpeed <= 10){
            System.out.println(name +", вы идеально подходите для спортивной хотьбы");
        } else if(walkSpeed < 7 && walkSpeed > 0){
            System.out.println(name + ", можете не торопиться, хорошая прогулка должна быть неспешной");
        }
    }

    @Override
    public void canSwim() {
        System.out.println("Рожденный бегать плавать не хочет");
    }

    @Override
    public void canSwimUnderWater() {
        System.out.println(name + ", когда-нибудь ты пойдешь покорять глубины озер, морей и океанов, но не сегодня. Потому что карантин");
    }
}
