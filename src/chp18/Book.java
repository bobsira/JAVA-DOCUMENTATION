package chp18;

import org.jetbrains.annotations.NotNull;

/**
 * Created by bobsira on 7/15/17.
 */
public class Book implements Comparable<Book> {
    int id, quantity;
    String name, author, publisher;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public int compareTo(@NotNull Book book) {
        if (id > book.id) {
            return 1;
        } else if (id < book.id) {
            return -1;
        } else {
            return 0;
        }
    }

}

