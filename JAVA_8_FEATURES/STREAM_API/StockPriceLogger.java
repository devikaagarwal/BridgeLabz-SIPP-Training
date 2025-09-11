import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(120.5, 125.0, 119.8, 130.2);
        prices.forEach(price -> System.out.println("Stock Price: $" + price));
    }
}

