package NestedLoops.MoreExercises;

import java.util.Scanner;

public class demo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double hoursPrice = 0;
        double daysPrice = 0;
        double totalPrice = 0;

        for (int i = 1; i <= days; i++) {

            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    hoursPrice += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    hoursPrice += 1.25;
                } else {
                    hoursPrice += 1;
                }

                daysPrice += hoursPrice;
                hoursPrice = 0;
            }
            System.out.printf("Day: %d - %.2f leva%n", i, daysPrice);
            totalPrice += daysPrice;
            daysPrice = 0;
        }
        System.out.printf("Total: %.2f leva", totalPrice);
    }
}
