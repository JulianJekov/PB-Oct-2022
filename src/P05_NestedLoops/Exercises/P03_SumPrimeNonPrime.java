package P05_NestedLoops.Exercises;

import java.util.Scanner;

public class P03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!input.equals("stop")) {
            int currentNum = Integer.parseInt(input);

            if (currentNum < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            int count = 0;
            for (int i = 1; i <= currentNum; i++) {


                if (currentNum % i == 0) {
                    count++;
                }
                if (count == 3) {
                    break;
                }
            }

            if (count > 2) {
                sumNonPrime += currentNum;
            } else {
                sumPrime += currentNum;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);

    }
}
