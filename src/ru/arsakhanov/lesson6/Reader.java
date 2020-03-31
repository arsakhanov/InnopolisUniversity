package ru.arsakhanov.lesson6;


public class Reader {

    private String readerFullName;
    private String readerAddress;
    private int readerPhoneNumber;
    private int readerAge;
    private Book handBook;


    public  int getReader(){

        System.out.println("ФИО читателя: " + readerFullName);
        System.out.println("Адрес читателя: " + readerAddress);
        System.out.println("Номер телефона читателя: " + readerPhoneNumber);
        System.out.println("Возраст читателя: " + readerAge);
        System.out.println("Книга на руках: " + handBook);

        return readerAge;
    }

    public void giveBook(Book inputBook){
        handBook = inputBook;
        handBook.setOwner(this);
    }

    public void returnBook(){
        handBook.setOwner(null);
        handBook = null;
    }

    public Reader(String readerFullName, String readerAddress, int readerPhoneNumber, int readerAge){

        this.readerFullName = readerFullName;
        this.readerAddress = readerAddress;
        this.readerPhoneNumber = readerPhoneNumber;
        this.readerAge = readerAge;
    }

    public void setReaderPhoneNumber(int readerPhoneNumber) {
        this.readerPhoneNumber = readerPhoneNumber;
    }




}


