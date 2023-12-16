package PB_Exams.Test3;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int numNights = Integer.parseInt(scanner.nextLine());
        double priceForNight = Double.parseDouble(scanner.nextLine());
        int moreCost = Integer.parseInt(scanner.nextLine());

        if(numNights > 7) {
            priceForNight = priceForNight * 0.95;

        }
        double priceForAllNights = numNights * priceForNight;
        double moreCostPercent = budget * moreCost/100;
        double finalPrice = priceForAllNights + moreCostPercent;

        if(finalPrice<= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - finalPrice);
        }else{
            System.out.printf("%.2f leva needed.", finalPrice - budget);
        }
    }
}
