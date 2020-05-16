package ru.arsakhanov.lesson23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasketArrayList implements Basket {

    ArrayList arraylistBasket = new ArrayList();

    /**
     *  Добавляет полы в коллекцию
     * @param product в параметре передается название продкуста типа String
     * @param quantity в параметре передается количество продукта типа int
     */
    @Override
    public void addProduct(String product, int quantity) {
        arraylistBasket.add(product);
        arraylistBasket.add(quantity);
    }

    /**
     * Удаляет элемент из коллекции (Удаляется и продукт и его количесвто)
     * @param product в качестве параметре передается название продукта типа String
     */
    @Override
    public void removeProduct(String product) {
        int index = arraylistBasket.indexOf(product);
        arraylistBasket.remove(index+1);
        arraylistBasket.remove(product);
    }

    /**
     * Метода обновляет количество продукта указанного в качестве параметра
     * @param product в параметре передается название продукта типа String
     * @param quantity в параметре передается количество продкута типа int
     */
    @Override
    public void updateProductQuantity(String product, int quantity) {
        if(arraylistBasket.contains(product)){
            int index = arraylistBasket.indexOf(product);
            arraylistBasket.set(index+1, quantity);
        }
    }

    /**
     * Удлаяет все элемены из списка (Все продукты и их количество)
     */
    @Override
    public void clear() {
        arraylistBasket.clear();
    }

    /**
     * Возвращает список всех продуктов, а также их количество
     * @return
     */
    @Override
    public List<String> getProducts() {
        Iterator products  = arraylistBasket.iterator();
        while(products.hasNext()){
            System.out.printf("%s %s \n", products.next(), products.next());
        }
        System.out.println();
        return arraylistBasket;
    }

    /**
     * Возвращает количество продкута
     * @param product в параметр передается название продкута(String), количество которого мы хотим узнать
     * @return
     */
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
