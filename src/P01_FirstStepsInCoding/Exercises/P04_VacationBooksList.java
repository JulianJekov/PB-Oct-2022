package P01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int readedPagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToReadBook = Integer.parseInt(scanner.nextLine());

        int overallTimeToReadTheBook = pagesInBook / readedPagesPerHour;
        int hoursNeededPerDay = overallTimeToReadTheBook / daysToReadBook;

        System.out.println(hoursNeededPerDay);
    }
}
