import java.util.Scanner;

public class WordLengthFinder {

    public static int manualLength(String str) {
        int len = 0;
        try {
            while (true) str.charAt(len++);
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

    public static String[][] wordWithLengths(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(manualLength(words[i]));
        }
        return table;
    }

    public static int[] findMinMax(String[][] table) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIndex = -1, maxIndex = -1;

        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        String[] words = manualSplit(input);
        String[][] table = wordWithLengths(words);
        int[] minMax = findMinMax(table);
        System.out.println("Shortest word: " + table[minMax[0]][0]);
        System.out.println("Longest word: " + table[minMax[1]][0]);
    }
}

