package ru.arsakhanov.lesson8.task4;

import java.util.ArrayList;

public class Contract {

    protected int number;
    private String data;
    private ArrayList<String> productList = null;

    public static Act getAct(Contract contract){
       return new Act(contract.number, contract.data, contract.productList);
    }


    public Contract(int number, String data, ArrayList<String> productList){
        this.number = number;
        this.data = data;
        this.productList = productList;
    }

}
