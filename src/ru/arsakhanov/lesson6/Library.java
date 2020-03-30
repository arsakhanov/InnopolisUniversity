package ru.arsakhanov.lesson6;


public class Library {

    public static void main(String[] args) {

        Book book = new Book();
        book.setBook("1984", "Оруэл", "Грозбук", 500);
        book.getBook();


        Reader reader = new Reader();
        reader.setReader("Иванов Иван Иванович", "ул Кукушкина дом Петухов",
                         1234567, 21);
        reader.getReader();

       //reader.findBook();

    }


}
