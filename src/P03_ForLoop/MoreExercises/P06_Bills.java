package P03_ForLoop.MoreExercises;

import java.util.Scanner;

public class P06_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        int water = 20;
        int internet = 15;

        double sumElectricity = 0;
        double sumWater = water * months;
        double sumInternet = internet * months;

        for (int i = 1; i <= months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());

            sumElectricity += electricity;
        }

        double sumOtherBill = (sumWater + sumInternet + sumElectricity) * 1.20;
        double avv = (sumElectricity + sumWater + sumInternet + sumOtherBill) / months;
        System.out.printf("Electricity: %.2f lv%nWater: %.2f lv%nInternet: %.2f lv%nOther: %.2f lv%nAverage: %.2f lv",
                sumElectricity, sumWater, sumInternet, sumOtherBill, avv);

    }
}
