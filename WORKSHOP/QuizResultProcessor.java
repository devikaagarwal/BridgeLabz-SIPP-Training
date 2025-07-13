package WORKSHOP;

import java.util.*;
public class QuizResultProcessor {
    private String[] correctAnswers;
    private List<Integer> scores;

    public QuizResultProcessor(String[] correctAnswers) {
        this.correctAnswers = correctAnswers;
        this.scores = new ArrayList<>();
    }

    public int processUserAnswers(String[] userAnswers){
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }

        scores.add(score);
        return score;
    }

    public String getGrade(int score) {
        double percentage = ((double) score / correctAnswers.length) * 100;

        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 75) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else {
            return "D";
        }
    }

    public void displayAllScores() {
        System.out.println("All user scores: " + scores);
    }

    public static void main(String[] args) {
        String[] correctAnswers = {"A", "B", "C", "D"};

        QuizResultProcessor processor = new QuizResultProcessor(correctAnswers);
        String[][] userSubmissions = {
            {"A", "B", "C", "D"},
            {"A", "C", "C", "D"},
            {"A", "B", "D", "D"}
        };

        for (int i = 0; i < userSubmissions.length; i++) {
            int score = processor.processUserAnswers(userSubmissions[i]);
            String grade = processor.getGrade(score);
            System.out.println("User " + (i + 1) + " Score: " + score + "/" + correctAnswers.length + ", Grade: " + grade);
        }
        processor.displayAllScores();
    }
}

