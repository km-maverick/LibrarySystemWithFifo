import java.util.LinkedList;
import java.util.Queue;

public class Library {
    public static void main(String[] args) {
        Library library = new Library();

        // Example book requests
        library.requestBook("User", "Introduction to Java");
        library.requestBook("Teacher", "Advanced Data Structures");
        library.requestBook("Senior Student", "History of Literature");

        // Process the book requests
        System.out.println(library.processRequests()); // Book "Introduction to Java" taken by Student
        System.out.println(library.processRequests()); // Book "Advanced Data Structures" taken by Teacher
        System.out.println(library.processRequests()); // Book "History of Literature" taken by Senior Student
        System.out.println(library.processRequests()); // No book requests at the moment.
    }
}
