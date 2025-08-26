import java.util.Random;
import java.util.Scanner;

public class Generate {

    // Method to generate random 2-digit scores for students
    static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3]; // 3 subjects: PCM

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + rand.nextInt(90); // random 10–99
            }
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // [total, average, percentage]

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100; // 3 subjects, each max 100

            // Round to 2 decimals
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    // Method to calculate grade
    static String[] calculateGrades(double[][] results) {
        int students = results.length;
        String[] grades = new String[students];

        for (int i = 0; i < students; i++) {
            double percent = results[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    // Method to display scorecard
