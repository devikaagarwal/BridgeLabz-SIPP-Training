import java.util.Scanner;

public class UppercaseComparison {
    public static String toUpperManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c -= 32;
            }
            result += c;
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.nextLine();
        String builtInUpper = input.toUpperCase();
        String manualUpper = toUpperManual(input);
        System.out.println("Built-in Upper: " + builtInUpper);
        System.out.println("Manual Upper: " + manualUpper);
        System.out.println("Are equal: " + compareStrings(builtInUpper, manualUpper));
    }
}

