import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;
            int forSum = 0;

            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);
        } 
        else {
            System.out.println("Not a natural number.");
        }
    }
}

