package OOPS.JAVA_CONSTRUCTORS;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 500.0;

    public CarRental() {
        this("Customer", "Sedan", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Alice", "SUV", 3);

        System.out.println("Customer: " + rental1.customerName + ", Car Model: " + rental1.carModel + ", Rental Days: " + rental1.rentalDays);
        System.out.println("Total Cost: $" + rental1.calculateTotalCost());

        System.out.println("Customer: " + rental2.customerName + ", Car Model: " + rental2.carModel + ", Rental Days: " + rental2.rentalDays);
        System.out.println("Total Cost: $" + rental2.calculateTotalCost());
    }
    
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
}

