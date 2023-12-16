package ForLoop.MoreExercises;

import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int numOfFans = Integer.parseInt(scanner.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= numOfFans; i++) {
            String sector = scanner.nextLine();
            if (sector.equals("A")) {
                sectorA++;
            } else if (sector.equals("B")) {
                sectorB++;
            } else if (sector.equals("V")) {
                sectorV++;
            } else if (sector.equals("G")) {
                sectorG++;
            }
        }
        double percentA = 1.0 * sectorA / numOfFans * 100;
        double percentB = 1.0 * sectorB / numOfFans * 100;
        double percentV = 1.0 * sectorV / numOfFans * 100;
        double percentG = 1.0 * sectorG / numOfFans * 100;
        double percentAvv = 1.0 * numOfFans / stadiumCapacity * 100;

        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%", percentAvv);

    }
}
