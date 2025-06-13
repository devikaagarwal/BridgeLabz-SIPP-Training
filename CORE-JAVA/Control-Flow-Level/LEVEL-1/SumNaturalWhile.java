import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;
            int whileSum = 0, i = 1;
            while (i <= n) {
                whileSum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);
        } else {
            System.out.println("Not a natural number.");
        }
    }
}

