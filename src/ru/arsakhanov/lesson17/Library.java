package ru.arsakhanov.lesson17;

import java.io.*;
import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {

        ArrayList<Book> bookArrayList = new ArrayList<>(); //создайю Arraylist, чтобы можно было добавлять новые книги в массив и не париться насчет размера

        bookArrayList.add(new Book("1984", "Oruel", "1995"));
        bookArrayList.add(new Book("The lord of the ring", "Tolkien", "1994"));
        bookArrayList.add(new Book("The witcher", "Sapkovski", "1993"));

        //Здесь я записываю все книги в файл на диске
        try{
            File file = new File("E://Games//Library.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Book s: bookArrayList){
                bufferedWriter.write(s + "\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.getMessage();
        }

        Book.showListOfBooks();
    }
}
