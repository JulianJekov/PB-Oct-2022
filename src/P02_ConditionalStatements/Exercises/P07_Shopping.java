package P02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numVideoCards = Integer.parseInt(scanner.nextLine());
        int numProcessors = Integer.parseInt(scanner.nextLine());
        int numRamMemory = Integer.parseInt(scanner.nextLine());

        double discount = 0;

        double videoCard = numVideoCards * 250;
        double processor = numProcessors * (videoCard* 0.35);
        double ramMemory = numRamMemory * (videoCard * 0.10);
        double sum = videoCard + processor + ramMemory;
        if (numVideoCards > numProcessors) {
            discount = sum * 0.15;
        }
        double finalSum = sum - discount;

        if (budget < finalSum) {
            System.out.printf("Not enough money! You need %.2f leva more!", finalSum - budget);
        }else{
            System.out.printf("You have %.2f leva left!", budget - finalSum);
        }
    }
}