package ru.arsakhanov.lesson17;

import java.util.ArrayList;

public class LibLauncher {

    public static void main(String[] args) {

        ArrayList<Book> bookArrayList = new ArrayList<>(); //создайю Arraylist, чтобы можно было добавлять новые книги в массив и не париться насчет размера

        bookArrayList.add(new Book("1984", "Oruel", "1995"));
        bookArrayList.add(new Book("The lord of the ring", "Tolkien", "1994"));
        bookArrayList.add(new Book("The witcher", "Sapkovski", "1993"));

        Library.addBooks(bookArrayList);
        Library.showListOfBooks();
    }
}
