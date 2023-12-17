package P03_ForLoop.MoreExercises;

import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());

        double points = 0;
        int from0To9 = 0;
        int from10To19 = 0;
        int from20To29 = 0;
        int from30To39 = 0;
        int from40To50 = 0;
        int invalidNumbers = 0;
        for (int i = 1; i <= moves; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers < 0 || numbers > 50) {
                points = points / 2;
                invalidNumbers++;
            }

            if (numbers >= 0 && numbers <= 9) {
                points += numbers*0.20;
                from0To9++;
            } else if (numbers >= 10 && numbers <= 19) {
                points +=numbers * 0.30;
                from10To19++;
            } else if (numbers>=20 && numbers<= 29) {
                points +=numbers * 0.40;
                from20To29++;
            } else if (numbers>=30&& numbers <= 39) {
                points += 50;
                from30To39++;
            } else if (numbers>=40 && numbers <= 50) {
                points += 100;
                from40To50++;
            }
        }
        double percentFrom0To9 = 1.0 * from0To9 / moves * 100;
        double percentFrom10To19 = 1.0 * from10To19 / moves * 100;
        double percentFrom20To29 = 1.0 * from20To29 / moves * 100;
        double percentFrom30To39 = 1.0 * from30To39 / moves * 100;
        double percentFrom40To50 = 1.0 * from40To50 / moves * 100;
        double percentFromInvalids = 1.0 * invalidNumbers / moves * 100;

        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", percentFrom0To9);
        System.out.printf("From 10 to 19: %.2f%%%n", percentFrom10To19);
        System.out.printf("From 20 to 29: %.2f%%%n", percentFrom20To29);
        System.out.printf("From 30 to 39: %.2f%%%n", percentFrom30To39);
        System.out.printf("From 40 to 50: %.2f%%%n", percentFrom40To50);
        System.out.printf("Invalid numbers: %.2f%%", percentFromInvalids);
    }
}
