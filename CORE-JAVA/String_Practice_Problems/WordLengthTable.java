import java.util.Scanner;

public class WordLengthTable {

    public static int manualLength(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len++);
            }
        } catch (Exception e) {
            return len;
        }
    }

    public static String[] manualSplit(String text) {
        int count = 1;
        for (int i = 0; i < manualLength(text); i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int start = 0, wordIndex = 0;
        for (int i = 0; i <= manualLength(text); i++) {
            if (i == manualLength(text) || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[wordIndex++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(manualLength(words[i]));
        }
        return result;
    }

    public static void display(String[][] table) {
        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String[] words = manualSplit(text);
        String[][] result = getWordLengths(words);
        display(result);
    }
}
