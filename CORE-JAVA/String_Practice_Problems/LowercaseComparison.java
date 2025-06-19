import java.util.Scanner;

public class LowercaseComparison {
    public static String toLowerManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c += 32;
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
        String builtInLower = input.toLowerCase();
        String manualLower = toLowerManual(input);
        System.out.println("Built-in Lower: " + builtInLower);
        System.out.println("Manual Lower: " + manualLower);
        System.out.println("Are equal: " + compareStrings(builtInLower, manualLower));
    }
}
