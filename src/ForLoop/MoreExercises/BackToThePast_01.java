package ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heritage = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());

        int evenYear = 0;
        int oddYear = 0;
        int yearsCount = 18;

        for (int i = 1800; i <= yearToLive; i++) {

            if (i % 2 == 0) {
                evenYear += 12000;
            } else {
                oddYear += 12000 + (50 * yearsCount);
            }
            yearsCount++;

        }
        int allYears = evenYear + oddYear;
        double diff = Math.abs(heritage - allYears);
        if (heritage >= allYears) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }
    }
}
