package P06_ExamProblems.PB_Exams.Test3;

import java.util.Scanner;

public class CoffeeMachine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numDrinks = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (drink.equals("Espresso")) {
            if (sugar.equals("Without")) {
                price = numDrinks * 0.90;
            } else if (sugar.equals("Normal")) {
                price = numDrinks * 1.0;
            } else if (sugar.equals("Extra")) {
                price = numDrinks * 1.20;
            }
            if (sugar.equals("Without")) {
                price = price * 0.65;
            }
            if (numDrinks >= 5) {
                price = price * 0.75;
            }
        } else if (drink.equals("Cappuccino")) {
            if (sugar.equals("Without")) {
                price = numDrinks * 1.0;
            } else if (sugar.equals("Normal")) {
                price = numDrinks * 1.20;
            } else if (sugar.equals("Extra")) {
                price = numDrinks * 1.60;
            }
            if (sugar.equals("Without")) {
                price = price * 0.65;
            }
        } else if (drink.equals("Tea")) {
            if (sugar.equals("Without")) {
                price = numDrinks * 0.50;
            } else if (sugar.equals("Normal")) {
                price = numDrinks * 0.60;
            } else if (sugar.equals("Extra")) {
                price = numDrinks * 0.70;
            }
            if (sugar.equals("Without")) {
                price = price * 0.65;
            }

        }

        if (price > 15) {
            price = price * 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",numDrinks, drink, price);
    }
}
