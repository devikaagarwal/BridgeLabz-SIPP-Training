package OOPS.JAVA_CONSTRUCTORS;

public class LibBook {
    public String ISBN;
    protected String title;
    private String author;

    public LibBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends LibBook {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails() {
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);
        System.out.println("Author (private via getter): " + getAuthor());
    }
}

