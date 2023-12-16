package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double metersForSeconds = distanceInMeters * timeForOneMeter;
        double delay = Math.floor(distanceInMeters / 15) * 12.5;
        double  timeForSwim = metersForSeconds + delay;

        if(recordInSeconds > timeForSwim){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeForSwim);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeForSwim - recordInSeconds);
        }

    }
}
