package OOPS.JAVA_KEYWORDS;

class Employee {
    static String companyName = "Tech Solutions Ltd.";
    static int totalEmployees = 0;

    String name, designation;
    final int id;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
        }
    }
}
