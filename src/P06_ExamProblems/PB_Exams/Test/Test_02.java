package P06_ExamProblems.PB_Exams.Test;

import java.util.Scanner;

public class Test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double litersOil = Double.parseDouble(scanner.nextLine());
        String dayFromWeekend = scanner.nextLine();

        double oilPrice = litersOil * 2.10;
        int guide = 100;
        double price = guide + oilPrice;

        if (dayFromWeekend.equals("Sunday")) {
            price = price * 0.8;
        } else if (dayFromWeekend.equals("Saturday")) {
            price = price * 0.9;
        }
        double diff = Math.abs(budget - price);
        if (budget >= price) {

            System.out.printf("Safari time! Money left: %.2f lv.", diff);
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }

    }
}
