import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Predicate<Double> temperatureAlert = temp -> temp > 40.0;

        double currentTemp = 42.5;
        if (temperatureAlert.test(currentTemp)) {
            System.out.println("ALERT: Temperature crossed threshold!");
        } else {
            System.out.println("Temperature is safe.");
        }
    }
}

