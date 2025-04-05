class Book {
    String title = "Java Programming";
    String author = "James Gosling";

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}
class Borrower extends Book {
    String borrowerName = "Anjali";
    int daysBorrowed = 5;
    void displayBorrower() {
        System.out.println("Borrowed By: " + borrowerName);
        System.out.println("Days Borrowed: " + daysBorrowed);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Borrower b = new Borrower();
        b.displayBook();
        b.displayBorrower();
    }
}
