package P03_ForLoop.MoreExercises;

import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lastSum = 0;
        int diff = 0;
        int maxDiff = Integer.MIN_VALUE;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            int sum = num1 + num2;

            if (i > 1) {
                diff = Math.abs(sum - lastSum);
            }
            if (maxDiff < diff) {
                maxDiff = diff;
            }
            lastSum = sum;
        }
            if (maxDiff == 0) {
                System.out.printf("Yes, value=%d", lastSum);
            } else {
                System.out.printf("No, maxdiff=%d", maxDiff);
            }

    }
}