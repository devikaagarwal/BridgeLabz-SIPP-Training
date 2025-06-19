import java.util.Scanner;

public class VowelConsonantChecker {

    public static String classifyChar(char c) {
        if (c >= 'A' && c <= 'Z') c += 32;
        if (c >= 'a' && c <= 'z') {
            return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classifyText(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = classifyChar(c);
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Character\tType");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.nextLine();
        String[][] result = classifyText(input);
        displayTable(result);
    }
}

