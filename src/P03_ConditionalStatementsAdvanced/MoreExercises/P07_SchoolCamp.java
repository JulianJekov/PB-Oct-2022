package P03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String gender = scanner.nextLine();
        int numStudents = Integer.parseInt(scanner.nextLine());
        int numNights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        if(season.equals("Winter")){
            if(gender.equals("boys")) {
                price = numStudents * 9.60 * numNights;
                sport = "Judo";
            }else if(gender.equals("girls")){
                price = numStudents * 9.60 * numNights;
                sport = "Gymnastics";
            }else if(gender.equals("mixed")){
                price = numStudents * 10 * numNights;
                sport = "Ski";
            }

        }else if(season.equals("Spring")) {
            if (gender.equals("boys")) {
                price = numStudents * 7.20 * numNights;
                sport = "Tennis";
            } else if (gender.equals("girls")) {
                price = numStudents * 7.20 * numNights;
                sport = "Athletics";
            } else if (gender.equals("mixed")) {
                price = numStudents * 9.50 * numNights;
                sport = "Cycling";
            }
        }else if(season.equals("Summer")){
            if (gender.equals("boys")) {
                price = numStudents * 15 * numNights;
                sport = "Football";
            } else if (gender.equals("girls")) {
                price = numStudents * 15 * numNights;
                sport = "Volleyball";
            } else if (gender.equals("mixed")) {
                price = numStudents * 20 * numNights;
                sport = "Swimming";
            }
        }
        if(numStudents>=50){
            price = price * 0.50;
        }else if(numStudents>=20){
            price = price * 0.85;
        }else if(numStudents>=10){
            price = price * 0.95;
        }
        System.out.printf("%s %.2f lv.",sport, price);
    }
}
