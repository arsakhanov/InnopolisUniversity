package ru.arsakhanov.lesson8.task4;

import java.util.ArrayList;

public class Act {

    private int number;
    private String data;

    private ArrayList<String> productList = null;

    public Act(int number, String data, ArrayList<String> productList){
        this.number = number;
        this.data = data;
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Act{" +
                "number=" + number +
                ", data='" + data + '\'' +
                ", productList=" + productList +
                '}';
    }
}
