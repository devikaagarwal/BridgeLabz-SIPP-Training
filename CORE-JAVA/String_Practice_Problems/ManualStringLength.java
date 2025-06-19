import java.util.Scanner;

public class ManualStringLength {

    public static int getLength(String s) {
        int length = 0;
        try {
            while (true) {
                s.charAt(length);
                length++;
            }
        } catch (Exception e) {
            return length;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = sc.next();
        System.out.println("Manual Length: " + getLength(input));
        System.out.println("Built-in Length: " + input.length());
    }
}

