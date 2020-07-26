package com.example.mylibrary;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Utils {

    private static Utils instance;

    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> alreadyReadBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> favouriteBooks;

    private Utils() {
        if (null == allBooks) {
            allBooks = new ArrayList<>();
            initData();
        }

        if (null == alreadyReadBooks) {
            alreadyReadBooks = new ArrayList<>();

        }
        if (null == wantToReadBooks) {
            wantToReadBooks = new ArrayList<>();

        }
        if (null == currentlyReadingBooks) {
            currentlyReadingBooks = new ArrayList<>();

        }
        if (null == favouriteBooks) {
            favouriteBooks = new ArrayList<>();

        }
    }

    private void initData() {
        // TODO: add initial data

        allBooks.add(new Book(1, "The Secret History", "Donna Tartt", 638,
                "https://www.bookspdf4free.com/wp-content/uploads/2020/02/9780140167771_Z.jpg",
                "Bill's fave book",
                "The Secret History is the first novel by the American author, Donna Tartt, published by Alfred A. Knopf in September, 1992. Set in New England, the novel tells the story of a closely knit group of six classics students at Hampden College, a small, elite Liberal Arts college located in Vermont based upon Bennington College, where Tartt was a student between 1982 and 1986."));
        allBooks.add(new Book(2, "Another book", "Edgar Lustgarten", 234,
                "https://www.bookspdf4free.com/wp-content/uploads/2020/02/9780140167771_Z.jpg",
                "not Bill's fave book",
                "The Secret History is the first novel by the American author, Donna Tartt, published by Alfred A. Knopf in September, 1992. Set in New England, the novel tells the story of a closely knit group of six classics students at Hampden College, a small, elite Liberal Arts college located in Vermont based upon Bennington College, where Tartt was a student between 1982 and 1986."));

    }

    public static Utils getInstance() {
        if (null != instance) {
        } else {
            instance = new Utils();
        }
        return instance;
    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }

    public static ArrayList<Book> getFavouriteBooks() {
        return favouriteBooks;
    }

    public Book getBookById(int id) {
        for (Book b: allBooks) {
            if (b.getId() == id) {
                return b;
            }
        }

        return null;
    }
}
