import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Claim {
    String type;
    double amount;

    public Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class ClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 1200),
            new Claim("Auto", 800),
            new Claim("Health", 1500),
            new Claim("Home", 5000),
            new Claim("Auto", 950)
        );

        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(c -> c.type, Collectors.averagingDouble(c -> c.amount)));

        avgClaims.forEach((type, avg) -> 
            System.out.println("Claim Type: " + type + ", Average: " + avg));
    }
}

