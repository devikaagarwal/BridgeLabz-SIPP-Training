import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks in Mathematics: ");
        int maths = input.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Percentage: " + average);

        if (average >= 90)
            System.out.println("Grade: A+ | Remarks: Outstanding");
        else if (average >= 80)
            System.out.println("Grade: A | Remarks: Excellent");
        else if (average >= 70)
            System.out.println("Grade: B | Remarks: Good");
        else if (average >= 60)
            System.out.println("Grade: C | Remarks: Satisfactory");
        else if (average >= 50)
            System.out.println("Grade: D | Remarks: Pass");
        else
            System.out.println("Grade: F | Remarks: Fail");

        input.close();
    }
}

