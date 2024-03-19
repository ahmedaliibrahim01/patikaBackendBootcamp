import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Created book objects.
        Book book1 = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald", "10.04.1925");
        Book book2 = new Book("To Kill a Mockingbird", 1960, "Harper Lee", "11.07.1960");
        Book book3 = new Book("1984", 1949, "George Orwell", "08.06.1949");
        Book book4 = new Book("Pride and Prejudice", 1813, "Jane Austen", "28.01.1813");
        Book book5 = new Book("The Catcher in the Rye", 1951, "J.D. Salinger", "16.07.1951");

        // Created a Set that sorts books by name
        Set<Book> bookSetByNames = new TreeSet<>();
        bookSetByNames.add(book1);
        bookSetByNames.add(book2);
        bookSetByNames.add(book3);
        bookSetByNames.add(book4);
        bookSetByNames.add(book5);

        System.out.println("\n                    =============The books are in order by name============= \n ");
        for (Book book : bookSetByNames){
            System.out.println(book);
        }

        // Created a Set that sorts books by page number
        Set<Book> bookSetByPageCount = new HashSet<>();
        bookSetByPageCount.addAll(bookSetByNames);

        System.out.println("\n                    =============Thee books ordered by number of pages============= \n ");
        for (Book book : bookSetByPageCount){
            System.out.println(book);
        }
    }
}
