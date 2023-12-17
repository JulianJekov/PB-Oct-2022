package P02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P08_FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double quantityFuel = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double price = 0;

        if (card.equals("Yes")) {
            if ("Gas".equals(fuel)) {
                price = quantityFuel * (0.93 - 0.08);
            } else if ("Diesel".equals(fuel)) {
                price = quantityFuel * (2.33 - 0.12);
            } else if ("Gasoline".equals(fuel)) {
                price = quantityFuel * (2.22 - 0.18);
            }
        }else{
            if ("Gas".equals(fuel)) {
                price = quantityFuel * 0.93;
            } else if ("Diesel".equals(fuel)) {
                price = quantityFuel * 2.33;
            } else if ("Gasoline".equals(fuel)) {
                price = quantityFuel * 2.22;
            }
        }
        if(quantityFuel >= 20 && quantityFuel <= 25){
            price=price * 0.92;
            System.out.printf("%.2f lv.", price);
        }else if(quantityFuel > 25){
            price= price * 0.90;
            System.out.printf("%.2f lv.", price);

        }else{
            System.out.printf("%.2f lv.", price);
        }


    }
}
