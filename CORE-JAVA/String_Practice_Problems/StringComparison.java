import java.util.Scanner;

public class StringComparison {
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String a = sc.next();
        System.out.println("Enter second string:");
        String b = sc.next();
        boolean customCompare = compareStrings(a, b);
        boolean builtInCompare = a.equals(b);
        System.out.println("Custom compare: " + customCompare);
        System.out.println("Built-in compare: " + builtInCompare);
    }
}
