interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

public class RideHailingDemo {
    public static void main(String[] args) {
        Vehicle v = new Car("V001", "John", 15);
        System.out.println(v.getVehicleDetails());
        System.out.println("Fare for 10 km: " + v.calculateFare(10));
    }
}

