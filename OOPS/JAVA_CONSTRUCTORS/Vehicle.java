package OOPS.JAVA_CONSTRUCTORS;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 2500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");
        Vehicle vehicle3 = new Vehicle("Alice Johnson", "Truck");

        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();
        vehicle3.displayVehicleDetails();

        Vehicle.updateRegistrationFee(3000.0);
        System.out.println("\nAfter updating registration fee:");
        vehicle1.displayVehicleDetails();
    }
}

