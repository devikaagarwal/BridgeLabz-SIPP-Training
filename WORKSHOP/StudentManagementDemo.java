import java.util.*;

class Student {
    String id;
    String name;
    int age;
    Set<String> subjects;
    Map<String, Double> grades;

    Student(String id, String name, int age, Set<String> subjects, Map<String, Double> grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjects = new HashSet<>(subjects);
        this.grades = new HashMap<>(grades);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public Set<String> getSubjects() { return subjects; }
    public Map<String, Double> getGrades() { return grades; }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        double total = 0.0;
        for (double grade : grades.values()) {
            total += grade;
        }
        return total / grades.size();
    }

    public String toString() {
        return id + " | " + name + " | Age: " + age + " | Avg Grade: " + String.format("%.2f", getAverageGrade()) + " | Subjects: " + subjects;
    }
}

class StudentManagementSystem {
    Map<String, Student> studentById = new HashMap<>();
    Map<String, Student> studentByName = new HashMap<>();

    public void addStudent(Student student) {
        studentById.put(student.getId(), student);
        studentByName.put(student.getName(), student);
    }

    public void removeStudentById(String id) {
        Student removed = studentById.remove(id);
        if (removed != null) {
            studentByName.remove(removed.getName());
        }
    }

    public Student searchById(String id) {
        return studentById.get(id);
    }

    public Student searchByName(String name) {
        return studentByName.get(name);
    }

    public void listStudents() {
        for (Student s : studentById.values()) {
            System.out.println(s);
        }
    }

    public void sortByName() {
        List<Student> list = new ArrayList<>(studentById.values());
        list.sort(Comparator.comparing(Student::getName));
        list.forEach(System.out::println);
    }

    public void sortByAverageGrade() {
        List<Student> list = new ArrayList<>(studentById.values());
        list.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());
        list.forEach(System.out::println);
    }

    public void findStudentsBySubject(String subject) {
        System.out.println("Students enrolled in: " + subject);
        for (Student s : studentById.values()) {
            if (s.getSubjects().contains(subject)) {
                System.out.println(s);
            }
        }
    }
}

public class StudentManagementDemo {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        Set<String> subjects1 = new HashSet<>(Arrays.asList("Math", "Physics"));
        Map<String, Double> grades1 = new HashMap<>();
        grades1.put("Math", 88.0);
        grades1.put("Physics", 92.0);

        Set<String> subjects2 = new HashSet<>(Arrays.asList("Chemistry", "Math"));
        Map<String, Double> grades2 = new HashMap<>();
        grades2.put("Chemistry", 76.5);
        grades2.put("Math", 81.0);

        Set<String> subjects3 = new HashSet<>(Arrays.asList("Biology", "Physics"));
        Map<String, Double> grades3 = new HashMap<>();
        grades3.put("Biology", 90.0);
        grades3.put("Physics", 95.0);

        Student s1 = new Student("S101", "Alice", 20, subjects1, grades1);
        Student s2 = new Student("S102", "Bob", 21, subjects2, grades2);
        Student s3 = new Student("S103", "Charlie", 19, subjects3, grades3);

        sms.addStudent(s1);
        sms.addStudent(s2);
        sms.addStudent(s3);

        System.out.println("All Students:");
        sms.listStudents();

        System.out.println("\nAfter removing Bob:");
        sms.removeStudentById("S102");
        sms.listStudents();

        System.out.println("\nSearch by name - Alice:");
        System.out.println(sms.searchByName("Alice"));

        System.out.println("\nSorted by Name:");
        sms.sortByName();

        System.out.println("\nSorted by Average Grade:");
        sms.sortByAverageGrade();

        sms.findStudentsBySubject("Physics");
    }
}

