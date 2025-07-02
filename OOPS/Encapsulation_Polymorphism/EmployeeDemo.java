interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId +", Name: " + name +", Base Salary: " + baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}


class FullTimeEmployee extends Employee implements Department {
    private double bonus;
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    public void assignDepartment(String deptName) {
        department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int id, String name, double baseSalary,
                            int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void assignDepartment(String deptName) {
        department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Alice", 30000, 5000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 0, 20, 300);

        Employee[] employees = { e1, e2 };
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Total Salary: " + e.calculateSalary());
            System.out.println();
        }
    }
}
