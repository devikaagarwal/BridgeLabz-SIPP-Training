import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        char maxChar = ' ';
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                maxChar = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + maxChar + "'");
    }
}

