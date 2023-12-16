package PB_Exams.PreExam;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPaper = Integer.parseInt(scanner.nextLine());
        int numCloth = Integer.parseInt(scanner.nextLine());
        double liters = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pricePaper = numPaper * 5.80;
        double priceCloth = numCloth * 7.20;
        double gluePrice = liters * 1.20;
        double fullPrice = priceCloth + pricePaper + gluePrice;
        double fullPriceWithDiscount = fullPrice - ((1.0 *percentDiscount /100) * fullPrice);


        System.out.printf("%.3f",fullPriceWithDiscount);

    }
}
