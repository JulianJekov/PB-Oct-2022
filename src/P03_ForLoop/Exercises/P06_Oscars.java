package P03_ForLoop.Exercises;

import java.util.Scanner;

public class P06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int countExaminers = Integer.parseInt(scanner.nextLine());

        double sumAllPoints = academyPoints;

        for (int i = 1; i <= countExaminers; i++) {
            String examinerName = scanner.nextLine();
            double pointsExaminer = Double.parseDouble(scanner.nextLine());

            double cureentPoints = (examinerName.length() * pointsExaminer) / 2;
            sumAllPoints += cureentPoints;

            if (sumAllPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, sumAllPoints);
                break;
            }
        }

        if (sumAllPoints < 1250.5) {
            double diff = 1250.5 - sumAllPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }

    }
}
