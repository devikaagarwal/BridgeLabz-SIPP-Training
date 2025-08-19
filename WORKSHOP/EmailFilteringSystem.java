import java.util.*;
import java.util.regex.Pattern;

// ---------------- Custom Exceptions ----------------

// Unchecked Exception
class InvalidEmailFormatException extends RuntimeException {
    public InvalidEmailFormatException(String message) {
        super(message);
    }
}

// Checked Exception
class NoEmployeeFoundException extends Exception {
    public NoEmployeeFoundException(String message) {
        super(message);
    }
}

// ---------------- Email Class ----------------
class Email {
    private String emailAddress;

    public Email(String emailAddress) {
        if (!isValid(emailAddress)) {
            throw new InvalidEmailFormatException("Invalid email format: " + emailAddress);
        }
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if (!isValid(emailAddress)) {
            throw new InvalidEmailFormatException("Invalid email format: " + emailAddress);
        }
        this.emailAddress = emailAddress;
    }

    // Regex Validation
    private boolean isValid(String email) {
        String regex = "^[a-z0-9._]+@company\\.com$"; 
        return Pattern.matches(regex, email);
    }

    @Override
    public String toString() {
        return emailAddress;
    }
}

// ---------------- Employee Class ----------------
class Employee {
    private String name;
    private Email email;

    public Employee(String name, Email email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', email=" + email + "}";
    }
}

// ---------------- EmailManager Class ----------------
class EmailManager {
    private List<Employee> employees = new ArrayList<>();

    // Add Employee
    public void addEmployee(String name, String emailAddress) {
        try {
            Email email = new Email(emailAddress);  // may throw InvalidEmailFormatException
            Employee emp = new Employee(name, email);
            employees.add(emp);
            System.out.println("Added: " + emp);
        } catch (InvalidEmailFormatException e) {
            System.err.println("Error adding employee: " + e.getMessage());
        }
    }

    // Search by Domain
    public List<Employee> searchByDomain(String domain) throws NoEmployeeFoundException {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getEmail().getEmailAddress().endsWith("@" + domain)) {
                result.add(emp);
            }
        }
        if (result.isEmpty()) {
            throw new NoEmployeeFoundException("No employees found for domain: " + domain);
        }
        return result;
    }
}

// ---------------- Main Class ----------------
public class EmailFilteringSystem {
    public static void main(String[] args) {
        EmailManager manager = new EmailManager();

        // Adding employees
        manager.addEmployee("Alice", "alice@company.com");   // valid
        manager.addEmployee("Bob", "bob@gmail.com");         // invalid
        manager.addEmployee("Charlie", "charlie123@company.com"); // valid
        manager.addEmployee("Daisy", "daisy@company.org");   // invalid
        manager.addEmployee("Eve", "eve_smith@company.com"); // valid

        // Searching by domain
        try {
            System.out.println("\nEmployees with domain company.com:");
            List<Employee> results = manager.searchByDomain("company.com");
            for (Employee emp : results) {
                System.out.println(emp);
            }
        } catch (NoEmployeeFoundException e) {
            System.err.println(e.getMessage());
        }

        // Searching non-existent domain
        try {
            System.out.println("\nEmployees with domain gmail.com:");
            List<Employee> results = manager.searchByDomain("gmail.com");
            for (Employee emp : results) {
                System.out.println(emp);
            }
        } catch (NoEmployeeFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
