import java.util.Scanner;

public class ManualTrim {

    public static int[] trimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

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
        System.out.println("Enter string with spaces:");
        String input = sc.nextLine();
        int[] indices = trimIndices(input);
        String manualTrim = manualSubstring(input, indices[0], indices[1]);
        String builtInTrim = input.trim();
        System.out.println("Manual Trim: [" + manualTrim + "]");
        System.out.println("Built-in Trim: [" + builtInTrim + "]");
        System.out.println("Equal? " + compareStrings(manualTrim, builtInTrim));
    }
}

