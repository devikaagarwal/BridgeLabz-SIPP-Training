package OOPS.JAVA_KEYWORDS;

class Vehicle_Registration {
    static double registrationFee = 5000.00;

    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle_Registration(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        if (this instanceof Vehicle_Registration) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Fee: ₹" + registrationFee);
        }
    }
}

