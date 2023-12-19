package P05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P14_PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num1; i++) {

            for (int j = 1; j < num1; j++) {

                for (int k = 'a'; k < 'a' + num2; k++) {

                    for (int l = 'a'; l < 'a' + num2; l++) {

                        for (int m = 1; m <= num1; m++) {

                            if (m > i && m > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, l, m);
                            }
                        }
                    }
                }
            }
        }

    }
}
