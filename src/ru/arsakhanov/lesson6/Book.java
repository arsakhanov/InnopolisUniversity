package ru.arsakhanov.lesson6;

public class Book{

    String  bookName;
    private String bookAuthor;
    private String bookPublishingHouse;
    private int bookPageCount;



    public void setBook(String bookName, String bookAuthor, String bookPublishingHouse, int bookPageCount){

        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublishingHouse = bookPublishingHouse;
        this.bookPageCount = bookPageCount;
    }

    public int getBook(){

        System.out.println("Название книги: " + bookName);
        System.out.println("Имя автора: " + bookAuthor);
        System.out.println("Издательство " + bookPublishingHouse);
        System.out.println("Количество страниц " + bookPageCount);
        return bookPageCount;
    }
}

