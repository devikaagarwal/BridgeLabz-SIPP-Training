// File: InvoiceCreator.java
import java.util.*;
import java.util.stream.*;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice for Transaction: " + transactionId;
    }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new) // Constructor reference
                                               .collect(Collectors.toList());

        System.out.println("Generated Invoices:");
        invoices.forEach(System.out::println);
    }
}

