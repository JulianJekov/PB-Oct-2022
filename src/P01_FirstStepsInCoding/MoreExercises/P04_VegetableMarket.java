package P01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P04_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        int kilosN = Integer.parseInt(scanner.nextLine());
        int kilosM = Integer.parseInt(scanner.nextLine());

        double priceN = n * kilosN;
        double priceM = m * kilosM;
        double finalPrice = priceN + priceM;
        double finalPriceInEuro = finalPrice / 1.94;
        System.out.println(String.format("%.2f", finalPriceInEuro));



    }
}
