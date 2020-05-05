package ru.arsakhanov.lesson19;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Receipt {

    public static void main(String[] args) {
        File file = new File("resources//products.txt");
        try {
            Scanner scanner = new Scanner(file);
            Formatter f;
            f = new Formatter();
            System.out.println(f.format("%-16s%11s%15s%18s", "Наименование", "Цена", "Количество", "Стоимость"));
            System.out.println("=============================================================");
            double quantity;
            double price;
            double cost;
            double totalCost = 0;
            String nameOfProduct;
            while(scanner.hasNextLine()) {
                nameOfProduct = scanner.nextLine();
                quantity = Double.parseDouble(scanner.nextLine());
                price = Double.parseDouble(scanner.nextLine());
                cost = quantity * price;
                totalCost += cost;
                f = new Formatter();
                f.format("%-16s %3$11.2f %13.2f %4$18.2f",nameOfProduct, quantity, price, cost);
                System.out.println(f);
                }
            f.close();
            System.out.println("=============================================================");
            System.out.printf("Итого %55.2f",totalCost);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
