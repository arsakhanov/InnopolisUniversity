package ru.arsakhanov.lesson7;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class VendingMachine extends NullPointerException {

    public static final Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        LogManager.getLogManager().reset();
        logr.setLevel(Level.ALL);

        try{
            FileHandler fileHandler = new FileHandler("MyFile.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logr.addHandler(fileHandler);
        }catch (IOException e) {
            System.err.println("File logger is not working" + e);
        }

        Scanner in = new Scanner(System.in);

        Drink[] drinks = new Drink[]{Drink.PEPSI, Drink.SPRITE, Drink.COLA, Drink.PEPSI};
        for (int i = 0; i < drinks.length; i++){
            System.out.println("№ " + (i+1) + " " + drinks[i] + " " + drinks[i].getPrice());
        }

        System.out.println("Внесите деньги на внутренний счет:");
        int userWallet = in.nextInt();
        logr.log(Level.INFO, "Пользователь внес " + userWallet + " рублей на внутренний счет");
        if(userWallet != 0) {
            System.out.println("Введите номер заказа: ");
            int userNumber = in.nextInt();
            logr.log(Level.INFO, "Пользователь ввел " + userNumber + " номер заказа");
            if(userNumber > 0 && userNumber <= drinks.length) {
                for (int i = 0; i < drinks.length; i++) {
                    if (userNumber-1 == i) {
                        if (userWallet >= drinks[i].price) {
                            System.out.println("Возьмите свой заказ: " + drinks[i]);
                            System.out.println("И не забудьте сдачи: " + (userWallet - drinks[i].price));
                        } else if (userWallet < drinks[i].price) {
                            logr.log(Level.WARNING, "У вас недостаточно денег");
                        }
                    }
                }
            }else logr.log(Level.SEVERE, "Вы ввели неправильный номер заказа"); //System.out.println("Вы ввели неправильный номер заказа");
        }else logr.log(Level.SEVERE, "Вы не внесли деньги на счет"); //System.out.println("Вы не внесли деньги на счет");

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


