package PB_Exams.Test;

import java.util.Scanner;

public class Test_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        int productBought = 0;
        int productCount = 0;
        double priceCount = 0;

        while (!command.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            productCount++;
            if (productCount % 3 == 0) {
                price *= 0.5;
            }

            if (budget - price < 0) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", price - budget);
                break;
            } else {
                budget -= price;
                productBought++;
                priceCount += price;
            }
            command = scanner.nextLine();
        }

        if (command.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", productBought, priceCount);
        }
    }
}