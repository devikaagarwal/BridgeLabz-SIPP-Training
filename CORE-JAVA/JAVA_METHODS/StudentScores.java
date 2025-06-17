import java.util.Random;

public class StudentScores {

    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 50 + rand.nextInt(51);
            }
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%.0f\t%.2f\t%.2f\n", i + 1, marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(5);
        double[][] results = calculateResults(marks);
        displayScorecard(marks, results);
    }
}

