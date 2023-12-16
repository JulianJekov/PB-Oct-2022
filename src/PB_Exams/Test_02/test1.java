package PB_Exams.Test_02;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int ticketsAdult = Integer.parseInt(scanner.nextLine());
        int ticketsKids = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double sumAdult = (priceAdult+tax) * ticketsAdult;
        double sumKids = ticketsKids * (priceAdult*0.3+tax);
        double allSum = sumAdult + sumKids;
        double profit = allSum*0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, profit);

    }
}
