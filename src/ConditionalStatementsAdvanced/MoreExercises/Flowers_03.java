package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numChrysanthemum = Integer.parseInt(scanner.nextLine());
        int numRoses = Integer.parseInt(scanner.nextLine());
        int numTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String yesOrNo = scanner.nextLine();

        double price = 0;
        double allFlowers = numChrysanthemum + numTulips + numRoses;

        if (season.equals("Spring") || season.equals("Summer")) {
            price = numChrysanthemum * 2 + numRoses * 4.10 + numTulips * 2.50;
            if (yesOrNo.equals("Y")) {
                price = price * 1.15;
            }
            if (season.equals("Spring") && numTulips > 7) {
                price = price * 0.95;
            }

        } else if (season.equals("Autumn") || season.equals("Winter")) {
            price = numChrysanthemum * 3.75 + numRoses * 4.50 + numTulips * 4.15;
            if (yesOrNo.equals("Y")) {
                price = price * 1.15;
            }
            if (season.equals("Winter") && numRoses >= 10) {
                price = price * 0.90;
            }
        }

        if (allFlowers > 20) {
            price = price * 0.80;
        }
        double finalPrice = price + 2;
        System.out.printf("%.2f", finalPrice);
    }
}
