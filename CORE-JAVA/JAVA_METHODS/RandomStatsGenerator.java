import java.util.Arrays;

public class RandomStatsGenerator {

    public static int[] generate4DigitRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1000 + (int)(Math.random() * 9000);
        }
        return array;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }

        double avg = (double) sum / numbers.length;
        return new double[] {avg, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.println("Random 4-digit numbers: " + Arrays.toString(randomNumbers));

        double[] stats = findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f\nMinimum: %.0f\nMaximum: %.0f\n", stats[0], stats[1], stats[2]);
    }
}

