package P04_WhileLoop.Lab;

import java.util.Scanner;

public class P06_P07_MaxNumber_MinNumber {
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
            //  P06_MaxNumber
            //* if (number > maxNumber) {
            //      maxNumber = number;
            //*  }

            input = scanner.nextLine();
        }
        System.out.println(minNumber);

        //P06_MaxNumber
        //System.out.println(maxNumber);
    }
}
