package P03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double priceKmMonth = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if(kmPerMonth<=5000){
                    priceKmMonth = kmPerMonth *0.75;
                }else if(kmPerMonth <= 10000){
                    priceKmMonth = kmPerMonth * 0.95;
                }else if(kmPerMonth<=20000){
                    priceKmMonth = kmPerMonth * 1.45;
                }
                break;
            case "Summer":
                if(kmPerMonth<=5000){
                    priceKmMonth = kmPerMonth * 0.90;
                }else if(kmPerMonth <= 10000) {
                    priceKmMonth = kmPerMonth * 1.10;
                }else if(kmPerMonth <=20000){
                    priceKmMonth = kmPerMonth * 1.45;
                }
                break;
            case "Winter":
                if(kmPerMonth<=5000){
                    priceKmMonth = kmPerMonth * 1.05;
                }else if(kmPerMonth <= 10000) {
                    priceKmMonth = kmPerMonth * 1.25;
                }else if(kmPerMonth<=20000){
                    priceKmMonth = kmPerMonth * 1.45;
                }
                break;
        }

        double priceKmSeason = priceKmMonth * 4;
        double priceWithTax = priceKmSeason * 0.90;
        System.out.printf("%.2f",priceWithTax);
    }
}
