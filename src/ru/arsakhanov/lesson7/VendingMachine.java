package ru.arsakhanov.lesson7;

import java.util.Scanner;

public class VendingMachine extends NullPointerException {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Drink[] drinks = new Drink[]{Drink.PEPSI, Drink.SPRITE, Drink.COLA, Drink.PEPSI};
        for (int i = 0; i < drinks.length; i++){
            System.out.println("№ " + (i+1) + " " + drinks[i] + " " + drinks[i].getPrice());
        }

        System.out.println("Внесите деньги на внутренний счет:");
        int userWallet = in.nextInt();
        if(userWallet != 0) {
            System.out.println("Введите номер заказа: ");
            int userNumber = in.nextInt();
            if(userNumber > 0 && userNumber <= drinks.length) {
                for (int i = 0; i < drinks.length; i++) {
                    if (userNumber-1 == i) {
                        if (userWallet >= drinks[i].price) {
                            System.out.println("Возьмите свой заказ: " + drinks[i]);
                            System.out.println("И не забудьте сдачи: " + (userWallet - drinks[i].price));
                        } else if (userWallet < drinks[i].price) {
                            System.out.println("У вас недостаточно денег");
                        }
                    }
                }
            }else System.out.println("Вы ввели неправильный номер заказа");
        }else System.out.println("Вы не внесли деньги на счет");

    }

    public enum Drink{
        PEPSI(100),
        SPRITE(100),
        COLA(150);

        private int price;

        Drink(int price){
            this.price = price;
        }

        public int getPrice(){
            return price;
        }
    }
}



