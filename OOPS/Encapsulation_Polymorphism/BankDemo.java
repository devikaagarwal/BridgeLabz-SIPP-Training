interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private long accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(long accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(long accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(long accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return 0;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount(1001, "Alice", 50000),
            new CurrentAccount(1002, "Bob", 20000)
        };

        for (BankAccount acc : accounts) {
            System.out.println("Interest: " + acc.calculateInterest());
        }
    }
}

