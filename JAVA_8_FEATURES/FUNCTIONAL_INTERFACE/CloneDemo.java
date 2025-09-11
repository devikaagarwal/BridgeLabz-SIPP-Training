class Product implements Cloneable {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product p1 = new Product("Laptop", 80000);
        Product p2 = (Product) p1.clone();

        System.out.println("Original Product: " + p1.name + " - " + p1.price);
        System.out.println("Cloned Product: " + p2.name + " - " + p2.price);
    }
}

