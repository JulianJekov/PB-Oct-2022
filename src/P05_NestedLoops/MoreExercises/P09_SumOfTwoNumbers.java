package P05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P09_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isFound = false;
        int num1 = 0;
        int num2 = 0;
        for (int i = start; i <= stop; i++) {

            for (int j = start; j <= stop; j++) {
                count++;

                if (i + j == magic) {
                    isFound = true;
                    num1 = i;
                    num2 = j;
                    break;
                }

            }
            if (isFound) {
                break;
            }
        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", count, num1, num2, magic);
        } else {
            System.out.printf("%d combinations - neither equals %d", count, magic);
        }
    }
}
