package ru.arsakhanov.lesson19;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
            BigDecimal quantity;
            BigDecimal price;
            BigDecimal cost;
            BigDecimal totalCost = BigDecimal.valueOf(0);
            String nameOfProduct;
            while(scanner.hasNextLine()) {
                nameOfProduct = scanner.nextLine();
                quantity = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine())).setScale(3, RoundingMode.HALF_UP);
                price = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine())).setScale(2, RoundingMode.HALF_UP);
                cost = quantity.multiply(price).setScale(2, RoundingMode.HALF_UP);
                totalCost = totalCost.add(cost).setScale(2, RoundingMode.HALF_UP);
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
