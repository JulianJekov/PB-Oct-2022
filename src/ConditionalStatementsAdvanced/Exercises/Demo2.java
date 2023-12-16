package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;

        switch (season){
            case "Spring":
                boatPrice = 3000;
                if (fisherman<=6){
                    boatPrice = boatPrice * 0.9;
                } else if (fisherman>=7&&fisherman<=11) {
                    boatPrice = boatPrice * 0.85;
                }else if (fisherman>=12){
                    boatPrice = boatPrice * 0.75;
                }
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                if (fisherman<=6){
                    boatPrice = boatPrice * 0.9;
                } else if (fisherman>=7&&fisherman<=11) {
                    boatPrice = boatPrice * 0.85;
                }else if (fisherman>=12){
                    boatPrice = boatPrice * 0.75;
                }
                if (fisherman%2==0&&season.equals("Summer")){
                    boatPrice = boatPrice * 0.95;
                }
                break;
            case "Winter":
                boatPrice = 2600;
                if (fisherman<=6){
                    boatPrice = boatPrice * 0.9;
                } else if (fisherman>=7&&fisherman<=11) {
                    boatPrice = boatPrice * 0.85;
                }else if (fisherman>=12){
                    boatPrice = boatPrice * 0.75;
                }
                if (fisherman%2==0){
                    boatPrice = boatPrice * 0.95;
                }
                break;
        }
        double difference = Math.abs(budget-boatPrice);
        if (budget>=boatPrice){
            System.out.printf("Yes! You have %.2f leva left.", difference);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
    }
}