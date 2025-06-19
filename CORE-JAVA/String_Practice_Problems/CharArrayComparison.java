import java.util.Scanner;

public class CharArrayComparison {
    public static char[] manualToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.next();
        char[] builtIn = input.toCharArray();
        char[] manual = manualToCharArray(input);
        System.out.println("Are equal: " + compareCharArrays(builtIn, manual));
    }
}
