package NestedLoops.Exercises;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        int countTotalTickets = 0;

        int countStandardTickets = 0;
        int countStudentTickets = 0;
        int countKidTickets = 0;

        while (!movieName.equals("Finish")){
            int countFreeSeats = Integer.parseInt(scanner.nextLine());
            int countMovieTickets = 0;
            String ticketType = scanner.nextLine();

            while (!ticketType.equals("End")){
                countMovieTickets++;

                if ("student".equals(ticketType)) {
                    countStudentTickets++;
                } else if ("standard".equals(ticketType)) {
                    countStandardTickets++;
                } else if ("kid".equals(ticketType)) {
                    countKidTickets++;
                }
                if(countMovieTickets>=countFreeSeats){
                    break;
                }

                ticketType =scanner.nextLine();
            }
            countTotalTickets+=countMovieTickets;
            double percentFilled = 1.0 * countMovieTickets / countFreeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n",movieName, percentFilled);
            movieName = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * countStudentTickets / countTotalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * countStandardTickets / countTotalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", 1.0 * countKidTickets / countTotalTickets * 100);
    }
}
