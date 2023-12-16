package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double priceKmMonth = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kmPerMonth <= 5000) {
                    priceKmMonth = kmPerMonth * 0.75;
                } else if (kmPerMonth <= 10000) {
                    priceKmMonth = kmPerMonth * 0.95;
                }
                break;
            case "Summer":
                if (kmPerMonth <= 5000) {
                    priceKmMonth = kmPerMonth * 0.90;
                } else if (kmPerMonth <= 10000) {
                    priceKmMonth = kmPerMonth * 1.10;
                }
                break;
            case "Winter":
                if (kmPerMonth <= 5000) {
                    priceKmMonth = kmPerMonth * 1.05;
                } else if (kmPerMonth <= 10000) {
                    priceKmMonth = kmPerMonth * 1.25;
                }
                break;
        }
        if (season.equals("Summer") || season.equals("Spring") || season.equals("Autumn") || season.equals("Winter")) {
            if (kmPerMonth >10000 && kmPerMonth <= 20000) {
                priceKmMonth = kmPerMonth * 1.45;
            }
        }
        double priceKmSeason = priceKmMonth * 4;
        double priceWithTax = priceKmSeason * 0.90;
        System.out.printf("%.2f", priceWithTax);
    }
}
