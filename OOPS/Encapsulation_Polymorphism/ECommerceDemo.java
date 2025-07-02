interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "GST 18%";
    }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Laptop", 50000),
            new Clothing(2, "Shirt", 2000),
            new Groceries(3, "Rice", 1000)
        };

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(p.getName() + " → Final Price: " + finalPrice);
        }
    }
}

