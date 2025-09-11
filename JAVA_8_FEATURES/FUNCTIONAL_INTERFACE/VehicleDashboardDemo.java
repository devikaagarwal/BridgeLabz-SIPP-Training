interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available for this vehicle.");
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric Car speed: 60 km/h");
    }
    public void displayBattery() {
        System.out.println("Battery at 75%");
    }
}

public class VehicleDashboardDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.displaySpeed();
        car.displayBattery();

        Vehicle eCar = new ElectricCar();
        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
