import java.util.Random;

public class EmployeeBonusCalculator {

    public static double[][] generateSalaryAndService(int count) {
        Random rand = new Random();
        double[][] data = new double[count][2];
        for (int i = 0; i < count; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = rand.nextInt(11);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displaySummary(double[][] original, double[][] updated) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tSalary\tService\tNewSalary\tBonus");
        for (int i = 0; i < original.length; i++) {
            double oldSalary = original[i][0];
            double service = original[i][1];
            double newSalary = updated[i][0];
            double bonus = updated[i][1];
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n", i + 1, oldSalary, service, newSalary, bonus);
            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;
        }
        System.out.printf("\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\nTotal Bonus Paid: %.2f\n",
                totalOld, totalNew, totalBonus);
    }

    public static void main(String[] args) {
        double[][] original = generateSalaryAndService(10);
        double[][] updated = calculateBonus(original);
        displaySummary(original, updated);
    }
}

