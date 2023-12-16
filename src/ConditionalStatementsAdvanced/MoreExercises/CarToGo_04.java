package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String typeCar = "";
        String classCar = "";
        double price = 0;

        if (budget <= 100) {
            classCar = "Economy class";
            if (season.equals("Summer")) {
                typeCar = "Cabrio";
                price = budget * 0.35;
            } else if (season.equals("Winter")) {
                typeCar = "Jeep";
                price = budget * 0.65;
            }
        } else if (budget <= 500) {
            classCar = "Compact class";
            if (season.equals("Summer")) {
                typeCar = "Cabrio";
                price = budget * 0.45;
            } else if (season.equals("Winter")) {
                typeCar = "Jeep";
                price = budget * 0.80;
            }
        }else {
            classCar = "Luxury class";
            typeCar = "Jeep";
            price = budget * 0.90;
        }
        System.out.printf("%s%n%s - %.2f", classCar, typeCar, price);
    }
}