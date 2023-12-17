package P03_ForLoop.Exercises;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int sumPoints = initialPoints;
        int countWins = 0;

        for (int i = 1; i <= countTournaments; i++) {
            String tournamentStage = scanner.nextLine();

            if ("W".equals(tournamentStage)) {
                sumPoints = sumPoints + 2000;
                countWins++;
            } else if ("F".equals(tournamentStage)) {
                sumPoints += 1200;
            } else if ("SF".equals(tournamentStage)) {
                sumPoints += 720;
            }

        }

        int tournamentPoints = sumPoints - initialPoints;
        double percentWinsTournaments = (1.0*countWins / countTournaments) *100;

        System.out.printf("Final points: %d%n", sumPoints);
        System.out.printf("Average points: %d%n",tournamentPoints / countTournaments);
        System.out.printf("%.2f%%",percentWinsTournaments);

    }
}
