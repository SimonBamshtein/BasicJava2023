package lesson_16.practice.book.cotroller;
import lesson_16.practice.book.model.Book;

public class BookApplication {
    public static void main(String[] args) {

        //Создаем обьектные переменные book1, book2, book3
        Book book1 = new Book("Heart of Dragon", "Kirill Klevanski", 2016, 1000000000L);
        Book book2 = new Book("Code Da vinci", "Den Brown", 2003, 1000000001L);
        Book book3 = new Book("Jack London", "White..", 1900, 1000000201L);


        book1.display();
        book2.display();
        book3.display();

        Book book4 = new Book("Two captans", "Kaverin", 956, 1000000201L);

        book1.display();

        book4.setYear(900);
        book4.display();





    }
}
