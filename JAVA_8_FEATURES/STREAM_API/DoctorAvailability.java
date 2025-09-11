import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean availableWeekend;

    public Doctor(String name, String specialty, boolean availableWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableWeekend = availableWeekend;
    }

    public String toString() {
        return name + " - " + specialty + " (Weekend: " + availableWeekend + ")";
    }
}

public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Lee", "Neurology", false),
            new Doctor("Dr. Patel", "Orthopedics", true),
            new Doctor("Dr. Adams", "Dermatology", true)
        );

        doctors.stream()
               .filter(d -> d.availableWeekend)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(System.out::println);
    }
}

