package WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
