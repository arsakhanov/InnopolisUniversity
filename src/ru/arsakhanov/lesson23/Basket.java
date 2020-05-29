package ru.arsakhanov.lesson23;

import java.util.List;

public interface Basket {

    /**
     *  Добавляет полы в коллекцию
     * @param product в параметре передается название продкуста типа String
     * @param quantity в параметре передается количество продукта типа int
     */
    void addProduct(String product, int quantity);

    /**
     * Удаляет элемент из коллекции (Удаляется и продукт и его количесвто)
     * @param product в качестве параметре передается название продукта типа String
     */
    void removeProduct(String product);

    /**
     * Метода обновляет количество продукта указанного в качестве параметра
     * @param product в параметре передается название продукта типа String
     * @param quantity в параметре передается количество продкута типа int
     */
    void updateProductQuantity(String product, int quantity);

    /**
     * Удлаяет все элемены из списка (Все продукты и их количество)
     */
    void clear();

    /**
     * Возвращает список всех продуктов, а также их количество
     * @return
     */
    List<String> getProducts();

    /**
     * Возвращает количество продкута
     * @param product в параметр передается название продкута(String), количество которого мы хотим узнать
     * @return
     */
    int getProductQuantity(String product);
}
