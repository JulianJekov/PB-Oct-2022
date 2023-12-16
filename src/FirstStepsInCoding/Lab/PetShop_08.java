package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double priceDogFood = 2.5 * dogFood;
        double priceCatFood = 4 * catFood;
        double finalPrice = priceDogFood + priceCatFood;

        System.out.println(finalPrice + " lv.");




    }
}
