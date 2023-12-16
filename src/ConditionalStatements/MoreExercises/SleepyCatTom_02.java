package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyCatTom_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int freeDays = Integer.parseInt(scanner.nextLine());

       int normForPlay = 30000;
       int workDays = 365 - freeDays;
       int freeDaysPlay = freeDays * 127;
       int workDaysPlay = workDays * 63;
       int totalMinutesPlay = workDaysPlay + freeDaysPlay;
       int minutesLeftToPlay = Math.abs(normForPlay - totalMinutesPlay);
       int hoursLeftToPlay = minutesLeftToPlay / 60;
       int newMinutesLeftToPlay = minutesLeftToPlay % 60;

       if(totalMinutesPlay > normForPlay){
           System.out.println("Tom will run away");
           System.out.printf("%d hours and %d minutes more for play",hoursLeftToPlay, newMinutesLeftToPlay);
       }else{
           System.out.println("Tom sleeps well");
           System.out.printf("%d hours and %d minutes less for play", hoursLeftToPlay, newMinutesLeftToPlay);
       }


    }
}
