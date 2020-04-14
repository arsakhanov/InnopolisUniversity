package ru.arsakhanov.lesson11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Censor {



    public static void main(String[] args) {

        censorPattern();
    }

    public static void censorPattern(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для проверки");
        String text = in.nextLine();
        Pattern censor = Pattern.compile("бяка(\\w*)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher replaceCensor = censor.matcher(text);
        String newText = replaceCensor.replaceAll("вырезано цензурой ");
        System.out.println(newText);
    }

}
