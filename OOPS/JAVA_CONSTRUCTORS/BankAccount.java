package OOPS.JAVA_CONSTRUCTORS;

public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayInfo() {
        System.out.println("Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Balance (private via getter): " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("123456789", "John Doe", 1000.0);
        account.displayInfo();
        
        account.setBalance(1200.0);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}

