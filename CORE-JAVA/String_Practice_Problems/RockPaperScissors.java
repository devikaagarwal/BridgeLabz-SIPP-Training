import java.util.*;

public class RockPaperScissors {
    static final String[] choices = {"rock", "paper", "scissors"};

    public static String computerChoice() {
        return choices[new Random().nextInt(3)];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) return "User";
        return "Computer";
    }

    public static String[][] playGames(int rounds) {
        Scanner sc = new Scanner(System.in);
        String[][] results = new String[rounds][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < rounds; i++) {
            System.out.println("Round " + (i + 1) + " - Enter rock/paper/scissors:");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;

            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = winner;
        }

        // Add stats row
        String[][] finalResults = Arrays.copyOf(results, rounds + 1);
        String userPct = String.format("%.2f", (userWins * 100.0 / rounds));
        String compPct = String.format("%.2f", (compWins * 100.0 / rounds));
        finalResults[rounds] = new String[]{"%", userPct + "%", compPct + "%"};

        return finalResults;
    }

    public static void displayResults(String[][] data) {
        System.out.println("User\tComputer\tWinner");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1] + "\t\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();
        String[][] result = playGames(rounds);
        displayResults(result);
    }
}

