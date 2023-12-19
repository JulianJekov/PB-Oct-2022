package P06_ExamProblems.PB_Exams.Test3;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int students = 0;
        int kids = 0;
        int standart = 0;
        int totalTickets = 0;

        String movie;

        while(!(movie = scanner.nextLine()).equals("Finish")){
            int seats = Integer.parseInt(scanner.nextLine());
            String type;
            int movieTickets = 0;
            while (movieTickets<seats && (!(type = scanner.nextLine()).equals("End"))){
                movieTickets++;
                if(type.equals("student")){
                    students++;

                }else if(type.equals("kid")){
                    kids++;

                }else if(type.equals("standard")){
                    standart++;

                }
                totalTickets++;
            }
            System.out.printf("%s - %.2f%% full.%n", movie,movieTickets * 100.0 / seats);

        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", students * 100.0 / totalTickets);
        System.out.printf("%.2f%% standard tickets.%n", standart * 100.0 / totalTickets);
        System.out.printf("%.2f%% kid tickets.", kids * 100.0 / totalTickets);

    }
}
