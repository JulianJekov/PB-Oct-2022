package ForLoop.Exercises;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int newPoints = startPoints;
        double percetnWon = 0;
        for (int i = 1; i <=tournaments ; i++) {
            String stage = scanner.nextLine();
            if(stage.equals("W")){
                newPoints+= 2000;
                percetnWon++;
            }else if(stage.equals("F")){
                newPoints+= 1200;
            }else if(stage.equals("SF")){
                newPoints+= 720;
            }
        }

        int pointsOnlyTournaments = newPoints - startPoints;
        System.out.printf("Final points: %d%n", newPoints);
        System.out.printf("Average points: %d%n",pointsOnlyTournaments / tournaments);
        System.out.printf("%.2f%%", percetnWon / tournaments *100);
    }
}