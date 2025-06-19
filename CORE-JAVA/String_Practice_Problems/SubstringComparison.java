import java.util.Scanner;

public class SubstringComparison {
    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
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
        String text = sc.next();
        System.out.println("Enter start index:");
        int start = sc.nextInt();
        System.out.println("Enter end index:");
        int end = sc.nextInt();
        String builtIn = text.substring(start, end);
        String manual = manualSubstring(text, start, end);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Manual: " + manual);
        System.out.println("Are equal: " + compareStrings(builtIn, manual));
    }
}

