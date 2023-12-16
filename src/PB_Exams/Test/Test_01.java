package PB_Exams.Test;

import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberries = Double.parseDouble(scanner.nextLine());
        double bananaKilos = Double.parseDouble(scanner.nextLine());
        double orangeKilos = Double.parseDouble(scanner.nextLine());
        double rasberriesKilos =Double.parseDouble(scanner.nextLine());
        double kilosStrawberries = Double.parseDouble(scanner.nextLine());

        double priceStrawberries = strawberries * kilosStrawberries;
        double priceRassberries = rasberriesKilos * (strawberries/2);
        double priceOranges = orangeKilos * (strawberries/2 * 0.6);
        double priceBanana = bananaKilos * (strawberries/2 * 0.2);
        double finalSum = priceBanana+priceOranges+priceRassberries+priceStrawberries;

        System.out.printf("%.2f", finalSum);


    }
}
