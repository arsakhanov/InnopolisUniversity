package ru.arsakhanov.lesson19;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Receipt {

    public static void main(String[] args) {
        File file = new File("E://Downloads//products.txt");
        try {
            Scanner scanner = new Scanner(file);
            Formatter f;
            f = new Formatter();
            System.out.println(f.format("%-16s%11s%15s%18s", "Наименование", "Цена", "Количество", "Стоимость"));
            System.out.println("=============================================================");
            double quantity = 0;
            double price = 0;
            double cost =0;
            double totalCost = 0;
            String nameOfProduct = new String();
            while(scanner.hasNextLine()) {
                f = new Formatter();
                if (scanner.hasNextDouble()) {
                    quantity = scanner.nextDouble();
                    price = scanner.nextDouble();
                    cost = quantity * price;
                }
                else nameOfProduct = scanner.nextLine();
                totalCost += cost;
                f.format("%-16s %3$11.2f %13.2f %4$18.2f",nameOfProduct, quantity, price, cost);
                if(quantity!=0 && price!=0 && cost!=0) {
                    System.out.println(f);
                    quantity = 0;
                    price = 0;
                    cost = 0;
                }
            }
            System.out.println("=============================================================");
            System.out.printf("Итого %55.2f",totalCost);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
