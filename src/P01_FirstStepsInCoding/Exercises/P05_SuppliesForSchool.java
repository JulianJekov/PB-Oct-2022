package P01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P05_SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPenPackets = Integer.parseInt(scanner.nextLine());
        int countMarkersPackets = Integer.parseInt(scanner.nextLine());
        int litersOfCleaner = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double priceForPens = 5.8 * countPenPackets;
        double priceForMarkers = 7.2 * countMarkersPackets;
        double priceForCleaner = 1.2 * litersOfCleaner;

        double wholeThingPrice = priceForPens + priceForMarkers + priceForCleaner;
        double discount = wholeThingPrice * percentDiscount/100;
        double finalPrice = wholeThingPrice - discount;

        System.out.println(finalPrice);



    }
}
