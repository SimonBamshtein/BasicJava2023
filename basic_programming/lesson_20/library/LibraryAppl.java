package lesson_20.library;

import lesson_20.library.models.Book;
import lesson_20.library.models.Library;

public class LibraryAppl {
    public static void main(String[] args) {
        Library library = new Library(1000);

/*
        library.addBook(new Book("War and Peace","Lev Tolstoi", 1990, 2000000000000L));
        library.addBook(new Book("Anna Karenina","Lev Tolstoi", 1995, 2000000000001L));
        library.addBook(new Book("451", "Ray Bredberry", 1965,2000000000002L));
        library.addBook(new Book("1984", "George Orwell", 1985,2000000000003L));


        System.out.println(library.getSize());

        Book bookFinded = library.findBook(2000000000002L);
        System.out.println(bookFinded);

        System.out.println(library.findBook(2000000000001L));
*/

        Book[] books;


        books = new Book[4];
        books[0] = new Book("War and Peace","Lev Tolstoi", 1990, 2000000000000L);
        books[1] = new Book("Anna Karenina","Lev Tolstoi", 1995, 2000000000001L);
        books[2] = new Book("451", "Ray Bredberry", 1965,2000000000002L);
        books[3] = new Book("1984", "George Orwell", 1985,2000000000003L);

        library.addBook(books[0]);
        library.addBook(books[1]);
        library.addBook(books[2]);
        library.addBook(books[3]);




        Book[] booksf;
        booksf = library.findBookAuthor("Lev Tolstoi", books);
        for (int i = 0; i < booksf.length; i++) {
            System.out.println(booksf[i]);
            System.out.println(library.getSize());
        }
        //удаление книги
        System.out.println("Removed book: ");
        library.removeBook(2000000000000L, books);
        System.out.println(library.getSize());
        System.out.println("Library size: " + library.getSize());
        //печать массива книг
        for (int i = 0; i < books.length ; i++) {
            System.out.println(books[i]);
        }

    }
}
