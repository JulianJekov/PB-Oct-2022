package P06_ExamProblems.PB_Exams.Test;

import java.util.Scanner;

public class Test_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());


        double priceHour = 0;
        double priceDays = 0;
        double totalCharge = 0;
        for (int i = 1; i <= d; i++) {

            for (int j = 1; j <= h; j++) {

                if (i % 2 == 0 && j % 2 != 0) {

                    priceHour += 2.5;
                } else if (i % 2 != 0 && j%2==0) {

                    priceHour += 1.25;
                }else {
                    priceHour+=1;
                }

                priceDays+=priceHour;
                priceHour=0;
            }
            totalCharge+=priceDays;
            System.out.printf("Day: %d - %.2f leva%n",i, priceDays);
            priceDays=0;
        }
        System.out.printf("Total: %.2f leva", totalCharge);
    }
}
