package ru.arsakhanov.lesson6;


public class Library {

    public static void main(String[] args) {

        Book book = new Book("1984", "Оруэл", "Грозбук", 500);

        System.out.println(book.toString());


        Reader reader = new Reader("Иванов Иван Иванович", "ул Кукушкина дом Петухов",
                                    1234567, 21);

        reader.getReader();
        System.out.println();
        reader.setReaderPhoneNumber(7654321);
        reader.giveBook(book);
        reader.getReader();
       //reader.findBook();

    }


}
