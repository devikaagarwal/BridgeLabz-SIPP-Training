import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, value;

        System.out.println("Enter numbers (0 to stop): ");
        while ((value = sc.nextDouble()) != 0) {
            total += value;
        }

        System.out.println("Total sum: " + total);
    }
}

