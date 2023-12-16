package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometers = Integer.parseInt(scanner.nextLine());
        String daysOrNight = scanner.nextLine();

        double taxiPrice = 0;
        double busPrice = 0.09 * kilometers;
        double trainPrice = 0.06 * kilometers;
        if(daysOrNight.equals("day")){
            taxiPrice = 0.70 + (kilometers * 0.79);
        }else{
            taxiPrice = 0.70 + (kilometers * 0.90);
        }

        if(kilometers < 20){
            System.out.printf("%.2f",taxiPrice);
        }else if(kilometers < 100){
            System.out.printf("%.2f",busPrice);
        }else{
            System.out.printf("%.2f",trainPrice);
        }

    }
}
