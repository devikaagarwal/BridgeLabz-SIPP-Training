import java.util.Random;

public class StudentScoreCard {

    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 40 + rand.nextInt(61); 
            scores[i][1] = 40 + rand.nextInt(61);
            scores[i][2] = 40 + rand.nextInt(61);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double pct = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(pct * 100.0) / 100.0;
        }
        return result;
    }

    public static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            double pct = result[i][2];
            if (pct >= 90) grades[i] = "A+";
            else if (pct >= 80) grades[i] = "A";
            else if (pct >= 70) grades[i] = "B";
            else if (pct >= 60) grades[i] = "C";
            else if (pct >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void display(int[][] marks, double[][] results, String[] grades) {
        System.out.println("Phy Chem Math Total Avg  %     Grade");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%3d %4d %4d %5.0f %4.2f %5.2f  %s\n",
                marks[i][0], marks[i][1], marks[i][2],
                results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] marks = generateScores(5);
        double[][] results = calculateResults(marks);
        String[] grades = calculateGrades(results);
        display(marks, results, grades);
    }
}

