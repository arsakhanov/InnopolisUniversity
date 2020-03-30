package ru.arsakhanov.lesson6;


public class Reader extends Book {

    private String readerFullName;
    private String readerAddress;
    private int readerPhoneNumber;
    private int readerAge;


    public  int getReader(){

        System.out.println("ФИО читателя: " + readerFullName);
        System.out.println("Адрес читателя: " + readerAddress);
        System.out.println("Номер телефона читателя: " + readerPhoneNumber);
        System.out.println("Возраст читателя: " + readerAge);

        return readerAge;
    }


    public void setReader(String readerFullName, String readerAddress, int readerPhoneNumber, int readerAge){

        this.readerFullName = readerFullName;
        this.readerAddress = readerAddress;
        this.readerPhoneNumber = readerPhoneNumber;
        this.readerAge = readerAge;
    }

 /*   public void findBook(){

        Scanner in = new Scanner(System.in);
        String cardReader;
        cardReader = in.nextLine();
        if ((cardReader.equals()) == true){

            System.out.println("Читатель с именем: " + readerFullName + " взял книгу " + bookName);
        }*/


}


