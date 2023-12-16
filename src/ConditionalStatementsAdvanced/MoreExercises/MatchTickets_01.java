package ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numPeople = Integer.parseInt(scanner.nextLine());

        double transport = 0;
        double price = 0;

        if(category.equals("VIP")){
            price = 499.99 * numPeople;
        }else if(category.equals("Normal")){
            price = 249.99 * numPeople;
        }
        if (numPeople >= 1 && numPeople <= 4) {
            transport = budget * 0.75;
        } else if (numPeople >= 5 && numPeople <= 9) {
            transport = budget * 0.60;
        } else if (numPeople >= 10 && numPeople <= 24) {
            transport = budget * 0.50;
        } else if (numPeople >= 25 && numPeople <= 49) {
            transport = budget * 0.40;
        } else {
            transport = budget * 0.25;
        }

        double finalPrice = budget - transport;
        double diff = Math.abs(finalPrice - price);
        if(finalPrice>price){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}