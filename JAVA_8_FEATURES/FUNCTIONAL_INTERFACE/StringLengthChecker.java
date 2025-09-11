import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = String::length;

        String message = "This is a test message";
        int length = lengthChecker.apply(message);

        System.out.println("Message length: " + length);
        if (length > 20) {
            System.out.println("WARNING: Message exceeds character limit!");
        }
    }
}

