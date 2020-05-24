package ru.arsakhanov.lesson25.task1;

import ru.arsakhanov.lesson23.Basket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketHashMap implements Basket {

    Map<String, Integer> map = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        map.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        map.replace(product, quantity);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<String> getProducts() {
        for(Map.Entry<String, Integer>entry: map.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        System.out.println("Количество продукта " +product + " - " +map.get(product));
        return 0;
    }
}
