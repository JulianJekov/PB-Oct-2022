package P01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P06_Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int paidForHours = Integer.parseInt(scanner.nextLine());

        double priceForNylon = (nylon + 2) * 1.50;
        double priceForPaint = (paint + paint * 10/100.0) * 14.50;
        double priceForThinner = thinner * 5;
        double packetPrice = 0.40;
        double fullPrice = priceForNylon + priceForPaint + priceForThinner + packetPrice;
        double workersPrice = (fullPrice * 30/100) * paidForHours;
        double finalPrice = fullPrice + workersPrice;
        System.out.println(finalPrice);




    }
}
