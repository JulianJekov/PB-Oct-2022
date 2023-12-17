package P02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P05_GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfStatists = Integer.parseInt(scanner.nextLine());
        double priceForCloths = Double.parseDouble(scanner.nextLine());

        double decore = budget * 0.10;
        double priceAllCloths = numberOfStatists * priceForCloths;
        if(numberOfStatists > 150) {
            priceAllCloths = priceAllCloths * 0.90;
        }
        double sum = priceAllCloths + decore;

        if(sum > budget){
            System.out.printf("Not enough money!%nWingard needs %.02f leva more.", sum -budget);
        }else{
            System.out.printf("Action!%nWingard starts filming with %.02f leva left.", budget - sum);
        }
    }
}
