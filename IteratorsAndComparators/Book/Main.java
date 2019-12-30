package IteratorsAndComparators.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book one = new Book("Once upon a time", 1990, "Owrel");
        Book two = new Book("Casanova", 1986);
        Book three = new Book("Star Wars", 1236, "Owrel", "Agata", "Mareshki");

        List<Book> books = new ArrayList<>();
        books.add(one);
        books.add(two);
        books.add(three);

        Library library = new Library(one, two,three);

        for (Book book : library) {
            System.out.println(book.getTitle());
        }
    }
}
