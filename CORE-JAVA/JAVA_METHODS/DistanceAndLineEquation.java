// Question 34: Distance and Line Equation
import java.util.Scanner;

public class DistanceAndLineEquation {

    public static double computeDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] computeLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[] {m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = computeDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        if (x1 == x2) {
            System.out.println("Line is vertical; slope is undefined.");
        } else {
            double[] line = computeLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of Line: y = %.2fx + %.2f\n", line[0], line[1]);
        }
    }
}

