import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temp = scanner.nextDouble();
        System.out.print("Enter wind speed (in mph): ");
        double speed = scanner.nextDouble();

        if (speed < 3 || temp > 50) {
            System.out.println("Wind chill is only defined for temp ≤ 50F and wind speed ≥ 3 mph.");
            return;
        }

        double windChill = calculateWindChill(temp, speed);
        System.out.printf("Wind Chill Temperature: %.2f°F\n", windChill);
    }
}
