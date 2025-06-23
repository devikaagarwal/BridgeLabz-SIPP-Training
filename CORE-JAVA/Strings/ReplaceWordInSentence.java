import java.util.Scanner;

public class ReplaceWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();

        String result = "";

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                words[i] = newWord;
            }
        }

        result = String.join(" ", words);
        System.out.println("Modified Sentence: " + result);
    }
}
