package PB_Exams.Test_02;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBalls = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int other = 0;
        int black = 0;

        for (int i = 1; i <=numBalls ; i++) {
            String color = scanner.nextLine();

            if(color.equals("red")){
                totalPoints+=5;
                red++;
            }else if(color.equals("orange")){
                totalPoints+=10;
                orange++;
            }else if(color.equals("yellow")){
                totalPoints+=15;
                yellow++;
            }else if(color.equals("white")){
                totalPoints+=20;
                white++;
            }else if(color.equals("black")){
                totalPoints = Math.floor(totalPoints/2);
                black++;
            }else{
                other++;
            }

        }
        System.out.printf("Total points: %.0f%n", totalPoints);
        System.out.printf("Red balls: %d%n", red);
        System.out.printf("Orange balls: %d%n", orange);
        System.out.printf("Yellow balls: %d%n", yellow);
        System.out.printf("White balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", other);
        System.out.printf("Divides from black balls: %d%n", black);

    }
}
