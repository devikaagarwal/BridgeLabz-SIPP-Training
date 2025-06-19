import java.util.Scanner;

public class WordSplitComparison {

    public static int manualLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } 
        catch (Exception e) {
            return count;
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

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String text = sc.nextLine();
        String[] manual = manualSplit(text);
        String[] builtIn = text.split(" ");
        System.out.println("Manual and built-in split equal? " + compareArrays(manual, builtIn));
    }
}

