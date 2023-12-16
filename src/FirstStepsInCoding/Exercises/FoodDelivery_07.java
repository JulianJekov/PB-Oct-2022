package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberChickenMenu = Integer.parseInt(scanner.nextLine());
        int numberFishMenu = Integer.parseInt(scanner.nextLine());
        int numberVeganMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = numberChickenMenu * 10.35;
        double fishMenuPrice = numberFishMenu * 12.40;
        double veganMenuPrice = numberVeganMenu * 8.15;
        double fullMenuPrice = chickenMenuPrice + fishMenuPrice + veganMenuPrice;
        double dessertPrice = fullMenuPrice * 20/100;
        double deliveryPrice = 2.50;
        double orderFullPrice = fullMenuPrice + dessertPrice + deliveryPrice;

        System.out.println(orderFullPrice);


    }
}
