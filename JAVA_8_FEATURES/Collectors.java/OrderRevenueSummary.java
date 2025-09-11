import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double amount;

    public Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public String getCustomer() { return customer; }
    public double getAmount() { return amount; }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 200.0),
            new Order("Bob", 150.0),
            new Order("Alice", 300.0),
            new Order("Bob", 100.0)
        );

        Map<String, Double> revenue = orders.stream()
            .collect(Collectors.groupingBy(Order::getCustomer,
                     Collectors.summingDouble(Order::getAmount)));

        revenue.forEach((customer, total) -> 
            System.out.println(customer + " -> $" + total));
    }
}

