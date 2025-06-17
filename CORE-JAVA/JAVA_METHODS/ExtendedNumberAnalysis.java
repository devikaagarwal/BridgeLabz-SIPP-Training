import java.util.Arrays;
import java.util.Scanner;

public class ExtendedNumberAnalysis {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] extractDigits(int number) {
        int[] digits = new int[countDigits(number)];
        int index = digits.length - 1;
        while (number > 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int[] digits, int number) {
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }

    public static int[] findTwoLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > first) {
                second = first;
                first = digit;
            } else if (digit > second && digit != first) {
                second = digit;
            }
        }
        return new int[]{first, second};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < first) {
                second = first;
                first = digit;
            } else if (digit < second && digit != first) {
                second = digit;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = extractDigits(number);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(digits, number));

        int[] largest = findTwoLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findTwoSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}

