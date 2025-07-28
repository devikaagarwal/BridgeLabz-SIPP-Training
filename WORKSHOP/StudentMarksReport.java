import java.util.*;

public class StudentMarksReport {
    Map<String, List<Integer>> studentMarks = new HashMap<>();

    public void addMark(String studentName, int mark) {
        studentMarks.computeIfAbsent(studentName, k -> new ArrayList<>()).add(mark);
    }

    public double getAverage(String studentName) {
        List<Integer> marks = studentMarks.get(studentName);
        if (marks == null || marks.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.size();
    }

    public String getTopStudent() {
        String topStudent = null;
        double highestAvg = 0.0;

        for (Map.Entry<String, List<Integer>> entry : studentMarks.entrySet()) {
            double avg = getAverage(entry.getKey());
            if (avg > highestAvg) {
                highestAvg = avg;
                topStudent = entry.getKey();
            }
        }
        return topStudent;
    }

    public void displayReport() {
        System.out.println("Student Marks Report:");
        for (String student : studentMarks.keySet()) {
            System.out.printf("%s: Avg = %.2f%n", student, getAverage(student));
        }
    }

    public static void main(String[] args) {
        StudentMarksReport report = new StudentMarksReport();

        report.addMark("Alice", 85);
        report.addMark("Alice", 90);
        report.addMark("Bob", 70);
        report.addMark("Bob", 75);
        report.addMark("Charlie", 95);
        report.addMark("Charlie", 98);

        report.displayReport();
        System.out.println("Top Student: " + report.getTopStudent());
    }
}

