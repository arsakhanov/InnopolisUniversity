package ru.arsakhanov.lesson23;

import java.io.IOException;
import java.util.logging.*;

public class BasketMain {

    public static final Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        LogManager.getLogManager().reset();
        logr.setLevel(Level.ALL);

        try {
            FileHandler fileHandler = new FileHandler("resources//lesson23//Lesson23LogFile.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            logr.addHandler(fileHandler);
        }catch (IOException e){
            System.err.println("Лог файл не работает " + e);
        }

        BasketArrayList basketArrayList = new BasketArrayList();
        basketArrayList.addProduct("Яблоки", 55);
        logr.log(Level.INFO, "В коллекцию добавили product - Яблоки и quantity - 55");
        basketArrayList.addProduct("Груши", 70);
        logr.log(Level.INFO, "В коллекцию добавили product - Груши и quantity - 70");
        basketArrayList.addProduct("Бананы", 60);
        logr.log(Level.INFO, "В коллекцию добавили product - Бананы и quantity - 60");
        basketArrayList.addProduct("Апельсины", 30);
        logr.log(Level.INFO, "В коллекцию добавили product - Апельсины и quantity - 30");

        basketArrayList.updateProductQuantity("Бананы", 100);
        logr.log(Level.INFO, "В коллекции обновили количество бананов на 100");
        basketArrayList.getProducts();
        basketArrayList.removeProduct("Бананы");
        logr.log(Level.INFO, "Из коллекции удалили product - Бананы и их количество quantity");
        basketArrayList.getProducts();
        basketArrayList.getProductQuantity("Апельсины");
        basketArrayList.clear();
        logr.log(Level.INFO, "Очистили всю коллекуию удалив из него все объекты");

    }
}
