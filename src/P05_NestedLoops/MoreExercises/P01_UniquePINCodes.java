package P05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P01_UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                int count = 1;
                int prime = 0;
                for (int k = 2; k <= j; k++) {
                    if (j % k == 0) {
                        count++;
                    }
                }
                if (count <= 2) {
                    prime += j;

                }
                for (int k = 1; k <= num3; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && prime >= 2 && prime <= 7) {
                        System.out.printf("%d %d% d%n", i, prime, k);
                    }
                }

            }

        }
    }
}
