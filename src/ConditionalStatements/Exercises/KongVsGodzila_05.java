package ConditionalStatements.Exercises;

import java.util.Scanner;

public class KongVsGodzila_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfStatist = Integer.parseInt(scanner.nextLine());
        double priceForCloths = Double.parseDouble(scanner.nextLine());

        double discount = 0;
        double decore = budget * 0.10;
        double priceAllClothsNoDiscount = numberOfStatist * priceForCloths;
        if(numberOfStatist > 150) {
            discount = priceAllClothsNoDiscount * 0.10;
        }

        double priceAllCloths = priceAllClothsNoDiscount - discount;
        double sum = priceAllCloths + decore;

        if(sum > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.02f leva more.", sum -budget);
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.02f leva left.", budget - sum);
        }


    }
}
