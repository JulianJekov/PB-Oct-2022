package P01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double basketShoes = yearTax * 0.6;
        double basketCloths = basketShoes * 0.8;
        double basketBall = basketCloths * 0.25;
        double basketAccessories = basketBall * 0.2;
        double finalPrice = yearTax + basketAccessories + basketBall + basketCloths + basketShoes;

        System.out.println(finalPrice);




    }
}






