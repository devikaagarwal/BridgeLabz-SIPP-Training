import java.util.Scanner;

public class ArrayIndexDemo {
    public static void causeException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(names[5]);
    }

    public static void handleException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment to see crash
        // causeException();
        handleException();
    }
}

