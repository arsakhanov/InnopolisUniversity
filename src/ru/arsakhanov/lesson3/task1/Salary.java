package ru.arsakhanov.lesson3.task1;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вашу зарплату");
        double salary = in.nextDouble();
        System.out.println("Введите налоговую ставку");
        int taxRate = in.nextInt();
        double salaryWithTaxRate = (salary/100)*(100 - taxRate);
        System.out.println("Зарплата с вычетом налога: " + salaryWithTaxRate);
    }
}
