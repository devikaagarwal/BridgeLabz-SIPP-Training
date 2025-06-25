package OOPS.JAVA_CONSTRUCTORS;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("1984", "George Orwell", 15.99);
        LibraryBook book2 = new LibraryBook("To Kill a Mockingbird", "Harper Lee", 12.99);

        System.out.println("Borrowing book1: " + book1.borrow());
        System.out.println("Borrowing book2: " + book2.borrow());
        System.out.println("Borrowing book1 again: " + book1.borrow());
        System.out.println("Is book1 available? " + book1.isAvailable);
        System.out.println("Is book2 available? " + book2.isAvailable);
    }
}

