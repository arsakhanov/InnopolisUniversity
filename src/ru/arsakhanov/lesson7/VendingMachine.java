package ru.arsakhanov.lesson7;

import java.util.Scanner;

public class VendingMachine extends NullPointerException {

    public static void main(String[] args) {

        for(theDrinks select : theDrinks.values()){
            System.out.println(select);
        }

        Scanner in = new Scanner(System.in);

        System.out.println("Внесите деньги на внутренний счет:");
        int userWallet = in.nextInt();

        if (userWallet != 0) {
            System.out.println("Введите номер заказа: ");
            int userNumber = in.nextInt();
            if(userNumber > 0 && userNumber < 7) {
                theDrinks userDrink = null;
                for (theDrinks drinks : theDrinks.values()) {
                    if ((userNumber - 1) == drinks.ordinal()) {
                        userDrink = drinks;
                    }
                }
                switch (userDrink){
                    case PEPSI_1_100:
                        if (userWallet >= 100) {
                            System.out.println("Возьмите свой напиток: " + userDrink);
                        } else System.out.println("Вы внесли недостаточно денег на счет");
                        break;

                    case SPRITE_2_100:
                        if (userWallet >= 100) {
                            System.out.println("Возьмите свой напиток: " + userDrink);
                        } else System.out.println("Вы внесли недостаточно денег на счет");
                        break;

                    case COLA_3_150:
                        if (userWallet >= 150) {
                            System.out.println("Возьмите свой напиток: " + userDrink);
                        } else System.out.println("Вы внесли недостаточно денег на счет");
                        break;

                    case MIRINDA_4_50:
                        if (userWallet >= 50) {
                            System.out.println("Возьмите свой напиток: " + userDrink);
                        } else System.out.println("Вы внесли недостаточно денег на счет");
                        break;

                    case FANTA_5_120:
                        if (userWallet >= 120) {
                            System.out.println("Возьмите свой напиток: " + userDrink);
                        } else System.out.println("Вы внесли недостаточно денег на счет");
                        break;

                    case SEVENUP_6_100:
                        if (userWallet >= 100) {
                            System.out.println("Возьмите свой напиток: " + userDrink);
                        } else System.out.println("Вы внесли недостаточно денег на счет");
                        break;

                    case MILK_7_200:
                        if (userWallet >= 200) {
                            System.out.println("Возьмите свой напиток: " + userDrink);
                        } else System.out.println("Вы внесли недостаточно денег на счет");
                        break;

                }
            }else System.out.println("Вы ввели неправильный номер заказа");
        } else System.out.println("Вы не внесли деньги на счет");

    }

    public enum theDrinks{
        PEPSI_1_100,
        SPRITE_2_100,
        COLA_3_150,
        MIRINDA_4_50,
        FANTA_5_120,
        SEVENUP_6_100,
        MILK_7_200;
    }

}
