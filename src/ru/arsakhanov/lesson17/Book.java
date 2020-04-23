package ru.arsakhanov.lesson17;

import java.io.*;

/**
 * Данный класс имеет 3 параметра.
 * В классе описывается конструктор, ест статическйи метод, который считывает информацию из файла и показывает его на консоли
 */
public class Book {

    private String bookName;
    private String bookAuthor;
    private String bookYearOfPublishing;


    Book(String bookName,String bookAuthor, String bookYearOfPublishing ){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYearOfPublishing = bookYearOfPublishing;
    }


    /**
     * Метода ищет файл по указанному пути и считывает из него данные
     */
    public static void showListOfBooks(){
       try {
           File file = new File("E://Games//Library.txt");
           FileReader fileReader = new FileReader(file);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String line;
           while ((line = bufferedReader.readLine())!=null){
               System.out.println(line);
           }
           bufferedReader.close();
       }catch (IOException e){
           e.getMessage();
       }
    }

    @Override
    public String toString() {
        return "Book{" +
                "Название книги: '" + bookName + '\'' +
                ", Автор книги: '" + bookAuthor + '\'' +
                ", Год издания: " + bookYearOfPublishing +
                '}';
    }
}
