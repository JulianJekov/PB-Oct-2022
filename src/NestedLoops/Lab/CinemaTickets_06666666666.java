package NestedLoops.Lab;

import java.util.Scanner;

public class CinemaTickets_06666666666 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int totaltickets = 0;
        int student = 0;
        int standard = 0;
        int kid = 0;

        while (!movie.equals("Finish")) {

            int space = Integer.parseInt(scanner.nextLine());
            int count = 0;
            String input = scanner.nextLine();
            while (!input.equals("End")) {
                count++;

                if(input.equals("student")){
                    student++;
                }else if(input.equals("standard")){
                    standard++;
                }else if(input.equals("kid")){
                    kid++;
                }

               if (count >= space) {
                    break;
                }

                input = scanner.nextLine();
            }
            double percentFull = 1.0 * count / space * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percentFull);
            totaltickets += count;

            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totaltickets);
        double studentPercent = 1.0*student / totaltickets * 100;
        System.out.printf("%.2f%% student tickets.%n", 1.0*student / totaltickets * 100);
        double standardPercent = 1.0 * standard / totaltickets * 100;
        System.out.printf("%.2f%% standard tickets.%n", standardPercent);
        double kidPercent = 1.0 * kid / totaltickets * 100;
        System.out.printf("%.2f%% kids tickets.", kidPercent);
    }
}