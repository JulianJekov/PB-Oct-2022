package P03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numJuniors = Integer.parseInt(scanner.nextLine());
        int numSeniors = Integer.parseInt(scanner.nextLine());
        String typeOfTrack = scanner.nextLine();

        double price = 0;

        if (typeOfTrack.equals("trail")) {
            price = (numJuniors * 5.5) + (numSeniors * 7);
        } else if (typeOfTrack.equals("cross-country")) {
            price = (numJuniors * 8 + numSeniors * 9.50);
            if (numJuniors + numSeniors >= 50) {
                price = price * 0.75;
            }
        } else if (typeOfTrack.equals("downhill")) {
            price = (numJuniors * 12.25) + (numSeniors * 13.75);
        } else if (typeOfTrack.equals("road")) {
            price = (numJuniors * 20) + (numSeniors * 21.50);
        }

        double finalPrice = price - (price * 0.05);

        System.out.printf("%.2f", finalPrice);
    }
}