package OOPS.JAVA_CONSTRUCTORS;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name (protected): " + name);
        System.out.println("CGPA (via getter): " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent(101, "Alice", 3.8);
        student.displayInfo();
        
        student.setCGPA(3.9);
        System.out.println("Updated CGPA: " + student.getCGPA());
    }
}

