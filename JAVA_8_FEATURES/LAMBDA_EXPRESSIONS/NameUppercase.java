// File: NameUppercase.java
import java.util.*;
import java.util.stream.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class NameUppercase {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice"),
            new Employee("Bob"),
            new Employee("Charlie")
        );

        List<String> upperNames = employees.stream()
                                           .map(Employee::getName) // Method reference
                                           .map(String::toUpperCase) // Method reference
                                           .collect(Collectors.toList());

        System.out.println("Uppercase Names:");
        upperNames.forEach(System.out::println);
    }
}

