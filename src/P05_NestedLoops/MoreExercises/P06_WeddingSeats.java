package P05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P06_WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int rowsFirstSector = Integer.parseInt(scanner.nextLine());
        int seatsOddRows = Integer.parseInt(scanner.nextLine());
        int seats = 0;

        for (char i = 'A'; i <= lastSector; i++) {
            if (i != 'A') {
                rowsFirstSector++;
            }
            for (int j = 1; j <= rowsFirstSector; j++) {
                int evenRows = 0;
                if (j % 2 == 0) {
                    evenRows = 2;
                }

                for (int k = 'a'; k < 'a' + seatsOddRows + evenRows; k++) {
                    seats++;
                    System.out.printf("%c%d%c%n", i, j, k);
                }

            }
        }
        System.out.println(seats);
    }

}

