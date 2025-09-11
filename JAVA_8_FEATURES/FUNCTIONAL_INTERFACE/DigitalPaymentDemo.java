interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }
}

public class DigitalPaymentDemo {
    public static void main(String[] args) {
        Payment payment = new UPI();
        payment.pay(500);

        payment = new CreditCard();
        payment.pay(1200);

        payment = new Wallet();
        payment.pay(300);
    }
}

