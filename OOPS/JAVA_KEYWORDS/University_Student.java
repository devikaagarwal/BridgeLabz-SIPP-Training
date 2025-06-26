package OOPS.JAVA_KEYWORDS;

class University_Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    String name;
    final int studentRollNumber;
    char grade;

    University_Student(String name, int studentRollNumber, char grade) {
        this.name = name;
        this.studentRollNumber = studentRollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof University_Student) {
            System.out.println("Name: " + name);
            System.out.println("Student ID: " + studentRollNumber);
            System.out.println("GPA: " + grade);
            System.out.println("University: " + universityName);
        }
    }
}