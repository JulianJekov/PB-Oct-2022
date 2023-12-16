package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        double taxEnter = Double.parseDouble(scanner.nextLine());
        double taxSunbed = Double.parseDouble(scanner.nextLine());
        double taxUmbrela = Double.parseDouble(scanner.nextLine());

        double taxPeople = peopleNumber * taxEnter;
        double percentPeopleNeedSunbeds = Math.ceil(peopleNumber * 0.75);
        double finalTaxSunbed = percentPeopleNeedSunbeds * taxSunbed;
        double percentPeopleNeedUmbrela = Math.ceil(peopleNumber * 0.50);
        double finalTaxUmbrela = percentPeopleNeedUmbrela * taxUmbrela;
        double finalPrice = taxPeople + finalTaxSunbed + finalTaxUmbrela;
        System.out.printf("%.2f lv.",finalPrice);


    }
}
