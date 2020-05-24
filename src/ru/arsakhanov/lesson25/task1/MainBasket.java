package ru.arsakhanov.lesson25.task1;

public class MainBasket {

    public static void main(String[] args) {

        BasketHashMap basketHashMap = new BasketHashMap();

        basketHashMap.addProduct("Яблоки", 25);
        basketHashMap.addProduct("Груши", 50);
        basketHashMap.addProduct("Апельсины", 100);
        basketHashMap.addProduct("Бананы", 50);
        basketHashMap.addProduct("Лимоны", 30);

        basketHashMap.getProducts();

        basketHashMap.removeProduct("Лимоны");

        System.out.println();

        basketHashMap.updateProductQuantity("Яблоки", 100);

        basketHashMap.getProducts();

        basketHashMap.getProductQuantity("Яблоки");
    }
}
