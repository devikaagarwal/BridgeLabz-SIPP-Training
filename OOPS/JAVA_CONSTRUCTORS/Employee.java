package OOPS.JAVA_CONSTRUCTORS;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Salary (private via getter): " + getSalary());
    }

    public static void main(String[] args) {
        Manager manager = new Manager(1001, "Sales", 75000.0);
        manager.displayManagerDetails();
        
        manager.updateSalary(80000.0);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}
