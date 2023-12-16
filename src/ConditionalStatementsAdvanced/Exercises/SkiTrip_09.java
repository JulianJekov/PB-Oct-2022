package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        if (typeOfRoom.equals("room for one person")) {
            price = nights * 18;
            if (rating.equals("positive")) {
                price = price * 1.25;
            } else {
                price = price * 0.90;
            }
        } else if (typeOfRoom.equals("apartment")) {
            if (days < 10) {
                price = (nights * 25) * 0.70;
            } else if (days >= 10 && days <= 15) {
                price = (nights * 25) * 0.65;
            } else {
                price = (nights * 25) * 0.50;
            }
            if (rating.equals("positive")) {
                price = price * 1.25;
            } else {
                price = price * 0.90;
            }
        } else if (typeOfRoom.equals("president apartment")) {
            if (days < 10) {
                price = (nights * 35) * 0.90;
            } else if (days >= 10 && days <= 15) {
                price = (nights * 35) * 0.85;
            } else {
                price = (nights * 35) * 0.80;
            }
            if (rating.equals("positive")) {
                price = price * 1.25;
            } else {
                price = price * 0.90;
            }

        }
        System.out.printf("%.2f", price);
    }
}
