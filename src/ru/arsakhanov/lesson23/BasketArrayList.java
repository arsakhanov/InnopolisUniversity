package ru.arsakhanov.lesson23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasketArrayList implements Basket {

    ArrayList arraylistBasket = new ArrayList();


    @Override
    public void addProduct(String product, int quantity) {
        arraylistBasket.add(product);
        arraylistBasket.add(quantity);
    }


    @Override
    public void removeProduct(String product) {
        int index = arraylistBasket.indexOf(product);
        arraylistBasket.remove(index+1);
        arraylistBasket.remove(product);
    }


    @Override
    public void updateProductQuantity(String product, int quantity) {
        if(arraylistBasket.contains(product)){
            int index = arraylistBasket.indexOf(product);
            arraylistBasket.set(index+1, quantity);
        }
    }


    @Override
    public void clear() {
        arraylistBasket.clear();
    }


    @Override
    public List<String> getProducts() {
        Iterator products  = arraylistBasket.iterator();
        while(products.hasNext()){
            System.out.printf("%s %s \n", products.next(), products.next());
        }
        System.out.println();
        return arraylistBasket;
    }


    @Override
    public int getProductQuantity(String product) {
        if(arraylistBasket.contains(product)){
        int index = arraylistBasket.indexOf(product);
            System.out.println("Количество продукта: "+product + " = " + arraylistBasket.get(index+1));
        return (Integer)arraylistBasket.get(index+1);
    }else {
            System.out.println("Данного товара: " + product + " - в списке нет");
            return 0;
        }
    }

}
