interface SensitiveData {}

class CustomerData implements SensitiveData {
    private String ssn;
    private String creditCard;

    public CustomerData(String ssn, String creditCard) {
        this.ssn = ssn;
        this.creditCard = creditCard;
    }

    public void showData() {
        System.out.println("Sensitive Data: [Encrypted]");
    }
}

public class EncryptionDemo {
    public static void main(String[] args) {
        CustomerData data = new CustomerData("123-45-6789", "4111-1111-1111-1111");

        if (data instanceof SensitiveData) {
            System.out.println("Sensitive data detected. Applying encryption...");
        }
        data.showData();
    }
}
