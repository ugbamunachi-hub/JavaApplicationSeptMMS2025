
import java.util.Scanner;

public class FindABook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] books = {
            "Things Fall Apart",
            "Half of a Yellow Sun",
            "The Great Gatsby",
            "Harry Potter",
            "To Kill a Mockingbird"
        };

        System.out.println("Available Books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("\nEnter the book title to search: ");
        String search = input.nextLine();

        boolean found = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        // Display search result
        if (found) {
            System.out.println("Book found!");
        } else {
            System.out.println("Book not found.");
        }

        input.close();
    }
}