import java.util.Arrays;
import java.util.Scanner;

public class HarshadDigitFrequency {

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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += digit;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += Math.pow(digit, 2);
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    public static int[][] digitFrequencies(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }
        int[][] frequency = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                frequency[index][0] = i;
                frequency[index][1] = freq[i];
                index++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = extractDigits(number);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));

        int[][] freq = digitFrequencies(digits);
        System.out.println("Digit Frequencies:");
        for (int[] pair : freq) {
            System.out.println("Digit: " + pair[0] + " → Frequency: " + pair[1]);
        }
    }
}

