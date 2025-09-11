import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(45, 75, 30, 90, 55);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(r -> System.out.println("High Reading: " + r));
    }
}

