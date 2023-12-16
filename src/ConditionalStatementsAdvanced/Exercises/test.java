package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int sumMinutesExam = hourExam * 60 + minutesExam;
        int sumMinutesArrival = hourArrival * 60 + minutesArrival;
        int diff = Math.abs(sumMinutesExam - sumMinutesArrival);

        if (sumMinutesArrival > sumMinutesExam) {
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } else if (diff <= 30) {
            System.out.println("On time");
            if (sumMinutesArrival != sumMinutesExam) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }


    }

}