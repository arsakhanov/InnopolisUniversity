package ru.arsakhanov.lesson8.task4;

import java.util.ArrayList;

public class SpecialContract extends Contract {

    public SpecialContract(int number, String data, ArrayList<String> productList) {
        super(number, data, productList);
    }

    public void testMethod(){
        System.out.println(this.number);
    }
}
