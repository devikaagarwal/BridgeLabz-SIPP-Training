package OOPS.JAVA_CONSTRUCTORS;

public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 12, 499.99);
        Course course2 = new Course("Data Structures", 8, 299.99);
        Course course3 = new Course("Web Development", 10, 399.99);

        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");
        System.out.println("\nAfter updating institute name:");
        course1.displayCourseDetails();
    }
}

