package ru.arsakhanov.lesson8.task4;

import java.util.ArrayList;
import java.util.Arrays;


public class Conversion {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Яблоки", "Груши", "Апельсины", "Мандарины"));
        Contract contract = new Contract(1, "6.04.2020", arrayList);
        System.out.println(Contract.getAct(contract).toString());
    }

}

