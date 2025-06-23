import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char toRemove = sc.next().charAt(0);
        String result = "";

        for (char ch : str.toCharArray()) {
            if (ch != toRemove) {
                result += ch;
            }
        }

        System.out.println("Modified String: " + result);
    }
}

