package ru.arsakhanov.lesson6;

public class Book{

    String  bookName;
    private String bookAuthor;
    private String bookPublishingHouse;
    private int bookPageCount;
    private Reader owner;

    public Reader getOwner() {
        return owner;
    }

    public void setOwner(Reader owner) {
        this.owner = owner;
    }

    public Book (String bookName, String bookAuthor, String bookPublishingHouse, int bookPageCount){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublishingHouse = bookPublishingHouse;
        this.bookPageCount = bookPageCount;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookPublishingHouse() {
        return bookPublishingHouse;
    }

    public int getBookPageCount() {
        return bookPageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPublishingHouse='" + bookPublishingHouse + '\'' +
                ", bookPageCount=" + bookPageCount +
                '}';
    }

}

