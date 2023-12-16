package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToysShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForVacantion = Double.parseDouble(scanner.nextLine());


        int numOfPuzels = Integer.parseInt(scanner.nextLine());
        int numOfDoll = Integer.parseInt(scanner.nextLine());
        int numOfBears = Integer.parseInt(scanner.nextLine());
        int numOfMinions = Integer.parseInt(scanner.nextLine());
        int numOfTrucks = Integer.parseInt(scanner.nextLine());

        double sum = numOfPuzels * 2.6 + numOfDoll * 3 + numOfBears * 4.10 + numOfMinions * 8.20
        + numOfTrucks * 2;
        int numOfToys = numOfPuzels + numOfDoll + numOfBears + numOfMinions + numOfTrucks;

        if (numOfToys >= 50) {
            sum = sum * 0.75;
        }

        double rent = sum * 0.1;
        double profit = sum - rent;

        if (profit >= priceForVacantion) {
            System.out.printf("Yes! %.2f lv left.", profit - priceForVacantion);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceForVacantion - profit);
        }

    }
}
